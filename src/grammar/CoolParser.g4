parser grammar CoolParser;

options {
	tokenVocab = CoolLexer;
}

@header{
	import cool.AST;
	import java.util.List;
}

@members{
	String filename;
	public void setFilename(String f){
		filename = f;
	}

/*
	DO NOT EDIT THE FILE ABOVE THIS LINE
	Add member functions, variables below.
*/

}

/*
	Add Grammar rules and appropriate error messages(As per need). Return Null in first rule.
*/

program returns [AST.program value]	: 
						cl=class_list EOF 
							{
								/*  Null in $value */
								$value = null
							}
					;
