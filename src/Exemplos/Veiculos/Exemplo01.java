package Exemplos.Veiculos;

public class Exemplo01 {

    public static void main(String[] args) {

        Carro carro1 = new Carro("FIAT", "Palio");

        carro1.printStatus();

        // Acelerar
        carro1.acelerar(20);
        carro1.acelerar(40);
        carro1.acelerar(140);
        carro1.acelerar(1);

        // printStatus
        carro1.printStatus();

        // Frear
        carro1.frear(100);
        carro1.frear(60);
        carro1.frear(45);

        // printStatus
        carro1.printStatus();

        System.out.println(carro1.getMarca());
        // carro1.setMarca("Nova Marca");
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getVelocidade());
    }
}
