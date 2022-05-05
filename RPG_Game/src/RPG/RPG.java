package RPG;

import java.util.Random;
import java.util.Scanner;

public class RPG {
    Random ran = new Random();
    Scanner myScanner = new Scanner(System.in);
    Scanner enterScanner = new Scanner(System.in);
    int pHP;
    String pn;
    String playerName;
    String playerWeapon;
    int choice;
    int monsterHP;
    int monsterHP2;
    int HolyShield;
    int FW;
    int OW;

    public static void main(String[] args) {

        RPG dublin;
        dublin = new RPG();

        dublin.player();
        dublin.Citadel();
    }

    public void player() {


        pHP = 15;
        monsterHP = 18;
        monsterHP2 = 16;

        playerWeapon = "None";

        System.out.println("HP: " + pHP);
        System.out.println("Weapon: " + playerWeapon);

        System.out.println("Please enter your name:");
        playerName = myScanner.nextLine();

        System.out.println("Please press 'Enter' to communicate with the NPC.");
        pn = myScanner.nextLine();


        System.out.println("(Summoner): Hello " + playerName + ", You've been summoned to another world.");
        pn = myScanner.nextLine();
        System.out.println("(Summoner): This is the punishment for your sins.");
        pn = myScanner.nextLine();
        System.out.println("(Summoner): The only way to bring you back to your world is....");
        pn = myScanner.nextLine();
        System.out.println("(Summoner): You'll need to get the Holy Sword and Holy Shield, and deliver it to the Citadel.");
        pn = myScanner.nextLine();
        System.out.println("(Summoner): Those are the tools that can be use to transport you back.");
        pn = myScanner.nextLine();
        System.out.println("(Summoner): First you must find the Holy Sword in the Myscroft Forest.");
        pn = myScanner.nextLine();
        System.out.println("(Summoner): Second is, you must get the Holy Shield to Black Knight who guards the Black Keep.");
        pn = myScanner.nextLine();

        System.out.println("(Summoner): Now is the time for you to go, goodluck " + playerName);
        pn = myScanner.nextLine();


    }

    public void Citadel() {
        System.out.println("\n=========================================================================\n");
        System.out.println("=====You're in the Citadel======.");
        System.out.println("You are in the gate of the Citadel.");
        pn = myScanner.nextLine();
        System.out.println("There was a Royal Guard guarding the gate.");
        pn = myScanner.nextLine();


        System.out.println("What do you want to do?");
        pn = myScanner.nextLine();
        System.out.println("1: Talk to the Royal guard");
        System.out.println("2: Attack the Royal guard");
        System.out.println("3: Leave");
        System.out.println("\n=========================================================================\n");

        choice = myScanner.nextInt();

        if (choice == 1) {
            if (HolyShield == 1) {
                ending();
            } else {
                System.out.println("(Royal Guard): Hello there adventurer. So your name is " + playerName + "? \nand you're the one who was summoned");
                enterScanner.nextLine();
                System.out.println("(Royal Guard): Please get the Holy Sword and Holy Shield first, before you enter");
                enterScanner.nextLine();
                Citadel();
            }

        } else if (choice == 2) {
            pHP = pHP - 1;
            System.out.println("(Royal Guard): Why are you doing this?\n\nThe guard hit you so hard and you gave up.\n(You receive 1 damage)\n");
            System.out.println("Your HP: " + pHP);
            enterScanner.nextLine();
            Citadel();
        } else if (choice == 3) {
            Road();
        } else {
            Citadel();
        }
    }

    public void Road() {
        System.out.println("\n=========================================================================\n");
        System.out.println("=====You're now in the Crosroads======.");
        System.out.println("Please press Enter to view options.");
        pn = myScanner.nextLine();
        System.out.println("1: Go to Chapel");
        System.out.println("2: Go to Myscroft Forest");
        System.out.println("3: Go to Citadel");
        System.out.println("4: Go to Black Keep");
        System.out.println("5: Go to Torabora Cave");
        System.out.println("6: Go to the Atlantis");

        System.out.println("\n=========================================================================\n");

        choice = myScanner.nextInt();

        if (choice == 1) {
            north();
        } else if (choice == 2) {
            east();
        } else if (choice == 3) {
            Citadel();
        } else if (choice == 4) {
            west();
        } else if (choice == 5) {
            Cave();
        } else if (choice == 6) {
            Sea();
        } else {
            Road();
        }
    }

