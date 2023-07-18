package innerClasses;

public class Shop {
    public static void main(String[] args) {
        Door door = new Door();
        System.out.println(door);
        door.shopStatus();
        door.getLock().setLock(false);
        door.shopStatus();
    }
}
