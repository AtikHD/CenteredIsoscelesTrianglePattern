import java.util.Scanner;
public class IsoscelesTrianglePattern {
    public static void main(String[] args) {
        System.out.println("Enter the value of base of the triangle. (has to be an odd number)");
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        for(int i=1; i<=base; i=i+2){
            for(int k=1; k<=(base-i)/2; k++){
                System.out.print("   ");
            }
            for(int j=1; j<=i; j++){
                System.out.printf("%-3d",j);
            }
            System.out.println();
        }
    }
}
