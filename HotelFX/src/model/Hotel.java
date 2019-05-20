package model;

public class Hotel {

	private Camera[] hotel = new Camera[20];

	public Hotel() {
	}
	
	public void inserisciCamera(Camera camera) {
		for (int i = 0; i < hotel.length; i++) {
			hotel[i] = camera;
		}
	}

	public void aggiungiCliente(int numeroCamera, Cliente cliente, int dataDa, int dataA) {
		boolean vuota = true;
		for (int i = dataDa; i < dataA; i++) {
			if (hotel[numeroCamera - 1].getClienti()[i] != null) {
				vuota = false;
			}
		}
		if (vuota) {
			for (int i = dataDa; i < dataA; i++) {
				hotel[numeroCamera - 1].getClienti()[i] = cliente;
			}
		} else {
			System.out.println("La camera non � disponibile per questo periodo");
		}
	}

	public void camereLiberePeriodo(int dataDa, int dataA) {
		boolean libera = true;
		for (int i = 0; i < hotel.length; i++) {
			for (int j = dataDa; j < dataA; j++) {
				if (hotel[i].getClienti()[j] != null) {
					libera = false;
				}
			}
			if (libera) {
				System.out.println("La camera " + i + 1 + " � libera");
			}
		}
	}

	public void cercaCliente(String nome, String cognome) {
		boolean trovato = false;
		for (int i = 0; i < hotel.length; i++) {
			for (int j = 0; j < hotel[i].getClienti().length; j++) {
				if ((hotel[i].getClienti()[j].getNome().equalsIgnoreCase(nome))
						&& (hotel[i].getClienti()[j].getCognome().equalsIgnoreCase(cognome))) {
					for (int k = j; k < hotel[i].getClienti().length; k++) {
						if ((hotel[i].getClienti()[j].getNome().equalsIgnoreCase(nome))
								&& (hotel[i].getClienti()[j].getCognome().equalsIgnoreCase(cognome))) {
						} else {
							System.out.println("Il cliente " + nome + " " + cognome + " occupa la stanza " + i + 1
									+ " dal giorno " + j + " al giorno " + k);
							trovato = true;
							k = hotel[i].getClienti().length;
						}
					}
				}
			}
		}
		if (!trovato) {
			System.out.println("Il cliente non � stato trovato");
		}
	}

	public void controllaCamera(int numeroCamera, int data) {
		if (hotel[numeroCamera - 1].getClienti()[data] == null) {
			System.out.println("La camera " + numeroCamera + " � libera nel giorno " + data);
		} else {
			System.out.println("La camera " + numeroCamera + " il giorno " + data + " � occupata dal cliente "
					+ hotel[numeroCamera - 1].getClienti()[data].getNome() + " "
					+ hotel[numeroCamera - 1].getClienti()[data].getCognome());
		}
	}

}
