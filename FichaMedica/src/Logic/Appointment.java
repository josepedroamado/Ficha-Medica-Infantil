package Logic;

import java.util.*;
public class Appointment {
    
    private boolean recordatorios;
    private String nota;
    private int proxConsulta;
    private boolean realizada;

    public Appointment(){
        
    }
    public Appointment(boolean recordatorios, String nota, int proxConsulta, boolean realizada) {
        this.recordatorios = recordatorios;
        this.nota = nota;
        this.proxConsulta = proxConsulta;
        this.realizada = realizada;
    }

    public boolean isRecordatorios() {
        return recordatorios;
    }

    public void setRecordatorios(boolean recordatorios) {
        this.recordatorios = recordatorios;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public int getProxConsulta() {
        return proxConsulta;
    }

    public void setProxConsulta(int proxConsulta) {
        this.proxConsulta = proxConsulta;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }
    
    
    
}
