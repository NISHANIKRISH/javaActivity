package file;
import java.io.*;
public class myfile {
public static void main(String[] args){
	try{
		FileOutputStream fs=new FileOutputStream("myfile.txt");
		String str="hello world";
		byte[] bt=str.getBytes();
		fs.write(bt);
		fs.flush();
		fs.close();


	}
	catch(IOException ex){
		System.out.println("IO error"+ex);
		
	}
}
}
