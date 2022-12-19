package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadordeReferencias;

public class Teste {

    public static void main(String[] args) {


      GuardadordeReferencias guardador = new GuardadordeReferencias();

      Conta cc = new ContaCorrente(22, 11);
      guardador.adiciona(cc);

      Conta cc2 = new ContaCorrente(22, 22);
      guardador.adiciona(cc2);

      int tamanho = guardador.getQuantidadeDeElementos();
      System.out.println(tamanho);

      Conta ref = guardador.getReferencia(0);
      System.out.println(ref.getNumero());

    }

}
