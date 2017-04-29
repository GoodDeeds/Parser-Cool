(*
An expr must be of the form
expr ::= ID <- expr
| expr[@TYPE].ID( [ expr [[, expr]] ∗ ] )
| ID( [ expr [[, expr]] ∗ ] )
| if expr then expr else expr fi
| while expr loop expr pool
| { [[expr; ]] + }
| let ID : TYPE [ <- expr ] [[, ID : TYPE [ <- expr ]]] ∗ in expr
| case expr of [[ID : TYPE => expr; ]] + esac
| new TYPE
| isvoid expr
| expr + expr
| expr − expr
| expr ∗ expr
| expr / expr
|  ̃expr
| expr < expr
| expr <= expr
| expr = expr
| not expr
| (expr)
| ID
| integer
| string
| true
| false
*)

class Test {
	func1(id : Type) : ReturnType {
		{
			expr1;
			expr2;
		}
	};
	func2(id : Type) : ReturnType {
		{
			id <- expr;
			expr@Type.id(expr);
			expr.id();
			expr@Type.id(expr,expr);
			id();
			id(expr);
			id(expr1,expr2,expr3);
			if expr then expr else expr fi;
			if expr 
			then
			{
				expr1;
				expr2;
			}
			else
			{
				expr3;
				expr4;
			}
			fi;
			while expr loop expr pool;
			while expr 
			loop
			{
				expr1;
				expr2;
				expr3;
			}
			pool;
			let id : Type in expr;
			let id1 : Type1, id2 : Type2 in 
			{
				expr1;
				expr2;
			};
			case expr of 
			id : Type => expr;
			esac;
			case expr of 
			id1 : Type1 => expr1;
			id2 : Type2 => expr2;
			esac;
			new Type;
			isvoid expr;
			expr1 + expr2;
			expr1 - expr2;
			expr1 * expr2;
			expr1 / expr2;
			~ expr;
			expr1 < expr2;
			expr1 <= expr2;
			expr1 = expr2;
			not expr;
			(expr);
			id;
			123;
			"ABC";
			true;
			false; 
		}
	};
};
