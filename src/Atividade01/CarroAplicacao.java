package Atividade01;

public class CarroAplicacao {

    public static void main(String[] args) {

        Carro carro1 = new Carro("FIAT", "Palio");

        carro1.printStatusCarro();

        // Acelerar
        carro1.acelerar(20);
        carro1.acelerar(40);
        carro1.acelerar(140);
        carro1.acelerar(1);

        // printStatus
        carro1.printStatusCarro();

        // Frear
        carro1.frear(100);
        carro1.frear(60);
        carro1.frear(45);

        // printStatus
        carro1.printStatusCarro();
    }
}
