import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal al=new Lion();
        al.eat();
        al.walk();
        //al.shout();
        Animal am=new Monkey();
        am.eat();
        am.walk();
        Animal ad=new Deer();
        ad.eat();
        ad.walk();
        List<Animal> list=new ArrayList<Animal>();
        Lion l1=new Lion();
        Monkey m1=new Monkey();
        Deer d1=new Deer();
        list.add(l1);
        list.add(m1);
        list.add(d1);
        for(Animal an:list){
            an.eat();
        }
    }
}
