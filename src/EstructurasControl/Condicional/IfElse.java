package EstructurasControl.Condicional;


public class IfElse {
    public static void main(String[] args) {

        If();
        IfElse();
        IfElseIf();
        Switch();
    }

    public static void If() {

        int edad = 18;
        boolean esMayor = edad >= 18;

        if (esMayor) {
            System.out.println("Es Mayor de Edad....");

        }
        if (edad >= 18) {
            System.out.println("Es Mayor de Edad");
        }
    }

    public static void IfElse() {
        int edad = 19;
        if (edad >= 18) {
            System.out.println("Es Mayor de Edad....");

        } else {
            System.out.println("Es Menor de Edad");
        }
    }

    public static void IfElseIf() {

        String dia = "Lunes";

        //Ejemplo de comparacion
//        boolean resultado = dia.equals("Lunes");
        boolean resultado = dia.equals("Martes");

        //if else if

        if (dia.equals("Lunes")) {
            System.out.println("Animo con la Semana....");

        } else if (dia.equals("Martes")) {
            System.out.println("Dia Martessss....");
        } else if (dia.equals("Miercoles")) {
            System.out.println("Dia Miercoles....");
        } else if (dia.equals("Jueves")) {
            System.out.println("Dia Jueves....");
        } else if (dia.equals("Viernes")) {
            System.out.println("Dia Viernes....");
        } else if (dia.equals("Sabado")) {
            System.out.println("Dia Sabado....");
        } else if (dia.equals("Domingo")) {
            System.out.println("Dia Domingo....");
        } else {
            System.out.println("El dia Introducido no es Valido");
        }
    }

    public static void Switch(){

        String dia = "Domingo";

        switch(dia){
            case "Lunes":
                System.out.println("Hoy es Lunes...");
                break;
            case "Martes":
                    System.out.println("Es Martes");
                break;
            case "Miercoles":
                System.out.println("Es Miercoles");
                break;
            case "Jueves":
                System.out.println("Es Jueves");
                break;
            case "Viernes":
                System.out.println("Es Viernes");
                break;
            case "Sabado":
                System.out.println("Es Sabado");
                break;
            case "Domingo":
                System.out.println("Es Domingo");
                break;

            default:
                System.out.println("Dato Ingresado no Valido");
        }
    }
}
