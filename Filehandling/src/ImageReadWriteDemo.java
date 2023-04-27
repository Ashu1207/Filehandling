import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class ImageReadWriteDemo {
public static void main(String[] args)throws Exception{
File file=new File("C:\\Users\\CORECOMP\\Pictures\\signature.jpg");
FileInputStream fis=new FileInputStream(file);
FileOutputStream fos=new FileOutputStream("D:\\signature.jpg");
int p;
while((p=fis.read())!=-1) {
	System.out.print((char)p);
	fos.write(p);
}
fos.close();
System.out.println("Success");
	}

}
