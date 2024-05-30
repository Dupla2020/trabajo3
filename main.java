public class main {
    public static void main(String[] args) {
        // Ejemplo de uso de las funciones
        System.out.println(compararNumeros(10, 5));
        System.out.println(decidirAprobacion(3.7));
        System.out.println(calcularPrecioFinal(55000));
        System.out.println(calcularAreaFigura(1, 5, 0, 0));
        System.out.println(calcularAreaFigura(2, 10, 8, 0));
        System.out.println(calcularAreaFigura(3, 0, 0, 3));
        System.out.println(encontrarMenor(10, 5, 7));
        System.out.println(encontrarMenor(2, 12, 1));
        System.out.println(encontrarMenor(2, 8, 4));
    }

    // 1. Comparar dos números y devolver un mensaje indicando cuál es mayor o si son iguales.
    static String compararNumeros(double num1, double num2) {
        if (num1 > num2) {
            return "El número mayor es: " + num1;
        } else if (num2 > num1) {
            return "El número mayor es: " + num2;
        } else {
            return "Los dos números son iguales.";
        }
    }

    // 2. Determinar si un estudiante ha aprobado o reprobado un examen en función de su nota.
    static String decidirAprobacion(double calificacion) {
        if (calificacion < 3.5) {
            return "Lo siento, usted ha reprobado el examen.";
        } else {
            return "¡Felicidades! Usted ha aprobado el examen.";
        }
    }

    // 3. Calcular el precio final tras aplicar un descuento del 10% si el precio original es igual o superior a 50000.
    static double calcularPrecioFinal(double precioOriginal) {
        if (precioOriginal >= 50000) {
            return precioOriginal * 0.9;
        } else {
            return precioOriginal;
        }
    }

    // 4. Calcular el área de un cuadrado, triángulo o círculo según el tipo de figura ingresada y las dimensiones correspondientes.
    static double calcularAreaFigura(int tipoFigura, double ladoCuadrado, double baseTriangulo, double radioCirculo) {
        switch (tipoFigura) {
            case 1:
                return ladoCuadrado * ladoCuadrado; // Área del cuadrado
            case 2:
                return (baseTriangulo * radioCirculo) / 2; // Área del triángulo
            case 3:
                return Math.PI * radioCirculo * radioCirculo; // Área del círculo
            default:
                System.out.println("Tipo de figura no válida.");
                return -1; // Tipo de figura no válida
        }
    }

    // 5. Devolver el menor de tres enteros dados.
    static int encontrarMenor(int num1, int num2, int num3) {
        int menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }
        return menor;
    }
}
