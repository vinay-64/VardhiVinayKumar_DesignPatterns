package com.vinay.Design_Patterns.BehavioralDesignPatterns.IteratorPattern;

public class IteratorDemo {
	public static void main(String[] args) {
	      NameRepository namesRepository = new NameRepository();

	      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      } 	
	   }
}
