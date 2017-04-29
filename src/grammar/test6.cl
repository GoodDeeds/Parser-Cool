(*
Program to accept two integers and tell which is larger
*)
class TwoInts {
	a : Int;
	b : Int;
	twoInts(x : Int, y : Int) : SELF_TYPE {
		{
			a <- x;
			b <- y;
			self;
		}
	};
	checkLarger() : Int {
		{
			if b < a
			then a
			else b
			fi;
		}
	};
};

class Main inherits IO {
	a : Int;
	b : Int;
	result : Int;
	twoInts_object : TwoInts <- new TwoInts;
	main() : SELF_TYPE {
		{
			out_string("Enter two integers : \n");
			a <- in_int();
			b <- in_int();
			twoInts_object.twoInts(a,b);
			result <- twoInts_object.checkLarger();
			out_string("The result is : ");
			out_int(result);
			out_string("\n");
			self;
		}
	};
};

(*
#include <iostream>
using namespace std;

class TwoInts
{
	private:
		int a, b;
	public:
		TwoInts(int x, int y)
		{
			a = x;
			b = y;
		}
		int checkLarger()
		{
			return (a > b) ? a : b;
		}
};

int main()
{
	int a, b;
	cout << "Enter two integers : " << endl;
	cin >> a >> b;
	TwoInts twoints(a,b);
	int result = twoints.checkLarger();
	cout << "The result is : " << result;
	return 0;
}

*)
