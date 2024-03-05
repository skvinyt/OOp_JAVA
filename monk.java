public class monk extends pers {
    int chakra;
    String faith;
    public monk(int id, String name, int health, int stamina, String weapon, int chakra, String faith) {
        super(id, name, health, stamina, weapon);
        this.chakra = chakra;
        this.faith = faith;
    }
    
}
