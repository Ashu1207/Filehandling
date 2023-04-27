import java.io.File;
import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args)throws Exception{
		
		File file=new File("E:\\my file.pdf");
		FileReader fr=new FileReader(file);
int d;
//System.out.println(char)d);
while((d=fr.read())!=-1) {
	System.out.print((char)d);
}
	
	}
}
