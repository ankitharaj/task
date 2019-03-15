package org.sspart.task2;

public class Stringoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String firstString ="ankitha";
      String secoundString ="ankitha raj";
      
      System.out.println(firstString.charAt(3));
//      for
      for(int i=0;i<firstString.split("i").length;i++) {
    	  System.out.println(firstString.split("i")[i]);

    	  
      }
      if(firstString.isEmpty()) {
    	  System.out.println("it is empty");
    	  
      }else {
    	  System.out.println("it is not empty");
      }
      
      if(firstString.equals(secoundString)) {
    	  System.out.println("both are equal");
    	  
      }else {
    	  System.out.println("not equal");
      }
      if(firstString.equalsIgnoreCase(secoundString)) {
    	  System.out.println("both are same");
    	  
      }else {
    	  System.out.println("both are not same");
      }
      if(firstString.contains(secoundString)) {
    	  System.out.println("it contains");
    	  
      }else {
    	  System.out.println("it doent contains");
      }
	}

}
