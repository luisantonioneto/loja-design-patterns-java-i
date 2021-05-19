package br.com.alura.loja.orcamento;

import br.com.alura.loja.imposto.Imposto;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }

}
