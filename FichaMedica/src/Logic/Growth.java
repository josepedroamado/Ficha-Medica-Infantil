package Logic;
import java.io.Serializable;
import java.time.LocalDate;

//Clase de Crecimientos de un hijo
public class Growth implements Serializable{
    //Attributes
    private LocalDate date;
    private float height;
    private float weight;
    private float cranialPerimeter;
     
    //Getters and Setters
    //Age
    public LocalDate getDate() {
        return date;
    }
    public void setAge(LocalDate edad) {
        date = edad;
    }
    //Height
    public float getHeight() {
        return height;
    }
    public void setHeight(float altura) {
        height = altura;
    }
    //Weight
    public float getweight() {
        return weight;
    }
    public void setWeight(float peso) {
        weight = peso;
    }
    //CranealPerimeter
    public float getCranialPerimeter() {
        return cranialPerimeter;
    }
    public void setCranialPerimeter(float perimetroCraneal) {
        cranialPerimeter = perimetroCraneal;
    }
    
    //Constructors
    //Empty
    public Growth(){
        date = LocalDate.parse("0000-00-00");
        height = 0;
        weight = 0;
        cranialPerimeter = 0;
        
    }
    //Parametered
    public Growth(LocalDate fecha, float altura, float peso, float perimetroCraneal) {
        date = fecha;
        height = altura;
        weight = peso;
        cranialPerimeter = perimetroCraneal;
    }
    
    
}
