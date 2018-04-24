package br.aula.teste;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import br.aula.db.HibernateFactory;
import br.aula.model.Cliente;

public class IncluindoCliente {

	public static void main(String[] args) {

		Session s = HibernateFactory.configureSessionFactory().openSession();

		Cliente cliente = new Cliente();
		cliente.setNome("Napoleao Bonaparte");
		cliente.setDataNascimento(new Date());
		cliente.setEndereco("Bauru");
		cliente.setEmail("teste@teste.com.br");

		Transaction t = s.beginTransaction();
		s.save(cliente);
		t.commit();
	}
}