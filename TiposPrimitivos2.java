/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tipos_primitivos;

/** eu heloisa fiz o meu primeiro algoritmo em java na sala 111/*
 *
 * @author FATEC ZONA LESTE
 */
public class TiposPrimitivos2  {
   public static void main(String[] args) {
  // Define a visibilidade e o comportamento de um método em uma classe.
          byte idade = 34; // Armazena números menores (-128 a 127)
          short ano = 2015; // Armazena valores um pouco maiores (-32.768 a 32.767)
          int populacaoCidade = 150000; // Tipo mais normal para números inteiros.
          long populacaoMundial = 8000000000L; //'L' é preciso para valores muito longos
          
          float altura = 1.92f; // 'f' é necessário no final para indicar float
          double peso = 101.2; // Mais preciso que float
          
          char inicial = 'J'; // Armazena um único caractere
          boolean ativo = true; // Armazena verdadeiro ou falso
          
          // Exibição dos valores
          System.out.println("Idade: " + idade);
          System.out.println("Ano: " + ano);
          System.out.println("População da cidade: " + populacaoCidade);
          System.out.println("População Mundial: " + populacaoMundial);
          System.out.println("Altura: " + altura + "m");
          System.out.println("Peso: " + peso + "kg");
          System.out.println("Inicial do nome: " + inicial);
          System.out.println("Está ativo?: " + ativo);
        }

}
