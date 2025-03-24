import java.util.Random;
import java.util.Scanner;

public class Main {
    static String[] slotIcons = { "🍉", "🍓", "🍋", "🍀" ,"🔔" };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****EGT*******");
        System.out.print("Enter a balance in GEL ");
        Integer balance = scanner.nextInt();
        egtSlot(balance);
    }
    public static String egtSlot(Integer balance) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        while ( balance >= 15 ) {
            System.out.println("Spin, yes or no ");
            String answer = scanner.nextLine();
            switch (answer) {
                case "yes": {
                    balance -= 15;
                    Integer computerChoice1 =  random.nextInt(slotIcons.length);
                    Integer computerChoice2 =  random.nextInt(slotIcons.length);
                    Integer computerChoice3 =  random.nextInt(slotIcons.length);
                    Integer computerChoice4 =  random.nextInt(slotIcons.length);
                    System.out.printf("%s %s %s %s\n", slotIcons[computerChoice1],
                    slotIcons[computerChoice2], slotIcons[computerChoice3], slotIcons[computerChoice4]);
                    if ( computerChoice1.equals(computerChoice2) & computerChoice3 == 3 ) {
                        balance += 75;
                        System.out.println("YOU WON 65 GEL");
                    }else if ( computerChoice1.equals(computerChoice2)  )  {
                        balance += 15;
                        System.out.println("YOU WON 15 GEL");
                    }
                    System.out.println("Balance: " + balance);
                    continue;


                }
                case "no": {
                    System.out.println("You finished the game");
                    return "";
                }
            }

        }
        if ( balance <= 15 ) {
            System.out.printf("Not enough balance to continue, You have left - %d GEL", balance);
        }
        return  "";
    }

}

































//        String[] Jeiran =  {"paper", "scissor", "rock" };
//
//        while(true) {
//            System.out.print("Je-i-ra-ni: ");
//            String userChoice = scanner.nextLine().toLowerCase();
//            Integer computerChoice = random.nextInt(Jeiran.length);
//            switch (userChoice) {
//                case "paper":
//                    if (Jeiran[computerChoice].equals("rock")) {
//                        System.out.println("Computer chose Rock, YOU WON!");
//
//                    }else if (Jeiran[computerChoice].equals("scissor")) {
//                        System.out.println("Computer chose scissor, YOU LOST!");
//                    }else {
//                        System.out.println("Computer chose paper too, IT'S DRAW!");
//                        continue;
//                    }
//                    return;
//                case "rock":
//                    if (Jeiran[computerChoice].equals("scissor")) {
//                        System.out.println("Computer chose scissor, YOU WIN!");
//                    }else if (Jeiran[computerChoice].equals("paper")) {
//                        System.out.println("Computer chose paper, YOU LOST");
//                    }else {
//                        System.out.println("Computer chose Rock too, IT'S DRAW!");
//                        continue;
//                    }
//                    return;
//                case "scissor":
//                    if (Jeiran[computerChoice].equals("rock")) {
//                        System.out.println("Computer chose Rock, YOU LOST!");
//                    }else if (Jeiran[computerChoice].equals("paper")) {
//                        System.out.println("Computer chose paper, YOU WIN");
//                    } else {
//                        System.out.println("Computer chose scissor too, IT'S A DRAW!");
//                        continue;
//                    }
//                    return;
//            }
//        }
























//    int x = 0;
//    static double balance = 10000;

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your age: ");
//        Integer Age = scanner.nextInt();
//
//        System.out.println("Enter your name: ");
//        String name = scanner.next();
//
//        System.out.println("You are " + Age + "years old");
//        System.out.println("You are name is " + name );

//
//        scanner.close();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Whats your name? ");
//        String name = scanner.next();
//
//        happyBirthday(name);
//
//    }
//    static void happyBirthday(String name) {
//        System.out.printf("Happy Birthday to %s", name);
//        System.out.println("\nHappy Birthday dear you");
//        System.out.println("How old did you become?");
//    }

//    bank();
//
//    }
//    static Integer bankBalance(Integer balance) {
//            return balance;
//    }
//    static double bankBalance() {
//        return balance;
//    }
//
//    static String withdraw(double money) {
//        return "You did Withdraw with " + money + "GEL";
//    }
//    static void  bank() {
//
//        boolean working = true;
//        Scanner scanner = new Scanner(System.in);
//
//        do {
//            System.out.println("\n*************************");
//            System.out.println("------1. $show Balance$-----");
//            System.out.println("------2. Deposit >-----");
//            System.out.println("------3. Withdraw <------");
//            System.out.println("------4. Exit------");
//            System.out.println("*************************");
//            System.out.print("Choose number 1 to 4: ");
//            Integer choice = scanner.nextInt();
//            switch (choice) {
//                case 1 -> System.out.printf("Balance is %.2f", bankBalance());
//                case 2 -> System.out.println("Deposit");
//                case 3 -> {
//                    System.out.println("How much GELA do you want? ");
//                    Double money = scanner.nextDouble();
//                    System.out.println(withdraw(money));
//                    balance = balance - money;
//                }
//                case 4 -> {
//                    working = false;
//                    System.out.println("Exit");
//                }
//                default -> System.out.println("Wrong Choice");
//            }
//        }while ( working );
//        scanner.close();