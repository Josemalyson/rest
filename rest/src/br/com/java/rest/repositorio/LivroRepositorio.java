package br.com.java.rest.repositorio;

import java.util.Arrays;
import java.util.List;

import javax.ejb.Stateless;

import br.com.java.rest.entidade.Autor;
import br.com.java.rest.entidade.Categoria;
import br.com.java.rest.entidade.Editora;
import br.com.java.rest.entidade.Livro;

@Stateless
public class LivroRepositorio {

	public List<Livro> listarTodosMock() {
		Editora editora = new Editora();
		editora.setId(1L);
		editora.setNome("Editora Do livro 1");
		Autor autor = new Autor();
		autor.setId(1L);
		autor.setNome("Autor Do livro 1");
		List<Autor> autorList = Arrays.asList(autor);
		int quantidadeDePaginas = 100;
		Categoria categoria = new Categoria();
		categoria.setId(1L);
		categoria.setNome("categoria Do livro 1");
		Livro livro = new Livro(editora, autorList, quantidadeDePaginas, categoria);
		livro.setId(1L);
		livro.setNome("Primeiro livro");
		return Arrays.asList(livro);
	}

}
