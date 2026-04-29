import java.util.*; 
public class Bodlogo1 { 
public static void main(String[] args) { 
Random rand = new Random(); 
int n = rand.nextInt(100) + 1;  
int[] arr = new int[n]; 
for (int i = 0; i < n; i++) { 
arr[i] = rand.nextInt(100);  
} 
System.out.println("Erembelehees umnu:"); 
for (int x : arr) { 
System.out.print(x + " "); 
} 
Arrays.sort(arr); 
System.out.println("\nErembelsnii daraa:"); 
for (int x : arr) { 
System.out.print(x + " "); 
} 
} 
}