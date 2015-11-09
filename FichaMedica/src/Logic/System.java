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
    //ListAllChildren
    public ArrayList<Child> getListAllChildren() {
        return listAllChildren;
    }
    //ListAllVaccines
    public ArrayList<Vaccine> getListAllVaccines() {
        return listAllVaccines;
    }
    //ListAllGrowth
    public ArrayList<Growth> getListAllGrowth() {
        return listAllGrowth;
    }
    
    //Methods
    //Registrar Hijo al sistema
    public void registerChild(Child h){
        this.getListAllChildren().add(h);
    }
    //Ingresar Hijo al sistema
    public void ingresarHijo(String name, LocalDate birthDate){
        Child h = new Child(name, birthDate);
        this.registerChild(h);
    }
    public void registrarCrecimiento(Growth g){
        this.getListAllGrowth().add(g);
    }
    public static boolean validarNumeros(int variable, int minimo, int maximo){
        boolean valido = false;
        if (variable >= minimo && variable <= maximo) {
            valido = true;
        }
        return valido;
    }
}
