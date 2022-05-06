import java.util.Scanner;
import java.util.Arrays;

public class newArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int index = 0;
        System.out.print("Dizi boyutunu giriniz : ");
        int size = input.nextInt();

        int [] list = new int[size];

        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length; j++){
                System.out.print("Eleman giriniz : ");
                j = input.nextInt();
                list[i] = j;
                break;
            }

        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));


    }
}
