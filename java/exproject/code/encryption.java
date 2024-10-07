
import java.util.*;



public class encryption {
    /* OTP = one_time_pad
    encryption technique that cannot be cracked,
    but requires that use of one_time pre_shared key
    the same size as, or longer than, the message being sent.
    IN this technique, plaintext is pared with a random secret key
    (also referred to as a one_time_pad).
     */
    private Scanner sc;
    private Random random;
    private ArrayList<Character> list;
    private ArrayList<Character> shuffledList;
    private char character;
    private String line;
    private char[] letters;
    private char[] secretLetters;



    encryption() {
        sc = new Scanner(System.in);
        random = new Random();
        list = new ArrayList<>();
        shuffledList = new ArrayList<>();
        character = ' ';


        askquestion();


    }

    private void askquestion() {
        while (true) {

            System.out.println("************************************************");
            System.out.println("What do you want to do?");
            System.out.println("(N)ewkey, (G)etkey, (E)ncrypt, (D)ecrypt, (Q)uit");
            char response = Character.toUpperCase(sc.nextLine().charAt(0));
            switch (response) {
                case 'N':
                    newkey();
                    break;
                case 'G' :
                    getkey();
                    break;
                case 'E' :
                    encrypt();
                    break;
                case 'D' :
                    decrypt();
                    break;
                case 'Q' :
                    quit();
                    break;
                default :
                    System.out.println("Invalid choice");
            }
        }
    }

    private void newkey() {
        character = ' ';
        list.clear();
        shuffledList.clear();

        for (int i = 36; i < 127; ++ i) {
            list.add(Character.valueOf(character));
            character ++;
        }
        shuffledList = new ArrayList<>(list);
        Collections.shuffle(shuffledList);
        System.out.println("a new key has been generated");
    }

    private void getkey() {
        System.out.println("key : ");
        for (Character c : list) {
            System.out.print(c);
        }

        for (Character c : shuffledList) {
            System.out.print(c);
        }
        System.out.println();
    }

    private void encrypt() {
        System.out.println("enter a massage to be encrypted : ");
        String message = sc.nextLine();

        letters = message.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (letters[i] == list.get(j)) {
                    letters[i] = shuffledList.get(j);
                    break;
                }
            }
        }
        System.out.println("Encrypted : ");
        for (char x : letters) {
            System.out.print(x);
        }
        System.out.println();
    }

    private void decrypt() {
        System.out.println("enter a massage to be dencrypted : ");
        String message = sc.nextLine();

        letters = message.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < shuffledList.size(); j++) {
                if (letters[i] == shuffledList.get(j)) {
                    letters[i] = list.get(j);
                    break;
                }
            }
        }
        System.out.println("Dencrypted : ");
        for (char x : letters) {
            System.out.print(x);
        }
        System.out.println();
    }

    private void quit () {
        System.out.println("Thank you for using");
        System.exit(0);
    }
}
