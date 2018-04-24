package br.aula.teste;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.aula.db.HibernateFactory;
import br.aula.model.Autor;
import br.aula.model.Livro;

public class IncluindoLivro {

	public static void main(String[] args) {

		Session s = HibernateFactory.configureSessionFactory().openSession();

		Autor autor = new Autor();
		autor.setNome("J R R Tolkien");

		Livro livro = new Livro();
		livro.setTitulo("Senhor dos Aneis");
		livro.setAutor(autor);
		livro.setQuantidade(10);

		Transaction t = s.beginTransaction();
		s.saveOrUpdate(livro);
		t.commit();

	}

}
