package serialisierung;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MainAutoSerial {

	public static void main(String[] args) {
		
		Auto auto1 = new Auto("Schwarz", new Motor(2000));
		
		try (OutputStream fos= new FileOutputStream("Java/serialisierung/auto.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos))
		{
			oos.writeObject(auto1);
			oos.close();
		}
		
		catch (IOException e)
		{
			e.printStackTrace();
			
		}
	}
}
