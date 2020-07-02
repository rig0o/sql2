parser grammar sqlParser;

options {tokenVocab=sqlLexer;}

sentencia:select | create_table | delete | update   ;
select: SELECT column FROM tabla opcion? ';';
create_table: ID '(' columna type ( ','columna type )*')'';';
delete: DELETE FROM tabla (WHERE clausula)?';';
update: UPDATE tabla SET condicion(',' condicion) WHERE condicion(','condicion)';';

opcion: where
        |inner tabla ON column EQ column
        |ORDEN_BY (column (DESC|ASC)?)+;

where:  WHERE clausula
        |WHERE column NOT? BETWEEN ID var AND var
        |WHERE column like
        |WHERE column IN '(' STRING(','STRING)*')';

inner:  INNER_JOIN
        | LEFT_JOIN
        | RIGH_JOIN ;

clausula: condicion (operador condicion)*
         |condicion (operador clausula)*
         |'('clausula')'
         |NOT clausula(operador clausula)*;
like: LIKE ID;
column: tabla'.'columna(','tabla'.'columna)*|columna( ',' columna)*|'*';
columna:ID;
tabla:ID;

condicion: ID EQ var;
var:STRING| INT| FLOAT;
type: INTEGER|VARCHAR'(' INT ')';
operador:AND | OR;