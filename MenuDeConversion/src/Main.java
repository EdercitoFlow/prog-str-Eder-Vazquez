import java.util.Scanner;
public class Main {
    public static double celsius=0;
    public static double farenheit=0;
    public static int conteoDeConversiones=0;
    public static double kilometros=0;
    public static double millas=0;
    public static double numeroConversionKmaMi=0.6214;
    public static double numeroConversionMiaKm=1.609344;
    public static void main (String[] args) throws Exception{
        Scanner sc = new Scanner (System.in);
        int opcion=0;
        validarNumero(sc , opcion);
        do {
            System.out.println("Bienvenido al Menu de conversiones, en este menu podras convertir: \n°C a °F\n°F a °C\nKm a Millas\nMillas a Km\nSalir");
            opcion=sc.nextInt(); //Se lee opcion de eleccion
            switch(opcion){
                case 1:
                    System.out.println("Elegiste opcion 1 (C a F) \n Para comenzar, digita los grados Celsius:");
                    celsius=sc.nextDouble();
                    farenheit= (celsius * 9/5) + 32;
                    System.out.println("Los grados ingresados en Celsius, convertidos a Farenheit son: "+farenheit);
                    conteoDeConversiones=conteoDeConversiones+1;
                    break;
                case 2:
                    System.out.println("Elegiste opcion 2 (F a C) \n Para comenzar, digita los grados en Farenheit:");
                    farenheit=sc.nextDouble();
                    celsius= (farenheit - 32) * 5/9;
                    System.out.println("Los grados ingresados en Farenheit, convertidos a Celsius son: "+celsius);
                    conteoDeConversiones=conteoDeConversiones+1;
                    break;
                case 3:
                    System.out.println("Elegiste opcion 3 (Km a Millas) \n Para comenzar, digita los Kilometros a convertir:");
                    kilometros=sc.nextDouble();
                    millas=kilometros*numeroConversionKmaMi;
                    System.out.println("Los kilometros ingresados convertidos a Millas son: "+millas);
                    conteoDeConversiones=conteoDeConversiones+1;
                    break;
                case 4:
                    System.out.println("Elegiste opcion 4 (Millas a Km) \n Para comenzar, digita las millas a convertir:");
                    millas=sc.nextDouble();
                    kilometros=millas*numeroConversionMiaKm;
                    System.out.println("Las millas ingresadas convertidas a Kilometros son: "+kilometros);
                    conteoDeConversiones=conteoDeConversiones+1;
                    break;
                case 5:
                    System.out.println("Elegiste opcion 5 (Salir)");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        }while(opcion==5);
    }
    public static double validarNumero(Scanner sc,int opcion){
       if(sc.hasNextInt()){
           opcion = sc.nextInt();
           if(opcion>0 && opcion <=5){
               return opcion;
           }else{
               System.out.println("El dato ingresado no es numerico");
                sc.next();
           }
       }
       return 0;
    }
}