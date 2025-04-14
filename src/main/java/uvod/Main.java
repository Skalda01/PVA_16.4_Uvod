package uvod;

public class Main {

    public static void main(String[] args) {
        /*
        * Vytvoření objektu:
        * [Název třídy] [názevProměnné] = new [Název třídy]([parametry]);
        */
        Entita entita1 = new Entita(5, 10, 15, 20);
        Entita entita2 = new Entita(20, 20, 20, 20);
        Npc npc = new Npc(30, 30, 30, 30, "John", 100, 10, true);


        /*
        * Výpis vzdálenosti mezi objektem a objektem2.
        * Díky dědičnosti může metodu distanceToX použít i objekt npc (i v případě, že metoda není definovaná ve třídě Npc).
        */
        System.out.println(entita1.distanceToEntita(npc));   
        System.out.println(npc.distanceToEntita(entita1));


        resetPosition(entita1);
        System.out.println(isAlive(npc));

        entita1.printEntita();
        npc.printEntita();

    }


   /*
    * Statická metoda ve třídě je metoda, která patří samotné třídě,
    * nikoli instancím této třídy. To znamená, že ji lze volat bez vytvoření objektu třídy.
    * Statická metoda má přístup pouze ke statickým členům třídy, tedy k proměnným a dalším metodám označeným jako statické.
    * Tento typ metody je užitečný pro operace, které nevyžadují instanci třídy a mohou být sdíleny mezi všemi objekty této třídy.
    */


    public static void resetPosition(Entita objekt) {
        objekt.setX(0);
        objekt.setY(0);
        System.out.println("Entita byla resetována na souřadnice: " + objekt.getX() + ", " + objekt.getY());
    }

    public static boolean isAlive(Entita objekt) {
        return objekt.isAlive();
    }   

  
}