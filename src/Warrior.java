public class Warrior extends Character{
    private Weapon weapon;
    public Warrior(String name, int speed, int power, int dexterity) {
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
        return "Warrior name "+getName()+", "+
                "speed " + getSpeed() +", "+
                "power " + getPower() +", "+
                "dexterity " + getDexterity() ;
    }
}
