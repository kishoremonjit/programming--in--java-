

class Customer {
    private int custId;
    private String name;
    private String address;
    private String phoneNo;


    public Customer(int custId, String name, String address, String phoneNo) {
        this.custId = custId;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }


    public int getCustId() {
        return custId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    // Setters
    public void setCustId(int custId) {
        this.custId = custId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Customer ID: " + custId +
                ", Name: " + name +
                ", Address: " + address +
                ", Phone No: " + phoneNo;
    }
}
class Main {
    public static void main(String[] args) {
        Customer[] customers = new Customer[5];
        customers[0] = new Customer(1, "Ravi Sharma", "Guwahati", "9876543210");
        customers[1] = new Customer(2, "Anita Das", "Jorhat", "9876501234");
        customers[2] = new Customer(3, "Mohan Nath", "Dibrugarh", "7890123456");
        customers[3] = new Customer(4, "Sita Devi", "Tezpur", "9012345678");
        customers[4] = new Customer(5, "Rahul Roy", "Silchar", "8765432109");

        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}
