package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rettangolo[] rectangles = new Rettangolo[3];
		
		for (byte i = 1; i <= 3; i++) {
			System.out.print("Insert rectangle " + i + " base value: ");
			int base = sc.nextInt();
			System.out.print("Insert rectangle " + i + " height value: ");
			int height = sc.nextInt();
			
			rectangles[i - 1] = new Rettangolo(base, height);
		}
		
		for (byte i = 0; i < rectangles.length; i++) {
			System.out.println("\nRectangle " + (i + 1) + " base: " + rectangles[i].base);
			System.out.println("Rectangle " + (i + 1) + " height: " + rectangles[i].height);
			System.out.println("Rectangle " + (i + 1) + " area: " + rectangles[i].calcolaArea());
			System.out.println("Rectangle " + (i + 1) + " perimeter: " + rectangles[i].calcolaPerimetro());
		}
	}	
}
