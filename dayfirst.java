import java.util.*;
public class dayfirst {
    public static void main(String[] args) {
        try (Scanner sc= new Scanner(System.in)) {
            System.out.println("enter array sizeee:-");
            int n=sc.nextInt();
            System.out.println("ENTER K:-");
            int k=sc.nextInt();
            System.out.println("ENTER ARRAY ELEMENt");
            Integer arr[]=new Integer[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();

            }
            Arrays.sort(arr, Collections.reverseOrder());
            int count=1;
            int prev=arr[0];

            if (k==1) {
                System.out.println(prev);
                return;
            }
            for(int i=1;i<arr.length;i++){
                if(arr[i]!=prev){
                    count++;
                    prev=arr[i];
                    if (count==k){
                        System.out.println(arr[i]);
                        return;
                    }
                }
            }
        }
        System.out.println(-1);
        
    }
}
