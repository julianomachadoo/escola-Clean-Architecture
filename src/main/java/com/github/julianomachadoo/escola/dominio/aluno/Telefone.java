package com.github.julianomachadoo.escola.dominio.aluno;

public class Telefone {

    private final String ddd;
    private final String numero;

    public Telefone(String ddd, String numero) {

        if (ddd == null ||ddd.length() != 2 || !ddd.matches("[0-9]*") || numero == null
                || numero.length() > 9 || numero.length() < 8 || !numero.matches("[0-9]*"))
            throw new IllegalArgumentException("Numero inválido");

        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }
}
