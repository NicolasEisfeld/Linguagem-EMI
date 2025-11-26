/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correcaoprova;

/**
 *
 * @author 05138300067
 */
public class Produtor implements Runnable{
    private String nome;

    public Produtor(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        try {
            for(int i = 1; i <= 30; i++) {
                System.out.println("Produtor: " + nome + ": " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Produtor " + nome + "foi interrompido");
        }
    }
    
    
}
