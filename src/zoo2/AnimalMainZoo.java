
package zoo2;
import java.util.Scanner;

public class AnimalMainZoo {

    
    public static void main(String[] args) {
    //Animal p = new Animal();
    //rusa p = new rusa(); 
    Zoo mZ = new Zoo("Kebun Binatang");
    Scanner sc = new Scanner(System.in); 
    int inp = 0; 
    do { 
           System.out.println("Masukkan:");             
           System.out.println("0 untuk menambahkan Hewan"); 
           System.out.println("1 untuk memberi air");
           System.out.println("2 untuk memberi rumput"); 
           System.out.println("3 untuk melihat hasil Perkembangan");
           System.out.println("999 untuk keluar");
    inp = sc.nextInt(); 
    switch(inp){ 
        case 0: Animal p = new Animal(); 
        if(mZ.addAnimal(p)) {
            printMessage("Hewan berhasil ditambahkan");
        }else {
            printMessage("Kebun Binatang sudah penuh"); } break;
        case 1: mZ.beriMinum(); break; 
        case 2: mZ.beriMakan(); break;
        case 3: int n = mZ.evolveAnimal(); 
        if(n>0) printMessage(n +" Animal(s) successfully Evolve!"); 
        else
            printMessage("Oops... There is no Animal ready to be Evolved.");
        break; 
    } 
mZ.displayAnimal(); 
} while (inp!=999); 
} 
public static void printMessage(String str)
{
System.out.println("***************************");
System.out.println("**"+str);
System.out.println("***************************"); 
}
}
    

