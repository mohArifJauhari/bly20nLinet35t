package test1;

public class Person {

	private String name, comment;
    private int age;

    public Person(String n, int a, String c) {
        name = n;
        age = a;
        comment = c;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Person))
            return false;
        Person p = (Person) o;
        return age == p.age && name.equals(p.name);
    }
    
    @Override
    public int hashCode() {
    	// TODO Auto-generated method stub
    	return name.hashCode() + age*7;
    }
}
