package Logic;

//Clase de las consultas de los niños
public class Appointment {
    
    //Attributes
    private boolean reminders;
    private String note;
    private int nextAppointment;
    private boolean attended;

    //Getters and Setters
    //Reminders
    public boolean getReminders() {
        return reminders;
    }
    public void setReminders(boolean recordatorios) {
        reminders = recordatorios;
    }
    //Note
    public String getNote() {
        return note;
    }
    public void setNote(String nota) {
        note = nota;
    }
    //NextAppointment
    public int getNextAppointment() {
        return nextAppointment;
    }
    public void setNextAppointment(int proxConsulta) {
        nextAppointment = proxConsulta;
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
        reminders = false;
        note = "Sin Nota";
        nextAppointment = 0;
        attended = false;
    }
    //Parametered
    public Appointment(boolean recordatorios, String nota, int proxConsulta, boolean realizada) {
        reminders = recordatorios;
        note = nota;
        nextAppointment = proxConsulta;
        attended = realizada;
    }
    
}
