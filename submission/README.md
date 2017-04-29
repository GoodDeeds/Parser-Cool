# COOL Compiler #

This project starts the building of a Parser for Cool.

### The Code and Design

* The modification made to the code is adding the grammar rules as specified in the Cool manual.
* Each rule has been expressed using the tokens for the corresponding symbols created by the Lexer.
* Multiple rules are separated using a |
* Code for construction of an AST has not been written. The code returns an AST with a null root.
* ANTLR checks that the input file satisfies the grammar specified in the code.
* For correct input, the parsing is successful, and the program proceeds to working with the AST. As the AST's root is null, the program then terminates with a null pointer exception.
* For incorrect input, it prints an error message corresponding to the first error found in the file.

### The Test Cases

* For each non-terminal in the grammar of Cool, a test case has been provided to verify each production of the non-terminal.
* For each such non-terminal, additional test cases have been provided, with each test case breaking one of the production rules of that non-terminal.
* There are 52 test cases in all.

#### test1.cl 
* This tests for the productions for program.
* test1_*.cl files break the rules in these productions.

#### test2.cl 
* This tests for the productions for class.
* test2_*.cl files break the rules in these productions.

#### test3.cl 
* This tests for the productions for feature.
* test3_*.cl files break the rules in these productions.

#### test4.cl 
* This tests for the productions for formal.
* test4_*.cl files break the rules in these productions.

#### test5.cl 
* This tests for the productions for expr.
* test5_*.cl files break the rules in these productions.

* Additional test cases with larger, syntactically correct programs have also been provided.
* As each production rule is tested by the test cases, these test cases give a good indication that the parser functions correctly.
