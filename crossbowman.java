public class crossbowman extends pers{
    int amountOfbowns;
    int accuarcy;
    
    public crossbowman(int id, String name, int health, int stamina, String weapon, int amountOfbowns, int accuarcy) {
        super(id, name, health, stamina, weapon);
        this.amountOfbowns = amountOfbowns;
        this.accuarcy = accuarcy;
    }

    
}
