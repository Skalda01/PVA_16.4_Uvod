package uvod;

public class Npc extends Object {

    private String name;
    private int health;
    private int damage;
    private boolean isAnimated;

    
    /*
    * Konstruktor třídy Npc, který volá konstruktor třídy Objekt a předává mu parametry.
    * super() slouží k volání konstruktoru nadřazené třídy.
    * 
    * Díky dědičnosti třída Npc využívá všechny atributy a metody třídy Objekt (x, y, width, height, isAlive).
    */

    public Npc(int x, int y, int width, int height, String name, int health, int damage, boolean isAnimated) {
        super(x, y, width, height);
        this.name = name;
        this.health = health;       
        this.damage = damage;
        this.isAnimated = isAnimated;
    }  

    /*
    * Zde implementujeme metody pro NPC.
    * Můžeme volat metody a atributy z nadřazené třídy Object.
    */


    /*
    * Překrýváme metodu printObject z nadřazené třídy Object.
    * Tímto způsobem se zobrazí všechny atributy třídy Npc.
    */
    @Override
    public void printObject() {
        super.printObject();
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Damage: " + damage);
        System.out.println("Is Animated: " + isAnimated);
    }

    

    /* 
    * Přetížení metod (method overloading) v Javě znamená, že v jedné třídě můžete mít více metod se stejným názvem,
    * ale s různými parametry. Tyto metody se liší počtem, typem nebo pořadím parametrů, nikoliv návratovým typem. 
    * Při volání přetížené metody Java automaticky vybere správnou metodu podle argumentů, které jsou předány při volání. 
    * Přetížení metod zlepšuje čitelnost kódu a umožňuje mít více variant funkcí, které vykonávají podobné úkoly s různými vstupy.
    */
    public void printCoordinates() {
        /*
         * Vytiskne souřadnice objektu.
         */
        System.out.println("X: " + getX());
        System.out.println("Y: " + getY());
    }   

    public void printCoordinates(Object obj) {
        /*
         * Vytiskne souřadnice objektu.
         */
        System.out.println("X: " + getX());
        System.out.println("Y: " + getY());

        /*
        * Vytiskne souřadnice objektu, který je parametrem.
        */
        System.out.println("X: " + obj.getX());
        System.out.println("Y: " + obj.getY());
 
    }   

   

    /*
     * Getter a setter pro atributy třídy Npc
     */
    public String getName(){return name;}       
    public void setName(String name){this.name = name;}
    public int getHealth(){return health;}
    public void setHealth(int health){this.health = health;}
    public int getDamage(){return damage;}
    public void setDamage(int damage){this.damage = damage;}
    public boolean isAnimated(){return isAnimated;}
    public void setAnimated(boolean isAnimated){this.isAnimated = isAnimated;}
}
