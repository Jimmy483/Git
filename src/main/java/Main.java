import java.util.Scanner;

public class Main {
    static boolean again=true;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Hi! What is your name");
        String name=sc.next();
        int age=0;



        while (again){
            System.out.println("How old are you?");
            age=sc.nextInt();
            System.out.println(name + ", are you " + age + "Years old?(Y/N)");
            String c=sc.next();
            if(c.toUpperCase().equals("Y")){
                again=false;
            }
        }

        System.out.println("Employee Detail");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        System.out.println("you are the best hacker we have ever had in our company");

    }
}
