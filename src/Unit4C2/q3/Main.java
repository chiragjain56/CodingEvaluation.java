package Unit4C2.q3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        String[] array = value.split(" ");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);
        int i = Integer.parseInt(array[2]);

        int s = 0;
        while(a<=b){
             s = a ;
             a = a + i;
            System.out.print(s + " ");
        }
    }
}
