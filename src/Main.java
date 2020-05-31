public class Main {

    public static void main(String[] args) {
        String phoneNumber = "86666666666";
        String str = phoneNumber.replaceAll("\\d{4}$", "****");
        String str2 = phoneNumber.replaceAll("\\d{2}\\-(\\d{2}$)", "**-**");
        if (phoneNumber.matches("\\d{11}")) {
            System.out.println(str);
        } else if (phoneNumber.matches("\\d-\\d\\d\\d-\\d\\d\\d-\\d\\d-\\d\\d")) {
            System.out.println(str2);
        } else if (phoneNumber.matches("\\+7\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d")) {
            System.out.println(str);
        }
    }
}