package com.vinay.Design_Patterns.StructuralDesignPatterns.BridgePattern;

public class RedCircle implements DrawAPI {
	   public void drawCircle(int radius, int x, int y) {
	      System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
	   }
	}