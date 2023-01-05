package com.github.julianomachadoo.escola.dominio.aluno;


public class AlunoNaoEncontrado extends RuntimeException {
    public AlunoNaoEncontrado(CPF cpf) {
        super("Aluno não encontrado com CPF: " + cpf.getNumero());
    }
}
