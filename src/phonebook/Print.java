package phonebook;

import java.util.ArrayList;

public class Print {

	public static void addressBook(AddressBook addressBook) {

		for (int i = 0, j = 0; i < addressBook.names.size() && j < addressBook.numbers.size(); i++, j++) {
			System.out.println(addressBook.names.get(i) + ": " + addressBook.numbers.get(j));
		}
	}

	public static void contact(Contact contact) {
		System.out.println(contact.getFirstName() + " " + contact.getLastName() + ":" + contact.getPhoneNumber());
	}

	public static void allAddressBooks(ArrayList<AddressBook> allAddressBooks) {
		for (AddressBook addressBook : allAddressBooks) {

			System.out.println(addressBook.getName() + ":\n");
			Print.addressBook(addressBook);
			System.out.println("------------------------------");

		}

	}

	public static void addressBooksTitles(ArrayList<AddressBook> allAddressBooks) {
		for (AddressBook addressBook : allAddressBooks) {

			System.out.println(addressBook.getName() + ":\n");

		}
	}

	public static void mainMenu() {
		System.out.println("------------------------------");
		System.out.println("Please choose a number:");
		System.out.println("1 - View address books");
		System.out.println("2 - Create a new address book");
		System.out.println("3 - Edit an existing address book");
		System.out.println("4 - Delete an address book");
		System.out.println("------------------------------");
	}

	public static void addressBookMenu() {
		System.out.println("------------------------------");
		System.out.println("Please choose a number:");
		System.out.println("1 - View all contacts");
		System.out.println("2 - Add a contact");
		System.out.println("3 - Delete a contact");
		System.out.println("------------------------------");
	}

}
