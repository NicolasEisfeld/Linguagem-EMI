
package Supermercado;


/**
 *
 * @author Nicolas Eisfeld Ferreira
 */

/*
    Primeiro Código em programação OO.
    Com a classe: Item
*/
public class Supermercado {

    public static void main(String[] args) { // Método Principal
       
        // Declaração de objetos
        
        Item I1 = new Item("1", "Monster", 10, 0.2, 10.99); // Criou um objeto a partir de uma classe denominada
        Item I2 = new Item("2", "Baly", 10, 0.2, 7.89);
        Item I3 = new Item("3", "Red Bull", 10, 0.1, 11.99);
        Item I4 = new Item("4", "Elev", 10, 0.5, 7.99);

        double TotalValorCupom = I1.calculaValorTotalItem() + I2.calculaValorTotalItem()
                + I3.calculaValorTotalItem() + I4.calculaValorTotalItem();
        
        
        System.out.println("                                   CUPOM FISCAL\n"
                        + "Código\tDescrição\tQuantidade\tValor Unitário\tDesconto\tValor Total\n");
        System.out.println(
                ""+ I1.getCodigo() +
                "\t"+ I1.getDescricao() +
                "\t\t"+ I1.getQuantidade() +
                "\t\t"+ I1.getprecoUnitario() +
                "\t\t"+ I1.getDesconto() +  
                "\t\t"+ I1.calculaValorTotalItem()
        );
        
        System.out.println(
                "" + I2.getCodigo() +
                "\t" + I2.getDescricao() +
                "\t\t"+ I2.getQuantidade() +
                "\t\t"+ I2.getprecoUnitario() +
                "\t\t"+ I2.getDesconto() +
                "\t\t"+ I2.calculaValorTotalItem()                        
        );
                
        System.out.println(
                "" + I3.getCodigo() +
                "\t" + I3.getDescricao() +
                "\t"+ I3.getQuantidade() +
                "\t\t"+ I3.getprecoUnitario() +
                "\t\t"+ I3.getDesconto() + 
                "\t\t"+ I3.calculaValorTotalItem()
        );
        
        System.out.println(
                "" + I4.getCodigo() +
                "\t" + I4.getDescricao() +
                "\t\t"+ I4.getQuantidade() +
                "\t\t"+ I4.getprecoUnitario() +
                "\t\t"+ I4.getDesconto() +
                "\t\t"+ I4.calculaValorTotalItem()
        );       
        
        System.out.println("Valor total do Cupom Fiscal: " + TotalValorCupom);
        
        System.out.print("\nMais imposto do Governo Estadual: +1,25 reais");
        I1.setprecoUnitario(I1.getprecoUnitario()+1.25);        
        I2.setprecoUnitario(I2.getprecoUnitario()+1.25);
        I3.setprecoUnitario(I3.getprecoUnitario()+1.25);
        I4.setprecoUnitario(I4.getprecoUnitario()+1.25);
        
        System.out.println("\nMais imposto do Governo Federal: +0.50 centavos");
        I1.setprecoUnitario(I1.getprecoUnitario()+0.50);        
        I2.setprecoUnitario(I2.getprecoUnitario()+0.50);
        I3.setprecoUnitario(I3.getprecoUnitario()+0.50);
        I4.setprecoUnitario(I4.getprecoUnitario()+0.50);
        
        
        
         TotalValorCupom = I1.calculaValorTotalItem() + I2.calculaValorTotalItem()
                + I3.calculaValorTotalItem() + I4.calculaValorTotalItem();
        
        System.out.println("Valores Atualizados. \n");
        System.out.println("                                   CUPOM FISCAL (atualizado)\n"
                        + "Código\tDescrição\tQuantidade\tValor Unitário\tDesconto\tValor Total\n");
        System.out.println(
                ""+ I1.getCodigo() +
                "\t"+ I1.getDescricao() +
                "\t\t"+ I1.getQuantidade() +
                "\t\t"+ I1.getprecoUnitario() +
                "\t\t"+ I1.getDesconto() +  
                "\t\t"+ I1.calculaValorTotalItem()
        );
        
        System.out.println(
                "" + I2.getCodigo() +
                "\t" + I2.getDescricao() +
                "\t\t"+ I2.getQuantidade() +
                "\t\t"+ I2.getprecoUnitario() +
                "\t\t"+ I2.getDesconto() +
                "\t\t"+ I2.calculaValorTotalItem()                        
        );
                
        System.out.println(
                "" + I3.getCodigo() +
                "\t" + I3.getDescricao() +
                "\t"+ I3.getQuantidade() +
                "\t\t"+ I3.getprecoUnitario() +
                "\t\t"+ I3.getDesconto() + 
                "\t\t"+ I3.calculaValorTotalItem()
        );
        
        System.out.println(
                "" + I4.getCodigo() +
                "\t" + I4.getDescricao() +
                "\t\t"+ I4.getQuantidade() +
                "\t\t"+ I4.getprecoUnitario() +
                "\t\t"+ I4.getDesconto() +
                "\t\t"+ I4.calculaValorTotalItem()
        );       
        
        System.out.println("Valor total do Cupom Fiscal: " + TotalValorCupom);
        
        

        
        
    }
    
}
