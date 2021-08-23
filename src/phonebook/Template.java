package phonebook;

public class Template {

	public static AddressBook colleagues() {

		AddressBook colleagues = new AddressBook();
		colleagues.setName("Colleagues");

		colleagues.addContact("Theresa", "Müller", "017624173951");
		colleagues.addContact("Moe", "Hamedani", "017629369289");
		colleagues.addContact("Lara", "Bradburg", "014482946297");
		colleagues.addContact("Samer", "Assi", "017738692688");
		return colleagues;
	}

	public static AddressBook family() {

		AddressBook family = new AddressBook();
		family.setName("Family");

		family.addContact("Novak", "Djokovic", "017674909441");
		family.addContact("Christopher", "Roberts", "014058397589");
		family.addContact("Yassmin", "Sahyoun", "014438940020");
		family.addContact("Mahdi", "Mohsen", "017492095892");

		return family;
	}

}