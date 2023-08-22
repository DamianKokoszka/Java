package com.javafee.java.lessons.lesson26.fronted;


import com.javafee.java.lessons.lesson26.backend.Pracownik;

public class Controller {
    private Pracownik model;
    private View view;

    public Controller(Pracownik model,View view){
        this.model = model;
        this.view = view;
    }

    public void setPracownikImie(String name){
        model.setName(name);
    }

    public String getPracownikImie(){
        return model.getName();
    }

    public void setPracownikId(String id){
        model.setId(id);
    }

    public void setDzialPracownikow(String Department){
        model.setDepartment(Department);
    }

    public String getDzialPracownikow(){
        return model.getDepartment();
    }

    public void updateView(){
        view.DrukujSzczegolyPracownikow(model.getName(),model.getId(),model.getDepartment());
    }
}
