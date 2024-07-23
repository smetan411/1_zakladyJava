package zaklady1;

public class Porovnavani3 {

    public static void main(String[] args) {

        // vytvořte proměnnou typu boolean s názvem menší
        // přiřaďte této proměnné různé hodnoty tak, aby ukazovala true nebo false
        boolean mensi = 3 < 4;
        System.out.println(mensi);

        System.out.println(5 < 10);
        System.out.println(5 > 10);

        System.out.println();
        // && znamená a současně, || znamená nebo::

        // vytvořte proměnnou číslo s hodnotou např. 6
        // vytvořte proměnnou typu boolean s názvem podminka
        // vytiskněte hodnotu proměnné pro číslo větší než pět a současně menší než deset
        int cislo = 6;
        boolean podminka = (cislo > 5) && (cislo < 10);
        System.out.println(podminka);

        // vytiskněte hodnotu proměnné pro číslo mensi než pět a nebo větší než deset
        boolean jinaPodminka = (cislo < 5) || (cislo > 10);
        System.out.println(jinaPodminka);

    }
}
