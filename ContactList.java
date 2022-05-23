import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {
	
	protected ArrayList<Contact> list = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	
	public void add() {
		System.out.print("Firstname: ");
		String fn = sc.nextLine();
		System.out.print("Lastname: ");
		String ln = sc.nextLine();
		System.out.print("Email: ");
		String em = sc.nextLine();
		System.out.print("Phone number: ");
		String pn = sc.nextLine();
		list.add(new Contact(fn, ln, em, pn));
		System.out.println("Added contact successfully!");
	}

	public void display() {
		System.out.println("List of contacts");
		for (Contact contact : list) {
			contact.display();
		}
	}
	
	public void removeContact() {
		System.out.print("Delete by (1-name, 2-email, 3-phone): ");
		int delete = Integer.parseInt(sc.nextLine());
		int index = -1; //Find the position to delete
		if (delete == 1) {
			System.out.print("Input name: ");
			String name = sc.nextLine();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getFirstName().compareToIgnoreCase(name) == 0) {
					index = i;
					break;
				}
			}
		}
		else if (delete == 2) {
			System.out.print("Input email: ");
			String email = sc.nextLine();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getEmail().compareToIgnoreCase(email) == 0) {
					index = i;
					break;
				}
			}
		}
		else if (delete == 3) {
			System.out.print("Input phone Number: ");
			String phone = sc.nextLine();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getPhone().compareToIgnoreCase(phone) == 0) {
					index = i;
					break;
				}
			}
		}
		else {
			System.out.println("Error input");
		}
		if (index != -1) {
			list.remove(index);
			System.out.println("Delete contact successfully!");
		}
		else {
			System.out.println("Cannot delete contact");
		}
	}
	
	public void adjust() {
		System.out.println("Adjust group for contact");
		System.out.println("Choose the contact to adjus (input name of contact): ");
		String name = sc.nextLine();
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getFirstName().compareToIgnoreCase(name) == 0) {
				index = i;
				break;
			}
		}
		if (index == -2) {
			System.out.println("Contact is not in list");
		}
		else {
			list.get(index).adjustment();
		}
	}
	public static void main(String[] args) {
		ContactList contactList = new ContactList();
		contactList.add();
//		contactList.add();
//		contactList.add();
		contactList.display();
		contactList.removeContact();
		contactList.display();
		contactList.adjust();
		contactList.display();
	}

}
