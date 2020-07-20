package com.vinay.Design_Patterns.CreationalDesignPatterns.SingletonPattern;

public class SingletonClass {
	private static SingletonClass instance = new SingletonClass();

	   private SingletonClass(){}

	   public static SingletonClass getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("This is Singleton Class !");
	   }
}
