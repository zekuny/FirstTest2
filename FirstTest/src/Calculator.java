public class Calculator {
	public double addition(double num1, double num2){
		return num1 + num2;
	}
	
	public double substraction(double num1, double num2){
		return num1 - num2;
	}
	
	public double multiplication(double num1, double num2){
		return num1 * num2;
	}
	
	public double division(double num1, double num2){
		return num1 / num2;
	}
	
	public double modulus(double num1, double num2){
		return num1 % num2;
	}
	
	
	
	
	public double calculate(double first, char sign, double second){
		switch(sign){
		case '+':
			return addition(first, second);
		case '-':
			return substraction(first, second);
		case '*':
			return multiplication(first, second);
		case '/':
			return division(first, second);
		case '%':
			return modulus(first, second);
		default:
			return 0.0;
		}
	}
}
