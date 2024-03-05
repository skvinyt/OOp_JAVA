public class peasant extends pers {

    int strength;
    int agility;

    public peasant(int id, String name, int health, int stamina, String weapon, int strength, int agility) {
        super(id, name, health, stamina, weapon);
        this.strength = strength;
        this.agility = agility;
    }
    
    public void attack(pers target) {
        int damage = pers.r.nextInt(1, 5) * strength * agility;
        target.GetDamage(damage); 
    }

    public void work(int hour) {
        stamina -= hour / 4;
    }

}
