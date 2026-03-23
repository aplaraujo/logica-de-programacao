package org.example;

import java.util.Scanner;

public class Main {
    private final static Scanner sc = new Scanner(System.in);

    private final static PetMachine PET_MACHINE = new PetMachine();

    public static void main(String[] args) {

        int option;

        do {
            System.out.println("===== Escolha uma das opções: =====");
            System.out.println("===================================");
            System.out.println("1 - Dar banho no bichinho");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com xampu");
            System.out.println("4 - Verificar água da máquina");
            System.out.println("5 - Verificar xampu da máquina");
            System.out.println("6 - Verificar se o bichinho está no banho");
            System.out.println("7 - Colocar o bichinho na máquina");
            System.out.println("8 - Retirar o bichinho da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");

            option = sc.nextInt();
        } while (option != 0);

        switch (option) {
            case 1 -> PET_MACHINE.takeAShower();
            case 2 -> setWater();
            case 3 -> setShampoo();
            case 4 -> verifyWaterAmount();
            case 5 -> verifyShampooAmount();
            case 6 -> checkIfHasPetInMachine();
            case 7 -> setPetInPetMachine();
            case 8 -> PET_MACHINE.removePet();
            case 9 -> PET_MACHINE.wash();
            case 0 -> System.exit(0);
            default -> System.out.println("Opção inválida");
        }

        sc.close();
    }

    private static void setWater() {
        System.out.println("Tentando colocar água na máquina");
        PET_MACHINE.addWater();
    }

    private static void setShampoo() {
        System.out.println("Tentando colocar xampu na máquina");
        PET_MACHINE.addShampoo();
    }

    private static void verifyWaterAmount() {
        var amount = PET_MACHINE.getWater();
        System.out.println("A máquina está no momento com " + amount + " litro(s) de água");
    }

    private static void verifyShampooAmount() {
        var amount = PET_MACHINE.getShampoo();
        System.out.println("A máquina está no momento com " + amount + " litro(s) de xampu");
    }

    private static void checkIfHasPetInMachine() {
        boolean hasPet = PET_MACHINE.hasPet();
        System.out.println(hasPet ? "Tem bichinho na máquina" : "Não tem bichinho na máquina");
    }

    public static void setPetInPetMachine() {
        String name = "";
        while(name == null || name.isEmpty()) {
            System.out.print("Digite o nome do bichinho: ");
            name = sc.nextLine();
        }

        Pet pet = new Pet(name);
        PET_MACHINE.setPet(pet);
        System.out.println("O bichinho " + pet.getName() + " foi colocado na máquina");
    }

}