import java.util.Scanner;

public class Contact {
	
	protected String firstName, lastName, email, phone;
	protected boolean friend, family, coworker;
	
	public Contact() {
		super();
	}

	public Contact(String firstName, String lastName, String email, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.friend = false;
		this.family = false;
		this.coworker = false;
	}
	
	public void display() {
		System.out.println(firstName + " " + lastName + " - " + email + " - " + phone + " - " + friend + 
				" - " + family + " - " + coworker);
	}
	public void adjustment() {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Adjust the group(s) of contact");
		System.out.print("Add to group(s) of contact or Remove from group(s) of contact (1 for add, 2 for remove): ");
		int chon = Integer.parseInt(sc.nextLine());
		
		if (chon == 1) {
			System.out.print("Which group (1-friend, 2-family, 3-coworker): ");
			int nhom = Integer.parseInt(sc.nextLine());
			switch (nhom) {
			case 1:
				if (!friend) {
					friend = true;
					System.out.println("Added to group Friend");
				}
				else {
					System.out.println("Contact already in Friend group!");
				}
				break;
			case 2:
				if (!family) {
					family = true;
					System.out.println("Added to group Family");
				}
				else {
					System.out.println("Contact already in Family group!");
				}
				break;
			case 3:
				if (!coworker) {
					coworker = true;
					System.out.println("Added to group Coworker");
				}
				else {
					System.out.println("Contact already in Coworker group!");
				}
				break;
			default: System.out.println("Error: Unknown contact type");
			}
		}
		
		else if (chon == 2) {
			System.out.print("Which group (1-friend, 2-family, 3-coworker): ");
			int nhom = Integer.parseInt(sc.nextLine());
			switch (nhom) {
			case 1:
				if (friend) {
					friend = false;
					System.out.println("Removed from Friend group");
				}
				else {
					System.out.println("Contact is not in Friend group!");
				}
				break;
			case 2:
				if (family) {
					family = false;
					System.out.println("Removed from Family group");
				}
				else {
					System.out.println("Contact is not in Family group!");
				}
				break;
			case 3:
				if (coworker) {
					coworker = false;
					System.out.println("Removed from Coworker group");
				}
				else {
					System.out.println("Contact is not in Coworker group!");
				}
				break;
			default: System.out.println("Error: Unknown contact type");
			}
		}
		else {
			System.out.println("Error: Unknown contact type");
		}

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isFriend() {
		return friend;
	}

	public void setFriend(boolean friend) {
		this.friend = friend;
	}

	public boolean isFamily() {
		return family;
	}

	public void setFamily(boolean family) {
		this.family = family;
	}

	public boolean isCoworker() {
		return coworker;
	}

	public void setCoworker(boolean coworker) {
		this.coworker = coworker;
	}
	
	

}