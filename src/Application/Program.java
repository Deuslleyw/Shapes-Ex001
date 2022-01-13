package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entitites.Rectangle;
import entitites.shape;
import entitites.enums.Color;
import entitites.Circle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int a = sc.nextInt();
		
		for (int i=1; i<=a; i++) {
			
			System.out.println("Shape #" + i + " data");
			
			
			
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			if(ch == 'r') {
				System.out.print("Width: ");
				double whidth = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				list.add(new Rectangle(color, whidth, height));
			
			}
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for( shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
