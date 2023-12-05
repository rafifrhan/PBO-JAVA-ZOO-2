
package zoo2;


public class Animal {
    private int statusTumbuh;//0-4 
    private int jumlahAir; 
    private int jumlahrumput;
    public Animal() { 
        statusTumbuh = 0; 
        jumlahAir = 0; 
        jumlahrumput = 0;
    }
    public int getJumlahAir(){ 
        return jumlahAir;
    }
    public void setJumlahAir(int n){ 
        jumlahAir = n;
    }
    public int getJumlahrumput(){ 
        return jumlahrumput;
    }
    public void setJumlahrumput(int n){ 
        jumlahrumput = n;
    }

    public void setStatusTumbuh(int n){ 
        statusTumbuh = n;
    }
    public void beriMinum() { 
        jumlahAir++; 
        cekKondisiTumbuh();
    }
    public void beriMakan() { 
        jumlahrumput++; 
        cekKondisiTumbuh();
    }
    public void cekKondisiTumbuh() { 
    //cek kecukupan air dan rumput
    if(jumlahAir >=2 && jumlahrumput >=3) { 
        tumbuh();
        } 
    }
    public void tumbuh() { 
        if(statusTumbuh <4) { 
            jumlahAir = jumlahAir - 2; 
            jumlahrumput = jumlahrumput - 3; 
            statusTumbuh++;}}
    public void displayAnimal() {
    System.out.println(getStatusTumbuhText());
    System.out.println("Jumlah Air:" + jumlahAir);
    System.out.println("Jumlah rumput:" + jumlahrumput);}

    public String getStatusTumbuhText() { 
    switch(statusTumbuh) {  
        case 0: return "Bayi rusa"; 
        case 1: return "rusa"; 
        case 2: return "rusa Dewasa";
    } return "Telah Berkembang";
    }
    
    public int getStatusTumbuh() { 
        return statusTumbuh;
    }
    public String getImagePath() {
    String tImagePath = "img/seed.png"; 
    switch(statusTumbuh) { 
        case 0: tImagePath = "img/bayi_rusa.png"; break; 
        case 1: tImagePath = "img/rusa.png"; break;
        case 2: tImagePath = "img/rusa_dewasa.png"; break; 
    } return 
      tImagePath;
    }
}

