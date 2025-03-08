package com.petshop;

public class MaquinaBanho {
    private int nivelAgua; // Em litros
    private int nivelShampoo; // Em litros
    private boolean petNoBanho;
    private boolean petLimpo;

    public MaquinaBanho() {
        this.nivelAgua = 0;
        this.nivelShampoo = 0;
        this.petNoBanho = false;
        this.petLimpo = false;
    }

    public void abastecerAgua() {
        if (nivelAgua + 2 <= 30) {
            nivelAgua += 2;
            System.out.println("Água abastecida. Nível atual: " + nivelAgua + " litros.");
        } else {
            System.out.println("Capacidade máxima de água atingida.");
        }
    }

    public void abastecerShampoo() {
        if (nivelShampoo + 2 <= 10) {
            nivelShampoo += 2;
            System.out.println("Shampoo abastecido. Nível atual: " + nivelShampoo + " litros.");
        } else {
            System.out.println("Capacidade máxima de shampoo atingida.");
        }
    }

    public void colocarPet() {
        if (!petNoBanho) {
            petNoBanho = true;
            petLimpo = false;
            System.out.println("Pet colocado na máquina.");
        } else {
            System.out.println("Já há um pet na máquina.");
        }
    }

    public void retirarPet() {
        if (petNoBanho) {
            if (petLimpo) {
                System.out.println("Pet retirado da máquina.");
            } else {
                System.out.println("Pet retirado sem estar limpo. A máquina precisa ser limpa.");
                limparMaquina();
            }
            petNoBanho = false;
        } else {
            System.out.println("Não há pet na máquina.");
        }
    }

    public void darBanho() {
        if (petNoBanho) {
            if (nivelAgua >= 10 && nivelShampoo >= 2) {
                nivelAgua -= 10;
                nivelShampoo -= 2;
                petLimpo = true;
                System.out.println("Banho realizado. Pet está limpo.");
            } else {
                System.out.println("Recursos insuficientes para dar banho.");
            }
        } else {
            System.out.println("Não há pet na máquina.");
        }
    }

    public void limparMaquina() {
        if (nivelAgua >= 3 && nivelShampoo >= 1) {
            nivelAgua -= 3;
            nivelShampoo -= 1;
            System.out.println("Máquina limpa.");
        } else {
            System.out.println("Recursos insuficientes para limpar a máquina.");
        }
    }

    public void verificarNiveis() {
        System.out.println("Nível de água: " + nivelAgua + " litros.");
        System.out.println("Nível de shampoo: " + nivelShampoo + " litros.");
    }

    public boolean temPetNoBanho() {
        return petNoBanho;
    }

    public int getNivelAgua() {
        return nivelAgua;
    }

    public int getNivelShampoo() {
        return nivelShampoo;
    }

    public boolean isPetNoBanho() {
        return petNoBanho;
    }

    public boolean isPetLimpo() {
        return petLimpo;
    }
}
