// 1 - pacote
package intro;

// 2 - referencia as bibliotecas

// 3 - classe:
public class Medidas {
    //3.1 atributos-características

    //3.2 métodos e funções
    public static void main(String[] args){
    System.out.println("Calculo de áreas");

    int largura;
    int comprimento;
    int resultado;

    largura = 4;
    comprimento = 6;

    resultado = largura * comprimento;
    System.out.println("Para a largura de " + largura + ", e o comprimento de "
            + comprimento + ". A área é de " + resultado + " metros quadrados");

    }
    public void calcularAreaModoExtenso(){
        int largura;
        int comprimento;
        int resultado;

        largura = 4;
        comprimento = 6;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + ", e o comprimento de "
                + comprimento + ". A área é de " + resultado + " metros quadrados");

    }
    public void calcularAreaModoCompacto(){
        int largura = 4;
        int comprimento = 6;
        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento +
                "a área é de " + largura * comprimento + "m²");
    }
}
