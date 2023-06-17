import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private int NumeroCartao;
    private int senhaCartao;
    private double limiteCartao;
    private double saldoCartao;
    List<ComprasProduto> pedidos;

    public CartaoDeCredito(double limite) {
        this.limiteCartao = limite;
        this.saldoCartao = limite;
        this.pedidos = new ArrayList<>();
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public double getSaldoCartao() {
        return saldoCartao;
    }

    public List<ComprasProduto> getPedidos() {
        return pedidos;
    }
}
