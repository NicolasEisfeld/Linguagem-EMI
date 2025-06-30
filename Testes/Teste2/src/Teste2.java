// 2º Teste de Linguagem de Programação I
// Nicolas Eisfeld Ferreira 

public class Teste2 {

    public static void main(String[] args) {

        // Questão 2
        Retangulo R1 = new Retangulo();
        R1.setLado(8.0);
        R1.setAltura(2.5);

        Retangulo R2 = new Retangulo();
        R2.setLado(13.0);
        R2.setAltura(7.3);

        // Exibe as áreas do R1 e R2
        System.out.println("Lado da 1ª Figura: " + R1.getLado());
        System.out.println("Altura da 1ª Figura: " + R1.getAltura());
        System.out.println("Área da 1ª Figura: " + R1.calcularArea());
        System.out.println("Perimetro da 1ª Figura: " + R1.calcularPerimetro());
        System.out.println("Lado da 2ª Figura: " + R2.getLado());
        System.out.println("Altura da 2ª Figura: " + R2.getAltura());
        System.out.println("Área da 2ª Figura: " + R2.calcularArea());
        System.out.println("Perimetro da 2ª Figura: " + R2.calcularPerimetro() + "\n");

        // Questão 4
        ControleArea CA1 = new ControleArea();
        CA1.registra(R1);
        CA1.registra(R2);

        // Exibe a soma das Áreas
        System.out.println("A soma das Áreas é: " + CA1.getTotalDaArea() + "\n");

        for (int i = 0; i < 10; i++) {
            Retangulo r = new Retangulo();
            r.setLado(i + 20);
            r.setAltura(i + 3);

            // Exibe os atributos, áreas e perimetros dos retângulos
            System.out.println("Lado e Altura do Retangulo " + (i + 1) + ": " + r.getLado() + ", " + r.getAltura());
            System.out.println("Área do Retangulo " + (i + 1) + ": " + r.calcularArea());
            System.out.println("Perimetro do Retangulo " + (i + 1) + ": " + r.calcularPerimetro() + "\n");

        }

    }

}
