package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

public class Hotel {

	private Camera[] hotel = new Camera[20];

	public Hotel() {
		File f = new File("Hotel.txt");
		Hotel h = new Hotel();
		try {
			BufferedReader in = new BufferedReader(new FileReader(f));
			Camera c = new Camera();
			String s = new String();
			String[] riga;
			do {
				s = in.readLine();
				if (s != null) {
					riga = s.split("\\|");
					c.setPrezzoMinimo(Float.parseFloat(riga[0]));
					c.setPrezzoMassimo(Float.parseFloat(riga[1]));
					c.setNumeroPostiLetto(Integer.parseInt(riga[2]));
					h.inserisciCamera(c);
				}
			} while (s != null);
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void inserisciCamera(Camera camera) {
		for (int i = 0; i < hotel.length; i++) {
			hotel[i] = camera;
		}
	}

	public void aggiungiCliente(int numeroCamera, Cliente cliente, int dataDa, int dataA) {
		boolean vuota = true;
		//mettere le date in base ai mesi
		
		
//		for (int i = dataDa; i < dataA; i++) {
//			if (hotel[numeroCamera - 1].getClienti()[i] != null) {
//				vuota = false;
//			}
//		}
//		if (vuota) {
//			for (int i = dataDa; i < dataA; i++) {
//				hotel[numeroCamera - 1].getClienti()[i] = cliente;
//			}
//		} else {
//			System.out.println("La camera non è disponibile per questo periodo");
//		}
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
				System.out.println("La camera " + i + 1 + " è libera");
			}
		}
	}

//	public void cercaCliente(String nome, String cognome) {
//		boolean trovato = false;
//		for (int i = 0; i < hotel.length; i++) {
//			for (int j = 0; j < hotel[i].getClienti().length; j++) {
//				if ((hotel[i].getClienti()[j].getNome().equalsIgnoreCase(nome))
//						&& (hotel[i].getClienti()[j].getCognome().equalsIgnoreCase(cognome))) {
//					for (int k = j; k < hotel[i].getClienti().length; k++) {
//						if ((hotel[i].getClienti()[j].getNome().equalsIgnoreCase(nome))
//								&& (hotel[i].getClienti()[j].getCognome().equalsIgnoreCase(cognome))) {
//						} else {
//							System.out.println("Il cliente " + nome + " " + cognome + " occupa la stanza " + i + 1
//									+ " dal giorno " + j + " al giorno " + k);
//							trovato = true;
//							k = hotel[i].getClienti().length;
//						}
//					}
//				}
//			}
//		}
//		if (!trovato) {
//			System.out.println("Il cliente non è stato trovato");
//		}
//	}

	public void controllaCamera(int numeroCamera, LocalDate data) {
//		viene passata la data e il n della camera e vede se la camera in quel giorno è occupata
	}

}
