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
			
			for (int j = 0; j < rectangles[i].height; j++) {
				for (int k = 0; k < rectangles[i].base; k++) {
					if (j == 0 || j == rectangles[i].height - 1) {
						if (k != rectangles[i].base - 1) {
							System.out.print("0");
						} else {
							System.out.print("0\n");
						}
					} else if (k == 0) {
						System.out.print("0");
					} else if (k == rectangles[i].base - 1) {
						System.out.print("0\n");
					} else {
						System.out.print(" ");
					}
				}
			}
			
			System.out.println("\n\n");
		}
	}	
}
