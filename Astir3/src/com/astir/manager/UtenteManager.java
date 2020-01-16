package com.astir.manager;

import com.astir.bean.Utente;
import com.astir.dao.UtenteDAO;

public class UtenteManager {
	
	UtenteDAO dao = new UtenteDAO();
	
	public Utente getUtente(String username, String password){
		return dao.getUtente(username,password);
	}
	public boolean existUsername(String username){
		Utente u1 = dao.getUtente(username); 
		return (u1!=null)?true:false;
	}
	public void bloccaUtente(String username) {
		dao.bloccaUtente(username);
		
	}
	
}