package services;

import java.util.List;

import model.ContatoVO;

public interface IContatoService {
    void salvar(ContatoVO contato) throws Exception;

    void atualizar(ContatoVO contato);

    ContatoVO buscarPorEmail(String email);

    void excluir(Integer id);

    List<ContatoVO> buscarTodos();
}
