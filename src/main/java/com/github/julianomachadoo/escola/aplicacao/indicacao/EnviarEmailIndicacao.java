package com.github.julianomachadoo.escola.aplicacao.indicacao;

import com.github.julianomachadoo.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

    void enviarPara(Aluno alunoIndicado);
}
