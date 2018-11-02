package serialisierung;

import java.io.Serializable;

public class Motor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1153032940858150309L;
	public int hubraum;
	
	public Motor(int hubraum){
		super();
		this.hubraum = hubraum;
	}

	public int getHubraum() {
		return hubraum;
	}
}
