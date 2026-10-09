package Mascota;

public class Mascota {
    private String nombre;
    private String especie;
    private String size;
    private int edad;
    private boolean disponible;

    public void setNombre(String nombre){
        if (nombre != null && !nombre.isBlank())
            this.nombre=nombre;
    }
    public void setEspecie(String especie){
        if (especie != null && !especie.isBlank())
            this.especie=especie;
    }
    public void setSize(String size){
        if (size != null && !size.isBlank())
            this.size=size;
    }
    public void setEdad(int edad){
        if (edad >= 0)
            this.edad=edad;
    }
    public void setDisponible(boolean disponible){
        this.disponible=disponible;
    }

    public String getNombre() {
        return nombre;
    }
    public String getEspecie() {
        return especie;
    }
    public String getSize() {
        return size;
    }
    public int getEdad() {
        return edad;
    }
    public boolean isDisponible() {
        return disponible;
    }

    public void mostrarPerfil(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Especie: "+getEspecie());
        System.out.println("Tamaño: "+getSize());
        System.out.println("Edad: "+getEdad());
        System.out.println("Disponible: "+isDisponible());
    }
}
