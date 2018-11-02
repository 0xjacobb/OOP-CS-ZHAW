package serialisierung;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class MainAutoDeSerialisieren {

	public static void main(String[] args) {
		Auto auto = null;

			try {
				InputStream fis = new FileInputStream("Java/serialisierung/auto.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);

				auto = (Auto) ois.readObject();
				ois.close();

				System.out.println("Farbe: " + auto.getFarbe());
				System.out.println("Hubraum: " + auto.getMotor().getHubraum());
				
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}


		if (auto != null) {
			System.out.println("Farbe: " + auto.getFarbe());
			System.out.println("Hubraum: " + auto.getMotor().getHubraum());
		}

	}

}
