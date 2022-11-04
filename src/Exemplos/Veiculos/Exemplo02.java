package Exemplos.Veiculos;

public class Exemplo02 {
    public static void main(String[] args) {

        Moto m1 = new Moto("Honda", 1000);
        m1.buzinar();
        m1.acelerar(100);
        m1.frear(20);
        m1.printStatus();
    }
}
