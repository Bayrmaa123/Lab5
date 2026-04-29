import java.util.*; 
public class Bodlogo3 { 
public static void main(String[] args) { 
Random rand = new Random(); 
int n = rand.nextInt(100) + 1; 
ArrayList<Integer> list = new ArrayList<>(); 
for (int i = 0; i < n; i++) { 
list.add(rand.nextInt(100)); 
} 
System.out.println("Anhnii jagsaalt:"); 
for (int x : list) { 
System.out.print(x + " "); 
} 
double sum = 0; 
for (int x : list) { 
sum += x; 
} 
double avg = sum / list.size(); 
list.removeIf(x -> x < avg); 
System.out.println("\nDundaj: " + avg); 
System.out.println("Dundajaas baga utguudiig ustgasnii daraa:"); 
for (int x : list) { 
System.out.print(x + " "); 
        } 
    } 
}