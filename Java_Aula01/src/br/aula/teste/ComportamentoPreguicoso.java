package br.aula.teste;

import org.hibernate.Session;

import java.util.List;
import br.aula.db.HibernateFactory;
import br.aula.model.Autor;
import br.aula.model.Livro;

public class ComportamentoPreguicoso {

	public static void main(String[] args) {

		Session s = HibernateFactory.configureSessionFactory().openSession();

		Autor autor = (Autor) s.get(Autor.class, 1);

		System.out.println(autor.getNome());

		List<Livro> livros = autor.getLivros();

		for (Livro livro : livros) {
			System.out.println(livro.getTitulo());
		}

	}
}
