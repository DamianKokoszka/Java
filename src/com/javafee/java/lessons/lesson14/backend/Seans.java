package com.javafee.java.lessons.lesson14.backend;

import java.util.Objects;

public class Seans {
    private String data;
    private String godzina;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public String getGodzina(){
        return godzina;
    }

    public void setGodzina(String godzina) {
        this.godzina = godzina;
    }

    public Seans(){
        super();
    }
    public Seans(String data, String godzina){
        super();
        this.data = data;
        this.godzina = godzina;
    }
    public String toString(){
        return  "data=" + data + ", godzina" + godzina ;
    };



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seans seans = (Seans) o;
        return Objects.equals(data, seans.data) && Objects.equals(godzina, seans.godzina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, godzina);
    }
}
