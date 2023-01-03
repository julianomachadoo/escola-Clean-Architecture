package com.github.julianomachadoo.escola;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));

        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));

        assertThrows(IllegalArgumentException.class,
                () -> new Email("emailInvalido"));
    }

    @Test
    void deveriaCriarEmailComEnderecoValido() {
        Email email = new Email("aluno@email.com");

        assertNotNull(email);
    }
}