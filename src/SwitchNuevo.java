public class SwitchNuevo {
    public static void main(String[] args) {
        int dia = 3; // Cambia este valor a otros números para probar

        String nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4, 5 -> "Jueves o Viernes"; // Múltiples valores en una línea
            default -> "Día no válido"; // Siempre debe haber un 'default'
        };

        System.out.println("Hoy es: " + nombreDia);
    }
}