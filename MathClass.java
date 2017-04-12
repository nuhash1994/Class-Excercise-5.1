import java.util.Scanner;

public class MathClass {
	public static void main(String[] args){
		Scanner keyboard= new Scanner(System.in);
		System.out.println("\nEnter a number: ");
		double num1=keyboard.nextDouble();
		System.out.println("\nEnter the power for the number: ");
		double pow=keyboard.nextDouble();
		System.out.println("\nThe anser for "+num1+" to the power "+pow+" is "+Math.pow(num1,pow)); 
		System.out.println("Enter a number to find its square root: ");
		int num2=keyboard.nextInt();
		System.out.println("\nThe square root of "+num2+" is "+Math.sqrt(num2)); 
		System.out.println("Enter a number: ");
		int num3=keyboard.nextInt();
		System.out.println("\nThe absolute value of "+num3+" is "+Math.abs(num3)); 
		System.out.println("Enter a number: ");
		int num4=keyboard.nextInt();
		System.out.println("\nradom value"+Math.random());
		System.out.println("Enter a number: ");
		double num5=keyboard.nextDouble();
		System.out.println("\nEnter another number to compare: ");
		double num6=keyboard.nextDouble();
		System.out.println("\nThe greater value between "+num4+" and "+num6+" is "+Math.max(num5, num6)); 
		System.out.println("\nEnter a number: ");
		double num7=keyboard.nextDouble();
		System.out.println("\nEnter another number to compare: ");
		double num8=keyboard.nextDouble();
		System.out.println("\nThe smaller value between "+num7+" and "+num8+" is "+Math.min(num7, num8));
		System.out.println("Enter a double number: ");
		double num9=keyboard.nextDouble();
		System.out.println("\nThe round value of "+num9+" is "+Math.round(num9)); 
		System.out.println("Enter a double number: ");
		double num10=keyboard.nextDouble();
		System.out.println("\nThe round value of "+num10+" according to Math.ceil method is "+Math.ceil(num10));
		System.out.println("Enter a double number: ");
		double num11=keyboard.nextDouble();
		System.out.println("\nThe round value of "+num11+" according to Math.ceil method is "+Math.floor(num11));
		keyboard.close();
	}
		}
