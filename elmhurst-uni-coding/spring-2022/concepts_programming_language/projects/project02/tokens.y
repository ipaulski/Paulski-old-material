%{
#include <string.h>
#include <stdio.h>
#include <stdlib.h>
int yylex(void);
void yyerror(char *s);
%}
%token READ WRITE
%token ID NUMBER
%token LPAREN RPAREN SEMICOLON
%token PLUS MULT MINUS COMMA DIV ASSIGN
%%
program :
%%
void yyerror(char *s) {
fprintf(stderr, "%s\n", s);
}