package Logic;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

//Clase de hijo, contiene todos los datos realacionados al mismo
public class Child implements Serializable{
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
        birthDate = null;
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
    
     //Methods
    //Agregar Consulta
    public void addAppointment(String nota, LocalDate fecha){
        if (this.addAppointmentCheck(nota, fecha)) {
            Appointment consulta = new Appointment (nota, fecha);
            listAppointments.add(consulta);
        }
    }
    //Agregar Consulta - Check de datos correctos
    public boolean addAppointmentCheck(String nota, LocalDate fecha){
        boolean correct = false;
        if (!nota.isEmpty()) {
            if (fecha != null) {             
                correct = true;                        
            }
        }
        return correct;
    }
    
    //Agregar Crecimiento
    public void addGrowth(LocalDate fecha, int altura, int peso, int perimetroCraneal){
        if (this.addGrowthCheck(fecha, altura, peso, perimetroCraneal)) {
            Growth crecimiento = new Growth(fecha, altura, peso, perimetroCraneal);
            listGrowth.add(crecimiento);
        }
    }
    //Agregar Crecimiento - Check de datos correctos
    public boolean addGrowthCheck(LocalDate fecha, int altura, int peso, int perimetroCraneal){
        boolean correct = false; 
        if (altura < 0 && peso < 0 && perimetroCraneal < 0) {
            if (fecha != null) {
                correct = true;              
            }                 
        }                  
        return correct;
    }
    
    //Agregar Vacuna
    
    //Agregar Vacuna - Check de Vacuna
    
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
