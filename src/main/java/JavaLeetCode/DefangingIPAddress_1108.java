package JavaLeetCode;

public class DefangingIPAddress_1108 {
    public static void main(String[] args) {
        String address="1.1.1.1";
        System.out.println(defangIPaddr(address));

    }
    public static String defangIPaddr(String address) {
        address = address.replace(".", "[.]");
        return address;
    }
}
