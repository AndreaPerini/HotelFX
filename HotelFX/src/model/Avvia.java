package model;
import java.util.*;
import java.io.*;

public class Avvia {

	public static void main(String[] args) {
		File f = new File("Hotel.txt");
		Scanner sc = new Scanner(System.in);
		boolean termina = false;
		Cliente cli = new Cliente();
		Azienda a = new Azienda();
		Hotel h = new Hotel();
		int nCamera, dataDa, dataA;
		String nome, cognome;
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
				}
			} while (s != null);
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//
//		Camera c = new Camera();
//		Hotel h = new Hotel();
//		System.out.println("Inserisci i dati delle 20 camere: ");
//		for (int i = 0; i < 20; i++) {
//			System.out.println("Inserisci il prezzo minimo: ");
//			c.setPrezzoMinimo(sc.nextFloat());
//			System.out.println("Inserisci il prezzo massimo: ");
//			c.setPrezzoMassimo(sc.nextFloat());
//			System.out.println("Inserisci il numero di posti letto: ");
//			c.setNumeroPostiLetto(sc.nextInt());
//			h.inserisciCamera(c);
//		}
		do {
			System.out.println(
					"Seleziona l'opzione:\n1-Assegna una camera ad un cliente\n2-Visualizza le stanze libere per un dato periodo\n3-Cerca un dato cliente\n4-Controlla una data camera");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Inserisci il numero della camera");
				nCamera = sc.nextInt();
				System.out.println(
						"Il cliente da inserire è un cliente privato o un'azienda?(Inserisci 'privato' o 'azienda')");
				if (sc.next().equalsIgnoreCase("privato")) {
					System.out.println("Inserisci il nome");
					cli.setNome(sc.next());
					System.out.println("Inserisci il cognome");
					cli.setCognome(sc.next());
					System.out.println("Inserisci il numero di telefono");
					cli.setNumeroTelefono(sc.nextInt());
					System.out.println("Inserisci la data di inizio del periodo");
					dataDa = sc.nextInt();
					System.out.println("Inserisci la data di fine del periodo");
					dataA = sc.nextInt();
					h.aggiungiCliente(nCamera, cli, dataDa, dataA);
				} else {
					System.out.println("Inserisci il nome");
					a.setNome(sc.next());
					System.out.println("Inserisci il cognome");
					a.setCognome(sc.next());
					System.out.println("Inserisci il numero di telefono");
					a.setNumeroTelefono(sc.nextInt());
					System.out.println("Inserisci il nome dell'azienda");
					a.setNomeAzienda(sc.next());
					System.out.println("Inserisci la partita IVA");
					a.setPartitaIVA(sc.nextInt());
					System.out.println("Isnerisci l'indirizzo di fatturazione");
					a.setIndirizzoFatturazione(sc.next());
					System.out.println("Inserisci la data di inizio del periodo");
					dataDa = sc.nextInt();
					System.out.println("Inserisci la data di fine del periodo");
					dataA = sc.nextInt();
					h.aggiungiCliente(nCamera, a, dataDa, dataA);
				}
				break;
			case 2:
				System.out.println("Inserisci la data di inizio del periodo");
				dataDa = sc.nextInt();
				System.out.println("Inserisci la data di termine del periodo");
				dataA = sc.nextInt();
				h.camereLiberePeriodo(dataDa, dataA);
				break;
			case 3:
				System.out.println("Inserisci il nome del cliente da ricercare");
				nome = sc.next();
				System.out.println("Inserisci il cognome del cliente da ricercare");
				cognome = sc.next();
				h.cercaCliente(nome, cognome);
				break;
			case 4:
				System.out.println("Inserisci il numero della camera");
				nCamera = sc.nextInt();
				System.out.println("Inserisci la data");
				h.controllaCamera(nCamera, sc.nextInt());
				break;
			default:
				termina = true;
			}
		} while (!termina);
		sc.close();
	}
}