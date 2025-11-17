package rmiConnection;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import remote.RemoteCategoria;
import remote.RemoteConexao;
import remote.RemoteProduto;
import remote.RemoteMovimento;

/**
 *
 * @author Davi-Wolff
 */
public class RMIConnection {

    private static RemoteProduto produto;
    private static RemoteCategoria categoria;
    private static RemoteMovimento movimentacao;
    private static RemoteConexao conexao;

    /**
     *
     * @param host parametro necessário para garantir a conexão do tipo RMI
     * @param port parametro necessário para garantir a conexão do tipo RMI
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     * @throws NotBoundException envia uma exceção caso não seja encontrado certo valor
     */
    public static void connect(String host, int port) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry("localhost", 1099);
        produto = (RemoteProduto) registry.lookup("ProdutoService");
        categoria = (RemoteCategoria) registry.lookup("CategoriaService");
        movimentacao = (RemoteMovimento) registry.lookup("MovimentacaoService");
        conexao = (RemoteConexao) registry.lookup("ConexaoService");
    }

    /**
     *
     * @param host parametro necessário para garantir a conexão do tipo RMI
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     * @throws NotBoundException envia uma exceção caso não seja encontrado certo valor
     */
    public static void connect(String host) throws RemoteException, NotBoundException {
        connect("localhost", 1099);
    }

    /**
     *
     * @return
     */
    public static RemoteProduto getProduto() {
        return produto;
    }

    /**
     *
     * @return
     */
    public static RemoteCategoria getCategoria() {
        return categoria;
    }

    /**
     *
     * @return
     */
    public static RemoteMovimento getMovimentacao() {
        return movimentacao;
    }
    
    /**
     *
     * @return
     */
    public static RemoteConexao getConexao() {
        return conexao;
    }
}
