public class SwitchNuevo {
    public static void main(String[] args) {
        int dia = 3; 

        String nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4, 5 -> "Jueves o Viernes"; 
            default -> "Día no válido"; 
        };

        System.out.println("Hoy es: " + nombreDia);
    }
}
