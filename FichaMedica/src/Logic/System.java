package Logic;
import java.time.LocalDate;
import java.util.ArrayList;

//Clase Sistema, contiene todas las listas
public class System {
    //Attributes
    private ArrayList<Appointment> listAllAppointments;
    private ArrayList<Child> listAllChildren;
    private ArrayList<Vaccine> listAllVaccines;
    private ArrayList<Growth> listAllGrowth;

    //Getters and Setters
    //ListAllAppointments
    public ArrayList<Appointment> getlistAllAppointments() {
        return listAllAppointments;
    }
    public void setListaAppointment(ArrayList<Appointment> listAppointment) {
        listAllAppointments = listAppointment;
    }
    //ListAllChildren
    public ArrayList<Child> getListAllChildren() {
        return listAllChildren;
    }
    public void setListAllChildren(ArrayList<Child> listChild) {
        listAllChildren = listChild;
    }
    //ListAllVaccines
    public ArrayList<Vaccine> getListAllVaccines() {
        return listAllVaccines;
    }
    public void setListAllVaccines(ArrayList<Vaccine> listVaccines) {
        listAllVaccines = listVaccines;
    }
    //ListAllGrowth
    public ArrayList<Growth> getListAllGrowth() {
        return listAllGrowth;
    }
    public void setListAllGrowth(ArrayList<Growth> listGrowth) {
        listAllGrowth = listGrowth;
    }
    
    //Methods
    //Registrar Hijo al sistema
    public void registrarHijo(Child h){
        this.getListAllChildren().add(h);
    }
    //Ingresar Hijo al sistema
    public void ingresarHijo(String unNombre, LocalDate fechaNacimiento, ArrayList<Appointment> unaListaConsultas, ArrayList<Vaccine> unaListaVacunas, ArrayList<Growth> unaListaCrecimiento ){
        Child h = new Child(unNombre, fechaNacimiento, unaListaConsultas, unaListaVacunas, unaListaCrecimiento);
        registrarHijo(h);
    }
}
