package br.com.java.rest.entidade;

import java.util.List;

public class Livros extends EntidadeGenerica {

	private Editora editora;
	private List<Autor> autorList;
	private int quantidadeDePaginas;
	private Categoria categoria;

	public Livros() {
		super();
	}

	public Livros(Editora editora, List<Autor> autorList, int quantidadeDePaginas, Categoria categoria) {
		super();
		this.editora = editora;
		this.autorList = autorList;
		this.quantidadeDePaginas = quantidadeDePaginas;
		this.categoria = categoria;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public List<Autor> getAutorList() {
		return autorList;
	}

	public void setAutorList(List<Autor> autorList) {
		this.autorList = autorList;
	}

	public int getQuantidadeDePaginas() {
		return quantidadeDePaginas;
	}

	public void setQuantidadeDePaginas(int quantidadeDePaginas) {
		this.quantidadeDePaginas = quantidadeDePaginas;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}
