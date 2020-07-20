package com.vinay.Design_Patterns.StructuralDesignPatterns.BridgePattern;

public abstract class Shape {
	   protected DrawAPI drawAPI;
	   
	   protected Shape(DrawAPI drawAPI){
	      this.drawAPI = drawAPI;
	   }
	   public abstract void draw();	
	}
