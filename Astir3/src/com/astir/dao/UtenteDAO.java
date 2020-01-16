package com.astir.dao;

import java.util.Date;

import com.astir.bean.Utente;

/**
 * Questa classe gestisce la persistenza dei dati relativi agli utenti
 * @author mazza
 *
 */
public class UtenteDAO {

	
	/**
	 *  * Questo metodo restituisce un oggetto utente recuperato dal database utilizzando 
	 *  lo username e password; se non trova l'utente vuol dire che non è presente in db
	 * @param username
	 * @param password
	 * @return
	 */
	public Utente getUtente(String username, String password) {
		// TODO
		if (username != null && password!= null && username.equals("admin") && password.equals("admin")) {
			return new Utente();
		}
		else {
			return null;
		}
	}
	/**
	 * Questo metodo torna un oggetto utente recuperato dal database utilizzando lo username
	 * @param username
	 * @return
	 */
	public Utente getUtente(String username) {
		if (username!= null && username.equals("admin")) {
			return new Utente();
		}
		else {
			return null;
		}
	}
	/**
	 * Questo metodo produce inserimento di un utente nel database
	 * @param utente
	 */
	public void creaUtente(Utente utente) {
		//TODO qui inserire la logica di creazione dell'oggetto
	}

	
	/**
	 * Questo metodo produce inserimento di un utente nel database
	 * @param utente
	 */
	public void modificaUtente(Utente utente) {
		//TODO qui inserire la logica di modifica dell'oggetto
	}
	
	/**
	 * Questo metodo produce inserimento di un utente nel database
	 * @param utente
	 */
	public void eliminaUtente(Utente utente) {
		utente.setEliminazione(new Date());
		modificaUtente(utente);
	}
	public void bloccaUtente(String username) {
		Utente u = new Utente();
		u.setUsername(username);
		u.setEliminazione(new Date());
		modificaUtente(u);
	}
	
}
