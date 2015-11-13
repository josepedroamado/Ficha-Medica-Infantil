package Logic;
import java.io.Serializable;
import java.time.LocalDate;

//Clase de las consultas de los niños
public class Appointment implements Serializable{
    //Attributes
    private LocalDate appointmentDate;
    private String note;
    private boolean attended;

    //Getters and Setters
    //Note
    public String getNote() {
        return note;
    }
    public void setNote(String nota) {
        note = nota;
    }
    //Attended
    public boolean getAttended() {
        return attended;
    }
    public void setAttended(boolean realizada) {
        attended = realizada;
    }
    //AppointmentDate
    public LocalDate getAppointmentDate(){
        return appointmentDate;
    }
    public void setAppointmentDate(LocalDate fecha){
        appointmentDate = fecha;
    }
    
    //Constructors
    //Empty
    public Appointment(){
        note = "Sin Nota";
        attended = false;
        appointmentDate = null;
    }
    //Parametered
    public Appointment(String nota, LocalDate fecha) {
        note = nota;
        attended = false;
        appointmentDate = fecha;
    }
    
     @Override
    public String toString(){
        return ("" + this.getAppointmentDate());       
    }
    @Override
    public boolean equals(Object o){
        boolean iguales = false;
        if (this.getAppointmentDate().equals(((Appointment)o).getAppointmentDate())) {
            if (this.getNote().equals(((Appointment)o).getNote())) {
                if (this.getAttended() == ((Appointment)o).getAttended()) {
                    iguales = true;
                }         
            }
        }      
        return iguales;
    }
} 
