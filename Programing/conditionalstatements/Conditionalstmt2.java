import java.util.*;
public class Conditionalstmt2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int value1,value2;
		char operator;
		value1=input.nextInt();
		value2=input.nextInt();
		operator=input.next().charAt(0);
		switch(operator)                   //switch is also a conditional statement based on the results in switch case will be executed
		{
		case '+':
			System.out.print(value1+value2);
			break;
		case '-':
			System.out.println(value1-value2);
			break;
		case '*':
			System.out.println(value1*value2);
			break;
		case '/':
			System.out.println(value1/value2);
			break;
		}
		input.close();
	}
}
