package Supermercado;

/**
 *
 * @author 03721174062
 */

/*
    Primeiro Código em programação OO.
    Com as classes: Item
*/
public class Supermercado {

    public static void main(String[] args) { // Método Principal
        
        Item I1 = new Item("1", "Primeiro Item", 10, 0.2, 10.99);
        Item I2 = new Item("2", "Segundo Item", 10, 0.2, 10.99);
        Item I3 = new Item("3", "Terceiro Item", 10, 0.2, 10.99);
        Item I4 = new Item("4", "Quarto Item", 10, 0.2, 10.99);
        
        System.out.println(
                "Codigo: " + I1.codigo +
                " Descrição: " + I1.descricao +
                " Quantidade: "+ I1.quantidade +
                " Desconto: "+ I1.desconto +
                " Preço Unitário: "+ I1.precoUnitario
        );
        
        
    }
    
}
