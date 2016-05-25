package br.com.java.rest.repositorio;

import java.util.ArrayList;
import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.java.rest.entidade.EntidadeGenerica;

@Stateless
public class GenericRepositorio {

	@PersistenceContext
	private EntityManager entityManager;

	public Collection<? extends EntidadeGenerica> listar() {
		return new ArrayList<>();
	}

	public EntidadeGenerica buscarPorId(long id) {
		return listar().stream().filter(entidadeGenerica -> entidadeGenerica.getId() == id).findAny().orElse(null);
	}

	public EntidadeGenerica buscarPorNome(String nome) {
		return listar().stream()
				.filter(entidadeGenerica -> entidadeGenerica.getNome().trim().toUpperCase().replaceAll("\\s+", "")
						.equalsIgnoreCase(nome.trim().toUpperCase().replaceAll("\\s+", "")))
				.findAny().orElse(null);
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
