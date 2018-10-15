package bauernhof_2;

public class Kuh implements Tier, Comparable<Kuh>{
	private String name;
	private int gewicht;
	
	public Kuh(String name, int gewicht) {
		this.gewicht = gewicht;
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public int getGewicht() {
		return gewicht;
	}
	@Override
	public void gibLaut() {
		System.out.println("muuuuh");
	}
	
	@Override
    public int compareTo(Kuh obj) {
        return this.getName().compareTo(obj.getName());
        //return this.getGewicht() - obj.getGewicht();
    }
}
