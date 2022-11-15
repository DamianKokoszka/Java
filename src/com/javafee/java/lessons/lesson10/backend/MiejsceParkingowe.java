package com.javafee.java.lessons.lesson10.backend;

public class MiejsceParkingowe {
    int [] arr = new int[10];

    public int NumerMiejsca;

    public int NumerMiejsca(){
        int miejsce = 0;
        for(int i = 0; i <10; i++){
            if(arr[i] == 0){
                miejsce = i + 1;
                arr[i] = i + 1;
                break;
            }
        }
        return miejsce;
    }

    public int si(){
        int sprawdzmiejsce = 0;
        for (int i= 0; i<10; i++){
            if(arr[i] !=0){
                return 1;
            }
            else if(arr[i] == 0){
                sprawdzmiejsce++;
            }
        }
        return sprawdzmiejsce;
    }
    public void spra(){
        System.out.print("\nMiejsce status: ");
        for(int i = 0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void WolneMiejsce(int num){
        arr[num - 1] = 0;
    }

}
