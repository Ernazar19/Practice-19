public class Archer extends Character {
    private Weapon weapon;

    public Archer(String name, int speed, int power, int dexterity) {
        super(name, speed, power, dexterity);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Archer "+getName()+", "+
                "speed " + getSpeed() +", "+
                "power " + getPower() +", "+
                "dexterity " + getDexterity();
    }
}