package first;

//Operators
//1.Arithmetic -> +,-,*,/,%(modulo)
//2.Assignment -> =,+=,-+,*=,/=
//3.Logical -> && , || , !
//4.Unary -> ++,--
//5.Conditional ->  >,<,>=,<=,==
public class P003_Operators {
	public static void main(String[] args) {
		int a = 10, b = 10, c = 13, d = 45;
		System.out.println(a > b);

		// 1.Arithmetic -> +,-,*,/,%(modulo)

		String a1 = "java";
		System.out.println("addition of a and b = " + (a + b));
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);// reminder

		double base = 7, height = 3.5;
		System.out.println((base * height) / 2);

		double radius = 4;

		double area_of_circle = Math.PI * (radius * radius);
		System.out.println(area_of_circle);

		// 2.Assignment -> =,+=,-+,*=,/=
		int i = 12, j = 2, k = 0;
//		i+=j; //i = i+j;
//		i-=j; //i = i-j;
//		i*=j;
//		i/=j;
		double dd = 3.14;
		i += dd; // i = i+13;
		System.out.println("i = " + i);

		i += 13;// i=i+13;
		System.out.println(i);

		// 4.Unary -> ++,--
		int q = 11;
		q++;// q = q+1;->12
		q--;// 11
		System.out.println(q);
	}
}
