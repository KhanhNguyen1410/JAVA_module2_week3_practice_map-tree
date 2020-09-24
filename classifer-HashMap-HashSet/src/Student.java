public class Student {
    private String Name;
    private int Age;
    private String Address;

    public Student() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Student(String name, int age, String address) {
        Name = name;
        Age = age;
        Address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Address='" + Address + '\'' +
                '}';
    }
}
