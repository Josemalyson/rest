package br.com.java.rest.entidade;

import java.util.List;

public class Biblioteca extends EntidadeGenerica {

	private List<Livro> livrosList;

	public Biblioteca() {
		super();
	}

	public Biblioteca(List<Livro> livrosList) {
		this.livrosList = livrosList;
	}

	public List<Livro> getLivrosList() {
		return livrosList;
	}

	public void setLivrosList(List<Livro> livrosList) {
		this.livrosList = livrosList;
	}

}
