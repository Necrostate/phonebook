package phonebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AddressBook {

	// Adding a Contact
	// Editing a Contact
	// Deleting a person
	// Sorting by name/ Telephone
	// Printing a Contact Info
	// Creating a new address book
	// Editing an old address book
	// Deleting an address book

	Scanner scan = new Scanner(System.in);

	private String name;
	ArrayList<String> names = new ArrayList<String>();
	ArrayList<String> numbers = new ArrayList<String>();

	public AddressBook(String name) {
		this.name = name;
	}
	
	public static ArrayList<AddressBook> addressBooksList = new ArrayList<>(Arrays.asList(Template.colleagues(), Template.family()));
	
	public static AddressBook createAddressBook(String name) {
		AddressBook addressBook = new AddressBook(name);
		return addressBook;
	}

	public static void deleteAddressBook(AddressBook addressBook) {
		addressBooksList.remove(addressBook);
	}
	
	public AddressBook findAddressBook(String name, ArrayList<AddressBook> addressBooksList) {
		for (AddressBook addressBook : addressBooksList)
			if (addressBook.getName() == name) 
				return addressBook;
		return null;
			// better use map
			
	}

	public void addContact(Contact contact, AddressBook addressBook) {
		names.add(contact.getFirstName() + " " + contact.getLastName());
		numbers.add(contact.getPhoneNumber());
	}

	public void addContact(String firstName, String lastName, String phoneNumber, AddressBook addressBook) {
		Contact contact = new Contact(firstName,lastName);
		contact.setPhoneNumber(phoneNumber);

		addContact(contact, addressBook);
	}

	public void addContact(AddressBook addressBook) {
		Contact contact = new Contact(null, null);

		System.out.println("Please type a new first name: ");
		contact.setFirstName(scan.next());
		System.out.println("Please type a new last name: ");
		contact.setLastName(scan.next());
		System.out.println("Please type a new phone number: ");
		contact.setPhoneNumber(scan.next());

		addContact(contact, addressBook);
	}

	public void deleteContact(AddressBook addressBook, Contact contact) {
		names.remove(contact.getFirstName() + " " + contact.getLastName());
		numbers.remove(contact.getPhoneNumber());
	}

	// to be continuted

	public void editContact(AddressBook addressBook) {
		System.out.println("Which contact do you want to edit? Please choose a number.");
		for (int i = 1; i < addressBook.names.size() + 1; i++) {
			System.out.print(i + " - ");
			Print.addressBook(addressBook);
			
			// to be fixed
		}

	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
