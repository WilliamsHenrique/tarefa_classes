package br.com.mod23e24;

import br.com.mod23e24.dao.ClienteDao;
import br.com.mod23e24.dao.ClienteDaoMock;
import br.com.mod23e24.dao.IClienteDao;
import br.com.mod23e24.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author williams.silva
 */
public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
