import java.util.Random;

abstract class pers {
    protected int id;
    protected String name;
    protected int health;
    protected int stamina;
    protected String weapon;
    protected static Random r;

    static {
        pers.r = new Random();
    }
    
    public pers(int id, String name, int health, int stamina, String weapon) {
        this.id = id;
        this.name = name;
        this.health = health;
        this.stamina = stamina;
        this.weapon = weapon;
    }

    protected void Print() {
        System.out.println("ID: " + id + " Name: " + name + " Health: " + health + " Weapon: " + weapon + " Stamina: " + stamina);
    }
    
    protected void GetDamage(int damage) {
        if (this.health - damage > 0) {
            this.health -= damage;
        }
    }

    protected void attack(pers target) {
        int damage = pers.r.nextInt(1, 5);
        target.GetDamage(damage); 
    }

    protected void death(pers target) {
        if (target.getHealth() < 0) {
            System.out.println("Ваш персонаж мёртв");
        }
    }

    public int getHealth() {
        return health;
    }

    

    
}
