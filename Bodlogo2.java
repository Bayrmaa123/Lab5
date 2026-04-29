import java.util.*; 
public class Bodlogo2 { 
public static void main(String[] args) { 
Random rand = new Random(); 
int n = rand.nextInt(100) + 1; 
int m = rand.nextInt(100) + 1; 
double[] x = new double[n]; 
double[] y = new double[m]; 
double[] z = new double[n + m]; 
for (int i = 0; i < n; i++) { 
x[i] = rand.nextDouble() * 100; 
} 
for (int i = 0; i < m; i++) { 
y[i] = rand.nextDouble() * 100; 
} 
int index = 0; 
for (double v : x) { 
z[index++] = v;} 
for (double v : y) { 
z[index++] = v;      
Arrays.sort(z); 
} 
System.out.println("Buurah daraalal:"); 
for (int i = z.length - 1; i >= 0; i--) { 
System.out.print(z[i] + " "); 
} 
} 
} 