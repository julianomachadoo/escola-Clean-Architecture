package com.github.julianomachadoo.escola.aplicacao.matricular.aluno;

import com.github.julianomachadoo.escola.dominio.aluno.Aluno;
import com.github.julianomachadoo.escola.dominio.aluno.CPF;
import com.github.julianomachadoo.escola.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repositorio);

        MatricularAlunoDto dados =
                new MatricularAlunoDto("Fulano", "123.456.789-00", "fulano@email.com");
        useCase.executa(dados);

        Aluno encontrado = repositorio.buscarPorCpf(new CPF("123.456.789-00"));

        assertEquals("Fulano", encontrado.getNome());
        assertEquals("123.456.789-00", encontrado.getCpf());
        assertEquals("fulano@email.com", encontrado.getEmail());
    }
}