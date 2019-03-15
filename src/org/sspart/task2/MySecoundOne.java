package org.sspart.task2;

import org.sspart.task1.MyFirstOne;

public class MySecoundOne {
	public boolean printData() throws Exception {
		try {
		System.out.println("i am in my secound one");
		String str="ankitha";
		int j=9;
		int i=Integer.parseInt(str);
		return true;
		
		
	}catch (Exception e) {
		return false;
	}
	}
		public static void printAnotherData() {
			System.out.println("i am in my secound one and in static method");
			
		
		
	}
		public MyFirstOne methodName() {
			MyFirstOne myfirstone= new MyFirstOne();
			return myfirstone;
		}
		public MyFirstOne returnMyfirstOneObject() {
		
			return  new MyFirstOne();
			
		}

			public String stringReturnMethod() {
				String str="";
				return str;
			}
           public String stringReturnMethod1() {
        	   return "";
        	   
           }

    	
		
    	
	}


