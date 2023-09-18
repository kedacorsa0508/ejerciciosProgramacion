import java.util.Scanner;
/**
* Esta clase define objetos de tipo Automóvil con una marca, modelo,
* motor, tipo de combustible, tipo de automóvil, número de puertas,
* cantidad de asientos, velocidad máxima, color y velocidad actual.
* @version 1.2/2020
*/
public class Automovil {
    // Atributo que define la marca de un automóvil
    String marca;
    // Atributo que define el modelo de un automóvil
    int modelo;
    // Atributo que define el motor de un automóvil
    int motor;
    // Tipo de combustible como un valor enumerado
    enum tipoCom {GASOLINA, BIOETANOL, DIESEL, BIODISESEL,
    GAS_NATURAL}
    // Atributo que define el tipo de combustible
    tipoCom tipoCombustible;
    // Tipo de automóvil como un valor enumerado
    enum tipoA {CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR,
    EJECUTIVO, SUV}
    // Atributo que define el tipo de automóvil
    tipoA tipoAutomovil;
    
    enum tipoM {MANUAL, AUTOMATICO}
    tipoM tipoMarcha;
    // Atributo que define el número de puertas de un automóvil
    int numeroPuertas;
    // Atributo que define la cantidad de asientos de un automóvil
    int cantidadAsientos;
    // Atributo que define la velocidad máxima de un automóvil
    int velocidadMaxima;
    // Color del automóvil como un valor enumerado
    enum tipoColor {BLANCO, NEGRO, ROJO, NARANJA,
    AMARILLO, VERDE, AZUL, VIOLETA}
    // Atributo que define el color de un automóvil
    tipoColor color;
    // Atributo que define la velocidad de un automóvil
    int velocidadActual = 0;
    int cantidadMultas = 0;
    int valorMulta = 0;
    /**
    * Constructor de la clase Automóvil
    * @param marca Parámetro que define la marca de un automóvil
    * @param modelo Parámetro que define el modelo (año de
    *fabricación) de un automóvil
    * @param motor Parámetro que define el volumen del cilindraje del
    * motor (puede ser gasolina, bioetanol, diésel, biodiesel o gas natural)
    * @param tipoAutomovil Parámetro que define el tipo de automóvil
    * (puede ser Carro de ciudad, Subcompacto, Compacto, Familiar,
    * Ejecutivo o SUV)
    * @param numeroPuertas Parámetro que define el número de
    * puertas de un automóvil
    * @param cantidadAsientos Parámetro que define la cantidad de
    * asientos que tiene el automóvil
    * @param velocidadMaxima Parámetro que define la velocidad
    * máxima permitida al automóvil
    * @param color Parámetro que define el color del automóvil (puede
    * ser Blanco, Negro, Rojo, Naranja, Amarillo, Verde, Azul o Violeta)
    */
    Automovil(String marca, int modelo, int motor, tipoCom tipoCombustible, tipoA tipoAutomovil, tipoM tipoMarcha, int numeroPuertas,  int cantidadAsientos,
     int velocidadMaxima, tipoColor color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.tipoMarcha = tipoMarcha;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
    }
    
   



    public String getMarca() {
        return marca;
    }





    public void setMarca(String marca) {
        this.marca = marca;
    }





    public int getModelo() {
        return modelo;
    }





    public void setModelo(int modelo) {
        this.modelo = modelo;
    }





    public int getMotor() {
        return motor;
    }





    public void setMotor(int motor) {
        this.motor = motor;
    }





    public tipoCom getTipoCombustible() {
        return tipoCombustible;
    }





    public void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }





    public tipoA getTipoAutomovil() {
        return tipoAutomovil;
    }



    public void setTipoAutomovil(tipoA tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }


    public tipoM getTipoMarcha() {
        return tipoMarcha;
    }


    public void setTipoMarcha(tipoM tipoMarcha) {
        this.tipoMarcha = tipoMarcha;
    }


    public int getNumeroPuertas() {
        return numeroPuertas;
    }





    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }





    public int getCantidadAsientos() {
        return cantidadAsientos;
    }





    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }





    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }





    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }





    public tipoColor getColor() {
        return color;
    }





    public void setColor(tipoColor color) {
        this.color = color;
    }





    public int getVelocidadActual() {
        return velocidadActual;
    }





    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }





    /**
    * Método que incrementa la velocidad de un automóvil
    * @param incrementoVelocidad Parámetro que define la cantidad a
    * incrementar en la velocidad actual de un automóvil
    */
    void acelerar(int incrementoVelocidad, Automovil automovil) {
        if (velocidadActual + incrementoVelocidad < velocidadMaxima) {
        /* Si el incremento de velocidad no supera la velocidad máxima */
        velocidadActual = velocidadActual + incrementoVelocidad;
    } else { /* De otra manera no se puede incrementar la velocidad y
    se genera mensaje */
            automovil.valorMulta += 500000; 
            automovil.cantidadMultas++;
            System.out.println("Se supero el limite de velocidad, se ha generado una multa: "+ automovil.valorMulta);
        }
    }
    /**
    * Método que decrementa la velocidad de un automóvil
    * @param marca Parámetro que define la cantidad a decrementar en
    * la velocidad actual de un automovil
    */

    void desacelerar(int decrementoVelocidad) {
    /* La velocidad actual no se puede decrementar alcanzando un
    valor negativo */
    if ((velocidadActual - decrementoVelocidad) > 0) {
        velocidadActual = velocidadActual - decrementoVelocidad;
    } else { /* De otra manera no se puede decrementar la velocidad y
    se genera mensaje */
        System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }
    /**
    * Método que coloca la velocidad actual de un automóvil en cero
    */
    void frenar() {
        velocidadActual = 0;
    }
    /**
    * Método que calcula el tiempo que tarda un automóvil en recorrer
    * cierta distancia
    * @param distancia Parámetro que define la distancia a recorrer por
    * el automóvil (en kilómetros)
    */
    double calcularTiempoLlegada(int distancia) {
        return distancia/velocidadActual;
    }
    /**
    * Método que imprime en pantalla los valores de los atributos de un
    automóvil
    */
    void imprimir() {
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor);
        System.out.println("Tipo de combustible = " + tipoCombustible);
        System.out.println("Tipo de automóvil = " + tipoAutomovil);
        System.out.println("Número de puertas = " + numeroPuertas);
        System.out.println("Cantidad de asientos = " + cantidadAsientos);
        System.out.println("Velocida máxima = " + velocidadMaxima);
        System.out.println("Color = " + color);
    }

    void imprimirMultas(){
        System.out.println("La cantidad de multas que tiene son: "+cantidadMultas);
        System.out.println("El valor total de las multas es: "+valorMulta);
    }

    /**
    * Método main que crea un automóvil, imprime sus datos en
    * pantalla y realiza varios cambios en su velocidad
    */
    public static void main(String args[]) {
        
        Automovil auto1 = new Automovil("Ford",2018,3,tipoCom.DIESEL,tipoA.EJECUTIVO , tipoM.AUTOMATICO,5,6,250,tipoColor.NEGRO);
        // Preguntar desde consolo Marca
        Scanner lectura = new Scanner(System.in);
        String marca1 = lectura.next();

        
        
        auto1.imprimir();
        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.acelerar(200, auto1);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.desacelerar(50);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.frenar();
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.desacelerar(20);
        auto1.imprimirMultas();
    }


  
}
