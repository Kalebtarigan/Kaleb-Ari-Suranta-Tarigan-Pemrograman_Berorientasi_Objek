/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */

class KurirReguler {
    protected String nama;
    
    public KurirReguler  (String nama){
        this.nama =  nama;
    }
    
    public void kirimBarang (String alamat){
        System.out.println(nama + " mengantar paket  ke " + alamat + " lewat jalur darat menembus kemacetan.");
    }
}

class KurirDrone extends KurirReguler {
    private String idDrone;
    
    public KurirDrone (String nama, String idDrone) {
        super(nama);
        this.idDrone = idDrone;
    }
    
    @Override  
    public void kirimBarang (String alamat){
        System.out.println("Unit Drone [" + idDrone + "] operator " + nama +
                "terbang mengantar paket langsung ke koordinat: " + alamat);
    }
}

public class SimulasiOverriding {
    public static void main(String[] args) {
        System.out.println("=== INI METHOD OVERRIDING ===");
        
        KurirReguler k1 = new KurirReguler("Budi");
        
        KurirReguler k2 = new KurirDrone("Arka", "DRN-01");
        
        k1.kirimBarang("Jl. Sudirman No. 10");
        k2.kirimBarang("Gedung Graha Lt. 5");
    }
    
}

/*
1  & 2. Tanpa @Override dan nama diubah jadi kirimbarang, output k2.kirimBarang("Gedung Graha Lt. 5"):
Arka mengantar paket ke Gedung Graha Lt. 5 lewat jalur darat menembus kemacetan.
Outputnya berubah menjadi jalur darat. Method kirimbarang (b kecil) dia

3. Dengan @Override dikembalikan di atas method yang salah ketik, error-nya:
KurirDrone.java:20: error: method does not override or implement a method from a supertype
    @Override
    ^

4. @Override adalah penanda untuk compiler bahwa method ini dimaksudkan menimpa method parent. Kalau ternyata tidak cocok (typo nama, beda parameter, atau method parent berubah), 
compiler langsung menampilkan error. Tanpa @Override, kesalahan semacam itu lolos diam-diam dan program berperilaku salah seperti pada eksperimen di atas. Anotasi ini juga membuat 
kode lebih mudah dibaca.
*/