
import java.util.ArrayList;
/**
 * @author elizabethbarrord
 * CSE274 - Lab06
 * April 21, 2016
 * This is a class to represent a social network profile for an individual.
 */
public class socialNetworkProfile {
	String firstName;
	String lastName;
	String status;
	ArrayList<socialNetworkProfile> friendsList;

	public socialNetworkProfile() {
		firstName = null;
		lastName = null;
		status = null;
		friendsList = new ArrayList<socialNetworkProfile>();

	}
	/**
	 * @param firstName string name of person
	 * @param lastName string name of person
	 * @param status string school status
	 * @param friendsList ArrayList<socialNetworkProfile> their current friends list
	 */
	public socialNetworkProfile(String firstName, String lastName, String status, ArrayList<socialNetworkProfile> friendsList) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.status = status;
		this.friendsList = friendsList;
	
	}
	/**
	 * @param newFriend socialNetworkProfile to be added as a friend
	 */
	public void addFriend(socialNetworkProfile newFriend) {
		if (!friendsList.contains(newFriend))
			friendsList.add(newFriend);
	}

	/**
	 * @param notFriend socialNetworkProfile to be removed from friendslist
	 */
	public void removeFriend(socialNetworkProfile notFriend) {
		friendsList.remove(notFriend);
	}

	public String toString() {
		ArrayList<socialNetworkProfile> friendNames = null;
		return "Name: " + getName() + "\nStatus: " + getStatus() + "\nFriends: " + friendsList.size() + "\n";
	}

	public void display2() {
		System.out.print(toString());
	}
	
	//GETTERS and SETTERS
	public void setFirstName(String name) {
		firstName = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String name) {
		lastName = name;
	}

	public String getLastName() {
		return firstName;
	}

	public String getName() {
		return firstName + " " +lastName;
	}

	public void setStatus(String status1) {
		status = status1;
	}

	public String getStatus() {
		return status;
	}

	public ArrayList<socialNetworkProfile> getFriends() {
		return friendsList;
	}

}
