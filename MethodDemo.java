import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
/**
 * 
 * @author SM Nazibullah Touhid
 * Prof. Tanes Kanchanawanchai
 * CSC 200
 * April 12, 2017
 * License: GMU
 * Program:
 * Implement a single java class and create the methods to find the following math expressions
 * h(x) = x^10
 * f(x,y) = x + y
 * g(x,y,z) = squrt(x) + absolute(y) + z^y
 * 
 *Purpose of the program:
 *To understand use of Methods
 */
public class MethodDemo extends Application{
	public void start(Stage primaryStage){
		Alert alert= new Alert(AlertType.INFORMATION);
		alert.setContentText("The answer is "+power(inputpow(),inputpow2()));
		alert.showAndWait();
		alert.setContentText("the answer for f(x,y) = x + y is "+add(inputadd(), inputadd2()));
		alert.showAndWait();
		alert.setContentText("the answer for g(x,y,z) = squrt(x) + absolute(y) + z^y is "+ absolute(inputabslt(), inputabslt(), inputabslt()));
		alert.showAndWait();
		
	}
public static int inputpow(){
	TextInputDialog dialog= new TextInputDialog();
	dialog.setContentText("Enter a Number");
	dialog.showAndWait();
	String input=dialog.getResult();
	int num=Integer.parseInt(input);
	return num;
}
public static int inputpow2(){
	TextInputDialog dialog= new TextInputDialog();
	dialog.setContentText("Enter the power of the number");
	dialog.showAndWait();
	String input=dialog.getResult();
	int pow=Integer.parseInt(input);
	return pow;
}
public static int inputadd(){
	TextInputDialog dialog= new TextInputDialog();
	dialog.setContentText("Enter Numbers for f(x,y) = x + y");
	dialog.showAndWait();
	String input=dialog.getResult();
	int num1=Integer.parseInt(input);
	return num1;
}
public static int inputadd2(){
	TextInputDialog dialog= new TextInputDialog();
	dialog.setContentText("Enter Numbers for f(x,y) = x + y");
	dialog.showAndWait();
	String input=dialog.getResult();
	int num2=Integer.parseInt(input);
	return num2;
}
	
public static String power(int num, int pow){
	
	int answer=1;
	for(int count=1;count<=pow;){
		answer=answer*num;
		count++;
		}
	String result=Integer.toString(answer);
	return result;
}

public static String add(int num1, int num2){
	int ans=num1+num2;
	String result=Integer.toString(ans);
	return result;
	
}

public static int inputabslt(){
	TextInputDialog dialog= new TextInputDialog();
	dialog.setContentText("Enter a numbers to find g(x,y,z) = squrt(x) + absolute(y) + z^y");
	dialog.showAndWait();
	String num=dialog.getResult();
	int result=Integer.parseInt(num);
	return result;			
}
public static String absolute(int num1, int num2, int num3){
	double t=1.0;
	double sqrt=num1/2;
	do{
		t=sqrt;
		sqrt=(t+(num1/t))/2;
	}while((t-sqrt)!=0);
	
	int output;
	if(num2>=0){
		output= num2;}
	else{
		output=(-1*num2);
		}
	
	int answer=1;
	for(int count=1;count<=output;){
		answer=answer*num3;
		count++;
		}
	
	double result=answer+output+sqrt;
	String resultstrg=Double.toString(result);
	return resultstrg;	
}



}
