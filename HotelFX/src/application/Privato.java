package application;

public class Privato extends Cliente{

	private String nome;
	private String Cognome;
	private int numeroTelefono;

	public Privato(String nome, String cognome, int numeroTelefono) {
		this.nome = nome;
		Cognome = cognome;
		this.numeroTelefono = numeroTelefono;
	}

	public Privato() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		Cognome = cognome;
	}

	public int getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

}
