package com.petshop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaquinaBanhoTest {

    @Test
    void testAbastecerAgua() {
        MaquinaBanho maquina = new MaquinaBanho();
        maquina.abastecerAgua();
        assertEquals(2, maquina.getNivelAgua());
    }

    @Test
    void testAbastecerShampoo() {
        MaquinaBanho maquina = new MaquinaBanho();
        maquina.abastecerShampoo();
        assertEquals(2, maquina.getNivelShampoo());
    }

    @Test
    void testColocarPet() {
        MaquinaBanho maquina = new MaquinaBanho();
        maquina.colocarPet();
        assertTrue(maquina.temPetNoBanho());
    }

    @Test
    void testDarBanho() {
        MaquinaBanho maquina = new MaquinaBanho();
        maquina.colocarPet();
        maquina.abastecerAgua();
        maquina.abastecerShampoo();
        maquina.darBanho();
        assertTrue(maquina.getNivelAgua() < 30);
        assertTrue(maquina.getNivelShampoo() < 10);
    }

}
