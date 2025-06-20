import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] numeros = {0, 1, 2, 3, 4};
        System.out.println(Arrays.toString(numeros));

        //array de arrays

        int[][] numbers = {{10, 11}, {22, 33}};
        System.out.println(Arrays.deepToString(numbers));

        int[][] nume = new int[3][2];
        nume[0][0] = 5;
        System.out.println(Arrays.deepToString(nume));


    }
}
