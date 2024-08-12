package practiceTest;

import java.util.Objects;

public class Equals implements Comparable {

    int size;
    String name;
    String color;

    Equals(int size,String name,String color)
    {
        this.size=size;
        this.name=name;
        this.color=color;
    }

    @Override
    public boolean equals(Object o)
    {
        ToString t=(ToString) o;

        if (this.color==t.color)
        {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(size);
    }


    @Override
    public int compareTo(Object o)
    {
        ToString t=(ToString) o;
        return this.color.compareTo(t.color);
    }

    public static void main(String[] args) {
        ToString ts=new ToString(12,"indumati","fare");
        Equals e=new Equals(12,"indumati","black");

        System.out.println(e.equals(ts));
        System.out.println(e.hashCode());
        System.out.println(ts.hashCode());
        System.out.println(e.color.compareTo(ts.color));
    }
}
