package practiceTest;

import org.testng.annotations.Test;

import java.util.Objects;

public class ToString {

    int size;
    String name;
    String color;

    ToString(int size,String name,String color)
    {
        this.size=size;
        this.name=name;
        this.color=color;
    }

    @Override
    public String toString()
    {
        return "Size :"+this.size+" Name :"+this.name+" Colour :"+this.color;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(size);
    }
    public static void main(String[] args) {
        ToString ts=new ToString(12,"MAdhu","black");

        System.out.println(ts);
    }
}