    public void north() {
        System.out.println("\n=========================================================================\n");
        System.out.println("=====You're now in the chapel======.");
        pn = myScanner.nextLine();
        System.out.println("This is the place where you recover you HP, because it was blessed by the Holy Goddess");
        pn = myScanner.nextLine();
        System.out.println("Your HP is recovered.");
        pn = myScanner.nextLine();
        pHP = pHP + 1;
        System.out.println("Your HP: " + pHP);
        System.out.println("\n\n1: Go back to the crossroad");
        System.out.println("\n=========================================================================\n");

        choice = myScanner.nextInt();

        if (choice == 1) {
            Road();
        } else {
            north();
        }
    }

    public void east() {
        System.out.println("\n=========================================================================\n");
        System.out.println("=====You're now in the Myscroft Forest======.");
        pn = myScanner.nextLine();
        System.out.println("You walked into a forest and you found the Holy sword");
        pn = myScanner.nextLine();
        playerWeapon = "Holy Sword";
        System.out.println("Your Weapon: " + playerWeapon);
        System.out.println("\n\n1: Go back to the crossroad");
        System.out.println("\n=========================================================================\n");

        choice = myScanner.nextInt();

        if (choice == 1) {
            Road();
        } else {
            east();
        }
    }

    public void west() {
        System.out.println("\n=========================================================================\n");
        System.out.println("=====You're now in the Black Keep======.");
        System.out.println("Press Enter to go inside");
        pn = myScanner.nextLine();
        System.out.println("You encounter the Black Knight!\n");
        System.out.println("1: Fight?");
        System.out.println("2: Escape?");
        System.out.println("\n=========================================================================\n");

        choice = myScanner.nextInt();

        if (choice == 1) {
            fight();
        } else if (choice == 2) {
            Road();
        } else {
            west();
        }
    }

    public void Cave() {
        System.out.println("\n=========================================================================\n");
        System.out.println("=====You're now in the Torabora Cave======.");
        pn = myScanner.nextLine();
        System.out.println("There was gentle caveman.");
        pn = myScanner.nextLine();
        System.out.println("he's asking for help..");
        pn = myScanner.nextLine();
        System.out.println("What are you going to do?");
        pn = myScanner.nextLine();
        System.out.println("1: Help?");
        System.out.println("2: Escape?");
        System.out.println("\n=========================================================================\n");

        choice = myScanner.nextInt();

        if (choice == 1) {
            help();
        } else if (choice == 2) {
            Road();
        } else {
            west();
        }

    }

    public void Sea() {
        System.out.println("\n=========================================================================\n");
        System.out.println("=====You're now in the Atlantis======.");
        pn = myScanner.nextLine();

        System.out.println("You encounter a Mermaid Monster\n");
        pn = myScanner.nextLine();
        System.out.println("1: Fight?");
        System.out.println("2: Escape?");
        System.out.println("\n=========================================================================\n");
        choice = myScanner.nextInt();

        if (choice == 1) {
            attack2();
        } else if (choice == 2) {
            Road();
        } else {
            west();
        }
    }


    public void fight() {
        System.out.println("\n=========================================================================\n");
        System.out.println("Your HP: " + pHP);
        System.out.println("Monster HP: " + monsterHP);
        System.out.println("\n1: Attack?");
        System.out.println("2: Escape?");
        System.out.println("\n=========================================================================\n");

        choice = myScanner.nextInt();

        if (choice == 1) {
            attack();
        } else if (choice == 2) {
            Road();
        } else {
            fight();
        }
    }

    public void attack() {
        int playerDamage = 0;


        if (playerWeapon.equals("None")) {
            playerDamage = new java.util.Random().nextInt(5);
        } else if (playerWeapon.equals("Holy Sword")) {
            playerDamage = new java.util.Random().nextInt(8);
        }

        System.out.println("You attacked the monster and gave " + playerDamage + " damage!");

        monsterHP = monsterHP - playerDamage;

        System.out.println("Monster HP: " + monsterHP);

        if (monsterHP < 1) {
            win();
        } else if (monsterHP > 0) {
            int monsterDamage = 0;

            monsterDamage = new java.util.Random().nextInt(4);

            System.out.println("The monster attacked you and gave " + monsterDamage + " damage!");

            pHP = pHP - monsterDamage;

            System.out.println("Player HP: " + pHP);

            if (pHP < 1) {
                dead();
            } else if (pHP > 0) {
                fight();
            }


        }

    }

