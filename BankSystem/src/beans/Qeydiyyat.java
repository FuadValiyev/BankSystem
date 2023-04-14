package beans;

import java.io.Serializable;

public class Qeydiyyat implements Serializable {

    private String ad;
    private String soyad;
    private int yas;
    private String link;
    private String kod;

    @Override
    public String toString() {
        return "ad=" + ad + ", soyad=" + soyad + ", yas=" + yas + ", link=" + link + ", kod=" + kod;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public Qeydiyyat(String ad, String soyad, int yas, String link, String kod) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.link = link;
        this.kod = kod;

    }

    public Qeydiyyat() {
    }
}
