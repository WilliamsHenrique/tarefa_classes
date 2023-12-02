package br.com.mod23e24.service;

/**
 * @author williams.silva
 */
public class ContratoService implements IContratoService{

    private IContratoService contratoDao;

    public ContratoService(IContratoService dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

}
