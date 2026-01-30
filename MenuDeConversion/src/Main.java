import java.util.Scanner;
public class Main {
    public static double celsius=0;
    public static double farenheit=0;
    public static int conteoDeConversiones=0;
    public static double kilometros=0;
    public static double millas=0;
    public static double numeroConversionKmaMi=0.6214;
    public static double numeroConversionMiaKm=1.609344;
    public static int opcion=0;
    public static int conteoTotal=0;
    public static int conteoDeInvalidos=0;
    public static int celsiusFarenheit=0;
    public static int farenheitCelsius=0;
    public static int kmAmillas=0;
    public static int millasAkm=0;
    public static void main (String[] args) throws Exception{
        Scanner sc = new Scanner (System.in);

        do {
            System.out.println("Bienvenido al Menu de conversiones, en este menu podras convertir: \n1. °C a °F\n2. °F a °C\n3. Km a Millas\n4. Millas a Km\n5. Salir");
            opcion=validarNumero(sc);
            switch(opcion){
                case 1:
                    System.out.println("Elegiste opcion 1 (C a F) \n Para comenzar, digita los grados Celsius:");
                    celsius=sc.nextDouble();
                    farenheit= (celsius * 9/5) + 32;
                    System.out.println("Los grados ingresados en Celsius, convertidos a Farenheit son: "+farenheit);
                    conteoDeConversiones=conteoDeConversiones+1;
                    conteoTotal++;
                    celsiusFarenheit++;
                    break;
                case 2:
                    System.out.println("Elegiste opcion 2 (F a C) \n Para comenzar, digita los grados en Farenheit:");
                    farenheit=sc.nextDouble();
                    celsius= (farenheit - 32) * 5/9;
                    System.out.println("Los grados ingresados en Farenheit, convertidos a Celsius son: "+celsius);
                    conteoDeConversiones=conteoDeConversiones+1;
                    conteoTotal++;
                    farenheitCelsius++;
                    break;
                case 3:
                    System.out.println("Elegiste opcion 3 (Km a Millas) \n Para comenzar, digita los Kilometros a convertir:");
                    kilometros=sc.nextDouble();
                    millas=kilometros*numeroConversionKmaMi;
                    System.out.println("Los kilometros ingresados convertidos a Millas son: "+millas);
                    conteoDeConversiones=conteoDeConversiones+1;
                    conteoTotal++;
                    kmAmillas++;
                    break;
                case 4:
                    System.out.println("Elegiste opcion 4 (Millas a Km) \n Para comenzar, digita las millas a convertir:");
                    millas=sc.nextDouble();
                    kilometros=millas*numeroConversionMiaKm;
                    System.out.println("Las millas ingresadas convertidas a Kilometros son: "+kilometros);
                    conteoDeConversiones=conteoDeConversiones+1;
                    conteoTotal++;
                    millasAkm++;
                    break;
                case 5:
                    System.out.println("Elegiste opcion 5 (Salir)");
                    System.out.println("--------------------Resumen------------------");
                    System.out.println("Se ejecutaron "+ conteoTotal+ " conversiones con este programa ");
                    System.out.println("Y se ingresaron "+conteoDeInvalidos+" opciones incorrectas");
                    System.out.println("C a F: "+celsiusFarenheit);
                    System.out.println("F a C: "+farenheitCelsius);
                    System.out.println("Km a Millas: "+kmAmillas);
                    System.out.println("Millas a Km: "+millasAkm);
                    System.out.println("---------------------------------------------");
                    break;
                default:

                    break;
            }

        }while(opcion!=5);
    }
    public static int validarNumero(Scanner sc){
        if(sc.hasNextInt()){
            int opcion = sc.nextInt();
            if(opcion > 0 && opcion <= 5){
                return opcion;
            } else {
                System.out.println("Opción fuera de rango");
                conteoDeInvalidos++;
            }
        } else {
            System.out.println("El dato ingresado no es numérico");
            sc.next(); // limpiar buffer
        }
        return 0;
    }

}
