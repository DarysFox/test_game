import java.util.Scanner;
public class Main {

//    static void pressEnterToContinue(){
//        Scanner keyIn = new Scanner(System.in);
//        keyIn.nextLine();
//        keyIn.nextLine();
//    }


    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_YELLOW = "\u001B[33m";

    public static final String ANSI_CYAN = "\u001B[36m";

    public static final String ANSI_PURPLE = "\u001B[35m";

    static void story() {
        String story2 = ANSI_YELLOW + "Abyste se dostali do mesta Arduyn, musite projit lesem Mahra. \n" +
                "Existuje legenda, ze prave v tomto lese se nachazi osada skretu, \n" +
                "se kterymi valcí kralovstvi Myrtany. \n" + ANSI_RESET;

        System.out.println(story2 + "\n");
    }

    public static void main(String[] args) throws InterruptedException{
        //start parametry
        int health = 100;
        int gold = 0;
        String[] backpack = new String[10];
        int right = 1;
        int left = 2;
        //player choice
        int playerChoice;
        String yesOrNo;
        long start = System.currentTimeMillis();

        //ahoj


        System.out.println("\n -------------------Game------------------- \n");
        Thread.sleep(2000);

        String playerName;
        System.out.println("Enter a player name: ");
        Scanner inputPlayer = new Scanner(System.in);
        playerName = inputPlayer.nextLine();
        System.out.println("Hello, " + ANSI_CYAN + playerName + ANSI_RESET + ". \n");
//        pressEnterToContinue();
        Thread.sleep(2000);

        String story = ANSI_YELLOW + "Kralovstvi Myrtana vede zoufalou valku se skrety. \n" +
                "Jedina zbran, kterou proti skretum ma, je magicka ruda, \n" +
                "jez je tezena na ostrove Khorinis. \n" +
                "Aby se ziskalo vice rudy, byli do dolu posilani zlocinci \n" +
                "vcetne tech, co spachali mensi zlociny. Vezni jmenem " + ANSI_CYAN + playerName + ANSI_YELLOW + " se presto podarilo uprchnout. \n" + ANSI_RESET;


        System.out.println(ANSI_YELLOW + " -------------------PROLOG------------------- \n" + ANSI_RESET);

        Thread.sleep(2000);

        System.out.println(story + "\n");
//        pressEnterToContinue();
        Thread.sleep(10000);


        //zacatek pribehu

        System.out.println(" -------------------START------------------- \n");
        Thread.sleep(2000);

        System.out.println(ANSI_PURPLE + "health: " + health + ". " + "         gold: " + gold + ". " + "         backpack: 0. \n" + ANSI_RESET);

        System.out.println("Stojite u mesta Venghard. Vpravo je mesto Myrtana, vlevo je mesto Arduyn. Kam pujdete?");
        System.out.println("1 - doprava \n" + "2 - doleva \n");
        playerChoice = inputPlayer.nextInt();

        if(playerChoice == right){
            Thread.sleep(2000);
            System.out.println("Vydali jste se na cestu do mesta Myrtana. Behem cesty jste nasli truhlu. " +
                    "Chcete ji otevrit?");
            System.out.println("yes - Chcete \n" + "no - Nechcete");

            yesOrNo = inputPlayer.next();


            if(yesOrNo.equalsIgnoreCase("yes")){
                gold = gold + 30;
                backpack[0] = "4 sipy";
                backpack[1] = "1 sekera";

                System.out.println(ANSI_PURPLE + "health: " + health + ". " + "         gold: " + gold + ". " + "         backpack: " + backpack[0]  + ", " + backpack[1] + ". \n" + ANSI_RESET);
//                pressEnterToContinue();
                Thread.sleep(3000);
                story();
            }
            else if(yesOrNo.equalsIgnoreCase("no")){
                Thread.sleep(2000);
                System.out.println("Pokracujete dal. \n");
                System.out.println(ANSI_PURPLE + "health: " + health + ". " + "         gold: " + gold + ". " + "         backpack: 0. \n" + ANSI_RESET);
//                pressEnterToContinue();
                Thread.sleep(3000);
                story();

            }

            else System.out.println("Wrong answer. Restart the game. \n");
        }


        else if(playerChoice == left){
            Thread.sleep(2000);
            System.out.println("Vydali jste se na cestu do mesta Arduyn. Behem cesty jste potkali 3 orky. " +
                    "Chcete na ne zautocit? ");

            System.out.println("yes - Chcete \n" + "no - Nechcete");

            yesOrNo = inputPlayer.next();


            if(yesOrNo.equalsIgnoreCase("yes")){
                health = health - 30;
                gold = gold + 60;
                System.out.println("Porazili jste je. \n");
                System.out.println(ANSI_PURPLE + "health: " + health + ". " + "         gold: " + gold + ". " + "         backpack: 0. \n" + ANSI_RESET);
//                pressEnterToContinue();
                Thread.sleep(3000);
                story();
            }

            else if(yesOrNo.equalsIgnoreCase("no")){
                Thread.sleep(2000);
                System.out.println("Pokracujete dal. \n");
                System.out.println(ANSI_PURPLE + "health: " + health + ". " + "         gold: " + gold + ". " + "         backpack: 0. \n");
//                pressEnterToContinue();
                Thread.sleep(3000);
                story();
            }

            else System.out.println("Wrong answer. Restart the game \n");
        }
    }
}
