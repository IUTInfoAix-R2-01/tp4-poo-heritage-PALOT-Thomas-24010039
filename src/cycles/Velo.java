package cycles;
import java.util.Random;

public class Velo {
	private final double braquet;
	private double diamRoue;
	private Random genAlea;

	
	public Velo (double braquet, double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
	}
	
	public Velo (double braquet) {
		this.braquet = braquet;
	}
	
	public Velo () {
		braquet = 13.0;
	}
	
	public Random getGenAlea() {
		return genAlea;
	}
	
	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}
	
	public double getBraquet() {
		return braquet;
	}
	
	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}
	
	public double getDiamRoue() {
		return diamRoue;
	}
	
	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}

	public String toString() {
		return "Velo [braquet=" + braquet + ", diamRoue=" + diamRoue + ", genAlea=" + genAlea + "]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return FrequenceCoupsDePedale * braquet * diamRoue * genAlea.nextDouble();
	}
	

public static void main(String[] args) {
	Velo v1 = new Velo();
	System.out.println(v1);
	Velo v2 = new Velo(15.0, 10.5);
	Random genAlea = new Random();
	v2.setGenAlea(genAlea);
	System.out.println(v2.getBraquet());
	System.out.println(v2.getDiamRoue());
	System.out.println(v2.getPuissance(50));
	}
}
