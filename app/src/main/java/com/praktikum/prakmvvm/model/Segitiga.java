package com.praktikum.prakmvvm.model;

public class Segitiga {
    private Double alas;
    private Double tinggi;
    private Double hasil;

    public Double getAlas() {
        return alas;
    }

    public void setAlas(Double alas) {
        this.alas = alas;
    }

    public Double getTinggi() {
        return tinggi;
    }

    public void setTinggi(Double tinggi) {
        this.tinggi = tinggi;
    }

    public Double getHasil() {
        return hasil;
    }

    public void setHasil(Double hasil) {
        this.hasil = hasil;
    }

    public Segitiga(Double alas, Double tinggi, Double hasil) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.hasil = hasil;
    }
}
