package Exemplos;

public class Exemplo00 {
    public static void main(String[] args) {
        // Criação do objeto do tipo caneta
        Caneta caneta1 = new Caneta("BIC","AZUL");
        caneta1.printStatusCaneta();
        // chamar a caneta para rabiscar
        caneta1.rabiscar();
        caneta1.printStatusCaneta();
        caneta1.destampar();
        caneta1.rabiscar();
        caneta1.printStatusCaneta();
        caneta1.escrever("DANILO VOLLES ARAUJO");
        caneta1.printStatusCaneta();

        // Criação de outro objeto
        Caneta caneta2 = new Caneta("BIC", "Preta");
    }
}
