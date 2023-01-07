package com.github.julianomachadoo.escola;

import com.github.julianomachadoo.escola.aplicacao.matricular.aluno.MatricularAluno;
import com.github.julianomachadoo.escola.aplicacao.matricular.aluno.MatricularAlunoDto;
import com.github.julianomachadoo.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoLinhaDeComando {

    public static void main(String[] args) {
        String nome = "Fulano da Silva";
        String cpf = "123.456.789-00";
        String email = "fulano@email.com";

        MatricularAluno matricularAluno = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
        matricularAluno.executa(new MatricularAlunoDto(nome, cpf, email));
    }
}
