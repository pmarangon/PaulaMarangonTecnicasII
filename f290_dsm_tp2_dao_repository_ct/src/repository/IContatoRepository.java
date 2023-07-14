package repository;

import java.util.List;

import model.ContatoVO;

public interface IContatoRepository {
    void salvar(ContatoVO contato) throws Exception;

    void atualizar(ContatoVO contato);

    void excluir(Integer id);

    List<ContatoVO> buscarTodos();

    ContatoVO buscarPorEmail(String email);
}
