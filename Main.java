public class Main{
    public static void main(String[] args) {
        
        Persona p = new Persona();
        p.setEdad(20);
        p.setNombre("Kevin");
        p.setTelefono(991713814);

        System.out.println("Lo que hay en el objeto Persona es: ");
        System.out.println(p.getEdad());
        System.out.println(p.getNombre());
        System.out.println(p.getTelefono());
    }
}