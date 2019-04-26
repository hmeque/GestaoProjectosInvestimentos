package ugen.gestao.projectos.investimentos.dao;

import java.util.List;


import ugen.gestao.projectos.investimentos.modelos.Projecto;

public interface projectoDao {
	
	Projecto buscaPorId(Long numero);
	List<Projecto> lista();
	void adiciona(Projecto pr);
	void altera(Projecto pr);
	void remove(Projecto pr);
	void finaliza(Long id);

}
