import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        String name;
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        name=sc.next();
        for(int i=0;i<num;i++)
        {
            System.out.println(name);
        }
    }
}
