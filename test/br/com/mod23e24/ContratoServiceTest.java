package br.com.mod23e24;

/**
 * @author williams.silva
 */

import br.com.mod23e24.dao.ContratoDao;
import br.com.mod23e24.dao.IContratoDao;
import br.com.mod23e24.dao.mocks.ContratoDaoMock;
import br.com.mod23e24.service.ContratoService;
import br.com.mod23e24.service.IContratoService;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ContratoServiceTest {
    @Test
    public void salvarTest() {
        ContratoDaoMock dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        assertEquals("Sucesso", retorno);
    }

    //TODO
    //Fazer métodos de buscar, excluir e atualizar

}
