package com.github.julianomachadoo.escola;

import com.github.julianomachadoo.escola.dominio.aluno.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {

    @Test
    void naoDeveriaCriarUmCpfComNumeroInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> new CPF(null));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF("aaa.aaa.aaa-aa"));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF("111.11.111-11"));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF("11.111.111-11"));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF("111.111.11-11"));

        assertThrows(IllegalArgumentException.class,
                () -> new CPF("111.111.111-1"));
    }

    @Test
    void deveriaCriarCpfComNumeroValido() {
        CPF cpf = new CPF("111.111.111-11");

        assertNotNull(cpf);
    }

}