package deep.cloning.example;

public class CloningExample {
	public static void main(String[] args) throws CloneNotSupportedException {

		City city = new City("Dehradun");
		Country country = new Country("India");

		Person person1 = new Person("Naresh", 10000, city, country);
		System.out.println(person1);

		Person person2 = person1.clone();
		System.out.println(person2);

		if (person1 == person2) {
			System.out.println("Both person1 and person2 holds same object");
		}

		if (person1.equals(person2)) {
			System.out.println("But both person1 and person2 are equal and have same content");
		}

		if (person1.getCity() == person2.getCity()) {
			System.out.println("Both person1 and person2 have same city object");
		}

		if (person1.getCountry() == person2.getCountry()) {
			System.out.println("Both person1 and person2 have same country object");
		}

		city.setName("Pune");
		country.setName("IN");
		System.out.println(person1);
		System.out.println(person2);

	}
}
