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

import br.com.java.rest.entidade.EntidadeGenerica;
import br.com.java.rest.execption.RestException;
import br.com.java.rest.repositorio.GenericRepositorio;

@SuppressWarnings("unchecked")
public class GenericServico<T extends EntidadeGenerica> {
	
	@Inject
	private GenericRepositorio genericRepositorio;

	@GET
	@Path("/")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public List<T> listar() {
		return (List<T>) genericRepositorio.listar();
	}

	@GET
	@Path("/{id}")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public T buscarPorId(@PathParam("id") long id) {
		T t = (T) genericRepositorio.buscarPorId(id);
		return isEntidadeGenericaValida(t);

	}

	@POST
	@Path("/{nome}")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public T buscarNome(@PathParam("nome") String nome) {
		T t = (T) genericRepositorio.buscarPorNome(nome);
		return isEntidadeGenericaValida(t);
	}

	private T isEntidadeGenericaValida(T t) {
		if (t != null) {
			return t;
		} else {
			throw new RestException("Objeto não encontrado");
		}
	}

}
