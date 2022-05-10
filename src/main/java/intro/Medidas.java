// 1 - pacote
package intro;

// 2 - referencia as bibliotecas

import java.util.Scanner;

// 3 - classe:
public class Medidas {
    //3.1 atributos-características

    //3.2 métodos e funções
    public static void main(String[] args) {
        //switch = selecionar o comportamento do programa conforme a escolha da pessoa ou do software
        Scanner scanner = new Scanner(System.in);
        System.out.println("M E N U  D E  O P Ç Õ E S");
        System.out.println("c - Calcular Area Modo Curto");
        System.out.println("e - Calcular Area Modo Extenso");
        System.out.println("i - If Simples");
        System.out.println("d - contar ate dez");
        System.out.println("r - Contagem regressiva de 10 a 0 ");
        System.out.println("Digite a opção desejada: ");
        String opcao = scanner.next();

        //String opcao = "melancia";

        switch (opcao) {
            case "c":
            case "C":
                System.out.println("Você escolheu executar o método calcularAreaModoCompacto");
                calcularAreaModoCompacto();
                break;
            case "d":
            case "D":
                System.out.println("Você escolheu executar o método contarAteDez");
                contarAteDez();
                break;
            case "e":
            case "E":
                System.out.println("Você escolheu executar o método calcularAreaModoExtenso");
                calcularAreaModoExtenso();
                break;
            case "i":
            case "I":
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimples();
                break;
        }
    }

    public static void ifSimples() {
        //if = se
        //else = senão
        String modo = "extenso";
        if (modo == "curto") {
            calcularAreaModoCompacto();
        } else {
            calcularAreaModoExtenso();
        }
    }

    public static void calcularAreaModoExtenso() {
        System.out.println("Calculo De Àrea Modo Extenso:");
        int largura;
        int comprimento;
        int resultado;

        largura = 4;
        comprimento = 6;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + ", e o comprimento de "
                + comprimento + ". A área é de " + resultado + " metros quadrados");

    }

    public static void calcularAreaModoCompacto() {
        System.out.println("Calculo De Àrea Modo Curto:");
        int largura = 4;
        int comprimento = 6;
        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento +
                "a área é de " + largura * comprimento + "m²");
    }

    public static void contarAteDez() {
        // Loops ou Repetições
        //for = repetição incondicional
        System.out.println("Contagem Crescente");

        for (int numero = 1; numero <= 10; numero++) {
            System.out.println(numero);
        }
    }
}

