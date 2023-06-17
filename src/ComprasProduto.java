public class ComprasProduto {
    private double valorProduto;
    private int QuantidadePedidos;
    private String descricaoProduto;

    public ComprasProduto(double valorProduto, String descricaoProduto) {
        this.valorProduto = valorProduto;
        this.descricaoProduto = descricaoProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public int getQuantidadePedidos() {
        return QuantidadePedidos;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }
}
