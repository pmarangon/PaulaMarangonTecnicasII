package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.ContatoVO;
import model.IContatoDAO;

public class ContatoDAO implements IContatoDAO {

    private Connection connection;
    private Logger logger;

    public ContatoDAO(Connection connection) {
        this.connection = connection;
        this.logger = Logger.getLogger(ContatoDAO.class.getName());
    }

    public ContatoDAO(Connection connection, Logger logger) {
        this.connection = connection;
        this.logger = logger;
    }

    @Override
    public void salvar(ContatoVO contato) throws Exception {
        String query = "INSERT INTO contatos (nome, email, telefone) values ('%s', '%s', '%s')";

        try (Statement statement = connection.createStatement()) {
            statement.execute(String.format(query,
                    contato.getNome(),
                    contato.getEmail(),
                    contato.getTelefone()));
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Falha ao inserir contato.", e);
            throw e;
        }
    }

    @Override
    public void atualizar(ContatoVO contato) {
        // TODO: Criar método de atualização de contato.
    }

    @Override
    public void excluir(Integer id) {
        // TODO: Criar método de exclusão de contato.
    }

    @Override
    public List<ContatoVO> buscarTodos() {
        List<ContatoVO> contatos = new ArrayList<>();

        String query = "SELECT id, nome, email, telefone FROM fatec.contatos order by nome;";

        try (Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                ContatoVO contato = new ContatoVO()
                        .setId(resultSet.getInt("id"))
                        .setNome(resultSet.getString("nome"))
                        .setEmail(resultSet.getString("email"))
                        .setTelefone(resultSet.getString("telefone"));

                contatos.add(contato);
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Falha ao recuperar contatos", e);
        }

        return contatos;
    }

    @Override
    public ContatoVO buscarPorEmail(String email) {
        String email = "paulammarangon@gmail.com";
        ContatoVO contatoVO = contatoDAO.buscarporEmail(email);
       
               if (contatoVO != null) {
                   System.out.println("ID: " + contatoVO.getId());
                   System.out.println("Nome: " + contatoVO.getNome());
                   System.out.println("Email: " + contatoVO.getEmail());
                   System.out.println("Telefone: " + contatoVO.getTelefone());
               } else {
                   System.out.println("Contato não encontrado");
               }
       }
    }

 List<ContatoVO> tabelaContatos = contatoDAO.getTabelaContatos();

        
        for (ContatoVO contatoVO : tabelaContatos) {
            System.out.println("ID: " + contatoVO.getId());
            System.out.println("Nome: " + contatoVO.getNome());
            System.out.println("Email: " + contatoVO.getEmail());
            System.out.println("Telefone: " + contatoVO.getTelefone());
            System.out.println("-----------------------");
        }
    }
