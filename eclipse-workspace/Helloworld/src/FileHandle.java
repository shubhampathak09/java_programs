import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

@SuppressWarnings("unused")
public class FileHandle {
	@SuppressWarnings("resource")
	public static void main(String args[]) throws Exception
	{
		FileOutputStream fos=new FileOutputStream("Demo.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeUTF("DemoContent");
		
		
		FileInputStream fis= new FileInputStream("Demo.txt");
		DataInputStream dis=new DataInputStream(fis);
		String s=dis.readUTF();
		System.out.println(s);
		
	}

}