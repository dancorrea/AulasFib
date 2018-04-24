package br.aula.teste;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.aula.db.HibernateFactory;
import br.aula.model.Usuario;

public class IncluindoUsuario {
	
	public static void main(String[] args) {
		
		Session s = HibernateFactory.configureSessionFactory().openSession();
		
		Usuario usuario = new Usuario();
		usuario.setUsername("User01");
		usuario.setPassword("1234");
		usuario.setEmail("teste@teste.com.br");	
		
		Transaction t = s.beginTransaction();
		s.save(usuario);
		t.commit();
	}
	
}
