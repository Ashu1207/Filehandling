package com.app;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
File file=new File("D:/Product.txt");
FileOutputStream fos=new FileOutputStream(file);
Product p= new Product();
p.setPid(101);
p.setpName("Mobile");
p.setQty(100);
p.setPrice(14900.89);

ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(p);
oos.close();
System.out.println("success");

	}

}
