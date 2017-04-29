(*
A feature must be of the form feature ::= ID( [ formal [[, formal]] ∗ ] ) : TYPE { expr }
										| ID : TYPE [ <- expr ]

*)
class Test {
	object(id : TypeA) : TypeB { expr };
	anobject(idA : TypeA, idB : TypeB, idC : TypeA) : TypeA {
		object	
	};
	
	object() : Type { expr };

	id : Type; 

	id : Type <- 0;
};


