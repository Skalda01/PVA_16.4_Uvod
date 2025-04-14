# Dědičnost v objektově orientovaném programování

Dědičnost je jedním ze základních principů objektově orientovaného programování a v Javě umožňuje jedné třídě převzít vlastnosti a metody jiné třídy. Tímto způsobem se dosahuje zjednodušení a zpřehlednění kódu. Říkáme tomu, že jedna třída dědí z jiné.

## Příklad

Představme si například, že máme třídu Zvíře, která má atributy jako jméno a věk, a metodu mluv(). Na základě této třídy můžeme vytvořit novou třídu Pes, která rozšiřuje třídu Zvíře pomocí klíčového slova extends. Třída Pes tak automaticky zdědí všechny vlastnosti a metody třídy Zvíře, ale může si přidat i vlastní, například metodu štěkej() nebo přepsat metodu mluv(), aby místo obecných "nějaký zvuk" vypisovala specifické "Haf!".

Tento přístup šetří čas, protože není nutné opakovaně psát stejný kód, což zároveň minimalizuje riziko vzniku chyb.

Dědičnost nám umožňuje vytvářet obecné třídy, jako je Zvíře, a z nich odvozovat konkrétnější třídy, například Pes, Kočka nebo Papoušek. Tento princip se široce využívá ve všech typech software, od her až po obchodní aplikace.

Třída, která dědí z jiné, se nazývá podtřída (angl. *subclass*), zatímco třída, ze které podtřída dědí, je nadřazená třída (angl. *superclass*).

## Třída

Třída je v podstatě šablona nebo plán, podle kterého se vytvářejí objekty. Můžeme ji přirovnat k návrhu domu – určuje, jaké vlastnosti budou mít jednotlivé místnosti, jak dům bude vypadat, ale dům samotný to není. V programování třída popisuje, jaké vlastnosti (atributy) a chování (metody) bude mít objekt. Například třída Auto může obsahovat atributy jako barva a rychlost, a metody jako jed() nebo zastav().

## Atribut

Atribut je proměnná, která popisuje vlastnosti objektu. Pokud máme třídu Auto, atributy by mohly zahrnovat například barvu, rychlost nebo značku. Každý objekt (například konkrétní auto) má své vlastní hodnoty těchto atributů. Atributy se definují uvnitř třídy a obvykle mají specifikovaný datový typ, například String pro text nebo int pro celé číslo.

### Private

Private atributy jsou přístupné pouze uvnitř samotné třídy. To znamená, že nelze je přímo měnit nebo číst z jiných tříd, což zajišťuje enkapsulaci a ochranu dat. Pro přístup k těmto atributům se často používají veřejné metody (tzv. getter a setter), které umožňují bezpečný přístup nebo úpravu hodnoty atributu.

### Public

Public atributy jsou přístupné přímo z jakékoliv jiné třídy. To znamená, že lze s těmito atributy pracovat bez omezení, což může být vhodné pro jednoduché třídy nebo v případech, kdy nechceme omezovat přístup k těmto datům. Nicméně, častěji se doporučuje používat **private** atributy pro lepší kontrolu a modularitu kódu.

## Metoda
Metoda je blok kódu, který vykonává určitou činnost a určuje, co objekt umí dělat. Například třída Auto může mít metodu jed(), která způsobí, že auto pojede dopředu. Metody mohou přijímat vstupy (parametry), například rychlost nebo směr jízdy, a mohou také něco vracet, například výsledek výpočtu. V Javě se metody píší uvnitř třídy a volají se prostřednictvím objektů, které tuto třídu instancují.

### Void metody
Pokud metoda nevrací žádnou hodnotu, používá se klíčové slovo void. To znamená, že metoda provádí nějakou činnost, ale nevrací žádný výsledek zpět. Například metoda jed() v třídě Auto může být typu void, protože jejím úkolem je pouze vykonat akci (například pohyb auta), ale nevrací žádnou hodnotu.
```java
public void jed() {
    System.out.println("Auto jede dopředu.");
}
```
 ### Metody s návratovým typem (např. int)
Pokud metoda má vracet nějaký výsledek, musí být uveden návratový typ, který určuje, jaký typ hodnoty metoda vrátí. Například metoda, která vypočítá součet dvou čísel a vrátí výsledek jako celé číslo, bude mít návratový typ int.
```java
public int soucet(int a, int b) {
    return a + b;
}
```
V tomto případě metoda soucet() vrací hodnotu typu int, což znamená, že musí obsahovat příkaz return, který vrátí hodnotu.

Tato struktura je klíčová pro efektivní využívání objektově orientovaného programování a pro zajištění přehlednosti a údržby kódu.

## Příklad

### Třída Entita
Třída Entita reprezentuje základní objekt s prostorovými vlastnostmi, jako je pozice a rozměry. Obsahuje atributy x, y, width, height a boolean isAlive, který určuje, zda je entita naživu. Třída má metodu printEntita(), která vypisuje informace o entitě, a metodu distanceToEntita(), která počítá vzdálenost mezi dvěma entitami na základě jejich středu. Metoda printXplusY() vrací součet hodnot x a y a poskytuje jednoduchou aritmetickou funkci pro entitu.

