package Logic;

import java.util.*;
public class Growth {
    
    //capas pasar a int
    private int edad;
    private float altura;
    private float peso;
    private float perimeroCraneal;

    public Growth(){
        
    }
    public Growth(int edad, float altura, float peso, float perimeroCraneal) {
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.perimeroCraneal = perimeroCraneal;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPerimeroCraneal() {
        return perimeroCraneal;
    }

    public void setPerimeroCraneal(float perimeroCraneal) {
        this.perimeroCraneal = perimeroCraneal;
    }
    
    
    
}
