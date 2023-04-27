package com.app;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserillization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileInputStream fis =new FileInputStream("D:/product.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Object o=ois.readObject();
	Product p=(Product)o;
	System.out.println(p);
}catch (Exception e) {
	e.printStackTrace();
	
}
	}

}
