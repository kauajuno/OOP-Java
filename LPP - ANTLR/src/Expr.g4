grammar Expr;

@header {
	package antlr;
}

prog: decl+ EOF
	;

decl: ID ':' INT_TYPE '=' NUM WS?
    | ID ':' INT_TYPE LIST_TYPE '=' NUM ((',' NUM)+)? WS?
    | ID ':' FLOAT_TYPE '=' NUM'.'NUM WS?
    | ID ':' FLOAT_TYPE LIST_TYPE '=' NUM'.'NUM ((',' NUM'.'NUM)+)? WS?
    | ID ':' CHAR_TYPE '=' CHAR WS?
    | ID ':' CHAR_TYPE LIST_TYPE '=' CHAR ((',' CHAR)+)? WS?
    ;

INT_TYPE: 'INT';
FLOAT_TYPE: 'FLOAT';
CHAR_TYPE: 'CHAR';
LIST_TYPE: '[]';
NUM: '0' | [0-9]+;
CHAR: [a-zA-Z];
ID: [a-z]([0-9a-zA-Z]+)?;
WS : [ \t\r\n]+ -> skip ;