package com.company;

//public class Main{
//
//    public static void main(String[] args) {
//
//        Printable printable = createPrintable("Foreign Affairs",false);
//        printable.print();
//
//        read(new Book("Java for impatients", "Cay Horstmann"));
//        read(new Journal("Java Dayly News"));
//    }
//
//    static void read(Printable p){
//
//        p.print();
//    }
//
//    static Printable createPrintable(String name, boolean option){
//
//        if(option)
//            return new Book(name, "Undefined");
//        else
//            return new Journal(name);
//    }
//}
//interface Printable{
//
//    void print();
//}
//class Book implements Printable{
//
//    String name;
//    String author;
//
//    Book(String name, String author){
//
//        this.name = name;
//        this.author = author;
//    }
//
//    public void print() {
//
//        System.out.printf("%s (%s) \n", name, author);
//    }
//}
//class Journal implements Printable {
//
//    private String name;
//
//    String getName(){
//        return name;
//    }
//
//    Journal(String name){
//
//        this.name = name;
//    }
//    public void print() {
//        System.out.println(name);
//    }
//}




//public class Main {
//
//    public static void main(String[] args) {
//
//        Button button = new Button(new ButtonClickHandler());
//        button.click();
//        button.click();
//        button.click();
//    }
//}
//
//class ButtonClickHandler implements EventHandler{
//
//    public void execute(){
//
//        System.out.println("Кнопка нажата!");
//    }
//}
//
//interface EventHandler{
//
//    void execute();
//}
//
//class Button{
//
//    EventHandler handler;
//    Button(EventHandler action){
//
//        this.handler=action;
//    }
//    public void click(){
//
//        handler.execute();
//    }
//}


//public class Main{
//
//    public static void main(String[] args) {
//
//        TVPipe pipe = new TVPipe();
//        pipe.printState(0);
//        pipe.printState(2);
//        pipe.printState(1);
//    }
//}
//class TVPipe implements Stateable{
//
//    public void printState(int n){
//        if(n==OPEN)
//            System.out.println("Телевизор выключен");
//        else if(n==CLOSED)
//            System.out.println("Телевизор включен");
//        else
//            System.out.println("Запущена печать на принтере...");
//    }
//}
//interface Stateable{
//
//    int OPEN = 1;
//    int CLOSED = 0;
//
//    void printState(int n);
//}

//public class Main {
//
//
//    public static void main(String[] args){
//        Car c1 = new Car( "Mercedes-benz", "S-classes", "$500", 7000000,  2015);
//        c1.println();
//        Car c2 = new Car( "BMW",  "7 series", "750 Li",  7050000,  2016);
//        c1.println();
//        Car c3 = new Car( "Audi",  "A8","Long",  7450000,  2016);
//        c1.println();
//    }
//
//}

public class Main {

    public static void main(String[] args) {
//        Book b1 = new Book("War and Peace", "L. Tolstoy", Type.BELLETRE);
//        System.out.printf("Book '%s' has a type %s", b1.name, b1.bookType);
//
//        switch(b1.bookType){
//            case BELLETRE:
//                System.out.println("Belletre");
//                break;
//            case SCIENCE:
//                System.out.println("Science");
//                break;
//            case SCIENCE_FICTION:
//                System.out.println("Science fiction");
//                break;
//            case PHANTASY:
//                System.out.println("Phantasy");
//                break;
//        }
//    }
//}
//class Book{
//
//    String name;
//    Type bookType;
//    String author;
//
//    Book(String name, String author, Type type){
//
//        bookType = type;
//        this.name = name;
//        this.author = author;
//    }
//}
//
//enum Type
//{
//    SCIENCE,
//    BELLETRE,
//    PHANTASY,
//    SCIENCE_FICTION
//}



//        Type[] types = Type.values();
//        for (Type s : types) { System.out.println(s); }
//    }
//}
//enum Type
//{
//    SCIENCE,
//    BELLETRE,
//    PHANTASY,
//    SCIENCE_FICTION
//}


//        System.out.println(Color.RED.getCode());        // #FF0000
//        System.out.println(Color.GREEN.getCode());      // #00FF00
//
//
//    }
//}
//enum Color{
//    RED("#FF0000"), BLUE("#0000FF"), GREEN("#00FF00");
//    private String code;
//    Color(String code){
//        this.code = code;
//    }
//    public String getCode(){ return code;}
//}

        Operation op = Operation.SUM;
        System.out.println(op.action(10, 4));   // 14
        op = Operation.MULTIPLY;
        System.out.println(op.action(6, 4));    // 24
    }
}
enum Operation{
    SUM{
        public int action(int x, int y){ return x + y;}
    },
    SUBTRACT{
        public int action(int x, int y){ return x - y;}
    },
    MULTIPLY{
        public int action(int x, int y){ return x * y;}
    };
    public abstract int action(int x, int y);
}
