%{
#pragma warning(disable : 4996)
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "y.tab.h"
#define TOKEN_INDEX_OFFSET 257
/* used if reservedWords are stored in a table */
 int reservedWordIndex = 0;
static char *mnemonic[ ] = {"", "READ", "WRITE",
                                 "ID", "NUMBER",
                                 "LPAREN", "RPAREN",
                                  "SEMICOLON", "PLUS", "TIMES", "MINUS", "COMMA", "DIV", "ASSIGN"};

static int ReserveWordLookup(char * yytext);
static char *reserveWordTable[]= {
                                  "read", "write"
                                  };
static int ReserveWordLookup(char* yytext)
{
    int index, first, last, cmp_test;
    first = 0;
    last = 2;
    index = first;
    //Sequential search
    while(index < last){
         cmp_test = strcmp(yytext, reserveWordTable[index]);
         if (cmp_test != 0)
                        index++;
         else
                      return index ;
    }
    return -1; /* Reserved Word not Found */
}
FILE *listingFile;
int lines;
int main(int argc, char **argv)
{
    int token;
    char *infileName;
    char *listingFileName = "list.txt";
    extern FILE *yyin;
    extern FILE *listingFile;
    extern int lines;
    listingFile = fopen(listingFileName, "w");
    if (argc>1) {
           infileName = argv[1];
           yyin = fopen(infileName, "r");
           if(yyin == NULL) {
                        exit(1);
           }
     }
     else {
            stdin;
     }
     lines = 1;
     fprintf(listingFile, "%3d ", lines);
     while (token = yylex() ) {
             if(token != NUMBER && token != ID) {
                         printf("%s\n",
                         mnemonic[token-TOKEN_INDEX_OFFSET+1], yytext);
                /*Move index up one since mnemonic[0] is not used */
             }
             else if(token == NUMBER){
                        printf("NUMBER, %d\n", atoi(yytext) );
             }
             else
                        printf("%s%s %s\n",mnemonic[token-TOKEN_INDEX_OFFSET+1],",", yytext);
      }
      fclose(listingFile);
      return 0;
}
%}
letter [a-zA-Z_]
digit [0-9]
%%
[ \t]+ {fprintf(listingFile, "%s", yytext); }
{digit}({digit})* { fprintf(listingFile, "%s", yytext);
                              return NUMBER; }
{letter}({letter}|{digit})* { fprintf(listingFile, "%s", yytext);
                              return (reservedWordIndex =
                                         ReserveWordLookup(yytext))< 0 ? ID
                                            : (reservedWordIndex + TOKEN_INDEX_OFFSET);
                                /* return ID if yytext not in table */
                             }
"(" {fprintf(listingFile, "%s", yytext); return LPAREN;}
")" {fprintf(listingFile, "%s", yytext); return RPAREN;}
";" {fprintf(listingFile, "%s", yytext); return SEMICOLON;}
"+" {fprintf(listingFile, "%s", yytext); return PLUS;}
"*" {fprintf(listingFile, "%s", yytext); return MULT;}
"," {fprintf(listingFile, "%s", yytext); return COMMA;}
"-" {fprintf(listingFile, "%s", yytext); return MINUS;}
"/" {fprintf(listingFile, "%s", yytext); return DIV;}
":=" {fprintf(listingFile, "%s", yytext); return ASSIGN;}

\n {fprintf(listingFile, "%s", yytext); lines++;
                          fprintf(listingFile, "%3d ", lines);}
. {fprintf(listingFile, "%s", yytext);
     printf("Lex Error: Illegal Character %s\n", yytext);}
%%
