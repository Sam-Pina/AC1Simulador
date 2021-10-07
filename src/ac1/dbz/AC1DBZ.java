package ac1.dbz;

import java.util.Scanner;

public class AC1DBZ {

    public static void main(String[] args) {

        int escolha = 0;
    
        Scanner ler = new Scanner(System.in);

        System.out.println(" ------- ATRIBUTOS DOS PERSONAGENS --------");
        Arena_DBZ personagem1 = new Arena_DBZ("GOKU", "Sayajin1", 30);
        Arena_DBZ personagem2 = new Arena_DBZ("VEGETA", "Sayajin4", 30);
        Arena_DBZ personagem3 = new Arena_DBZ("FREEZA", "Sayajin3", 30);
        Arena_DBZ personagem4 = new Arena_DBZ("BULMA", "Sayajin2", 30);

      
        System.out.println("-------------------------------------------");
        System.out.println("---------- ARENA DRAGON BALL Z -----------");
        System.out.println(".......... ESCOLHA SUA BATALHA ........... ");
        System.out.println("1- Goku VS Freeza");           // personagem1 vs personagem3
        System.out.println("2- Vegeta VS Goku");           // personagem2 vs personagem1
        System.out.println("3- Freeza VS Bulma");          // personagem3 vs personagem4
        System.out.println("4- Bulma VS Vegeta");          // personagem4 vs personagem2
        System.out.println("5- Sair");
        System.out.println("........................... ");
        System.out.print("Escolha uma operação : ");
        escolha = ler.nextInt();
        
        int ataquevegeta = personagem2.getAtaque();
        int ataquegoku = personagem1.getAtaque();
        int ataquefreeza = personagem3.getAtaque();
        int ataquebulma = personagem4.getAtaque();

        switch (escolha) {
            case 1:
                if (ataquegoku > ataquefreeza) {
                    System.out.println("O grande campeao é: " + personagem1.getNome());
                } else {
                    System.out.println("O grande campeao é: " + personagem3.getNome());
                }
                break;

            case 2:

                if (ataquevegeta > ataquegoku) {
                    System.out.println("O grande campeao é: " + personagem2.getNome());
                } else {
                    System.out.println("O grande campeao é: " + personagem1.getNome());
                }
                break;

            case 3:

               if (ataquefreeza > ataquebulma) {
                    System.out.println("O grande campeao é: " + personagem3.getNome());
                } else {
                    System.out.println("A grande campea é: " + personagem4.getNome());
                }
                break;

            case 4:
               
                if (ataquebulma> ataquevegeta) {
                    System.out.println("A grande campea é: " + personagem4.getNome());
                } else {
                    System.out.println("O grande campeao é: " + personagem2.getNome());
                }
                break;

            case 5:
                System.out.println("fim de combate");
                main(args);
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }

    }

}
