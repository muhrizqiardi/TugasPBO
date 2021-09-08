import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {

        // Menu
        System.out.println("Menu: \n1. Class Person\n2. Class NPC\n>> ");
        String menu = dataIn.readLine();

        switch (menu) {
            case "1":
                System.out.print("Enter your name                   : ");
                String name = dataIn.readLine();
                System.out.print("Where do you live?                : ");
                String address = dataIn.readLine();
                System.out.print("What is your hobby?               : ");
                String hobby = dataIn.readLine();
                System.out.print("What is your job?                 : ");
                String profession = dataIn.readLine();
                System.out.print("Enter your birth year             : ");
                int birthYear = Integer.parseInt(dataIn.readLine());
                System.out.print("Enter your birth month            : ");
                int birthMonth = Integer.parseInt(dataIn.readLine());
                System.out.print("Enter your birth day              : ");
                int birthDay = Integer.parseInt(dataIn.readLine());

                Person person1 = new Person(name, address, hobby, profession, birthYear, birthMonth, birthDay);

                person1.greeting();
                person1.getAge();
                break;
            case "2":
                System.out.println("Enter your NPC");
                System.out.print("Name           : ");
                String npcName = dataIn.readLine();

                System.out.print("Level          : ");
                Float npcLevel = Float.parseFloat(dataIn.readLine());

                System.out.print("Health         : ");
                Float npcHealth = Float.parseFloat(dataIn.readLine());

                System.out.print("Position x     : ");
                int npcPositionX = Integer.parseInt(dataIn.readLine());

                System.out.print("Position y     : ");
                int npcPositionY = Integer.parseInt(dataIn.readLine());

                NPC npc1 = new NPC(npcName, npcLevel, npcHealth, npcPositionX, npcPositionY);
                String npcMenu = "0";

                loop: while (npcMenu != "4") {

                    if (!npc1.isAlive()) {
                        System.out.println("You are dead.");
                        break loop;
                    }

                    System.out.println("");
                    System.out.println("");
                    npc1.info();
                    System.out.println("\nWhat do you want to do?");
                    System.out.println("1. Attack");
                    System.out.println("2. Give potion");
                    System.out.println("3. Move");
                    System.out.println("4. Exit\n>> ");
                    npcMenu = dataIn.readLine();
                    


                    switch (npcMenu) {
                        case "4": 
                            break loop;
                        case "1":
                            System.out.println("\nHow many points?");
                            int attackPoint = Integer.parseInt(dataIn.readLine());
                            npc1.attack(attackPoint);
                            break;
                        case "2":
                            System.out.println("\nHow many points?");
                            int givePotionPoint = Integer.parseInt(dataIn.readLine());
                            npc1.givePotion(givePotionPoint);
                            break;
                        case "3":  
                            System.out.println("\nMove X:");
                            int moveX = Integer.parseInt(dataIn.readLine());

                            System.out.println("\nMove Y:");
                            int moveY = Integer.parseInt(dataIn.readLine());
                            
                            npc1.move(moveX, moveY);
                            break;
                        default:
                            System.out.println("Enter the menu correctly, okay?");

                            break;
                    }

                }
                break;
            default:
                System.out.println("Enter the menu correctly.");
                break;

        }

    }
}
