package com.github.julianomachadoo.escola.aplicacao.matricular.aluno;

import com.github.julianomachadoo.escola.dominio.aluno.Aluno;
import com.github.julianomachadoo.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorio;

    public MatricularAluno(RepositorioDeAlunos repositorio) {
        this.repositorio = repositorio;
    }

    public void executa(MatricularAlunoDto dados) {
        Aluno novo = dados.criarAluno();
        repositorio.matricular(novo);
    }
}
