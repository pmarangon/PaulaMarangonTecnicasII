package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoFactory {


    private static final Logger logger = Logger.getLogger(ConexaoFactory.class.getName());
    private static final String url = "jdbc:mysql://127.0.0.1:3306/sys";
    private static final String user = "root";
    private static final String password = "segredo";
    

    public static Connection getConexao() throws Exception {

        try {
            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Falha ao abrir conexão.", e);
            throw e;
        }
    }
}
