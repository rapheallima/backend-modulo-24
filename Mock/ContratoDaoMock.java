package Mock;

import Dao.IContratoDao;

public class ContratoDaoMock implements IContratoDao {

	@Override
	public void salvar() {
	
		
	}

	@Override
	public String buscar(int id) {
        return "Mock Resultado para ID " + id;
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
