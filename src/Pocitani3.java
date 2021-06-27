class Pocitani3 {

    public static void main(String[] args) {

        double nahodneCislo = Math.random();
        System.out.println(nahodneCislo);

        System.out.println();
        System.out.println(Math.random());

        System.out.println();
        double meziNulouAStovkou = Math.random() * 100;
        System.out.println(meziNulouAStovkou);
        System.out.println(Math.round(Math.random() * 100));
        System.out.println();
        System.out.println(Math.round(Math.random() * 5));

        double kostka = Math.round(Math.random() * 5 + 1);
        int kostkaInt = (int) kostka;
        System.out.println("kostka říká" + " " + kostkaInt);


        // porovnávací operátory vrací true nebo false - boolean
        //    <  <=  >  >=  ==  !=

        boolean triJeMensiNezCtyri = 3 < 4;
        System.out.println(triJeMensiNezCtyri);

        boolean petJeVetsiNezCtyri = 5 > 4;
        boolean ctyriJeMeziTriAPet = triJeMensiNezCtyri && petJeVetsiNezCtyri;      // && je true pokud jsou obe promenne true
        System.out.println(ctyriJeMeziTriAPet);

        boolean ctyriJeVetsiNezPetNeboTri = (4 > 5) || (4 > 3);                     // || je true pokud je alespon jeden vyraz true
        System.out.println(ctyriJeVetsiNezPetNeboTri);
    }
}


