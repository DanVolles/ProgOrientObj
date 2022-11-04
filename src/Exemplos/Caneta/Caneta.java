package Exemplos.Caneta;

public class Caneta {
    private String modelo;
    private String cor;
    private int carga;
    private boolean tampa = false;

    // Método construtor
    Caneta (String modelo, String cor) {
        tampa = false;
        this.modelo = modelo;
        this.cor = cor;
        carga = 30;
    }

    void rabiscar (){
        escrever("Rabisco");
    }
    public void escrever(String texto) {
        if (tampa) {
            System.out.println(texto);
            texto = texto.replaceAll(" ","");
            if (carga >= texto.length()) {
                carga -= texto.length();
            } else {
                System.out.println("Carga insuficiente");
            }
        } else {
            System.out.println("Retire a tampa");
        }
    }

    void tampar(){
        tampa = false;
    }

    void destampar(){
        tampa = true;
    }

    // Botão direito, generate, to string
    @Override
    public String toString() {
        return "Caneta{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", carga=" + carga +
                ", tampa=" + tampa +
                '}';
    }

    public void printStatusCaneta (){
        System.out.println(toString());
     // System.out.println(this); // outra forma de chamar o método
    }
}

