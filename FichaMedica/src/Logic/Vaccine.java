package Logic;

import java.util.*;
public class Vaccine {
    
    private String nombre;
    private boolean obligatoria;
    private boolean dada;
    private int fechaDada;
    private int fechaVencimiento;
    private int recordatorio;

    public Vaccine(){
        
    }
    public Vaccine(String nombre, boolean obligatoria, boolean dada, int fechaDada, int fechaVencimiento, int recordatorio) {
        this.nombre = nombre;
        this.obligatoria = obligatoria;
        this.dada = dada;
        this.fechaDada = fechaDada;
        this.fechaVencimiento = fechaVencimiento;
        this.recordatorio = recordatorio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isObligatoria() {
        return obligatoria;
    }

    public void setObligatoria(boolean obligatoria) {
        this.obligatoria = obligatoria;
    }

    public boolean isDada() {
        return dada;
    }

    public void setDada(boolean dada) {
        this.dada = dada;
    }

    public int getFechaDada() {
        return fechaDada;
    }

    public void setFechaDada(int fechaDada) {
        this.fechaDada = fechaDada;
    }

    public int getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(int fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getRecordatorio() {
        return recordatorio;
    }

    public void setRecordatorio(int recordatorio) {
        this.recordatorio = recordatorio;
    }
    
    
    
}
