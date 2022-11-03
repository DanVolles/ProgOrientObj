package Atividade01;

public class Carro {

// Atributos
        private String marca;
        private String modelo;
        private int velocidade;

// Método construtor para informar Marca e Modelo
        Carro (String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
            velocidade = 0;
        }

// Método para acelerar
        public void acelerar (int a) {
            System.out.println("-- Aceleração --");
            velocidade = velocidade + a; // ou velocidade += a;
            if (velocidade > 200) {
                System.out.println("Impossível acelerar tanto.");
                velocidade = 200;
            } else {
                System.out.println("A velocidade atual do carro é: " + velocidade + " km/h.");
            }
        }

// Método para frear
        void frear (int f) {
            System.out.println("-- Frenagem --");
            velocidade = velocidade - f;
            if (velocidade < 0) {
                System.out.println("Você freou muito forte. \nA velocidade atual é 0 km/h.");
                velocidade = 0;
            } else {
                System.out.println("A velocidade atual do carro é: " + velocidade + " km/h.");
            }
        }

// Método toString
        @Override
        public String toString() {
            return "Carro {" +
                    "marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", velocidade=" + velocidade +
                    '}';
        }

// Método printStatus
        public void printStatusCarro () {
            System.out.println(toString());
        }

// Método de retorno
        public String getMarca() {
            return marca;
        }
        public String getModelo() {
            return modelo;
        }
        public int getVelocidade() {
            return velocidade;
        }

// Método de acesso
        public void setMarca(String marca) {
            this.marca = marca;
        }
        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
        public void setVelocidade(int velocidade) {
            this.velocidade = velocidade;
        }
}
