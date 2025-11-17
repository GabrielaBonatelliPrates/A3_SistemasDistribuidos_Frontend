package controller;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import remote.RemoteCategoria;
import remote.RemoteConexao;
import remote.RemoteProduto;
import view.FrmMenuPrincipal;
import remote.RemoteMovimento;
import rmiConnection.RMIConnection;

/**
 * classe ControleEstoque é uma classe utilizada para gerenciar a movimentação
 * do estoque
 *
 * @author Cesar Augusto
 */
public class ControleEstoque {

    /**
     * metodos de instancia para efetivar o controle do estoque
     *
     * @param produtoDAO instancia um novo produto do banco de dados
     * @param categoriaDAO instancia uma nova categoria do banco de dados
     * @param movimentacaoDAO instancia uma nova movimentação do banco de dados
     */
    protected RemoteCategoria categoriaDAO;
    protected RemoteProduto produtoDAO;
    protected RemoteMovimento movimentacaoDAO;
    protected RemoteConexao conexaoDAO;

    /**
     *
     * @param iniciaAplicação metodo que inicia o sistema
     */
    public void iniciaAplicação() throws SQLException, RemoteException, NotBoundException {
        RMIConnection.connect("localhost", 1099);
        categoriaDAO = RMIConnection.getCategoria();
        produtoDAO = RMIConnection.getProduto();
        movimentacaoDAO = RMIConnection.getMovimentacao();
        conexaoDAO = RMIConnection.getConexao();
        //instancia a interface gráfica do menu principal
        FrmMenuPrincipal telaMenu = new FrmMenuPrincipal(produtoDAO, categoriaDAO, movimentacaoDAO, conexaoDAO);
        //deixa ele visível
        telaMenu.setVisible(true);
        produtoDAO.pegarProdutos();
    }

}
