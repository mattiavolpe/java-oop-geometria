package org.lessons.java.geometria;

public class Rettangolo {
	public int base;
	public int height;
	
	Rettangolo(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	public int calcolaArea() {
		return this.base * this.height;
	}
	
	public int calcolaPerimetro() {
		return (this.base + this.height) * 2;
	}
	
	public void disegna() {
		for (int j = 0; j < this.height; j++) {
			for (int k = 0; k < this.base; k++) {
				if (j == 0 || j == this.height - 1) {
					if (k != this.base - 1) {
						System.out.print("0");
					} else {
						System.out.print("0\n");
					}
				} else if (k == 0) {
					System.out.print("0");
				} else if (k == this.base - 1) {
					System.out.print("0\n");
				} else {
					System.out.print(" ");
				}
			}
		}
	}
}
