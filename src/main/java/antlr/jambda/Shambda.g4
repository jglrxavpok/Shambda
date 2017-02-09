grammar Shambda;

file:
    (functionDeclaration | uniformDeclaration | constantDeclaration)*;

constantDeclaration:
    'constant' parameter EQUAL_SIGN constantExpression DOUBLE_SEMI_COLON;

uniformDeclaration:
    'uniform' parameter DOUBLE_SEMI_COLON;

functionDeclaration:
    parameter parameter* EQUAL_SIGN functionBody;

functionBody:
    statement (SEMI_COLON statement)* DOUBLE_SEMI_COLON;

integer:
    DIGIT+;

unsignedInteger:
    'u' integer;

unsignedLong:
    'u' longNumber;

longNumber:
    integer LONG_TERMINATOR;

doubleNumber:
    integer (PERIOD integer)? 'd';

floatingPointNumber:
    integer (PERIOD integer)? FLOAT_TERMINATOR;

constantExpression:
    integer | floatingPointNumber | longNumber | doubleNumber | unsignedInteger | unsignedLong;

expression:
    functionCall | constantExpression | dereference | Identifier | LEFT_PAREN expression RIGHT_PAREN;

dereference:
    '!' Identifier;

statement:
    expression | variableDeclaration | variableAssignment;

variableAssignment:
    parameter ASSIGN_SIGN expression;

variableDeclaration:
    'let' variableAssignment;

functionCall:
    Identifier (expression)*;

type:
      Identifier
    | Identifier LEFT_PAREN type RIGHT_PAREN
    | type '*' LEFT_PAREN storageClass RIGHT_PAREN;

storageClass:
    'UniformConstant'
     | 'Input'
     | 'Uniform'
     | 'Output'
     | 'Workgroup'
     | 'CrossWorkgroup'
     | 'Private'
     | 'Function'
     | 'Generic'
     | 'PushConstant'
     | 'AtomicCounter'
     | 'Image';

parameter:
    Identifier (COLON type)?;

FLOAT_TERMINATOR:
    'f';

LONG_TERMINATOR:
    'L';

DOUBLE_SEMI_COLON:
    ';;';

SEMI_COLON:
    ';';

DIGIT:
    ('0'..'9');

PERIOD:
    '.';

PLUS:
    '+';

MINUS:
    '-';

MULTIPLY:
    '*';

DIVISION:
    '/';

COLON:
    ':';

LEFT_PAREN:
    '(';

RIGHT_PAREN:
    ')';

SMALL_ARROW:
    '->';

ASSIGN_SIGN:
    ':=';

EQUAL_SIGN:
    '=';

LOWERCASE_LETTER:
    ('a'..'z');

UPPERCASE_LETTER:
    ('A'..'Z');

STAR:
    [*];

WHITESPACE:
    [ \t\n\r]+ -> skip;

Identifier
    :   JavaLetter JavaLetterOrDigit*
    ;

fragment
JavaLetter
    :   [a-zA-Z$_] // these are the "java letters" below 0x7F
    |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
    ;

fragment
JavaLetterOrDigit
    :   [a-zA-Z0-9$_] // these are the "java letters or digits" below 0x7F
    |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
    ;