lexer grammar sqlLexer;

SELECT:'SELECT' | 'select';
FROM: 'FROM' | 'from';
WHERE:'WHERE' | 'where';
CREATE_TABLE:'CREATE TABLE'|'create table';
DELETE:'DELETE'|'delete' ;
BETWEEN:'BETWEEN'|'between';
ORDER_BY:'ORDER BY'|'order by';
GROUP_BY:'GROUP BY'|'group by';
LEFT_JOIN:'LEFT JOIN'|'left join';
INNER_JOIN:'INNER JOIN'|'inner join';
RIGHT_JOIN:'RIGHT JOIN'|'right join';
IN:'IN'|'in';
ON:'ON'|'on';
INTEGER:'INT'|'int';
VARCHAR:'VARCHAR'|'varchar';
DESC:'DESC'|'desc';
ASC:'ASC'|'asc';
AND:'AND'|'and';
OR:'OR'|'or';
NOT:'NOT'|'not';
PAR_OPEN:'(';
PAR_CLOUSE:')';
EQ:'=';
GT:'>';
LT:'<';
GEQ:'>=';
LEQ:'<=';
DOT:'.';
COMA:',';
PUNTOCOMA:';';
WC:'*';
STRING:'"'.*?'"'| '\''.*?'\'' ;

ID: CHAR+;
INT: DIGIT+ ;
FLOAT: DIGIT+ '.' DIGIT+ ;

WS:[' '\n\r\t]->skip;
fragment DIGIT:[0-9];
fragment CHAR:[a-zA-Z_];