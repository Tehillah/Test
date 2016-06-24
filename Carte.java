package model;

public class Carte {

	private String typeCarte;
	private int numeroCarte;

	/**
	 * 
	 * @param typeCarte
	 * @param numeroCarte
	 */
	public Carte(String typeCarte, int numeroCarte) {
		// TODO - implement Carte.Carte
		// throw new UnsupportedOperationException();
	}

	public void retirer() {
		// TODO - implement Carte.retirer
		// throw new UnsupportedOperationException();
	}

	public void payer() {
		// TODO - implement Carte.payer
		// throw new UnsupportedOperationException();
	}

	public String getTypeCarte() {
		return this.typeCarte;
	}

	/**
	 * 
	 * @param typeCarte
	 */
	public void setTypeCarte(String typeCarte) {
		this.typeCarte = typeCarte;
	}

	public int getNumeroCarte() {
		return this.numeroCarte;
	}

	/**
	 * 
	 * @param numeroCarte
	 */
	public void setNumeroCarte(int numeroCarte) {
		this.numeroCarte = numeroCarte;
	}

	@Override
	public String toString() {
		return "Carte [typeCarte=" + typeCarte + ", numeroCarte=" + numeroCarte + "]";
	}

}