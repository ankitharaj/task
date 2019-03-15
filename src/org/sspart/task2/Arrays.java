package org.sspart.task2;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String[] str= getarray();
     String[][] doubleDimention= {{"anki","ankitha","raj"},{"anki","ankitha","raj"}};
     String[] str1=new String[str.length];
     str1[0]="anki";
     str1[1]="ankitha";
     str1[2]="raj";
     
     
     
     for(int i=0;i<str.length;i++) {
    	 System.out.println(str[i]);
     }
     for(int i=0; i<doubleDimention.length;i++) {
    	 for(int j=0; j<doubleDimention[i].length;j++) {
    		 System.out.println(doubleDimention[i][j]);
    	 }
     }
     System.out.println("yes its done");
	}
 public static String[] getarray() {
	 String[] str= {"anki","ankitha","raj"};
	 return str;
 }
}
