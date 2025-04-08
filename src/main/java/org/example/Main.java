package org.example;
public class Main {
    public static void main(String[] args) {
        saiHi();
        saiHi();
        saiHi();
        sayHiTo("Jonas");
        sayHiTo("Adele");
        double simplifiedPI = simPI();
        System.out.println(simplifiedPI);
        System.out.println(simPI());
        String niceName = nameCase("nAgLiS");
        System.out.println(niceName);
        System.out.println();
        String vardas = "dainius";
        System.out.println(nameCase(vardas));
        vardas = "nAGLIS";
        String pavarde = "MockevICIiUs";
        String sutvarkytasPilnasVardas = fullName(vardas, pavarde);
        System.out.println(sutvarkytasPilnasVardas);
    }

    public static String fullName(String name, String surname){
        return nameCase(name) + " " + nameCase(surname);
    }
    public static double simPI(){//nieko nepriima, grazina reiksme i koda
        return 3.1415;
    }
    public static String nameCase(String name){// priima String argument, grazina string reiksme;
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }
    public static void saiHi(){// nieko nepriima, nieko negrazina
        System.out.println("hello :)");
    }
    public static void sayHiTo(String name){// priima 1 kintamaji, nieko negrazina
        System.out.println("hello " + name);
    }
    //overloadinti metodai
}