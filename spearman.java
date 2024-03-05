public class spearman extends pers{
    int strength;
    int protection;
    
    public spearman(int id, String name, int health, int stamina, String weapon, int strength, int protection) {
        super(id, name, health, stamina, weapon);
        this.strength = strength;
        this.protection = protection;
    }

    
}
