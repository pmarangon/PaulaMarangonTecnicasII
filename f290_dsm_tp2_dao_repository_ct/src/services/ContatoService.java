package services;

import java.util.List;
import java.util.Objects;

import model.ContatoVO;
import repository.IContatoRepository;

public class ContatoService implements IContatoService {

    private IContatoRepository repository;

    public ContatoService(IContatoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void salvar(ContatoVO contato) throws Exception {
        repository.salvar(contato);
    }

    @Override
    public void atualizar(ContatoVO contato) {
        // TODO: Criar método que valide a existencia do acontato antes da atualização.
        if (Objects.isNull(contato) || Objects.isNull(contato.getEmail())) {
            throw new IllegalArgumentException("Email é obrigatório!");
        }

        ContatoVO oContato = repository.buscarPorEmail(contato.getEmail());

        if (Objects.isNull(oContato)) {
            throw new RuntimeException("Contato não atualizado, email [%s] não localizado.");
        }

    }

    @Override
    public ContatoVO buscarPorEmail(String email) {
        // TODO: realizar chamada do dao
        return repository.buscarPorEmail(email);
    }

    @Override
    public void excluir(Integer id) {
        // TODO: realizar chamada do dao
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

    @Override
    public List<ContatoVO> buscarTodos() {
        return repository.buscarTodos();
    }

}
