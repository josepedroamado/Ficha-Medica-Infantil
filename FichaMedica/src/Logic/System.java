package Logic;
import java.time.LocalDate;
import java.util.ArrayList;

//Clase Sistema, contiene todas las listas
public class System {
    //Attributes
    private ArrayList<Appointment> listAllAppointments;
    private ArrayList<Child> listAllChildren;
    private ArrayList<Vaccine> listAllVaccines;

    //Getters and Setters
    //ListAllAppointments
    public ArrayList<Appointment> getlistAllAppointments() {
        return listAllAppointments;
    }
    //ListAllChildren
    public ArrayList<Child> getListAllChildren() {
        return listAllChildren;
    }
    //ListAllVaccines
    public ArrayList<Vaccine> getListAllVaccines() {
        return listAllVaccines;
    }

    //Constructors
    //Empty
    public System(){
        listAllAppointments = new ArrayList <Appointment>();
        listAllChildren = new ArrayList <Child>();
        listAllVaccines = new ArrayList <Vaccine>();
    }
    
    //Methods
    //Registrar Hijo al sistema
    public void registerChild(Child h){
        if(h != null){
            this.getListAllChildren().add(h);
        }
    }
    //Ingresar Hijo al sistema
    public void ingresarHijo(String name, LocalDate birthDate){
        Child h = new Child(name, birthDate);
        this.registerChild(h);
    }
}
