[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/ivRc4nsj)
# Experiment 38: String Compression

## Problem Statement

Implement a method to perform basic string compression using the counts of repeated characters.
For example, the string `aabcccccaaa` would become `a2b1c5a3`.

**Constraint:** If the "compressed" string would not be smaller than the original string, your program should print the **original** string.

## Input Format

* A single string $S$.

## Output Format

* The compressed string or the original string (whichever is appropriate).

### Example 1

**Input:**

```text
aabcccccaaa
```

**Output:**

```text
a2b1c5a3
```

### Example 2

**Input:**

```text
abc
```

**Output:**

```text
abc
```

**Explanation for Ex 2:**
Compressed string is `a1b1c1` (length 6). Original string is `abc` (length 3).
Since the compressed string is longer, we return the original.
