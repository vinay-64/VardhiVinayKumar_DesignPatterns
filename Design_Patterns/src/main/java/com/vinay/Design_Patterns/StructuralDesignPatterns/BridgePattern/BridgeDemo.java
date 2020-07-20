package com.vinay.Design_Patterns.StructuralDesignPatterns.BridgePattern;

public class BridgeDemo {
	public static void main(String[] args) {
	      Shape redCircle = new Circle(100,100, 10, new RedCircle());
	      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

	      redCircle.draw();
	      greenCircle.draw();
	   }
}
