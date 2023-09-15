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
}
