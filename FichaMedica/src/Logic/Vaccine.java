package Logic;
import java.io.Serializable;
import java.time.LocalDate;

//Clase Vacuna, contienen todos los datos pertinentes a la misma
public class Vaccine implements Serializable{
    //Attributes
    private String name;
    private boolean mandatory;
    private LocalDate receivedDate;
    private LocalDate expirationDate;
    
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
    //ExpirationDate
    public LocalDate getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(LocalDate fechaVencimiento) {
        expirationDate = fechaVencimiento;
    }

    //Constructors
    //Empty
    public Vaccine(){
        name = "Sin Nombre";
        mandatory = false;
        receivedDate = null;
        expirationDate = null;
    }
    //Parametered
    public Vaccine(String nombre, boolean obligatoria, LocalDate fechaDada, LocalDate fechaVencimiento) {
        name = nombre;
        mandatory = obligatoria;
        receivedDate = fechaDada;
        expirationDate = fechaVencimiento;
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
