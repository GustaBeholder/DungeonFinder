/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gustavolemillion.Entity;

/**
 *
 * @author Aluno
 */
public class JogadorAtual {
    
   private static Jogador jogador;

    public static Jogador getJogador() {
        return jogador;
    }

    public static void setJogador(Jogador jogador) {
        JogadorAtual.jogador = jogador;
    }
   
   
    
}
