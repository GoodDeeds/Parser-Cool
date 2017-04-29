(*
A class should be of the form class TYPE [inherits TYPE] { [[feature; ]] ∗ }
*)

class CorrectClass {
	func1() : Int {
		0
	};
	func2() : String {
		"A"
	};
};

class InheritTest inherits CorrectClass {
	
};
