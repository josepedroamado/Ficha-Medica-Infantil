package Logic;

//Clase Vacuna, contienen todos los datos pertinentes a la misma
public class Vaccine {
    //Attributes
    private String name;
    private boolean mandatory;
    private boolean received;
    private int receivedDate;
    private int expirationDate;
    private int reminder;
    
    //Getters and Setters
    //Name
    public String getNombre() {
        return name;
    }
    public void setNombre(String nombre) {
        name = nombre;
    }
    //Mandatory (Obligatoria)
    public boolean getMandatory() {
        return mandatory;
    }
    public void setObligatoria(boolean obligatoria) {
        mandatory = obligatoria;
    }
    //Received
    public boolean getReceived() {
        return received;
    }
    public void setReceived(boolean dada) {
        received = dada;
    }
    //ReceivedDate
    public int getReceivedDate() {
        return receivedDate;
    }
    public void setReceivedDate(int fechaDada) {
        receivedDate = fechaDada;
    }
    //ExpirationDate
    public int getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(int fechaVencimiento) {
        expirationDate = fechaVencimiento;
    }
    //Reminder
    public int getReminder() {
        return reminder;
    }
    public void setReminder(int recordatorio) {
        this.reminder = recordatorio;
    }
    
    //Constructors
    //Empty
    public Vaccine(){
        name = "Sin Nombre";
        mandatory = false;
        received = false;
        receivedDate = 0;
        expirationDate = 0;
        reminder = 0;
    }
    //Parametered
    public Vaccine(String nombre, boolean obligatoria, boolean dada, int fechaDada, int fechaVencimiento, int recordatorio) {
        name = nombre;
        mandatory = obligatoria;
        received = dada;
        receivedDate = fechaDada;
        expirationDate = fechaVencimiento;
        reminder = recordatorio;
    }
    
    
}
