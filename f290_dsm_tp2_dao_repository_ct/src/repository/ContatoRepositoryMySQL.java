package repository;

import java.util.List;

import model.ContatoVO;
import model.IContatoDAO;

public class ContatoRepositoryMySQL implements IContatoRepository{

    private IContatoDAO dao;

    public ContatoRepositoryMySQL(IContatoDAO dao) {
        this.dao = dao;
    }

    @Override
    public void salvar(ContatoVO contato) throws Exception {
        dao.salvar(contato);
    }

    @Override
    public void atualizar(ContatoVO contato) {
        dao.atualizar(contato);
    }

    @Override
    public void excluir(Integer id) {
       dao.excluir(id);
    }

    @Override
    public List<ContatoVO> buscarTodos() {
        return dao.buscarTodos();
    }

    @Override
    public ContatoVO buscarPorEmail(String email) {
        return dao.buscarPorEmail(email);
    }
    
}
