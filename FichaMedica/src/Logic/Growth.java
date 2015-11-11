package Logic;
import java.io.Serializable;
import java.time.LocalDate;

//Clase de Crecimientos de un hijo
public class Growth implements Serializable{
    //Attributes
    private int age;
    private float height;
    private float weight;
    private float cranialPerimeter;
     
    //Getters and Setters
    //Age
    public int getAge() {
        return age;
    }
    public void setAge(int edad) {
        age = edad;
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
        age = 0;
        height = 0;
        weight = 0;
        cranialPerimeter = 0;
        
    }
    //Parametered
    public Growth(Child hijo, float altura, float peso, float perimetroCraneal) {
        age = LocalDate.now().getYear()-hijo.getBirthDate().getYear();
        height = altura;
        weight = peso;
        cranialPerimeter = perimetroCraneal;
    }
    
    
}
