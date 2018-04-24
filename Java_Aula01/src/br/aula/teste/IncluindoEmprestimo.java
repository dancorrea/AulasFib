package br.aula.teste;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.aula.db.HibernateFactory;
import br.aula.model.Emprestimo;

public class IncluindoEmprestimo {

	public static void main(String[] args) {

		Session s = HibernateFactory.configureSessionFactory().openSession();

		Emprestimo emprestimo = new Emprestimo();
		emprestimo.setData_emprestimo(new Date());
		emprestimo.setData_devolucao(new Date());

		Transaction t = s.beginTransaction();
		s.save(emprestimo);
		t.commit();

	}

}
