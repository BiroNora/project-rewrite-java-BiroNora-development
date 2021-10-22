# Project rewrite

## Story

This kind of exercise is a classic: your task is to reimplement some basic
built-in functionalities of a language or its standard library for pedagogical
reasons without using built-in functionalities or the standard library itself.
Caveat: don’t use such code in your commercial projects!

## What are you going to learn?

- Practice the basics of the language.
- Get familiar with a few simple algorithms.

## Tasks

1. Implement the `min(int x, int y)` function for two integers as inputs.
    - From any two integers, the lesser is returned.
    - No built-in functions are used.

2. Implement the `max(int[] values)` function for an array of integers.
    - From any array of integers, the greatest is returned.
    - No built-in functions are used.

3. Implement the `length(int[] values)` function for an array of integers which returns the length of the array.
    - For any integer array, the number of its elements is returned.
    - No built-in functions are used.

4. Implement the `multiply(int x, int y)` function for integers as inputs. Do not use the `*` and `/` operators or any built-in functions. You can use `+`.
    - For any two integer inputs the returned value equals the result of `x * y`.
    - Neither `*`, `/` nor any built-in functions are used.

5. Implement the `pow(int x, int y)` function for integer base numbers and positive integer exponents. Do not use any built-in functions. You can use `*`.
    - For inputs from the specified domain, the returned value equals the result of `Math.pow(x, y)`. Both the inputs and the return value must be integers).
    - No built-in functions are used.

6. [OPTIONAL] Implement the `divmod(int x, int y)` function for two integers as inputs. Do not use the `/` and the `%` operator or any built-in functions. The return value must be an `int[]` where the first value is equal to the value of `x / y` and the second value is equal to the value of `x % y`.
    - For any two positive integer inputs the returned value equals `[x / y, x % y]`.
    - For any two +/- integer inputs the returned value equals `[x / y, x % y]`.
    - Neither `/`, `%`, nor any built-in functions are used.

## General requirements

- In general, do not use any built-in functions.

## Hints

- How to look for the greatest value in a list?
  Iterate through the list.
  Keep track of the greatest value by storing it in a variable.
  Compare the variable at every iteration with the current list element.
  If the variable is smaller than the current list element - replace it.
  At the end of the loop it will hold the answer.
- To get a length, you can iterate and count.
- Integer multiplication is basically addition a given number of times.
- An integer power function is basically multiplication a given number of times.
- How can you divide and calculate modulo _without_ actually dividing?
  Try to add up numbers until you reach the goal! We'll test only with
  not too large numbers (between `-100` and `100`).
  Also, reproducing integer divison can be tricky, as the result is always
  rounded towards 0: `4/5` is `0` and `-4/5` is also `0`.


## Background materials

- <i class="far fa-exclamation"></i> [Java Data Types](https://www.w3schools.com/java/java_data_types.asp)
- <i class="far fa-exclamation"></i> [Control structures](https://www.baeldung.com/java-control-structures)
- <i class="far fa-exclamation"></i> [Java Methods](https://www.w3schools.com/java/java_methods.asp)
- <i class="far fa-exclamation"></i> [Java Method Parameters](https://www.w3schools.com/java/java_methods_param.asp)

