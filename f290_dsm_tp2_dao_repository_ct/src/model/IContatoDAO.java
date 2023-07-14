package model;

import java.util.List;

public interface IContatoDAO {

    void salvar(ContatoVO contato) throws Exception;

    void atualizar(ContatoVO contato);

    void excluir(Integer id);

    List<ContatoVO> buscarTodos();

    ContatoVO buscarPorEmail(String email);
    
}
