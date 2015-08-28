import java.util.Scanner;


public class CalculatorApp {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the the first number? : ");
		int first = sc.nextInt();
		System.out.println("1 - Addition");
		System.out.println("2 - Subtraction");
		System.out.println("3 - Multiplication");
		System.out.println("4 - Division");
		System.out.println("5 - Modulus");
		System.out.println("What do you want to do? : ");
		int sign = sc.nextInt();
		System.out.println("What is the second number ? : ");
		int second = sc.nextInt();
		System.out.println(helper(first, sign, second));
				
	}
	
	public static String helper(int first, int sign, int second){
		char c;
		int result;
		switch(sign){
		case 1:
			c = '+';
			result = first + second;
			break;
		case 2:
			c = '-';
			result = first - second;
			break;
		case 3:
			c = '*';
			result = first * second;
			break;
		case 4:
			c = '/';
			result = first / second;
			break;
		case 5:
			c = '%';
			result = first % second;
		default:
			c = ' ';
			result = 0;
		}
		return String.valueOf(first) + " " + c + " " + second + " = " + String.valueOf(result);
	}

}
