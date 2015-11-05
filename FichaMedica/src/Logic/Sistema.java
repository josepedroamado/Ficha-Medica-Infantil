
package Logic;

import java.util.*;
public class Sistema {
    private ArrayList<Appointment> listaAppointment;
    private ArrayList<Child> listaChild;
    private ArrayList<Vaccine> listaVaccine;
    private ArrayList<Growth> listaGrowth;

    public ArrayList<Appointment> getListaAppointment() {
        return listaAppointment;
    }

    public void setListaAppointment(ArrayList<Appointment> listaAppointment) {
        this.listaAppointment = listaAppointment;
    }

    public ArrayList<Child> getListaChild() {
        return listaChild;
    }

    public void setListaChild(ArrayList<Child> listaChild) {
        this.listaChild = listaChild;
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
    public void registrarHijo(Child h){
        this.getListaChild().add(h);
    }
    
    public void ingresarHijo(String unNombre, int unaEdad, ArrayList<Appointment> unaListaConsultas, ArrayList<Vaccine> unaListaVacunas, ArrayList<Growth> unaListaCrecimiento ){
        Child h = new Child(unNombre, unaEdad, unaListaConsultas, unaListaVacunas, unaListaCrecimiento);
        registrarHijo(h);
    }
}
