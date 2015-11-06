package Logic;

//Clase de Crecimientos de un hijo
public class Growth {
    //capaz pasar a int
    //Attributes
    private int age;
    private float height;
    private float weight;
    private float cranealPerimeter;

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
    public float getCranealPerimeter() {
        return cranealPerimeter;
    }
    public void setCranealPerimeter(float perimeroCraneal) {
        cranealPerimeter = perimeroCraneal;
    }
    
    //Constructors
    //Empty
    public Growth(){
        age = 0;
        height = 0;
        weight = 0;
        cranealPerimeter = 0;
        
    }
    //Parametered
    public Growth(int edad, float altura, float peso, float perimeroCraneal) {
        age = edad;
        height = altura;
        weight = peso;
        cranealPerimeter = perimeroCraneal;
    }
    
    
}
