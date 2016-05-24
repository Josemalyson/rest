package br.com.java.rest.repositorio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ejb.Stateless;

import br.com.java.rest.entidade.Autor;

@Stateless
public class AutorRepositorio {


	public List<Autor> listar() {
		Autor autor1 = new Autor();
		autor1.setId(1L);
		autor1.setNome("José de Alencar");

		Autor autor2 = new Autor();
		autor2.setId(2L);
		autor2.setNome("José Sarney");
		return new ArrayList<>(Arrays.asList(autor1,autor2));
	}

	public Autor buscarPorId(long id) {
		return listar().stream().filter(autor -> autor.getId() == id).findAny().orElse(new Autor());
	}

	public Autor buscarPorNome(String nome) {
		return listar().stream()
				.filter(autor -> autor.getNome().trim().toUpperCase().replaceAll("\\s+", "")
						.equalsIgnoreCase(nome.trim().toUpperCase().replaceAll("\\s+", "")))
				.findAny().orElse(new Autor());
	}

}
