package com.github.julianomachadoo.escola.aplicacao.matricular.aluno;

import com.github.julianomachadoo.escola.dominio.aluno.Aluno;
import com.github.julianomachadoo.escola.dominio.aluno.CPF;
import com.github.julianomachadoo.escola.dominio.aluno.Email;

public class MatricularAlunoDto {

    private String nomeAluno;
    private String cpfAluno;
    private String emailAluno;

    public MatricularAlunoDto(String nomeAluno, String cpfAluno, String emailAluno) {
        this.nomeAluno = nomeAluno;
        this.cpfAluno = cpfAluno;
        this.emailAluno = emailAluno;
    }

    public Aluno criarAluno() {
        return new Aluno(new CPF(cpfAluno), nomeAluno, new Email(emailAluno));
    }
}
