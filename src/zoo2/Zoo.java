
package zoo2;
import java.util.ArrayList; 

public class Zoo extends Animal{
    private int SIZE = 10; 
    private int nHewan = 0; 
    private String mZooName; 
    private ArrayList<Animal> pArrList; 
    private int hasilPerkembangan;
    public Zoo(String pName)
    { pArrList = new ArrayList<Animal>(10);
        mZooName = pName; 
    }
      public Zoo()
        {
                this("MyZoo");
        }
public boolean addAnimal(Animal p){ 
    if(nHewan < SIZE){ 
        pArrList.add(p); 
        nHewan++; 
        return true;
}else return false;
}
public int evolveAnimal(){ 
    int tmpN=0; int i=0;
while ((pArrList != null) && (i < pArrList.size())) { 
    if(pArrList.get(i).getStatusTumbuh() == 3){ 
        pArrList.remove(i); nHewan--; tmpN++; i=0;
}else i++;
    	}
hasilPerkembangan = hasilPerkembangan + (tmpN*100);
return tmpN;
}
public void beriMinum(){
    for (int i = 0; i < pArrList.size(); i++) {
        pArrList.get(i).beriMinum();
}
}
        public void beriMakan()
        {
                for (int i = 0; i < pArrList.size(); i++) {                        
                    pArrList.get(i).beriMakan();
                }
        }
public void displayAnimal()
{
System.out.println("----------" + mZooName + "----------");
System.out.println("There are " + nHewan + " Animal(s) in the Zoo");
System.out.println("Your Evolve point:" + hasilPerkembangan);
for (int i = 0; i < pArrList.size(); i++) {
                        pArrList.get(i).displayAnimal();} }
public int getHasilPerkembangan()
{ return hasilPerkembangan;
}
}
