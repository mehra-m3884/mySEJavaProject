/**
 * 
 */
package myJavaProject;

/**
 * @author win
 *
 */
import java.util.Scanner;
public class myAppTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello, Software Engg world");
		System.out.println("Enter a number");
		int n = input.nextInt();
		int result = n*n;
		
		System.out.println("The square of the number is");
		System.out.println(result);
	}

}
