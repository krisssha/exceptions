public class Main {
    public static void main(String[] args) {
boolean success = Data.validate("login", "password", "password");
if (success){
    System.out.println("данные валидны");
} else {
    System.out.println("данные невалидны");
}
    }
}