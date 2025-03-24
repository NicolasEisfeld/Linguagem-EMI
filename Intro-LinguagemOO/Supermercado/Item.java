
package Supermercado;

/**
 *
 * @author Nicolas Eisfeld Ferreira
 */
public class Item { // classe Item
    
    // Encapsulamento de cada propriedade da classe (deixando privado)
    private String codigo; 
    private String descricao;
    private int quantidade;
    private double desconto;
    private double precoUnitario;
    
    
    // Métodos Acessores
    public String getCodigo() { // retorna o atributo do objeto
        return this.codigo;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public int getQuantidade() {
        return this.quantidade;
    }
    public double getDesconto() {
        return this.desconto;
    }
    public double getprecoUnitario() {
        return this.precoUnitario;
    }
    
    // Métodos Mutantes
    public void setCodigo(String codigo) { // Está sendo utilizado somente por exemplo, pois está mudando o valor para o mesmo valor do atributo
        this.codigo = codigo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    public void setprecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    
    
   
    
    
    public double calculaValorTotalItem() {

        double totalItem = this.precoUnitario * this.quantidade - (this.desconto * (this.precoUnitario * this.quantidade));
        
        
        return totalItem;
    }
    
    // método constructor (joga todos os atributos como parâmetros de um objeto)
    public Item( String codigo, String descricao, int quantidade, double desconto, double precoUnitario){
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.desconto = desconto;
        this.precoUnitario = precoUnitario;
    }
    
    
}
