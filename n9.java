import java.util.Scanner;

public class n9 {
    public static void main(String[] args) {
        int c;
    String a,s,name;
        System.out.println("hello name.... ");
        Scanner input=new Scanner(System.in);
        a=input.next();
        System.out.println("Do you want to edit on the name press 1");
        c=input.nextInt();
        if(c==1) {
            System.out.println("write the new name");
            s = input.next();
            name = s;}
            else
              name=  a;


        System.out.printf("hello..."+name   +" in java");

    }
}
