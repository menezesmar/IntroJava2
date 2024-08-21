// 1 - Pacote
package br.com.iterasys;

// 2 - Referência as bibliotecas


// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Caracteristicas

    // 3.2 - Métodos e Funções
    public static void main(String[] args) {

        calcularAreaModoCurto();
        calcularAreaModoExtenso();

    }

    public static void calcularAreaModoCurto(){
        System.out.println("Cálculo de Áreas Modo Curto");

// Cálculo de Áreas - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento +
                "m a área é de " + largura * comprimento + "m²");

    }

    public static void calcularAreaModoExtenso(){
        System.out.println("Cálculo de Áreas Modo Extenso");
        // Cálcudo de Área - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5; // largura recebe 5
        comprimento = 6; // comprimento recebe 6

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento + "m a área é de "
        + resultado + "m²");

    }




    }