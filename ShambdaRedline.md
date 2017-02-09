The Shambda Shading language
============================

Reason
======
Most shading languages perform very simple operations, shaders don't very often interact with their other invocations
and can be paralleled, which is why a functional language might fit the role of a shading language.

Goal
====
Creating a shader language, usable for Vulkan applications, that allows to program the shading with functional programming.
Every shader made with GLSL must be translatable into Shambda.

The syntax must be **concise** and easily **readable**.