public class SwitchViejo {
    public static void main(String[] args) {
        int dia = 3; // Cambia este valor para probar

        String nombreDia = ""; // Se debe inicializar fuera del switch

        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
            case 5:
                nombreDia = "Jueves o Viernes"; // Agrupación manual de casos
                break;
            default:
                nombreDia = "Día no válido"; // Obligatorio para manejar valores inesperados
                break;
        }

        System.out.println("Hoy es: " + nombreDia);
    }
}