package src.basics_01_10Dec;

public class Compclass implements Comparable<Compclass> {

    public Compclass(Integer id, String name) {
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
    public String toString() {     //Generate To String Method
        return "Compclass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Compclass student2) {
//        return Integer.compare(this.id,student2.id);
//    }

    @Override
    public int compareTo(Compclass student2) {
        return CharSequence.compare(this.name,student2.name);
    }
}
