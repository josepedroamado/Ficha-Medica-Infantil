package Logic;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

//Clase de hijo, contiene todos los datos realacionados al mismo
public class Child implements Serializable{
    //Attributes
    private String name;
    private LocalDate birthDate;
    private ArrayList<Appointment> listAppointments;
    private ArrayList<Vaccine> listVaccines;
    private ArrayList<Growth> listGrowth;
    
    //Getters and Setter
    //Name
    public String getName() {
        return name;
    }
    public void setName(String nombre) {
        name = nombre;
    }
    //Age
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate date) {
        birthDate = date;
    }
    //ListAppointments
    public ArrayList<Appointment> getListAppointments() {
        return listAppointments;
    }
    //ListVaccines
    public ArrayList<Vaccine> getListVaccines() {
        return listVaccines;
    }
    //ListGrowth
    public ArrayList<Growth> getListGrowth() {
        return listGrowth;
    } 

    //Constructors
    //Empty
    public Child(){
        name = "Sin nombre";
        birthDate = null;
        listAppointments = null;
        listVaccines = null;
        listGrowth = null;
    }
    //Parametered
    public Child(String aName, LocalDate birth) {
        name = aName;
        birthDate = birth;
        listAppointments = new ArrayList <Appointment>();     
        listGrowth = new ArrayList <Growth>();
        int[] vencimientosBCG = {0};
        Vaccine bcg = new Vaccine ("BCG", true, vencimientosBCG, birthDate);
        bcg.setReceivedDate(null);
        int[] vencimientosPentavalente = {2, 4, 6, 12};
        Vaccine pentavalente = new Vaccine ("Pentavalente", true, vencimientosPentavalente, birthDate);
        pentavalente.setReceivedDate(null);
        int[] vencimientosTripleBacteriana = {60};
        Vaccine tripleBacteriana = new Vaccine ("Triple bacteriana", true, vencimientosTripleBacteriana, birthDate);
        tripleBacteriana.setReceivedDate(null);
        int[] vencimientosHepatitisB = {144};
        Vaccine hepatitisB = new Vaccine ("Hepatitis B", true, vencimientosHepatitisB, birthDate);
        hepatitisB.setReceivedDate(null);
        int[] vencimientosPolio = {2, 4, 6, 12};
        Vaccine polio = new Vaccine ("Polio", true, vencimientosPolio, birthDate);
        polio.setReceivedDate(null);
        int[] vencimientosTripleViral = {12, 60};
        Vaccine tripleViral = new Vaccine ("Triple Viral", true, vencimientosTripleViral, birthDate);
        tripleViral.setReceivedDate(null);
        int[] vencimientosVaricela = {12};
        Vaccine varicela = new Vaccine ("Varicela", true, vencimientosVaricela, birthDate);
        varicela.setReceivedDate(null);
        int[] vencimientosDobleBacteriana = {144, 264};
        Vaccine dobleBacteriana = new Vaccine ("Doble Bacteriana", true, vencimientosDobleBacteriana, birthDate);
        dobleBacteriana.setReceivedDate(null);
        listVaccines = new ArrayList <Vaccine>();
        listVaccines.add(bcg);
        listVaccines.add(pentavalente);
        listVaccines.add(tripleBacteriana);
        listVaccines.add(hepatitisB);
        listVaccines.add(polio);
        listVaccines.add(tripleViral);
        listVaccines.add(varicela);
        listVaccines.add(dobleBacteriana);
    }
    
     //Methods
    //Agregar Consulta
    public void addAppointment(String nota, LocalDate fecha){
        if (this.addAppointmentCheck(nota, fecha)) {
            Appointment consulta = new Appointment (nota, fecha);
            listAppointments.add(consulta);
        }
    }
    //Agregar Consulta - Check de datos correctos
    public boolean addAppointmentCheck(String nota, LocalDate fecha){
        boolean correct = false;
        if (!nota.isEmpty()) {
            if (fecha != null) {             
                correct = true;                        
            }
        }
        return correct;
    }
    
    //Agregar Crecimiento
    public void addGrowth(LocalDate fecha, int altura, int peso, int perimetroCraneal){
        if (this.addGrowthCheck(fecha, altura, peso, perimetroCraneal)) {
            Growth crecimiento = new Growth(fecha, altura, peso, perimetroCraneal);
            listGrowth.add(crecimiento);
        }
    }
    //Agregar Crecimiento - Check de datos correctos
    public boolean addGrowthCheck(LocalDate fecha, int altura, int peso, int perimetroCraneal){
        boolean correct = false; 
        if (altura > 0 && peso > 0 && perimetroCraneal > 0 && fecha != null) {
            correct = true;  
        }
        return correct;
    }
    
    //Agregar Vacuna
    public void addReceivedVaccine(Vaccine vacuna, LocalDate fechaDada){
        int indexVacuna = this.getListVaccines().indexOf(vacuna);
        this.getListVaccines().get(indexVacuna).setReceivedDate(fechaDada);
        if (this.getListVaccines().get(indexVacuna).getExpirationMonths() != null) {
            if (!this.getListVaccines().get(indexVacuna).getExpirationMonths().isEmpty()) {
                this.getListVaccines().get(indexVacuna).getExpirationMonths().remove(0);
            }          
        }    
    }
    
    //Cargar Vacunas
    public void cargarArchivo(String ruta){
        try{
            ArchivoLectura read = new ArchivoLectura(ruta);
            while(read.hayMasLineas()){
                String[] readLines = read.linea().split("/");
                String nombre = readLines[0];
                boolean obligatoria = false;
                if (readLines[1].equals("Si")) {
                    obligatoria = true;
                }
                int [] vencimientos = null;
                if (readLines.length > 3) {
                    String[] readNumbers = readLines[2].split(",");
                    for (int i = 0; i < readNumbers.length-1; i++) {
                        vencimientos[i] = Integer.parseInt(readNumbers[i]);
                    }
                }
                Vaccine v = new Vaccine (nombre, obligatoria, vencimientos, null);
                if (this.getListVaccines().contains(v)) {
                    int index = this.getListVaccines().indexOf(v);
                    this.getListVaccines().get(index).setObligatoria(obligatoria);
                }
                else{
                    this.getListVaccines().add(v);
                }                    
            }    
            read.cerrar();
        }catch(FileNotFoundException e){
            System.out.println("not found");
        }
    }
    
    @Override
    public String toString(){
        return ("" + this.getName());       
    }
    
    @Override
    public boolean equals(Object o){
        boolean iguales = false;
        if (this.getName().equals(((Child)o).getName())) {
            if (this.getBirthDate().equals(((Child)o).getBirthDate())) {
                iguales = true;
            }
        }      
        return iguales;
    }
}
