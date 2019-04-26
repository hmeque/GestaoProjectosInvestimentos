package ugen.gestao.projectos.investimentos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ugen.gestao.projectos.investimentos.modelos.Projecto;

@Repository
public class jpaProjectoDao implements projectoDao {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public void adiciona(Projecto pr) {
		manager.persist(pr);
	}

	@Override
	public void altera(Projecto pr) {
		manager.merge(pr);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Projecto> lista() {
		return manager.createQuery("select * from projecto").getResultList();
	}

	@Override
	public Projecto buscaPorId(Long numero) {
		return manager.find(Projecto.class, numero);
	}

	@Override
	public void remove(Projecto pr) {
		Projecto projectoARemover = buscaPorId(pr.getNumero());
		manager.remove(projectoARemover);
	}

	@Override
	public void finaliza(Long numero) {
		Projecto pr = buscaPorId(numero);
		pr.setEstado("Finalizado");
		//pr.setDataFim(Calendar.getInstance());
		manager.merge(pr);
	}

}
