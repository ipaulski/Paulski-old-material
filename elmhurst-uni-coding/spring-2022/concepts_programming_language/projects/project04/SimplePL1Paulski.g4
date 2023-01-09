grammar SimplePL1Paulski;

program : stmt_list ;

stmt_list :
    stmt stmt_list
    | 
    ;

stmt : 
    ID ASSIGN expr SEMICOLON
    | READ LPAREN id_list RPAREN SEMICOLON
    | WRITE LPAREN expr_list RPAREN SEMICOLON
    ;

expr_list : 
    expr expr_list_tail 
    ;

expr_list_tail : 
    COMMA expr expr_list_tail 
    | 
    ;

id_list : 
    ID id_list_tail 
    ;

id_list_tail : 
    COMMA ID id_list_tail
    | 
    ;

expr : 
    term term_tail
    ;

term_tail :
    add_op term term_tail
    | 
    ;

term :
    factor factor_tail
    ;

factor_tail :
    mult_op factor factor_tail
    | 
    ;

factor :
    LPAREN expr RPAREN
    | ID
    | NUMBER
    ;

add_op :
    PLUS 
    | MINUS
    ;

mult_op :
    TIMES
    | DIV
    ;

//LETTER : [a-zA-Z_] ;
//DIGIT : [0-9] ;

READ    : 'read' ;
WRITE   : 'write' ;

//ID      : (LETTER)(LETTER|DIGIT)* ;
//NUMBER  : (DIGIT)(DIGIT)* ; 
ID      : [a-zA-Z_][a-zA-Z0-9_]* ;
NUMBER  : [0-9][0-9]* ;
ASSIGN  : ':=' ;
PLUS    : '+' ;
MINUS   : '-' ;
TIMES   : '*' ;
DIV     : '/' ;
SEMICOLON : ';' ;
COMMA   : ',' ;
LPAREN  : '(' ;
RPAREN  : ')' ;

WS      : [ \t\n]+ -> skip ;