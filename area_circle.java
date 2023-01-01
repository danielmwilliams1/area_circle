import java.util.Scanner;
public class area_circle {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = kb.nextInt();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
        kb.close();
    }
    
}
