package Chapter9.soru02;

public class Stock {
    /*
    Stok sembolü için  symbol isminde string türünden bir veri elemanı.+
    ■ Stok adı için name isminde string türünden bir veri elemanı.+
    ■ Bir önceki güne ait stok fiyatını tutan  previousClosingPrice isminde double türden bir veri elemanı.+
    ■ Bir güncel stok fiyatını tutan currentPrice isminde double türden bir veri elemanı.+
    ■ Belirtilen sembol ve isim parametreleri ile bir stok nesnesi yaratan constructor.
    ■ Geri dönüş değeri, güncel fiyat (currentPrice) ile bir önceki fiyat
    (previousClosingPrice) arasındaki değişim olan getChangePercent() metodu. */


    private String sembol;
    private String stokAdi;
    private double birOncekiFiyat;
    private double guncelFiyat;


    public Stock(String sembol, String stokAdi) {
        this.sembol = sembol;
        this.stokAdi = stokAdi;
    }

    public  double getChangePersent(){
        return this.guncelFiyat - this.birOncekiFiyat;
    }

    public String getSembol() {
        return sembol;
    }

    public void setSembol(String sembol) {
        this.sembol = sembol;
    }

    public String getStokAdi() {
        return stokAdi;
    }

    public void setStokAdi(String stokAdi) {
        this.stokAdi = stokAdi;
    }

    public double getBirOncekiFiyat(double v) {
        return birOncekiFiyat;
    }

    public void setBirOncekiFiyat(double birOncekiFiyat) {
        this.birOncekiFiyat = birOncekiFiyat;
    }

    public double getGuncelFiyat() {
        return guncelFiyat;
    }

    public void setGuncelFiyat(double guncelFiyat) {
        this.guncelFiyat = guncelFiyat;
    }
}
