grammar Skel;

parse
 : assignment+ EOF
 | OTHER {System.err.println("unknown char: " + $OTHER.text);}
 ;

assignment : ID ASSIGN patt SCOL
 | main;

patt
 : stream
 | sequence
 | dataparallel 
 | ID
 ;
 
 main : (MAIN ASSIGN)+ stream SCOL
  | sequence SCOL
  | dataparallel SCOL
 ;
 
stream
 : farm
 | pipe
 ;
 
sequence
 : seq
 | comp
 ;
 
dataparallel : map ;
 
block : OPAR patt CPAR ;

seq : SEQ OPAR INT CPAR;

comp : COMP block;

pipe : PIPE stages;

farm : FARM block;

map : MAP block;

stages : OPAR (patt COMMA patt)+CPAR;

COMMA : ',';
SCOL : ';';
ASSIGN : '=';
OPAR : '(';
CPAR : ')';
SEQ : 'SEQ';
COMP : 'COMP';
PIPE : 'PIPE';
FARM : 'FARM';
MAP  : 'MAP';
MAIN : 'MAIN';

ID
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

INT
 : [0-9]+
 ;

COMMENT
 : '#' ~[\r\n]* -> skip
 ;

SPACE
 : [ \t\r\n] -> skip
 ;

OTHER
 : . 
 ;
