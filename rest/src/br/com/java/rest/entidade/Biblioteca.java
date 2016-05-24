package br.com.java.rest.entidade;

import java.util.List;

public class Biblioteca extends EntidadeGenerica {

	private List<Livros> livrosList;

	public Biblioteca() {
		super();
	}

	public Biblioteca(List<Livros> livrosList) {
		this.livrosList = livrosList;
	}

	public List<Livros> getLivrosList() {
		return livrosList;
	}

	public void setLivrosList(List<Livros> livrosList) {
		this.livrosList = livrosList;
	}

}
