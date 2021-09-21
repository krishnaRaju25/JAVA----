import java.sql.SQLOutput;

public class Laptop {
    private int ram;
    private int hhd;
    private String processor;
    private String screensize;
public void initialize(int r,int h,String proc,String ss) {
    ram = r;
    hhd = h;
    processor = proc;
    screensize = ss;
}
public void display(){
    System.out.println("ram "+ram+"gb");
    System.out.println("hhd "+hhd+"gb");
    System.out.println("processor "+processor);
    System.out.println("Screensize "+screensize);
}


}
