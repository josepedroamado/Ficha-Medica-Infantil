package Logic;

import java.util.*;
public class Child {
    
    private String nombre;
    private int edad;
    private ArrayList<Appointment> listaConsultas;
    private ArrayList<Vaccine> listaVacunas;
    private ArrayList<Growth> listaCrecimiento;
    
    public Child(){
    }

    public Child(String nombre, int edad, ArrayList<Appointment> listaConsultas, ArrayList<Vaccine> listaVacunas, ArrayList<Growth> listaCrecimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.listaConsultas = listaConsultas;
        this.listaVacunas = listaVacunas;
        this.listaCrecimiento = listaCrecimiento;
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

    public ArrayList<Appointment> getListaConsultas() {
        return listaConsultas;
    }

    public void setListaConsultas(ArrayList<Appointment> listaConsultas) {
        this.listaConsultas = listaConsultas;
    }

    public ArrayList<Vaccine> getListaVacunas() {
        return listaVacunas;
    }

    public void setListaVacunas(ArrayList<Vaccine> listaVacunas) {
        this.listaVacunas = listaVacunas;
    }

    public ArrayList<Growth> getListaCrecimiento() {
        return listaCrecimiento;
    }

    public void setListaCrecimiento(ArrayList<Growth> listaCrecimiento) {
        this.listaCrecimiento = listaCrecimiento;
    }

    
    
    @Override
    public String toString(){
        return ("" + this.getNombre());
        
    }

}
