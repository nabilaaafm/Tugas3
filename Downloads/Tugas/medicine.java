
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

/**
 *
 * @author nabila
 */
public class medicine {
    String IsColour;
    double IsShaped;
    int IsNett;
    double IsVarian;
    boolean IsResep;
    int antrian=0;
    String getAntrian;
    
    void medicine(String IsColour, int IsNett, boolean IsResep){
        this.IsColour = IsColour;
        this.IsShaped = IsShaped;
        this.IsNett = IsNett;
        this.IsVarian = IsVarian;
        this.IsResep = true;
    }
 
    void status(){
        System.out.println("Buka");
}
    void antrian1(int tambahAntrian){
        antrian = antrian + tambahAntrian;
    }
    void antrian2(int kurangAntrian) {
        antrian = antrian - kurangAntrian;
        System.out.println("Telah menerima obat : "+kurangAntrian);
    }
    int getAntrian(){
        return antrian;
    }
    void statusBaru(){
        System.out.println("Tutup");
    }
}
