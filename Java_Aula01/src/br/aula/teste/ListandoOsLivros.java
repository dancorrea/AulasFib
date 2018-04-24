package br.aula.teste;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import br.aula.db.HibernateFactory;
import br.aula.model.Livro;

public class ListandoOsLivros {

	public static void main(String[] args) {

		Session s = HibernateFactory.configureSessionFactory().openSession();

		Query query = s.createQuery("from Livro");

		List<Livro> livros = query.list();
		for (Livro livro : livros) {
			System.out.println(livro.getTitulo());
		}

	}

}
