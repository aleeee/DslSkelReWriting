grammar Skel1;

program : programPart+ 
		| OTHER {System.err.println("unknown char: " + $OTHER.text);}
		;

programPart : (statement ';')* main      #MainStatement            
 			;

statement : assignment
         ;
main : mainExpr='main' '=' patternExpr ';'
	 ;
assignment : varName=IDENTIFIER '=' expr=patternExpr;

patternExpr : stream=streamPattern
            | seq=sequential
            | dataParallel=dataParallelPattern
            | varName=IDENTIFIER
            ;

streamPattern : farm=farmSkel
       | pipe=pipeSkel
       ;

sequential  : sec=sequence
            | comp=composition
            ;

dataParallelPattern  : map=mapSkel
              ;


block : '(' expr=patternExpr ')' ;

sequence : 'Seq' '(' NUMBER ')';

composition : 'Comp' block;

pipeSkel : 'Pipe' stages;

farmSkel : 'Farm' block;

mapSkel : 'Map' block;

stages: '(' expr+=patternExpr  ',' expr+=patternExpr (',' expr+=patternExpr)* ')' ;

IDENTIFIER: [a-zA-Z][a-zA-Z0-9]* ;
NUMBER: [0-9]+;
WHITESPACE: [ \t\n\r]+ -> skip;

OTHER : . 
 ;