import java.util.Scanner;
public class ImitationGame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Cipher user = new Cipher();
        
        System.out.println("Hello. This encryptor takes lowercase, uppercase, and numbers only.");
        System.out.println("Please refrain from using special characters or spaces.");
        System.out.println("What do you want to encrypt?");
        
        String toCode = sc.nextLine(); // scans user input
        
        System.out.println(user.encode(toCode)); // prints encoded string
        
        System.out.println("Do you want to decrypt? (enter 1 for yes and 2 for no)");
        
        int dcrpt = sc.nextInt();
    
        if (dcrpt == 1)
        {
            System.out.println(user.decode(user.encode(toCode)));
        }else if (dcrpt == 2){
            System.out.println("End of program.");
            System.exit(0);
        }else{
            System.out.println("That is not a valid input. End of program.");
            System.exit(0);
        }
    }
}
