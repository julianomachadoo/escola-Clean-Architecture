package com.github.julianomachadoo.escola.infra.aluno;

import com.github.julianomachadoo.escola.dominio.aluno.Aluno;
import com.github.julianomachadoo.escola.dominio.aluno.AlunoNaoEncontrado;
import com.github.julianomachadoo.escola.dominio.aluno.CPF;
import com.github.julianomachadoo.escola.dominio.aluno.RepositorioDeAlunos;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

    private List<Aluno> matriculados = new ArrayList<>();

    @Override
    public void matricular(Aluno aluno) {
        this.matriculados.add(aluno);
    }

    @Override
    public Aluno buscarPorCpf(CPF cpf) {
        return matriculados.stream().filter(aluno -> aluno.getCpf().equals(cpf.getNumero()))
                .findFirst()
                .orElseThrow(() -> new AlunoNaoEncontrado(cpf));
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return this.matriculados;
    }
}
