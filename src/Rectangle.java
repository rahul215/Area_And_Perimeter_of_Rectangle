import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        int length,breadth,area,perimeter;
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        breadth = sc.nextInt();
        area = length * breadth;
        System.out.println("Area");
        System.out.println(area);

        perimeter = 2*(length + breadth);
        length = sc.nextInt();
        breadth = sc.nextInt();
        System.out.println("PERIMETER");
        System.out.println(perimeter);
    }
}
