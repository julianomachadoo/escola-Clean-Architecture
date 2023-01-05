package com.github.julianomachadoo.escola;

import com.github.julianomachadoo.escola.dominio.aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefoneComNumeroInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null, "88888888"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("", "88888888"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("5", "88888888"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("111", "88888888"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("aa", "88888888"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("55", null));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("55", ""));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("55", "7777777"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("55", "1010101010"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("55", "aaaaaaaa"));

    }

    @Test
    void deveriaCriarTelefoneComNumeroValido() {
        Telefone telefone = new Telefone("11", "88888888");
        Telefone telefone2 = new Telefone("11", "999999999");

        assertNotNull(telefone);
        assertNotNull(telefone2);
    }

}