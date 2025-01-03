package Test;

import org.junit.Assert;
import org.junit.Test;

import Dao.ContratoDao;
import Dao.IContratoDao;
import Mock.ContratoDaoMock;
import Service.ContratoService;
import Service.IContratoService;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        service.salvar();
    }

    @Test
    public void buscarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar(1);
        Assert.assertEquals("Mock Resultado para ID 1", retorno);
    }

    @Test
    public void excluirTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        service.excluir(1);
        // Sem exceções, operação bem-sucedida
        Assert.assertTrue(true);
    }

    @Test
    public void atualizarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        service.atualizar(1, "Novo Valor");
        // Sem exceções, operação bem-sucedida
        Assert.assertTrue(true);
    }
}
