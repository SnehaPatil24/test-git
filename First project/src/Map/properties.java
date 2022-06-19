package Map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class properties {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		// TO read key value pair from properties file
		//we will use class called as properties
		Properties prop=new Properties();
		
		//step 2-we need to tell/provide file path which we want to read
		//when ever you try to read file ,there is checked exception file not found
		//try catch and second is throws
		prop.load(new FileInputStream("D:\\core java(automation)\\First project\\resources\\one.properties"));

		//step 3-read properties from the file
		System.out.println(prop.getProperty("password"));
		
		//keys are case sansitive it means Firstname and firstname both different
		System.out.println(prop.getProperty("firstname"));
		
		//getproperty- i will help to read specific key from properties file
		//change value of key
		//setproperty
		prop.setProperty("password","1");
		prop.store(new FileWriter("D:\\core java(automation)\\First project\\resources\\one.properties"), "testing store");
		System.out.println(prop.getProperty("password"));
		//call method setproperties---two parameter key and new value
		//we have push change to file ---store method
		
		//1. create object of properties class
		//2.we give access to properties file to object using load method
		//3.if you want to read key-getproperties("keyname")
		//if you want to change key value then setproperty("key","newvalue")
		//and called store method
		Set<Entry<Object,Object>> t=prop.entrySet();
		Iterator<Entry<Object,Object>> itr = t.iterator();
		while(itr.hasNext())
		{
			Entry<Object,Object> j=itr.next();
			System.out.println(j.getKey()+" "+j.getValue());
		}
		//if you want to read all properties in one goal
		Properties p=System.getProperties();
		Set<Entry<Object,Object>> t1=p.entrySet();
		Iterator<Entry<Object,Object>> itr1 = t1.iterator();
		while(itr1.hasNext())
		{
			Entry<Object,Object> j1=itr1.next();
			System.out.println(j1.getKey()+" "+j1.getValue());
		}
		 
		
		
		
		
	}

}
