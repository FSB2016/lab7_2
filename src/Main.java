
interface PasangersAuto{
    static void movpas(){}
}
interface CargoAuto{
    static void movd(){}
}
class Truck implements PasangersAuto,CargoAuto{
    static void movpas(){
        System.out.print(" как правило перевозит 1 пассажира, ");
    }
    static void movd(){
        System.out.print("зато перевозит много груза");
    }
    Truck(){
        System.out.print("\nГрузовик ");
        movpas();
        movd();
    }
}
class Sedan implements PasangersAuto,CargoAuto{
    static void movpas(){
        System.out.print(" перевозит 4 пассакжира, ");
    }
    static void movd(){
        System.out.print(" седан не перевозит большой обьём багажа");
    }
    Sedan(){
        System.out.print("\nСедан ");
        movpas();
        movd();
    }
}
class Pickup implements PasangersAuto,CargoAuto{
    static void movpas(){
        System.out.print(" перевозит 4 пассакжира ");
    }
    static void movd(){
        System.out.print(" и перевозит довольно внушительный большой обьём багажа.");
    }
    Pickup(){
        System.out.print("\nПикап ");
        movpas();
        movd();
    }
}
class Main{
    public static void main(String argc[]){
        Truck t = new Truck();
        Sedan s = new Sedan();
        Pickup p = new Pickup();
    }
}