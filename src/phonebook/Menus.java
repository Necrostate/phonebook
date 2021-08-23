package phonebook;

import java.util.Scanner;

public class Menus {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void mainMenu() {
		
		Print.mainMenu();
	
		int i = scan.nextInt();
		
		if (i == 1) {
			Print.allAddressBooks(AddressBook.allAddressBooks());
		mainMenu();
		}
		
		if (i == 2) {
			System.out.println("Please enter a name for your address book:");
			String name = scan.next();
			AddressBook newAddressBook = AddressBook.createAddressBook(name);
			AddressBook.addressBooksList.add(newAddressBook);
			Print.allAddressBooks(AddressBook.addressBooksList);
			
			mainMenu();
		}
		
		if (i == 3) {
			System.out.println("Which address book do you want to edit?");
			Print.addressBooksTitles(AddressBook.allAddressBooks());
		}
	}
	
	public static void addressBookMenu(AddressBook addressBook) {
		Print.addressBookMenu();
		
		int i = scan.nextInt();
		
		if (i == 1) {
			Print.addressBook(addressBook);
			addressBookMenu(addressBook);
		}
		if (i == 2) {
			addressBook.addContact();
			addressBookMenu(addressBook);
		}
		
		// to be continued

	}

}
