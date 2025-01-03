package Test;

import org.junit.Assert;
import org.junit.Test;

import Service.ContratoService;
import Service.IContratoService;;

public class ClienteServiceTest {
	
	@Test
	public void salvarTest() {
		IContratoService service = new ContratoService(null);
		String retorno = service.salvar();
		Assert.assertEquals(null, retorno);
	}

}
