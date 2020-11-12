import java.util.*;
public class BubbleSort {  
    static void bubbleSort(double[] arr) {  
  int n=arr.length;
        double temp = 0.0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) {  
int n;

               Scanner in=new Scanner(System.in);
System.out.println("Enter size of the array:\n");
n=in.nextInt();


                double[] arr=new double[n];
for(int i=0;i<n;i++){
System.out.println("Enter element "+(i+1));
arr[i]=in.nextInt();
}

                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < n; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);//sorting array elements using bubble sort  
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < n; i++){  
                        System.out.print(arr[i] + " ");  
                }  
   
        }  
}  
