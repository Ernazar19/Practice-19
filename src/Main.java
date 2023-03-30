public class Main {
    public static void main(String[] args) {

        Archer archer = new Archer("Artur ", 450, 550, 69);
        Warrior warrior = new Warrior("Genry", 500, 432, 50);
        Character[] characters1 = {archer, warrior};
        for (Character a : characters1) {
            if (a.equals(archer)) {
                archer.setWeapon(new Weapon(WeaponType.AXE));
                System.out.println(archer + " weapon " + archer.getWeapon().getWeaponType());
            } else if (a.equals(warrior)) {
                warrior.setWeapon(new Weapon(WeaponType.SWORD));
                warrior.setWeapon(new Weapon(WeaponType.BOW));
                // System.out.println(warrior+" weapon "+warrior.getWeapon().getWeaponType());
            }
        }
    }
}