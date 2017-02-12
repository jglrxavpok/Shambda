grammar Shambda;

file:
    (setImport | functionDeclaration | uniformDeclaration | constantDeclaration)* EOF;

setImport:
    '#import' (Identifier | Integer) ('.' (Identifier | Integer))* DOUBLE_SEMI_COLON;

constantDeclaration:
    'constant' parameter EQUAL_SIGN constantExpression DOUBLE_SEMI_COLON;

uniformDeclaration:
    'uniform' parameter DOUBLE_SEMI_COLON;

functionDeclaration:
    parameter parameter* EQUAL_SIGN functionBody;

functionBody:
    statement (SEMI_COLON statement)* DOUBLE_SEMI_COLON;

UnsignedInteger:
    'u' Integer;

UnsignedLong:
    'u' LongNumber;

LongNumber:
    Digits LONG_TERMINATOR;

DoubleNumber:
    Digits (PERIOD Digits)? 'd';

FloatingPointNumber:
    Digits (PERIOD Digits)? FLOAT_TERMINATOR;

Boolean:
    'true' | 'false';

constantExpression:
    Integer | FloatingPointNumber | LongNumber | DoubleNumber | UnsignedInteger | UnsignedLong | Boolean;

Integer:
    Digits;

expression
    : '!' expression                       #dereferenceExpr
    | '-' expression                    #unaryMinusExpr
    | functionCall                      #functionCallExpr
    | constantExpression                #constantExpressionExpr
    | Identifier                        #idExpr
    | LEFT_PAREN expression RIGHT_PAREN #wrappedExpr
    | expression '*' expression         #multExpr
    | expression '/' expression         #divExpr
    | expression '-' expression         #minusExpr
    | expression '+' expression         #plusExpr
    ;

statement:
    expression | variableDeclaration | variableAssignment;

variableAssignment:
    parameter ASSIGN_SIGN expression;

variableDeclaration:
    'let' variableAssignment;

functionCall:
    Identifier LEFT_PAREN (expression)* RIGHT_PAREN
    | Identifier '$' expression*;

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

fragment
DecimalNumeral
    :   '0'
    |   NonZeroDigit (Digits? | '_'+ Digits)
    ;

fragment
Digits
    :   Digit (DigitOrUnderscore* Digit)?
    ;

fragment
Digit
    :   '0'
    |   NonZeroDigit
    ;

fragment
NonZeroDigit
    :   [1-9]
    ;

fragment
DigitOrUnderscore
    :   Digit
    |   '_'
    ;

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