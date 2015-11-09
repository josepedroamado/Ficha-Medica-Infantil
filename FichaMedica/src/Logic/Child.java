package Logic;
import java.time.LocalDate;
import java.util.ArrayList;

//Clase de hijo, contiene todos los datos realacionados al mismo
public class Child {
    //Attributes
    private String name;
    private int age;
    private ArrayList<Appointment> listAppointments;
    private ArrayList<Vaccine> listVaccines;
    private ArrayList<Growth> listGrowth;
    
    //Getters and Setter
    //Name
    public String getName() {
        return name;
    }
    public void setName(String nombre) {
        name = nombre;
    }
    //Age
    public int getAge() {
        return age;
    }
    public void setAge(int edad) {
        age = edad;
    }
    //ListAppointments
    public ArrayList<Appointment> getListAppointments() {
        return listAppointments;
    }
    public void setListAppointments(ArrayList<Appointment> listaConsultas) {
        listAppointments = listaConsultas;
    }
    //ListVaccines
    public ArrayList<Vaccine> getListVaccines() {
        return listVaccines;
    }
    public void setListVaccines(ArrayList<Vaccine> listaVacunas) {
        listVaccines = listaVacunas;
    }
    //ListGrowth
    public ArrayList<Growth> getListGrowth() {
        return listGrowth;
    }
    public void setListGrowth(ArrayList<Growth> listaCrecimiento) {
        listGrowth = listaCrecimiento;
    }
    
    //Constructors
    //Empty
    public Child(){
        name = "Sin nombre";
        age = -1;
        listAppointments = null;
        listVaccines = null;
        listGrowth = null;
    }
    //Parametered
    public Child(String aName, LocalDate birthDate) {
        //Obtengo Año Actual
        int year =  LocalDate.now().getYear();
        name = aName;
        age = year - birthDate.getYear();
        listAppointments = new ArrayList <Appointment>();
        listVaccines = new ArrayList <Vaccine>();
        listGrowth = new ArrayList <Growth>();
    }
    @Override
    public String toString(){
        return ("" + this.getName());
        
    }

}
