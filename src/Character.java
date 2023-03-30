import java.util.Arrays;

public class Character {
    private String Name;
    private int speed;
    private int power;
    private int dexterity;
    private Weapon weapon;

    public Character(String name, int speed, int power, int dexterity) {
        Name = name;
        this.speed = speed;
        this.power = power;
        this.dexterity = dexterity;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }



    void  attack(){
        System.out.println();
    }void characterAttack(){
        System.out.println(getName()+"the attacks...");
    }

    @Override
    public String toString() {
        return "Character{" +
                "Name='" + Name + '\'' +
                ", speed=" + speed +
                ", power=" + power +
                ", dexterity=" + dexterity +
                ", weapon="+weapon+
                '}';
    }
}
