package com.vinay.Design_Patterns.BehavioralDesignPatterns.IteratorPattern;

public class NameRepository implements Container {
	   public String names[] = {"Sachin" , "Virat" ,"Rohit" , "Lara"};

	   public Iterator getIterator() {
	      return new NameIterator();
	   }

	   private class NameIterator implements Iterator {

	      int index;

	      public boolean hasNext() {
	      
	         if(index < names.length){
	            return true;
	         }
	         return false;
	      }

	      public Object next() {
	      
	         if(this.hasNext()){
	            return names[index++];
	         }
	         return null;
	      }		
	   }
	}