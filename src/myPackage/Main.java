package myPackage;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Person> set = new LinkedHashSet<Person>();

        set.add(new Person(1));
        set.add(new Person(2));
        set.add(new Person(3));
        set.add(new Person(4));
        set.add(new Person(5));

        for (Person i:
             set) {
            System.out.println(i.getId());
        }

        System.out.println("---");

        set.remove(new Person(1));

        for (Person i:
                set) {
            System.out.println(i.getId());
        }
    }
}
// phai nhap theo thu tu;

// Ham (hashCode) + (equal) xoa item trong mang;