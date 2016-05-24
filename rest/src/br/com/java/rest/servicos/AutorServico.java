package br.com.java.rest.servicos;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.java.rest.entidade.Autor;
import br.com.java.rest.execption.RestExecption;
import br.com.java.rest.repositorio.AutorRepositorio;

@Path("/autores")
public class AutorServico {

	@Inject
	private AutorRepositorio autorRepositorio;

	@GET
	@Path("/")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public List<Autor> listarAutores() {
		return autorRepositorio.listar();
	}

	@GET
	@Path("/{id}")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public Autor buscarPorId(@PathParam("id") long id) {
		Autor autor = autorRepositorio.buscarPorId(id);
		return isAutorValido(autor);

	}

	@POST
	@Path("/{nome}")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public Autor buscarNome(@PathParam("nome") String nome) {
		Autor autor = autorRepositorio.buscarPorNome(nome);
		return isAutorValido(autor);
	}

	private Autor isAutorValido(Autor autor) {
		if (autor.getId() != null) {
			return autor;
		} else {
			throw new RestExecption("Autor não encontrado");
		}
	}

}
