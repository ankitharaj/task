package org.sspart.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<String> str= new ArrayList<String>();
   str.add("anki");
   str.add("500072");
   str.add("kukatpally");
   
   for(int i = 0; i<str.size();i++) {
	   System.out.println(str.get(i));
	   
   }
	   Map<String,String> map=new HashMap<String, String>();
       map.put("name", "anki");
       map.put("pincode", "500072");
       map.put("address", "kukatpally");
       System.out.println(map.get("pincode"));
   }
   
	}


