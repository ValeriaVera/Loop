import java.util.Scanner;
public class Rectangle {
	public static void main(String [] args) {
		Scanner scanner = new Scanner (System.in);
		
		int length = 0;
		int width = 0;
		int area = 0;
		int perimeter = 0;
		
		System.out.println("Enter the length of rectangle");
		length = scanner.nextInt();
		
		System.out.println("Enter the width of rectangle");
		width = scanner.nextInt();
		
		area = length * width;
		perimeter = 2 * (length + width);
		
		System.out.println("The area of rectangle is " + area);
		System.out.println("The perimeter of rectangle is " + perimeter);
		
	}
}
