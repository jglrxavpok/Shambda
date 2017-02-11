Shambda
======
Functional shading language aimed to be compiled to a SPIR-V module.

Syntax
------

Declarations
------------
All declarations must finish with a double semicolon: ```;;```

**Constant declaration:**
```
constant <name>:<type> = <constant expression>;;
constant <name> = <constant expression>;;
```
Creates a new constant with the given value. The type is optional and can be inferred from the expression.

---
**Uniform declaration:**
```
uniform <name>:<type>;;
```
Declares an uniform. As uniforms cannot be initialized, it is mandatory to reference its type.

---
**Fonction declaration:**
```
<function name>:<return type> param1:<type of param1> param2:<type of param2> = <statements>;;
<function name> param1 param2 = <statements>;;
```
Declares a new function with the given name and return type (optional when inference is possible).
Each parameter type is optional, except for the case of *Stage functions*.

A statement can be:
* A local variable declaration ```let <name> := <expression>;;```
* Reassigning a value to a local variable ```<name> := <expression>;;```
* An expression (see *Expressions*)

Statements must be separated by **single** semicolons ```;```.

---
**Literals:**

Integers (32 bits): ```42, -946, 45_555```

Floating point numbers (32 bits): ```4f, 58.57f, 3.14159f```

Long integers (64 bits): ```42L, -946L, 45_555L```

Doubles (64 bits floating point numbers): ```4d, 58.57d, 3.14159d```

Unsigned integers: ```u59865```

Unsigned long integers: ```u4564L```

Booleans: ```true, false```

---
**Function calls:**
```
f(arg1 arg2)
```
```f()``` should be used for functions taking no arguments

---
**Using a function as an argument:**
Just specify the name:
```
myfunc number = add (number 1f);;
[...]
functionTakingOtherFunction (myfunc);; (types ommited)
```

---
**Identifiers:**

Shambda follows the same rules as Java for its identifiers with a single exception, single letter names are not allowed:

```a```, ```_```, ```é``` are all not valid in Shambda.

Accents are discouraged since they can lead to issues with encodings.

---
**Base types:**

```int32, int64```: integer and long integer types

```float32, float64```: floating point and double precision types

```bool```: boolean type

```uint32, uint64```: unsigned integer and unsigned long integer types


```vec<size>(<component type>)``` (eg. ```vec4(bool)```: 4-dimensional boolean vector): vector of given size with constituents of type 'component type'

```mat<size>(<vector type>)``` (eg. ```mat4(vec4(float32))```: 4x4 float matrix): matrix with 'size' columns and each column is of type 'vector type'

```<type>*```: pointer type pointing to 'type'


File Structure
--------------
In a Shambda file, you can find declarations of constants, uniforms and functions.

---
**Stage functions:**

Each shader stage is represented by a function named with the name of said stage (eg. ```fragment = vec4(1f 1f 1f 1f);;``` is a fragment shader returning the color white for each pixel)

Supported stage are:
* 'fragment': Returns a vec4(float32) representing the ouput color as a RGBA float vector. Parameters are equivalent to the input in a fragment shader.
* 'vertex': Returns a vec4(float32) representing the position on screen of the vertex. Parameters are equivalent to the input in a vertex shader. The order of the parameters define their layout location.