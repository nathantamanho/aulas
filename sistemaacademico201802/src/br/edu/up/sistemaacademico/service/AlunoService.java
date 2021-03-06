package br.edu.up.sistemaacademico.service;

import br.edu.up.sistemaacademico.dao.AlunoDao;
import br.edu.up.sistemaacademico.entity.Aluno;

public class AlunoService {
	
	public void salvar(Aluno aluno) throws ServiceException {
		
		if (aluno == null) {
			throw new ServiceException("O aluno n�o pode ser vazio!");
		}
		
		if (aluno.getNome() == null || aluno.getNome().equals("")) {
			throw new ServiceException("O nome do aluno n�o pode ser vazio!");
		}
		
		new AlunoDao().salvar(aluno);
	}

}
