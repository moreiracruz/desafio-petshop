package com.petshop;

import java.util.Scanner;

public class PetshopApplication {

	public static void main(String[] args) {
		new PetshopApplication().run();
	}

	public void run() {
		Scanner scanner = new Scanner(System.in);
		MaquinaBanho maquina = new MaquinaBanho();

		while (true) {
			System.out.println("\nEscolha uma operação:");
			System.out.println("1 - Abastecer água");
			System.out.println("2 - Abastecer shampoo");
			System.out.println("3 - Colocar pet na máquina");
			System.out.println("4 - Retirar pet da máquina");
			System.out.println("5 - Dar banho no pet");
			System.out.println("6 - Verificar níveis de água e shampoo");
			System.out.println("7 - Verificar se tem pet no banho");
			System.out.println("8 - Limpar máquina");
			System.out.println("9 - Sair");
			int opcao = scanner.nextInt();

			switch (opcao) {
				case 1:
					maquina.abastecerAgua();
					break;
				case 2:
					maquina.abastecerShampoo();
					break;
				case 3:
					maquina.colocarPet();
					break;
				case 4:
					maquina.retirarPet();
					break;
				case 5:
					maquina.darBanho();
					break;
				case 6:
					maquina.verificarNiveis();
					break;
				case 7:
					System.out.println("Tem pet no banho? " + maquina.temPetNoBanho());
					break;
				case 8:
					maquina.limparMaquina();
					break;
				case 9:
					System.out.println("Saindo...");
					scanner.close();
					return;
				default:
					System.out.println("Opção inválida.");
			}
		}
	}

}
