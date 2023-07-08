package br.com.fatecararas.domain;

public class Lagarto { public class Papel extends Algoritmo {
  @Override
  public String executar(TipoAlgoritmo tipo) {

      switch (tipo) {
          case PAPEL -> {
              return "Ganhou! Lagarto  come papel";
          }
          case TESOURA -> {
              return "Perdeu! Tesoura decapita o lagarto!";
          }
          case PEDRA -> {
              return "Perdeu! Pedra esmaga o lagarto!";
          }
          case LAGARTO -> {
              return "Empatou! lagarto envenena lagarto";
          }
          case SPOCK -> {
              return "Ganhou! Lagarto envenena Spock";
          }
          default -> {
              return "Empatou! Tipo inválido";
          }
      }
  }
}

  
}
