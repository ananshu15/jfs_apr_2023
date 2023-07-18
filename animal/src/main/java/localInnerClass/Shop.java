package localInnerClass;

public class Shop {
    public static void main(String[] args) {
        Door door = new Door();
        if (door.isLocked("qwerty")) {
            System.out.println("Shop is closed");
        } else {
            System.out.println("Welcome to the shop");
        }
    }
}
