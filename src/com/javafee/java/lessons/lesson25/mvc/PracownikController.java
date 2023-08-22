package com.javafee.java.lessons.lesson25.mvc;

public class PracownikController {

    private Pracownik model;
    private PracownikView view;

    public PracownikController(Pracownik model,PracownikView view){
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
