package br.com.fatecararas.domain;

public class Spock {public class Papel extends Algoritmo {
  @Override
  public String executar(TipoAlgoritmo tipo) {

      switch (tipo) {
          case PAPEL -> {
              return "Empatou! Papel refuta spock";
          }
          case TESOURA -> {
              return "Ganhou! Spock esmaga tesoura!";
          }
          case PEDRA -> {
              return "Ganhou! Spock vaporiza pedra!";
          }
          case LAGARTO -> {
              return "Perdeu! lagarto envenena spock";
          }
          case SPOCK -> {
              return "Empatou! spock vaporiza Spock";
          }
          default -> {
              return "Empatou! Tipo inválido";
          }
      }
  }
}

  
}
