
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author elizabethbarrord, barrorem
 * CSE274 - Lab06
 * April 21, 2016
 * This is a class to manage all the profiles in the nwetwork.
 */
public class Manager {
	
	ArrayList<socialNetworkProfile> profiles;
	socialNetworkProfile marie;

	public Manager() {
		profiles = new ArrayList<socialNetworkProfile>();
	}

	/**
	 * @param newProfile a socialNetworkProfile 
	 */
	public void addProfile(socialNetworkProfile newProfile) {
		profiles.add(newProfile);
	}

	public void removeProfile(socialNetworkProfile profile) {
		for (int i = 0; i < profiles.size(); i++) {
			profiles.get(i).removeFriend(profile);
		}
		profiles.remove(profile);
	}
	/**
	 * @param friend1 current profile
	 * @param friend2 friend to be added
	 */
	public void makeFriends(socialNetworkProfile friend1, socialNetworkProfile friend2) {
		friend1.addFriend(friend2);
		friend2.addFriend(friend1);
	}

	public void display() {
		for (int i = 0; i < profiles.size(); i++) {
			socialNetworkProfile temp = profiles.get(i);
			temp.display2();
			System.out.println();
		}
	}
	public void marie(socialNetworkProfile profile){
		profile.toString();
		
	}
}