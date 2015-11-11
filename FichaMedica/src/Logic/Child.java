package Logic;
import java.time.LocalDate;
import java.util.ArrayList;

//Clase de hijo, contiene todos los datos realacionados al mismo
public class Child {
    //Attributes
    private String name;
    private LocalDate birthDate;
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
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate date) {
        birthDate = date;
    }
    //ListAppointments
    public ArrayList<Appointment> getListAppointments() {
        return listAppointments;
    }
    //ListVaccines
    public ArrayList<Vaccine> getListVaccines() {
        return listVaccines;
    }
    //ListGrowth
    public ArrayList<Growth> getListGrowth() {
        return listGrowth;
    } 
    
    //Constructors
    //Empty
    public Child(){
        name = "Sin nombre";
        birthDate = LocalDate.parse("0000-00-00");
        listAppointments = null;
        listVaccines = null;
        listGrowth = null;
    }
    //Parametered
    public Child(String aName, LocalDate birth) {
        name = aName;
        birthDate = birth;
        listAppointments = new ArrayList <Appointment>();
        listVaccines = new ArrayList <Vaccine>();
        listGrowth = new ArrayList <Growth>();
    }
    @Override
    public String toString(){
        return ("" + this.getName());       
    }
    @Override
    public boolean equals(Object o){
        boolean iguales = false;
        if (this.getName().equals(((Child)o).getName())) {
            if (this.getBirthDate().equals(((Child)o).getBirthDate())) {
                iguales = true;
            }
        }      
        return iguales;
    }

}
