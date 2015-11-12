package Logic;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

//Clase Sistema, contiene todas las listas
public class LogicSystem implements Serializable{
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
    public LogicSystem(){
        listAllAppointments = new ArrayList <Appointment>();
        listAllChildren = new ArrayList <Child>();
        listAllVaccines = new ArrayList <Vaccine>();
    }
    
    //Methods
    //Ingresar Hijo al sistema
    public void ingresarHijo(String name, LocalDate birthDate){
        if (this.ingresarHijoCheck(name, birthDate)) {
            Child h = new Child(name, birthDate);
            this.getListAllChildren().add(h);     
        }          
    }
    //Checkeo de Si Los Datos del hijo son correctos
    public boolean ingresarHijoCheck(String name, LocalDate birthDate){
        boolean hijoCorrecto = false;
        if (!name.isEmpty()) {
            if (birthDate != null) {
                if (birthDate != LocalDate.parse("0000-00-00")) {
                    hijoCorrecto = true;
                }
            }
        }  
        return hijoCorrecto;
    }
    
    public boolean validarNumeros(int variable, int minimo, int maximo){
        boolean valido = false;
        if (variable >= minimo && variable <= maximo) {
            valido = true;
        }
        return valido;
    }
}
