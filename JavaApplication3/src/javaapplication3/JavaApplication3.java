/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o valor total da compra: ");
            int valorTotal = scanner.nextInt();
            
            int desconto = calcularDesconto(valorTotal);
            int valorFinal = valorTotal - desconto;
            
            System.out.println("Desconto a ser aplicado: R$" + desconto);
            System.out.println("Valor total a ser pago: R$" + valorFinal);
        }
    }

    public static int calcularDesconto(int valorTotal) {
        if (valorTotal < 20000) {
            return valorTotal * 5 / 100; // 5% de desconto
        } else if (valorTotal < 30000) {
            return valorTotal * 10 / 100; // 10% de desconto
        } else {
            return valorTotal * 15 / 100; // 15% de desconto
        }
    }
}