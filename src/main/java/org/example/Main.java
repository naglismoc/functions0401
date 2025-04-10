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

        int[] nums = {1,5,10};
        int[][] nums2d =
                {
                        {1,5,10,5,15,5},
                        {4,8,10},
                        {5,8,3}
                };
        System.out.println(nums2d[1][2]);

        for (int i = 0; i < nums2d.length; i++) {
            for (int a = 0; a < nums2d[i].length; a++) {
                System.out.print(nums2d[i][a] + " ");
            }
            System.out.println();
        }


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