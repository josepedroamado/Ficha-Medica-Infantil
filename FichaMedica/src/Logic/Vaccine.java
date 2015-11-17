package Logic;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

//Clase Vacuna, contienen todos los datos pertinentes a la misma
public class Vaccine implements Serializable{
    //Attributes
    private String name;
    private boolean mandatory;
    private LocalDate receivedDate;
    private ArrayList<LocalDate> expirationMonths;
    
    //Getters and Setters
    //Name
    public String getName() {
        return name;
    }
    public void setName(String nombre) {
        name = nombre;
    }
    //Mandatory (Obligatoria)
    public boolean getMandatory() {
        return mandatory;
    }
    public void setObligatoria(boolean obligatoria) {
        mandatory = obligatoria;
    }
    //ReceivedDate
    public LocalDate getReceivedDate() {
        return receivedDate;
    }
    public void setReceivedDate(LocalDate fechaDada) {
        receivedDate = fechaDada;
    }
    //Expiration Months
    public ArrayList<LocalDate> getExpirationMonths(){
        return expirationMonths;
    }
  
    //Constructors
    //Empty
    public Vaccine(){
        name = "Sin Nombre";
        mandatory = false;
        receivedDate = null;
        expirationMonths = null;
    }
    //Parametered
    public Vaccine(String nombre, boolean obligatoria, int[]vencimientos, LocalDate fechaDada) {
        name = nombre;
        mandatory = obligatoria;
        receivedDate = fechaDada;
        expirationMonths = new ArrayList<LocalDate>();
        for (int i = 0; i < vencimientos.length-1; i++) {
            int mesesProxDosis = vencimientos[i];
            if (fechaDada != null) {
                if (mesesProxDosis == 0) {
                    expirationMonths.add(fechaDada);
                    System.out.println("era 0");
                }
                else{
                    LocalDate nextDosis = fechaDada.plus(Period.ofMonths(mesesProxDosis));
                    expirationMonths.add(nextDosis);
                }
                
            }
                                
        }
    }
    
       @Override
        public String toString(){
            return ("" + this.getName());       
        }
    
    @Override
    public boolean equals(Object o){
        boolean iguales = false;
        if (this.getName().equals(((Vaccine)o).getName())) {
            iguales = true;
        }      
        return iguales;
    }
}
