package pack3;

class Address {
    private String street;

    public Address(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }
}

public class Ex10__Person {
	public String name;
	public int age;
	public Address address;
	
	public Ex10__Person(String name, int age) {
		this.name=name;
		this.age=age;
		this.address=new Address("역삼동 123");
	}
	public String display() {
		return "Name: " + name + " Age: "+ age + " Address: " +address.getStreet();

	}
	
	
}
