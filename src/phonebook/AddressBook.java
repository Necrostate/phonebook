package phonebook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	// Adding a Person
	// Editing a Person
	// Deleting a person
	// Sorting by name/ Telephone
	// Printing a Person Info
	// Creating a new address book
	// Editing an old address book
	// Deleting an address book

	Scanner scan = new Scanner(System.in);

	ArrayList<String> names = new ArrayList<String>();
	ArrayList<String> numbers = new ArrayList<String>();
	private String name;

	public void addContact(Person person) {
		names.add(person.getFirstName() + " " + person.getLastName());
		numbers.add(person.getPhoneNumber());
	}

	public void addContact(String firstName, String lastName, String phoneNumber) {
		Person person = new Person();
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setPhoneNumber(phoneNumber);

		addContact(person);
	}

	public void addContact() {
		Person person = new Person();

		System.out.println("Please type a new first name: ");
		person.setFirstName(scan.next());
		System.out.println("Please type a new last name: ");
		person.setLastName(scan.next());
		System.out.println("Please type a new phone number: ");
		person.setPhoneNumber(scan.next());

		addContact(person);
	}

	public void deleteContact(Person person) {
		names.remove(person.getFirstName() + " " + person.getLastName());
		numbers.remove(person.getPhoneNumber());
	}

	// to be continuted

	public void editContact(AddressBook addressBook) {
		System.out.println("Which contact do you want to edit? Please choose a number.");
		for (int i = 1; i < addressBook.names.size() + 1; i++) {
			System.out.print(i + " - ");
			Print.addressBook(addressBook);
		}

	}

	public static AddressBook createAddressBook(String name) {
		AddressBook addressBook = new AddressBook();
		addressBook.setName(name);
		return addressBook;
	}

	public static void deleteAddressBook(AddressBook addressBook) {
		addressBook = null;
	}

	public static ArrayList<AddressBook> addressBooksList = new ArrayList<AddressBook>();

	public static ArrayList<AddressBook> allAddressBooks() {
		addressBooksList.add(Template.colleagues());
		addressBooksList.add(Template.family());
		return addressBooksList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
