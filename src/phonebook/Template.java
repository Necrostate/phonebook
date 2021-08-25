package phonebook;

public class Template {

	public static AddressBook colleagues() {

		AddressBook colleagues = new AddressBook("Colleagues");

		colleagues.addContact("Theresa", "Müller", "017624173951", null);
		colleagues.addContact("Moe", "Hamedani", "017629369289", null);
		colleagues.addContact("Lara", "Bradburg", "014482946297", null);
		colleagues.addContact("Samer", "Assi", "017738692688", null);
		return colleagues;
	}

	public static AddressBook family() {

		AddressBook family = new AddressBook("Family");

		family.addContact("Novak", "Djokovic", "017674909441", null);
		family.addContact("Christopher", "Roberts", "014058397589", null);
		family.addContact("Yassmin", "Sahyoun", "014438940020", null);
		family.addContact("Mahdi", "Mohsen", "017492095892", null);

		return family;
	}

}