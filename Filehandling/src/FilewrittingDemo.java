import java.io.File;
import java.io.FileWriter;
public class FilewrittingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
File file=new File("E:\\My file.pdf");
FileWriter fw=new FileWriter(file,true );
fw.write(" Hello");
fw.close();
System.out.println("success");
		}catch(Exception e) {
			e.printStackTrace();
	}
	}
}
