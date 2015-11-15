package Logic;
import java.io.Serializable;
import java.time.LocalDate;

//Clase de Crecimientos de un hijo
public class Growth implements Serializable{
    //Attributes
    private LocalDate date;
    private int height;
    private int weight;
    private int cranialPerimeter;
     
    //Getters and Setters
    //Age
    public LocalDate getDate() {
        return date;
    }
    public void setAge(LocalDate edad) {
        date = edad;
    }
    //Height
    public int getHeight() {
        return height;
    }
    public void setHeight(int altura) {
        height = altura;
    }
    //Weight
    public int getweight() {
        return weight;
    }
    public void setWeight(int peso) {
        weight = peso;
    }
    //CranealPerimeter
    public int getCranialPerimeter() {
        return cranialPerimeter;
    }
    public void setCranialPerimeter(int perimetroCraneal) {
        cranialPerimeter = perimetroCraneal;
    }
    
    //Constructors
    //Empty
    public Growth(){
        date = null;
        height = 0;
        weight = 0;
        cranialPerimeter = 0;       
    }
    //Parametered
    public Growth(LocalDate fecha, int altura, int peso, int perimetroCraneal) {
        date = fecha;
        height = altura;
        weight = peso;
        cranialPerimeter = perimetroCraneal;
    }
    
    
}
