grammar Skel1;

skeletonProgram
 : programPart+ EOF
 | OTHER {System.err.println("unknown char: " + $OTHER.text);}
 ;
programPart : (statement)* mainExpr
 			;

statement : assignment ';'
         ;
mainExpr : mainMethod=main '=' expr=patternExpr ';'
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
main : 'main';

block : '(' expr=patternExpr ')' ;

sequence : 'Seq' '(' NUMBER ')';

composition : 'Comp' block;

pipeSkel : 'Pipe' stages;

farmSkel : 'Farm' block;

mapSkel : 'Map' block;

stages: '(' expr+=patternExpr  ',' expr+=patternExpr (',' expr+=patternExpr)* ')' ;

IDENTIFIER: [a-zA-Z][a-zA-Z0-9]* ;
NUMBER: [0-9]+;

COMMENT
 : '#' ~[\r\n]* -> skip
 ;

SPACE
 : [ \t\r\n] -> skip
 ;

OTHER : . 
 ;