package src.basics_01_10Dec;

import java.util.Comparator;

class ASC implements Comparator<Compclass1> {

    @Override
    public int compare(Compclass1 o1, Compclass1 o2) {
        return Integer.compare(o1.getId(),o2.getId());
    }
}

class DES implements Comparator<Compclass1> {

    @Override
    public int compare(Compclass1 o1, Compclass1 o2) {
        return Integer.compare(o2.getId(),o1.getId());
    }
}

class SortByName implements Comparator<Compclass1> {

    @Override
    public int compare(Compclass1 o1, Compclass1 o2) {
        return o1.getName().compareTo((o2.getName()));
    }


}

public class Compclass1 implements Comparable<Compclass1> {

    public Compclass1(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Integer id;
    String name;

    @Override
    public String toString() {
        return "Compclass1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Compclass1 o) {
        return 0;
    }
}
