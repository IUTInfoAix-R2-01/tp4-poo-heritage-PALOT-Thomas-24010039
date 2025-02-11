package cycles;

import java.util.Random;

public class VeloElec extends Velo{
	private final double facteurPuissanceMoteur;
	
	
	public VeloElec(double braquet, double diamRoue, double coupleMoteur) {
		super(braquet, diamRoue);
		facteurPuissanceMoteur = coupleMoteur;
	}
		
	public VeloElec(double diamRoue, double coupleMoteur) {
		super(13.0, diamRoue);
		facteurPuissanceMoteur = coupleMoteur;
	}
	
	public VeloElec () {
		facteurPuissanceMoteur = 15.0;
	}
	
	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}
	
	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}

	@Override
	public String toString() {
		return "VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	
	@Override
	public double getPuissance(double frequenceCoupsDePedale) {
		return super.getPuissance(frequenceCoupsDePedale) * facteurPuissanceMoteur;
	}
	
	
	public static void main(String[] args) {
		VeloElec v1 = new VeloElec();
		System.out.println(v1);
		System.out.println(v1.getBraquet());
		VeloElec v2 = new VeloElec(15.0, 10.5);
		Random genAlea = new Random();
		v2.setGenAlea(genAlea);
		System.out.println(v2.getDiamRoue());
		System.out.println(v2.getPuissance(50));
		
		}
	
}
