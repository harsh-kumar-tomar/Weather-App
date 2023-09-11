package com.example.javaappversion14.Domains;

public class Hourly {
    private String hour ;
    private int temp ;
    private String imgPath ;

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public Hourly(String hour, int temp, String imgPath) {
        this.hour = hour;
        this.temp = temp;
        this.imgPath = imgPath;
    }
}
