package br.com.fatecararas;

import br.com.fatecararas.domain.Algoritmo;
import br.com.fatecararas.domain.Jokenpo;
import br.com.fatecararas.domain.Lagarto;
import br.com.fatecararas.domain.Papel;
import br.com.fatecararas.domain.Pedra;
import br.com.fatecararas.domain.Spock;
import br.com.fatecararas.domain.Tesoura;
import br.com.fatecararas.domain.TipoAlgoritmo;

import java.util.Random;
import java.util.Scanner;

import javax.swing.SpinnerDateModel;

import static br.com.fatecararas.domain.TipoAlgoritmo.*;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        Scanner in = new Scanner(System.in);
        System.out.println("Escolha uma das opções [ 1-PAPEL, 2-TESOURA, 3-PEDRA, 4-LAGARTO, 5-SPOCK ]\n");
        int jogada = in.nextInt();

       private static Algoritmo getAlgoritmo(TipoAlgoritmo tipo) {
    return switch (tipo) {
    case PAPEL -> new Papel();
    case TESOURA -> new Tesoura();
    case PEDRA -> new Pedra();
    case LAGARTO -> new Lagarto();
    case SPOCK -> new Spock();

        int computador = new Random().nextInt(5) + 1;

        TipoAlgoritmo algoritmoComputador = getTipo(computador);
        System.out.println("O COMPUTADOR escolheu: " + algoritmoComputador);

        var jokenpo = new Jokenpo();

        //TODO: Substituir a criação de instancia com o operador new pelo objeto gerado no TODO anterior
        jokenpo.setAlgortimo(new Papel());
        jokenpo.jogar(algoritmoComputador);

        in.close();
    }
}