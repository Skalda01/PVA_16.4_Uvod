package test;

import uvod.Entita;
import uvod.Npc;
import uvod.Enemy;
import uvod.Player;

import java.util.ArrayList;
import java.util.Comparator;

public class TestClass {

    private Entita entita1, entita2;
    private Npc npc;
    private Player player;
    private ArrayList<Enemy> enemy_List;


    /*
    * Konstruktor třídy TestClass.
    * Vytváří entita1, entita2, NPC, Player, ArrayList a Enemy.
    */
    public TestClass() {
        // Vytvoření entit
        entita1 = new Entita(5, 10, 15, 20);
        entita2 = new Entita(20, 20, 20, 20);

        // Vytvoření NPC
        npc = new Npc(30, 30, 30, 30, "John", 100, 10, true);

        // Vytvoření Player
        player = new Player(100, 100, 40, 40, "Player", 100, 10, true);

        // Vytvoření ArrayListu NPC
        enemy_List = new ArrayList<>();

        // Vytvoření Enemy
        enemy_List.add(new Enemy(50, 50, 50, 50, "Enemy_A", 100, 10, true));
        enemy_List.add(new Enemy(100, 100, 50, 50, "Enemy_B", 100, 10, true));
        enemy_List.add(new Enemy(150, 150, 50, 50, "Enemy_C", 100, 10, true));
        enemy_List.add(new Enemy(200, 200, 50, 50, "Enemy_D", 100, 10, true));
        enemy_List.add(new Enemy(250, 250, 50, 50, "Enemy_E", 100, 10, true));
    }




    /*
    * Zde jsou testovací metody, které implementujete.
    *
    * 1) Neměňte návratovou hodnotu metody.
    * 2) Neměňte název metody.
    * 3) Neupravujte žádné hodnoty v public testClass().
    * 4) Všechny potřebné věci jsou v public testClass().
    */


    // Test 1
    // Testovací metoda pro výpočet vzdálenosti mezi entitami.
    // Vrátí vzdálenost mezi entitou 1 a entitou 2.
    public int TestDistanceToObject() {
        return 0;
    }


    // Test 2
    // Testovací metoda pro ověření isAlive u entity 1.
    // Nastaví isAlive na false pro entitu 1.
    // Vrátí hodnotu isAlive pro entitu 1.
    public boolean TestIsAlive() {
        return true;
    }


    // Test 3
    // Testovací metoda pro ověření velikosti enemy_List.
    // Vrátí velikost enemy_List.
    public int TestEnemyListSize() {
        return 0;
    }


    // Test 4
    // Testovací metoda pro získání elementu z enemy_List na indexu 2, poté změníme isAlive na false.
    // Vrátí hodnotu isAlive pro element z enemy_List na indexu 2.
    public boolean TestEnemyListElement() {
        return true;
    }


    // Test 5
    // Testovací metoda pro přidání enemy do enemy_List s názvem Enemy_F.
    // Vrátí přidaného enemy.
    public Enemy TestAddEnemy() {
        return null;
    }


    // Test 6
    // Testovací metoda pro vymazání enemy z enemy_List s názvem Enemy_C (nepoužívejte index, použijte jméno jako parametr k odstranění).
    // Vrátí odstraněného enemy.
    public Enemy TestRemoveEnemy() {
        return null;
    }


    // Test 7
    // Testovací metoda pro zjištění, zda player a nějaký enemy mají stejné souřadnice x, y.
    // Vytvořte novou metodu v třídě Entita pro zjištění, zda jsou souřadnice stejné (návratová hodnota: boolean).
    // Vrátí enemy, který má stejné souřadnice x, y.
    public Enemy TestSameCoordinates() {
        return null;
    }


    // Test 8
    // Testovací metoda pro odstranění enemy z enemy_List, pokud dojde k kolizi mezi playerem a enemy na souřadnicích x, y.
    // Vrátí enemy_list po odstranění enemy.
    public ArrayList<Enemy> TestRemoveEnemyCollision() {
        return null;
    }


    // Test 9
    // Testovací metoda vloží všechny potomky třídy Entita do ArrayList<>.
    // Vrátí ArrayList<> (ArrayList založte v testovací metodě).
    public ArrayList<Entita> TestReturnArrayListObject() {
        return null;
    }



    // Pokročile operace nad ArrayList 

    public static void main(String[] args) {
        ArrayList<Enemy> enemy_List = new ArrayList<>();
        Player player = new Player(100, 100, 40, 40, "Player", 100, 10, true);

        for (int i = 0; i < 10; i++) {
            enemy_List.add(new Enemy(i*50, i*50, 50, 50, "Enemy_" + i, 100, 10, true));
        }


        // Odebraní pomocí removeIf 
        enemy_List.removeIf(enemy -> enemy.getX() > 300);

     
        
        // Využití foreach pro výpis názvů enemy
        enemy_List.forEach(enemy -> System.out.println(enemy.getName()));

        // Využití foreach pro výpis vzdálenosti enemy od hráče
        enemy_List.forEach(enemy -> System.out.println(enemy.distanceToEntita(player)));

        // Využití foreach pro výpis názvů enemy, které mají stejné souřadnice jako hráč
        enemy_List.forEach(enemy -> {
            if (player.sameCoordinates(enemy)) {
                System.out.println(enemy.getName());
            }
        });

        // Seřazení enemy podle vzdálenosti od hráče
        enemy_List.sort(Comparator.comparing(enemy -> enemy.distanceToEntita(player)));

    }

   


    public Entita getEntita1() { return entita1; }
    public Entita getEntita2() { return entita2; }
    public void setEntita1(Entita entita1) { this.entita1 = entita1; }
    public void setEntita2(Entita entita2) { this.entita2 = entita2; }
    public Npc getNpc() { return npc; }
    public Player getPlayer() { return player; }
    public ArrayList<Enemy> getEnemyList() { return enemy_List; }
    public void setNpc(Npc npc) { this.npc = npc; }
    public void setPlayer(Player player) { this.player = player; }

}
