package telefonbuch;

public class NotValidEntryException extends Exception  {
	
	public NotValidEntryException(){
		super("Ich bin deine Exception");
	}

	public NotValidEntryException(String fehlermeldung){
		super(fehlermeldung);
	}
}
