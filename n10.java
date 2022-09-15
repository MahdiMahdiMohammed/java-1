///**من خلال فهم الترجمة للسؤال محادثة//

import java.util.Scanner;

public class n10 {
    public static void main(String[] args) {
String  name2,name1="Mahdi",us1,us2,joop;
int age,year;

        Scanner input=new Scanner(System.in);
        System.out.println("speaker "+name1);
        System.out.println("whet's your name ");
        name2= input.next();
        System.out.println("pleased to meet you my name "+name1);
        System.out.println("speaker " +name2);
        System.out.println("you studying my " +name1);
        us1= input.next();
        //System.out.println(""+us1);
        System.out.println("speaker " +name1);
        System.out.println("and whet are you studying");
        System.out.println("speaker " +name2);
        us2= input.next();
        //System.out.println(""+us2);
        System.out.println("speaker " +name1);
        System.out.println("whet date of your birth");
        year= input.nextInt();
        age=2022-year;
        System.out.println("your old age is " + age);

        System.out.println("speaker"+name1);
            System.out.println("whet do you want me to do");
            System.out.println("speaker"+name2);
            joop=input.next();
            System.out.println("i'm sorry "+name2+ "Ican't work that");

    }
}
