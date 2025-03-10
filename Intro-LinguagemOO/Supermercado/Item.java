
package Supermercado;

/**
 *
 * @author 03721174062
 */
public class Item {
    String codigo;
    String descricao;
    int quantidade;
    double desconto;
    double precoUnitario;
    
    // método constructor
    public Item( String codigo, String descricao, int quantidade, double desconto, double precoUnitario){
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.desconto = desconto;
        this.precoUnitario = precoUnitario;
    }
    
    
}
