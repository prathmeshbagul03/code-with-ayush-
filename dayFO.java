import java.util.*;
public class dayFO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("enter size of array:");
        int size=sc.nextInt();
         System.err.println("enter array elements:");
         int[] arr = new int[size];

         for (int i=0; i<arr.length; i++ ){
         arr[i] = sc.nextInt();
    }

    int i=0;
    int j=0;
    while(i < arr.length) {
        if(arr[i] !=0){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]= temp;
            j++;
        }
        i++;
    }
    System.err.print("Array:");
    for(int k=0; k<arr.length; k++){
            System.err.print(arr[k]+ " ");
    }
}
}