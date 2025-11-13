package main;

import controller.ControleEstoque;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;


/**classe main é uma classe que executa o programa
 *
 * @author Mateo-Padilla
 */
public class Main {
    /**
     *
     * @param args metodo principal do projeto
     * @throws java.sql.SQLException
     * @throws java.rmi.RemoteException
     */
    public static void main(String[] args) throws SQLException, RemoteException, NotBoundException  {
        
        //instancia a classe "ControleEstoque"
        ControleEstoque controleEstoque = new ControleEstoque();
       //inicia a aplicação
        controleEstoque.iniciaAplicação();
    }
}