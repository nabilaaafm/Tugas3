/**
 *
 * @author nabila
 */
public class antri {
    public static void main(String [] args){
        medicine mdc1 = new medicine();
       
        mdc1.status();
        mdc1.antrian1(5);
        System.out.println("Banyak Antrian : "+mdc1.getAntrian());
        mdc1.antrian2(1);
        mdc1.medicine("merah",33,true);
        System.out.println("Warna : "+ mdc1.IsColour);
        System.out.println("Massa : "+ mdc1.IsNett);
        System.out.println("Resep : "+ mdc1.IsResep);
        System.out.println("Antrian Sekarang : "+mdc1.getAntrian());
        mdc1.statusBaru();
    }
}

