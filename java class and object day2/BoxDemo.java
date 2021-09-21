public class BoxDemo {
    public static void main(String[] args) {
        Box b1=new Box(100,50,200);

        b1.display();
        System.out.println(b1.volume(15,50,20));
        b1.setLength(b1.getLength()+110/100);
        b1.setWidth(b1.getWidth()+120/100);
        b1.setHeight(b1.getHeight()+150/100);
        System.out.println(b1.volume(100,50,30));

    }
}
