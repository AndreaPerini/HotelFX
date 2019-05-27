package model;

public class Camera {

	private int numeroCamera = 0;
	private float prezzoMinimo;
	private float prezzoMassimo;
	private int numeroPostiLetto;
//	private Cliente[] clienti = new Cliente[365];
	private Cliente [][] clienti = new Cliente [12][];
	

	public Camera() {
		this.numeroCamera = numeroCamera++;
		for(int i=0; i<31; i++) {//gennaio
			clienti[0][i] = null;
		}
		for(int i=0; i<28; i++) {//febbraio
			clienti[0][i] = null;
		}
		for(int i=0; i<31; i++) {//marzo
			clienti[0][i] = null;
		}
		for(int i=0; i<30; i++) {//aprile
			clienti[0][i] = null;
		}
		for(int i=0; i<31; i++) {//maggio
			clienti[0][i] = null;
		}
		for(int i=0; i<30; i++) {//giugno
			clienti[0][i] = null;
		}
		for(int i=0; i<31; i++) {//luglio
			clienti[0][i] = null;
		}
		for(int i=0; i<31; i++) {//agosto
			clienti[0][i] = null;
		}
		for(int i=0; i<30; i++) {//settembre
			clienti[0][i] = null;
		}
		for(int i=0; i<31; i++) {//ottobre
			clienti[0][i] = null;
		}
		for(int i=0; i<30; i++) {//novembre
			clienti[0][i] = null;
		}
		for(int i=0; i<31; i++) {//dicembre
			clienti[0][i] = null;
		}
	}

	public float getPrezzoMinimo() {
		return prezzoMinimo;
	}

	public void setPrezzoMinimo(float prezzoMinimo) {
		this.prezzoMinimo = prezzoMinimo;
	}

	public float getPrezzoMassimo() {
		return prezzoMassimo;
	}

	public void setPrezzoMassimo(float prezzoMassimo) {
		this.prezzoMassimo = prezzoMassimo;
	}

	public int getNumeroPostiLetto() {
		return numeroPostiLetto;
	}

	public void setNumeroPostiLetto(int numeroPostiLetto) {
		this.numeroPostiLetto = numeroPostiLetto;
	}
	
	public void setClienti(Cliente cliente, int giorno, int mese) {
		this.clienti[giorno-1][mese-1] = cliente;
	}
	
	public boolean isVuota(int giorno, int mese) {
		if(clienti[giorno-1][mese-1]==null)return true;
		return false;
	}

	public Cliente getClienti(int giorno, int mese) {
		return clienti[giorno-1][mese-1];
	}

}
