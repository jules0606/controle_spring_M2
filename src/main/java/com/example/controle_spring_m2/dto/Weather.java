package com.example.controle_spring_m2.dto;

import io.swagger.annotations.ApiModelProperty;

public class Weather {

    @ApiModelProperty(notes = "nom de la Ville", required = true, value = "test nomVille", name = "nomVille")
    private String nomVille;
    @ApiModelProperty(notes = "zip Code", required = true, value = "test zipCode", name = "zipCode")
    private String zipCode;
    @ApiModelProperty(notes = "degre en celsius", required = true, value = "test degreCelsius", name = "degreCelsius")
    private String degreCelsius;
    @ApiModelProperty(notes = "temps", required = true, value = "test temps", name = "temps")
    private String temps;
    @ApiModelProperty(notes = "pays", required = true, value = "pays", name = "pays")
    private String pays;

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
