public class EmployeeTest {

    int id;
    Address address;
    String name;

    public EmployeeTest(int id, Address address, String name) {
        this.id = id;
        this.address = address;
        this.name = name;
    }

    void showinfo() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.country);
    }


    public static void main(String[] args) {
        Address address1 = new Address("서울", "한국");
        Address address2 = new Address("도쿄", "일본");

        EmployeeTest e1 = new EmployeeTest(1, address1, "김건휘");
        EmployeeTest e2 = new EmployeeTest(2, address2, "김코딩");

        e1.showinfo();
        e2.showinfo();
    }

    static class Address {
        String city, country;

        public Address(String city, String country) {
            this.city = city;
            this.country = country;
        }
    }
}