    public void attack2() {
        int playerDamage = 0;


        if (playerWeapon.equals("None")) {
            playerDamage = new java.util.Random().nextInt(5);
        } else if (playerWeapon.equals("Holy Sword")) {
            playerDamage = new java.util.Random().nextInt(8);
        }

        System.out.println("You attacked the monster and gave " + playerDamage + " damage!");

        monsterHP2 = monsterHP2 - playerDamage;

        System.out.println("Monster HP: " + monsterHP2);

        if (monsterHP2 < 1) {
               win2();
        } else if (monsterHP2 > 0) {
            int monsterDamage = 0;

            monsterDamage = new java.util.Random().nextInt(4);

            System.out.println("The monster attacked you and gave " + monsterDamage + " damage!");

            pHP = pHP - monsterDamage;

            System.out.println("Player HP: " + pHP);

            if (pHP < 1) {
                dead();
            } else if (pHP > 0) {
                fight();
            }
        }
    }

    public void dead() {
        System.out.println("\n=========================================================================\n");
        System.out.println("You are dead!!!");
        System.out.println("\n\nGAME OVER");
        System.out.println("\n=========================================================================\n");

    }

    public void win() {
        System.out.println("\n=========================================================================\n");
        System.out.println("You killed the Black Knight!");
        System.out.println("The Black Knight drop the Holy Shield!");
        System.out.println("You obtained the Holy Shield!\n\n");
        System.out.println("1: Go east");
        System.out.println("\n=========================================================================\n");

        HolyShield = 1;

        choice = myScanner.nextInt();
        if (choice == 1) {
            Road();
        } else {
            win();
        }

    }

    public void win2() {
        System.out.println("\n=========================================================================\n");
        System.out.println("You killed the Mermaid!!");
        System.out.println("You got +10 health");
        pHP = pHP+10;
        System.out.println("Your Health is: "+pHP);
        System.out.println("1: Go east");
        System.out.println("\n=========================================================================\n");



        choice = myScanner.nextInt();
        if (choice == 1) {
            Road();
        } else {
            win2();
        }
    }


        public void help() {
        System.out.println("\n=========================================================================\n");
        pn = myScanner.nextLine();
        System.out.println("(Caveman): Good day Young man, I'm greatful for your help.");
        pn = myScanner.nextLine();
        System.out.println("(Caveman): My only task is, to find my staff in this cave.");
        pn = myScanner.nextLine();
        System.out.println("(Caveman): Goodluck hero!");
        pn = myScanner.nextLine();
        help2();
    }

     public void help2(){
            System.out.println("\nSelect a Place:");
            System.out.println("1.North Cave ");
            System.out.println("2.South Cave");
            System.out.println("3.East Cave");
            System.out.println("4.West Cave");
            System.out.println("5.Escape");
            choice = myScanner.nextInt();

            if (choice == 1) {
                System.out.println("Wrong Place! Find again. ");
                help2();
            } else if (choice == 2) {
                System.out.println("Wrong Place! Find again. ");
                help2();
            } else if (choice == 3) {
                System.out.println("You found it! ");
                pn = myScanner.nextLine();
                System.out.println("(Caveman): Thank you Young man, come here again and help me.");
                pn = myScanner.nextLine();
                System.out.println("1. You'll return to Crossroads.");
                pn = myScanner.nextLine();
                Road();
            } else if (choice == 4) {
                System.out.println("Wrong Place! Find again. ");
                choice = myScanner.nextInt();
                help2();
            } else if (choice == 5) {
                Road();
            }

    }

    public void ending(){
        System.out.println("\n=========================================================================\n");
        System.out.println("(Royal Guard): Oh you killed the Black Knight and you got the Holy Shield!? Great!");
        pn = myScanner.nextLine();
        System.out.println("(Royal Guard): And you also found the Holy Sword?");
        pn = myScanner.nextLine();
        System.out.println("(Royal Guard): Congratulations! You completed your mission.....");
        pn = myScanner.nextLine();
        System.out.println("(Royal Guard): I'll escort you "+playerName+" to the portal.");
        pn = myScanner.nextLine();
        System.out.println("(Summoner): We meet again "+ playerName+", I guess you completed your mission.");
        pn = myScanner.nextLine();
        System.out.println("(Summoner): As what I said, You have been cleansed and you're capable of returning home");
        pn = myScanner.nextLine();
        System.out.println("(Summoner): Once again, congratulations "+playerName+". I hope we meet again someday..");
        pn = myScanner.nextLine();
        System.out.println("\n\n           THE END                    ");
        System.out.println("\n=========================================================================\n");
    }
}