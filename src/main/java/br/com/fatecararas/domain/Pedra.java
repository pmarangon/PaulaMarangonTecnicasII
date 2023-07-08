package br.com.fatecararas.domain;

public class Pedra { public class Papel extends Algoritmo {
  @Override
  public String executar(TipoAlgoritmo tipo) {

      switch (tipo) {
          case PAPEL -> {
              return "Ganhou! Papel embrulha pedra";
          }
          case TESOURA -> {
              return "Ganhou! Pedra esmaga tesoura!";
          }
          case PEDRA -> {
              return "Empatou! Pedra esmaga  pedra!";
          }
          case LAGARTO -> {
              return "Ganhou! pedra esmaga pedra";
          }
          case SPOCK -> {
              return "Perdeu! Spock vaporiza pedra";
          }
          default -> {
              return "Empatou! Tipo inválido";
          }
      }
  }
}

  
}
