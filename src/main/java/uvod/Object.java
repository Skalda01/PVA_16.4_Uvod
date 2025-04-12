package uvod;

public class Object {

    
    /*
    * Atribut označený jako private je přístupný a modifikovatelný pouze uvnitř samotné třídy, 
    * což chrání jeho hodnotu před přístupem z vnějších tříd.
    */
    private int x;
    private int y;
    private int width;
    private int height;

    /*
    * Atribut označený jako public je přístupný a modifikovatelný z jakéhokoli jiného kódu mimo tuto třídu.
    */
    public boolean isAlive;

   /*
    * Konstruktor je speciální metoda v objektově orientovaném programování, 
    * která se automaticky volá při vytvoření nového objektu třídy a slouží k inicializaci jeho vlastností (atributů).
    * Konstruktor má stejné jméno jako daná třída.
    */
    public Object(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.isAlive = true;
    }

    /*
    * Metoda je funkce, která provádí určité akce nebo výpočty s objektem.
    * Public metoda je přístupná z jakéhokoli jiného kódu mimo třídu.
    * Private metoda je přístupná pouze uvnitř samotné třídy.
    * 
    * void je návratový typ, který označuje, že metoda nevrací žádnou hodnotu.
    * int je návratový typ, který označuje, že metoda vrací celé číslo.
    * (Návratová hodnota může být např. int, boolean, String, Object atd.)
    */


    public void printObject() {
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Is Alive: " + isAlive);
    }

    
    public int printXplusY() {
        return x + y;
    }

    public int distanceToObject(Object obj) {
        
        double centerX1 = x + width / 2.0;
        double centerY1 = y + height / 2.0;
        
        double centerX2 = obj.getX() + obj.getWidth() / 2.0;
        double centerY2 = obj.getY() + obj.getHeight() / 2.0;
        
        double deltaX = centerX1 - centerX2;
        double deltaY = centerY1 - centerY2;  
        
        return (int) Math.round(Math.sqrt(deltaX * deltaX + deltaY * deltaY)); 
    }


    private void printWidthplusHeight() {
        System.out.println("Privatní metoda volána z konstruktoru");
    }


    // Metoda pro test 7 (bude odebrána).
    // Vytvořte novou metodu v třídě Object pro zjištění, zda jsou souřadnice x a y stejné (návratová hodnota: boolean).
    public boolean sameCoordinates(Object obj) {
        return x == obj.getX() && y == obj.getY();
    }


    

    /*
    * Getter a setter jsou metody, které slouží k získání a nastavení hodnot atributů objektu.
    * Getter vrací hodnotu atributu.
    * Setter nastavuje hodnotu atributu.
    */
    public int getX() {return x;}
    public void setX(int x) {this.x = x;}
    public int getY() {return y;}
    public void setY(int y) {this.y = y;}
    public int getWidth() {return width;}
    public void setWidth(int width) {this.width = width;}
    public int getHeight() {return height;}
    public void setHeight(int height) {this.height = height;}
    public boolean isAlive() {return isAlive;}
    public void setIsAlive(boolean isAlive) {this.isAlive = isAlive;}

}
