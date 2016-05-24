package br.com.java.rest.repositorio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ejb.Stateless;

import br.com.java.rest.entidade.Biblioteca;
import br.com.java.rest.entidade.Livro;

@Stateless
public class BibliotecaRepositorio {

	private List<Biblioteca> bibliotecaList;

	public List<Biblioteca> listar() {

		bibliotecaList = new ArrayList<>();

		Biblioteca biblioteca = new Biblioteca();
		biblioteca.setId(1L);
		biblioteca.setNome("Biblioteca Geral de Santa Rita - PB");

		Livro livro = new Livro();
		livro.setId(1L);
		livro.setNome("A HORA DA ESTRELA");
		biblioteca.setLivrosList(Arrays.asList(livro));

		Biblioteca biblioteca2 = new Biblioteca();
		biblioteca2.setId(2L);
		biblioteca2.setNome("Biblioteca Central de Jo�o Pessoa - PB");

		Biblioteca biblioteca3 = new Biblioteca();
		biblioteca3.setId(3L);
		biblioteca3.setNome("CabedeloTeca - PB");

		bibliotecaList = Arrays.asList(biblioteca, biblioteca2, biblioteca3);
		bibliotecaList.sort((b1, b2) -> b1.getNome().compareToIgnoreCase(b2.getNome()));
		return bibliotecaList;
	}

	public Biblioteca buscarPorId(long id) {
		return listar().stream().filter(b -> b.getId() == id).findAny().orElse(new Biblioteca());
	}

	public Biblioteca buscarPorNome(String nome) {
		return listar().stream()
				.filter(b -> b.getNome().trim().toUpperCase().replaceAll("\\s+", "")
						.equalsIgnoreCase(nome.trim().toUpperCase().replaceAll("\\s+", "")))
				.findAny().orElse(new Biblioteca());
	}

}
