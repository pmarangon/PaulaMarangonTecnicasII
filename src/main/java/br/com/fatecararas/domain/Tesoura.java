package br.com.fatecararas.domain;

public class Tesoura {public class Papel extends Algoritmo {
  @Override
  public String executar(TipoAlgoritmo tipo) {

      switch (tipo) {
          case PAPEL -> {
              return "Ganhou! Tesoura corta papel";
          }
          case TESOURA -> {
              return "Empatou! Tesoura empata com tesoura!";
          }
          case PEDRA -> {
              return "Perdeu! Pedra esmaga tesoura!";
          }
          case LAGARTO -> {
              return "Ganhou! tesoura decapita lagarto";
          }
          case SPOCK -> {
              return "Perdeu! Papel refuta Spock";
          }
          default -> {
              return "Empatou! Tipo inválido";
          }
      }
  }
}

  
}
