
package interfejsy.trening;
/**
 * author pawelstradomski
 */
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;




public class InterfejsyTrening {

    
    public static void main(String[] args) {
        System.out.println(nazwaInterfejsu.Pi);
        
        int[] Tablica = new int[3];
        Tablica[0] = 50;
        Tablica[1] = 10;
        Tablica[2] = 30;
        
        Arrays.sort(Tablica); // aby zaimportowac control+shift+i
        System.out.println(Tablica[0]);
        
        Pracownik[] pracownik = new Pracownik[3];
        pracownik[0] = new Pracownik(5000);
        pracownik[1] = new Pracownik(200);
        pracownik[2] = new Pracownik(11555);
        
        Arrays.sort(pracownik);
        for(Pracownik p: pracownik)
        {
            System.out.println(p.getWynagrodzenie());
        }
        
        Arrays.sort(pracownik, Collections.reverseOrder());
        for(Pracownik p: pracownik)
        {
            System.out.println(p.getWynagrodzenie());
        }
        
        System.out.println(pracownik[0].compareTo(pracownik[1]));

        
        
    }
    
}
interface nazwaInterfejsu
{
    double Pi = 3.14; // wlasciwosc - public, static, final
    
    void test();     // metoda - public, abstract
}
interface nazwaInterfejsu2
{
    
}
class Pracownik implements nazwaInterfejsu, nazwaInterfejsu2, Comparable
{

    @Override
    public void test() 
    {
        
    }
    Pracownik(double wynagrodzenie)
    {
        this.wynagrodzenie = wynagrodzenie;
    }
    
    double getWynagrodzenie()
    {
        return this.wynagrodzenie;
    }
    private double wynagrodzenie;

    @Override
    public int compareTo(Object t) 
    {
        Pracownik przyslany = (Pracownik)t;
        if(this.wynagrodzenie>przyslany.wynagrodzenie)
            return 1;
        if(this.wynagrodzenie<przyslany.wynagrodzenie)
            return -1;
        return 0;
    }
    
}
