import java.util.Scanner;

/**
 * @author elizabethbarrord, barrorem 
 * CSE274 - Lab06 
 * April 21, 2016 
 * This is a class that receives input from the user to create
 * a profile, add friends, and delete friends.
 */

public class userInteraction {
	
	public static void main(String[] args) {

		socialNetworkProfile newProfile = new socialNetworkProfile();
		Scanner in = new Scanner(System.in);

		Manager networkApplication = new Manager();
		System.out.println("Would you like to join the network? Type yes or no");
		String yesorno = in.nextLine();
		if (yesorno.equals("yes")) {
			System.out.println("To create a profile, type your first name ");
		} else {
			System.out.println("Okay");
			System.exit(0);
		}

		String first = in.nextLine();
		newProfile.setFirstName(first);
		System.out.println("Enter your last name");
		String last = in.nextLine();
		newProfile.setLastName(last);
		System.out.println("Enter status");
		String status1 = in.nextLine();
		newProfile.setStatus(status1);
		networkApplication.addProfile(newProfile);
		System.out.println("YOUR PROFILE:\n");
		networkApplication.display();

		socialNetworkProfile Marie = new socialNetworkProfile();
		Marie.setFirstName("Marie");
		Marie.setLastName("Smith");
		Marie.setStatus("Graduate Student");
		networkApplication.addProfile(Marie);

		System.out.println("\n\nThere are others in the network!!\n\n\n\nALL PROFILES:");
		networkApplication.display();

		System.out.println("\nWould you like to add Marie as a friend? yes or no");
		String add = in.nextLine();
		if (add.equals("yes")) {
			networkApplication.makeFriends(newProfile, Marie);
			System.out.println("\n\nFRIENDSHIPS\n");
			networkApplication.display();
		}else{
			System.out.println("Okay\n\nALL PROFILES");
			networkApplication.display();
			System.exit(0);
		}

		System.out.println("If you no longer want to be friends with Marie,\n"
				+ " you can remove her from your networking expereince.\n" + "Would you like to remove Marie?");
		String deleteresponse = in.nextLine();
		if (deleteresponse.equals("yes")) {
			networkApplication.removeProfile(Marie);
		} else {
			networkApplication.display();
		}
		System.out.println("\n\nYOUR UPDATED FRIENDSHIPS\n");
		networkApplication.display();
	}
}