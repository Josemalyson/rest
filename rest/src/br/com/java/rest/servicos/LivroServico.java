package br.com.java.rest.servicos;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.java.rest.entidade.Livro;
import br.com.java.rest.repositorio.LivroRepositorio;

@Path("/livros")
public class LivroServico extends GenericServico<Livro> {

	@Inject
	private LivroRepositorio livroRepositorio;

	@GET
	@Path("/listar/todos")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public List<Livro> listarAll() {
		return livroRepositorio.listarTodosMock();

	}

}
