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

    public boolean lancaCompras(ComprasProduto compra){
        if(this.saldoCartao > compra.getValorProduto()){
            this.pedidos.add(compra);
            this.saldoCartao =- compra.getValorProduto();
            return true;
        }
        return false;
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
