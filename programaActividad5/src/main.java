import java.io.*;
public class main {
    public static void main(String[] args) throws IOException{
        //Esto de BufferedReader sirve para que se pueda introducir texto
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        //Variables
        float x = 0;
        float y = 0;
        String respuesta = "a";
        System.out.println("Sistema de calculadora para actividad 5");
        //Marcar el valor de x
        do {
            System.out.print("Escriba aqui el primer numero: ");
            //Para escribir la respuesta
            respuesta = entrada.readLine();
            //Si la respuesta esta vacia, mostrar mensaje
            if (respuesta.isEmpty()){
                System.out.println("Introdusca un numero");
            //Si tiene un valor, entonces marcar el primer numero
            }else{
                x = Float.parseFloat(respuesta);
            }
        } while (respuesta.isEmpty());
        //Marcar el valor de y
        //Hacer lo mismo que con X
        do {
            System.out.print("Escriba aqui el segundo numero: ");
            respuesta = entrada.readLine();
            if (respuesta.isEmpty()){
                System.out.println("Introdusca un numero");
            }else{
                y = Float.parseFloat(respuesta);
            }
        } while (respuesta.isEmpty());
        //Ahora mostrar los resultados
        System.out.println("Estos son los resultados; ("+x+", "+y+")");
        System.out.println("Suma:");
        System.out.println(x + " + "+ y + " = "+suma(x,y));
        System.out.println("Resta:");
        System.out.println(x + " - "+ y + " = "+resta(x,y));
        System.out.println(y + " - "+ x + " = "+restaInversa(x,y));
        System.out.println("Multiplicacion:");
        System.out.println(x + " * "+ y + " = "+multiplicacion(x,y));
        System.out.println("Division:");
        System.out.println(x + " / "+ y + " = "+division(x,y));
        System.out.println(y + " / "+ x + " = "+divisionInversa(x,y));
        System.out.println("NOTA: Se hizo restas y divisiones normales e inversas");
        //Despedida
        System.out.print("Gracias por usar el programa, presione Enter para salir");
        //Esto sirve para que el programa espere a que el usuario pulse enter para terminar
        entrada.readLine();
    }
    //Suma
    public static float suma(float x, float y) {
        float resultado;
        resultado = x + y;
        return resultado;
    }
    //Resta
    private static float resta(float x, float y){
        float resultado;
        resultado = x - y;
        return resultado;
    }
    //Resta inversa
    private static float restaInversa(float x, float y){
        float resultado;
        resultado = y - x;
        return resultado;
    }
    //Multiplicacion
    private static float multiplicacion(float x, float y){
        float resultado;
        resultado = x * y;
        return resultado;
    }
    //Division
    private static float division(float x, float y){
        float resultado;
        resultado = x / y;
        return resultado;
    }
    //Division inversa
    private static float divisionInversa(float x, float y){
        float resultado;
        resultado = y / x;
        return resultado;
    }
}
