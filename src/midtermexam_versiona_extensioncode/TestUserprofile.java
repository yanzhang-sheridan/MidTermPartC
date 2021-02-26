

package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *Create a class called TestUserprofile with main method 
 * where a user wants to create a new profile. 
 * The user will enter their name and 
 * choose their favourite Genre from a displayed list of 
 * the possible Genres. 
 * The user will then see a message that their userProfile
 * was created. 
 *
 * @author Yan Zhang
 */
public class TestUserprofile {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};

        System.out.println("Available genres:");

        for (String g : genres) {
            System.out.println(g);
        }
        
        System.out.println();
        System.out.println(" please pick your genres form the above list");
        String genre = in.nextLine();

        System.out.println();
        System.out.println("please enter your name:");

        UserProfile user = new UserProfile(in.nextLine(), genre);

        System.out.println("your user profile is successfully created");

    }
;
        
      

}
