grammar Shambda;

file:
    (typeDefinition | setImport | memberDeclaration)* EOF;

setImport:
    'import' (Identifier | Integer) ('.' (Identifier | Integer))* DOUBLE_SEMI_COLON;

typeDefinition:
    'type' Identifier LCURLY (parameter SEMI_COLON)* RCURLY DOUBLE_SEMI_COLON;

memberDeclaration:
    parameter+ EQUAL_SIGN functionBody;

functionBody:
    statement (SEMI_COLON statement)* DOUBLE_SEMI_COLON;

UnsignedInteger:
    'u' Integer;

UnsignedLong:
    'u' LongNumber;

LongNumber:
    Digits LONG_TERMINATOR;

DoubleNumber:
    Digits (PERIOD Digits)? ('d' | 'D');

FloatingPointNumber:
    Digits (PERIOD Digits)? FLOAT_TERMINATOR;

Boolean:
    'true' | 'false';

UniformDeclaration
    : 'uniform'
    ;

constantExpression:
    Integer | FloatingPointNumber | LongNumber | DoubleNumber | UnsignedInteger | UnsignedLong | Boolean;

Integer:
    Digits;

expression
    : '!' expression                                            #dereferenceExpr
    | SubOperator expression                                    #unaryMinusExpr
    | functionCall                                              #functionCallExpr
    | constantExpression                                        #constantExpressionExpr
    | Identifier                                                #idExpr
    | expression '[' expression ']'                             #elementAccessExpr
    | expression '.' Identifier                                 #accessExpr
    | LEFT_PAREN expression RIGHT_PAREN                         #wrappedExpr
    | expression MultOperator expression                        #multExpr
    | expression DivOperator expression                         #divExpr
    | expression SubOperator expression                         #minusExpr
    | expression AddOperator expression                         #plusExpr
    | UniformDeclaration                                        #uniformExpr
    | ProvidedFunction                                          #providedExpr
    ;

ProvidedFunction
    : 'provided'
    ;

fragment BinaryOperatorSuffix
    : ('.'|'..'|'l'|'u'|'ul'|'lu')?
    ;

MultOperator
    : '*' BinaryOperatorSuffix
    ;

DivOperator
    : '/' BinaryOperatorSuffix
    ;

AddOperator
    : '+' BinaryOperatorSuffix
    ;

SubOperator
    : '-' BinaryOperatorSuffix
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

type
    : Identifier                                        #baseType
    | Identifier LEFT_PAREN type RIGHT_PAREN            #compositeType
    | type '#' storageClass                             #pointerType
    | type '#' LEFT_PAREN storageClass RIGHT_PAREN      #pointerType
    | type '[' Integer ']'                              #arrayType
// TODO: Decide if should be kept as it is
//    | type '[' expression ']'                           #runtimeArray
    ;

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

LCURLY:
    '{';

RCURLY:
    '}';

FLOAT_TERMINATOR
    : 'f'
    | 'F';

LONG_TERMINATOR
    : 'L'
    | 'l';

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