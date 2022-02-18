package com.example.controle_spring_m2.dto;

public class Weather {

    private String nomVille;
    private String zipCode;
    private String degreCelsius;
    private String temps;
    private String pays;

    public Weather() {
    }

    public Weather(String nomVille, String zipCode, String degreCelsius, String temps, String pays) {
        this.nomVille = nomVille;
        this.zipCode = zipCode;
        this.degreCelsius = degreCelsius;
        this.temps = temps;
        this.pays = pays;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "nomVille='" + nomVille + '\'' +
                ", zipCode=" + zipCode +
                ", degreCelsius='" + degreCelsius + '\'' +
                ", temps='" + temps + '\'' +
                '}';
    }

    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getDegreCelsius() {
        return degreCelsius;
    }

    public void setDegreCelsius(String degreCelsius) {
        this.degreCelsius = degreCelsius;
    }

    public String getTemps() {
        return temps;
    }

    public void setTemps(String temps) {
        this.temps = temps;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
