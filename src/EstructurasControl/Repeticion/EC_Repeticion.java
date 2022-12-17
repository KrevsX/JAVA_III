package EstructurasControl.Repeticion;

public class EC_Repeticion {
    public static void main(String[] args) {
        FOR();
        FOREACH();
        WHILE();
    }

    public static void FOR() {
        for (int i = 0; i < 10; i++) {
            System.out.println("El valor de i es: " + i);

        }
        String[] nombre = {"Pepe", "Juanito", "Roberto"};
        for (int i = 0; i < nombre.length; i++) {
            System.out.println(nombre[2]);
        }

        int suma = 0;
        int[] numeros = {4, 5, 8};
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
            suma += numeros[i];
        }
    }

    public static void FOREACH() {
        String[] nombres = {"Pepe", "Juanito", "Roberto"};

        for (String nombre : nombres) {

        }
        int[] numeros = {100, 150, 200};

        int suma = 0;
        for (int numero : numeros) {
            suma += numero;


        }
        System.out.println(suma);
    }

    public static void WHILE() {

        int contador = 0;

        while (contador < 20) {
            contador++;
            if (contador == 5) {
                //                break;
                continue;
            }
            System.out.println("Holaaa EC_While:..." + contador);
        }
    }
}
