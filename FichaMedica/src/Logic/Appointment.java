package Logic;

//Clase de las consultas de los niños
public class Appointment {
    //Attributes
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
    
    //Constructors
    //Empty
    public Appointment(){
        note = "Sin Nota";
        attended = false;
    }
    //Parametered
    public Appointment(String nota, boolean realizada) {
        note = nota;
        attended = realizada;
    }
    
}
