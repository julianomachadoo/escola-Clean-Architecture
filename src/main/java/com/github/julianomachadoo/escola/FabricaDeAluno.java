package com.github.julianomachadoo.escola;

import java.util.ArrayList;
import java.util.List;

public class FabricaDeAluno {

    private String nome;
    private CPF cpf;
    private Email email;
    private final List<Telefone> telefones = new ArrayList<>();

    public FabricaDeAluno comNomeCPFEEmail(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = new CPF(cpf);
        this.email = new Email(email);
        return this;
    }

    public FabricaDeAluno comTelefone(String ddd, String numero) {
        Telefone telefone = new Telefone(ddd, numero);
        this.telefones.add(telefone);
        return this;
    }

    public Aluno build() {
        Aluno aluno = new Aluno(cpf, nome, email);
        for (Telefone telefone : telefones) {
            aluno.adicionarTelefone(telefone.getDdd(), telefone.getNumero());
        }
        return aluno;
    }

}
