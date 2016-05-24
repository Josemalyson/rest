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

import br.com.java.rest.entidade.Biblioteca;
import br.com.java.rest.repositorio.BibliotecaRepositorio;

@Path("/bibliotecas")
public class BibliotecaServico {

	@Inject
	private BibliotecaRepositorio bibliotecaRepositorio;

	@GET
	@Path("/")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public List<Biblioteca> listarLivros() {
		return bibliotecaRepositorio.listar();
	}

	@GET
	@Path("/{id}")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public Biblioteca buscarPorId(@PathParam("id") long id) {
		return bibliotecaRepositorio.buscarPorId(id);
	}
	
	@POST
	@Path("/{nome}")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public Biblioteca buscarNome(@PathParam("nome") String nome) {
		return bibliotecaRepositorio.buscarPorNome(nome);
	}
	
	// @PUT
	// @Path("/book/{isbn}")
	// public void addBook(@PathParam("isbn") String id, @QueryParam("name")
	// String name) {...}
	//
	// @DELETE
	// @Path("/book/{id}")
	// public void removeBook(@PathParam("id") String id {...}

}
