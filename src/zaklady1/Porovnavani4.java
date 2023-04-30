package zaklady1;

public class Porovnavani4 {

    public static void main(String[] args) {

        // vytvorte promennou typu boolean mensi
        // priradte teto promenne ruzne hodnoty tak, aby ukazovala true nebo false
        boolean mensi = 3 < 4;
        System.out.println(mensi);

        // použijeme && a současně:
        // incializujte promennou cislo na hodnotu napr. 6
        // vytvorte promennou typu boolean s nazvem mojePodminka
        // pro cislo vetsi nez pet a soucasne mensi nez deset
        // vytisknete hodnotu promenne
        int cislo = 6;
        boolean mojePodminka = (cislo > 5) && (cislo < 10);
        System.out.println(mojePodminka);

        // použijeme "||" nebo:
        // incializujte promennou cislo na hodnotu napr. 6
        // vytvorte promennou typu boolean s nazvem jinaPodminka
        // pro cislo mensi nez pet a soucasne vetsi nez deset
        // vytisknete hodnotu promenne
        int jineCislo = 6;
        boolean jinaPodminka = (jineCislo < 5) || (jineCislo > 10);
        System.out.println(jinaPodminka);

    }

}
