public class LaptopDemo {
    public static void main(String[] args) {
        Laptop l1=new Laptop();
        l1.initialize(8,512,"intel","15.16");
        Laptop l2=new Laptop();
        l2.initialize(8,512,"dell","18.16");
        l1.display();
        l2.display();

    }
}
