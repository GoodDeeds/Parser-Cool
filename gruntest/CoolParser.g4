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

/*program returns [AST.program value]	: 
						cl=class_list EOF 
							{
								/*  Null in $value */
						/*		$value = null;
							}
					;*/
program : class_list EOF;

class_list	:
		(class_s SEMICOLON)+
	;

class_s   :
		CLASS TYPEID (INHERITS TYPEID)? LBRACE (feature SEMICOLON)* RBRACE
	;
	


feature	:
		OBJECTID LPAREN (formal (COMMA formal)*)? RPAREN COLON TYPEID LBRACE expr RBRACE
	|	OBJECTID COLON TYPEID (ASSIGN expr)?
	;

formal	:
		OBJECTID COLON TYPEID
	;

expr	:
		OBJECTID ASSIGN expr
	|	expr (ATSYM TYPEID)? DOT OBJECTID LPAREN (expr (COMMA expr)*)? RPAREN
	|	OBJECTID LPAREN (expr (COMMA expr)*)? RPAREN
	|	IF expr THEN expr ELSE expr FI 
	|	WHILE expr LOOP expr POOL
	|	LBRACE (expr SEMICOLON)+ RBRACE
	|	LET OBJECTID COLON TYPEID (ASSIGN expr)? (COMMA OBJECTID COLON TYPEID (ASSIGN expr)?)* IN expr
	|	CASE expr OF (OBJECTID COLON TYPEID DARROW expr COMMA)+ ESAC
	|	NEW TYPEID
	|	ISVOID expr
	|	expr PLUS expr
	|	expr MINUS expr
	|	expr STAR expr
	|	expr SLASH expr
	|	TILDE expr
	|	expr LT expr
	|	expr LE expr
	|	expr EQUALS	expr
	|	NOT expr
	|	LPAREN expr RPAREN
	|	OBJECTID
	|	INT_CONST
	|	STR_CONST
	|	BOOL_CONST
	;


