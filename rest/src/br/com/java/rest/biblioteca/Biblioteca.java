package br.com.java.rest.biblioteca;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/biblioteca")
public class Biblioteca {

	@GET
	@Path("/livros")
	@Produces({ "application/json" })
	public String listarLivros() {
		return "Livros testes";
	}

}
