import java.util.ArrayList;
public class CatRunner {
    public static void main (String args[])
    {
        ArrayList <Cat> cats = new ArrayList<Cat>();
        Cat cat1 = new Cat("Joey");
        Cat cat2 = new Cat("Max");
        Cat cat3 = new Cat("Jenny");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);

        Cat cat4 = new Cat("Toby");
        Cat temp = cats.set(2,cat4);
        System.out.println(cats);
        System.out.println(temp);

        cat4.setName(cat4.getName() + " Meow");
        System.out.println(cat4);

        for(int i = 0; i <cats.size();i++){
            String newName = cats.get(i).getName().toUpperCase();
            cats.get(i).setName(newName);
        }
        System.out.println(cats);
    }
}
