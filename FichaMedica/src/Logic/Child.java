package Logic;

import java.util.*;
public class Child {
    
    private String nombre;
    private int edad;
    private ArrayList<Appointment> listaAppointment;
    private ArrayList<Vaccine> listaVaccine;
    private ArrayList<Growth> listaGrowth;
    
    public Child(){
    }

    public Child(String nombre, int edad, ArrayList<Appointment> listaAppointment, ArrayList<Vaccine> listaVaccine, ArrayList<Growth> listaGrowth) {
        this.nombre = nombre;
        this.edad = edad;
        this.listaAppointment = listaAppointment;
        this.listaVaccine = listaVaccine;
        this.listaGrowth = listaGrowth;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Appointment> getListaAppointment() {
        return listaAppointment;
    }

    public void setListaAppointment(ArrayList<Appointment> listaAppointment) {
        this.listaAppointment = listaAppointment;
    }

    public ArrayList<Vaccine> getListaVaccine() {
        return listaVaccine;
    }

    public void setListaVaccine(ArrayList<Vaccine> listaVaccine) {
        this.listaVaccine = listaVaccine;
    }

    public ArrayList<Growth> getListaGrowth() {
        return listaGrowth;
    }

    public void setListaGrowth(ArrayList<Growth> listaGrowth) {
        this.listaGrowth = listaGrowth;
    }
    
    

}
