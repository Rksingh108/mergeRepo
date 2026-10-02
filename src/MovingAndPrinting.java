import java.util.Arrays;

public class MovingAndPrinting {
    static void main(String[] args) {
        int arr[] = {10,10,20,30,30,40,50,50};
        int l = 0;
        int r = 1;
        while(l < arr.length && r < arr.length){
            if(arr[l] == arr[r]){
                r++;
                l++;
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
