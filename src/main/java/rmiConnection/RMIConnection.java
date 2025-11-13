package rmiConnection;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import remote.RemoteCategoria;
import remote.RemoteConexao;
import remote.RemoteProduto;
import remote.RemoteMovimento;

public class RMIConnection {

    private static RemoteProduto produto;
    private static RemoteCategoria categoria;
    private static RemoteMovimento movimentacao;
    private static RemoteConexao conexao;

    public static void connect(String host, int port) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry("localhost", 1099);
        produto = (RemoteProduto) registry.lookup("ProdutoService");
        categoria = (RemoteCategoria) registry.lookup("CategoriaService");
        movimentacao = (RemoteMovimento) registry.lookup("MovimentacaoService");
        conexao = (RemoteConexao) registry.lookup("ConexaoService");
    }

    public static void connect(String host) throws RemoteException, NotBoundException {
        connect("localhost", 1099);
    }

    public static RemoteProduto getProduto() {
        return produto;
    }

    public static RemoteCategoria getCategoria() {
        return categoria;
    }

    public static RemoteMovimento getMovimentacao() {
        return movimentacao;
    }
    
    public static RemoteConexao getConexao() {
        return conexao;
    }
}
