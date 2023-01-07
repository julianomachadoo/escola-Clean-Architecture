package com.github.julianomachadoo.escola.infra.indicacao;

import com.github.julianomachadoo.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import com.github.julianomachadoo.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

    @Override
    public void enviarPara(Aluno alunoIndicado) {
        // logica de envio de emila com a lib Java Mail;
    }
}
