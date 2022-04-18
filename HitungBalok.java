package tugas.hitung.volume.balok;

/**
 *
 * @author Anjeli Oktalia
 */
public class HitungBalok {
    private double Panjang;
    private double Lebar;
    private double Tinggi;
    double volume;
    
public HitungBalok (double Pj,double Lb,double Tg){
    this.setPanjang(Pj);
    this.setLebar(Lb);
    this.settinggi(Tg);
}
private void setPanjang(double Pj){
    this.Panjang = Pj;
}
private void setLebar(double Lb){
    this.Lebar = Lb;
}
private void settinggi(double Tg){
    this.Tinggi = Tg;
}
public int volume (){
    this.volume = this.Panjang * this.Lebar * this.Tinggi;
    return (int) this.volume;
}
public void PrintHasil(){
        this.volume();
        System.out.println("Nilai Volume dari balok dengan ");
        System.out.println("Panjang "+this.Panjang+" cm ");
        System.out.println("Lebar "+this.Lebar+" cm ");
        System.out.println("Tinggi "+this.Tinggi+" cm ");
        System.out.println("Maka Volumenya Adalah "+this.volume+" cm³");
    }
    
}
