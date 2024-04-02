import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Width:");
        Integer width=scanner.nextInt();
        System.out.println("Enter the Length:");
        Integer length=scanner.nextInt();
        Rectangle calculateArea=new Rectangle(length, width);
        System.out.println("The area of rectangle is: :"+calculateArea.CalculateArea());


    }
}