```java
public class Entita {

    private int x;
    private int y;
    private int width;
    private int height;
    public boolean isAlive;

    public Entita(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.isAlive = true;
    }

    public void printEntita() {
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Is Alive: " + isAlive);
    }

    public int printXplusY() {
        return x + y;
    }

    public int distanceToEntita(Entita obj) {
        
        double centerX1 = x + width / 2.0;
        double centerY1 = y + height / 2.0;
        
        double centerX2 = obj.getX() + obj.getWidth() / 2.0;
        double centerY2 = obj.getY() + obj.getHeight() / 2.0;
        
        double deltaX = centerX1 - centerX2;
        double deltaY = centerY1 - centerY2;  
        
        return (int) Math.round(Math.sqrt(deltaX * deltaX + deltaY * deltaY)); 
    }
}
```

### Třída Npc
Třída Npc dědí od třídy Entita a přidává specifické vlastnosti pro postavy v hře, jako je jméno, zdraví, poškození a animace. Kromě základních metod třídy Entita, jako je printEntita(), má třída Npc metodu pro tisk souřadnic postavy (printCoordinates()) a metodu, která vypisuje souřadnice jak NPC, tak jiných entit (printCoordinates(Entita obj)). Konstruktor třídy Npc přijímá specifické parametry jako jméno, zdraví a poškození, které jsou inicializovány při vytváření objektu. Tato třída umožňuje rozšíření chování třídy Entita přidáním specifických metod pro NPC postavy.

```java
public class Npc extends Entita {

    private String name;
    private int health;
    private int damage;
    private boolean isAnimated;


    public Npc(int x, int y, int width, int height, String name, int health, int damage, boolean isAnimated) {
        super(x, y, width, height);
        this.name = name;
        this.health = health;       
        this.damage = damage;
        this.isAnimated = isAnimated;
    }  

    @Override
    public void printEntita() {
        super.printEntita();
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Damage: " + damage);
        System.out.println("Is Animated: " + isAnimated);
    }

    public void printCoordinates() {
        System.out.println("X: " + getX());
        System.out.println("Y: " + getY());
    }   

    public void printCoordinates(Entita obj) {
        System.out.println("X: " + getX());
        System.out.println("Y: " + getY());

        System.out.println("X: " + obj.getX());
        System.out.println("Y: " + obj.getY());
    }   
}
```


## Override (přepsání metody)
V objektově orientovaném programování (OOP) znamená přepsání metody (angl. method overriding) situaci, kdy podtřída (subclass) poskytne svou vlastní implementaci metody, která byla již definována v nadřazené třídě (superclass). Tato nová implementace metody v podtřídě má stejný název, návratový typ i parametry jako původní metoda ve třídě nadřazené. Přepsání metody umožňuje podtřídě upravit nebo zcela změnit chování metody, která byla zděděna. V Javě je pro přepsání metody použito klíčové slovo @Override, které slouží jako indikátor, že metoda je přepsaná, a také jako kontrola kompilátorem, zda správně odpovídá metodě v nadřazené třídě.
```java

    @Override
    public void printEntita() {
        super.printEntita();
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Damage: " + damage);
        System.out.println("Is Animated: " + isAnimated);
    }
```

## Přetěžování metod
Přetěžování metod (angl. method overloading) je proces, kdy ve stejné třídě definujeme více metod se stejným názvem, ale s různými parametry (např. jiný počet nebo typ parametrů). Přetěžování neovlivňuje metody ve třídách nadřazených, jde o různé implementace téhož názvu metody v jedné třídě, které se odlišují svým podpisem (tedy typem a počtem parametrů). Pomocí přetěžování můžeme definovat metody, které vykonávají podobné činnosti, ale pro různé typy vstupních dat. Například metoda sčítat() může být přetížena pro sčítání dvou celých čísel, dvou desetinných čísel nebo i pro sčítání dvou řetězců.

Tento mechanismus umožňuje flexibilitu a čitelnost kódu, protože umožňuje použít stejný název metody pro různé scénáře, přičemž každý z nich vyžaduje jiné vstupy.
```java
    public void printCoordinates() {
        System.out.println("X: " + getX());
        System.out.println("Y: " + getY());
    }

    public void printCoordinates(Entita obj) {
        System.out.println("X: " + getX());
        System.out.println("Y: " + getY());

        System.out.println("X: " + obj.getX());
        System.out.println("Y: " + obj.getY());
    } 
  
```
## Statické metody
Statické metody jsou metody, které patří k samotné třídě, nikoli k instanci objektu třídy. To znamená, že je lze volat bez vytváření objektu této třídy. Statické metody se definují pomocí klíčového slova static a mohou přistupovat pouze k statickým atributům třídy, nikoli k atributům instancí (neboť nemají přístup k konkrétním objektům). Jsou užitečné, když je třeba vykonat operace, které nezávisí na konkrétním stavu objektu, například pomocí pomocných funkcí nebo když je funkce společná pro všechny instance třídy. Příkladem může být metoda pro výpočet matematické konstanty nebo pomocná metoda pro zpracování dat.
```java
public class Matematika {
    public static int soucet(int a, int b) {
        return a + b;
    }
}

int vysledek = Matematika.soucet(5, 3);
```



