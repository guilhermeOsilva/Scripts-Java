/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.projeto_programacao.encapsulamento;

import java.util.Scanner;

/**
 *
 * @author Guilherme Silva
 */
public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("me fale um nome!!!!????");
        String leitor = sc.nextLine();
        System.out.println("me fale uma idade!!!???");
        Integer leitorIdade = sc.nextInt();
        System.out.println("me fale seu primeiro valor!!!!!?????");
        Double leitorValorInic = sc.nextDouble();
        System.out.println("me fale seu segundo valor!!!!!!??????");
        Double leitorValorSec = sc.nextDouble();

        ObjUm objUm = new ObjUm(leitor, leitorIdade, leitorValorInic, leitorValorSec);

//        System.out.println("o nome é: " + objUm.getNome());
//        System.out.println("a idade é: " + objUm.getIdade());
//        System.out.println("o primeiro valor é: " + objUm.getDinheiroInicial());
//        System.out.println("o segundo valor é: " + objUm.getDinheiroFinal());
//
//        System.out.println(" o valor final é:" + objUm.conta());

        System.out.println(objUm);
        
        
    
    }

}
