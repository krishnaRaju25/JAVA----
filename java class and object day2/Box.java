import java.sql.SQLOutput;

public class Box {
    private int length;
    private int width;
    private int height;

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void display() {
        System.out.println("length " + length);
        System.out.println("width " + width);
        System.out.println("height " + height);
    }

    public int volume(int length,int width,int height) {
        System.out.println("print volume");
       return length * width * height;
    }


}
