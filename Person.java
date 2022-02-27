public class Person {
    private String name;
    private String email;
    private String id;
    private String phoneNumber;

    // Added new constructor
    public Person(String name, String email, String id)
    {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public Person(String theName)
    {
        this.name = theName;
    }

    // methods - getters
    public String getName() { return this.name;}
    public String getEmail() { return this.email;}
    public String getId() { return this.id;}
    public String getPhoneNumber() { return this.phoneNumber;}

    // methods - setters
    public void setName(String theName) { this.name = theName;}
    public void setEmail(String theEmail) {this.email = theEmail;}
    public void setId(String theId) {this.id = theId;}
    public void setPhoneNumber(String thePhoneNumber) { this.phoneNumber = thePhoneNumber;}
    public String toString()
    {
        return this.name + " " + this.email + " " + this.id + " " + this.phoneNumber;
    }

    // main method for testing
    public static void main(String[] args)
    {
        Person p1 = new Person("Sana");
        System.out.println(p1);

        Person p2 = new Person("Jean");
        p2.setEmail("jean@gmail.com");
        p2.setPhoneNumber("404 899-9955");
        System.out.println(p2);

        Person p3 = new Person("jhon","abc@gmail.com","1001");
        System.out.println(p3);
    }
}
