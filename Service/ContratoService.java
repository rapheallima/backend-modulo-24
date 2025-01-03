package Service;

import Dao.IContratoDao;

public class ContratoService implements IContratoService {

	private IContratoDao contratoDao;

	public ContratoService(IContratoDao dao) {
		this.contratoDao = dao;
	}

	@Override
	public String salvar() {
		contratoDao.salvar();
		return null;
	}

	@Override
	public String buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(int id, String novoValor) {
		// TODO Auto-generated method stub
		
	}

}
