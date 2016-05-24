package br.com.java.rest.servicos;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.java.rest.entidade.Biblioteca;
import br.com.java.rest.repositorio.BibliotecaRepositorio;

@Path("/bibliotecas")
public class BibliotecaServico {

	@Inject
	private BibliotecaRepositorio bibliotecaRepositorio;

	@GET
	@Path("/")
	@Produces({ "application/json" })
	public List<Biblioteca> listarLivros() {
		return bibliotecaRepositorio.listar();
	}

	@GET
	@Path("/{id}")
	@Produces({ "application/json" })
	public Biblioteca buscarPorId(@PathParam("id") long id) {
		return bibliotecaRepositorio.buscarPorId(id);
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
