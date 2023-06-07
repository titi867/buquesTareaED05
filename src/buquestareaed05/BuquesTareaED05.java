/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buquestareaed05;

import java.util.Scanner;

public class BuquesTareaED05 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        String nombreBuque, duenoBuque, tipoBuque, materialCasco;
        double codigoBuque, tonelajeBuque;
        String nombrePuerto, descripcionPuerto;
        String nombreMar;
        double profundidadMar;
        String continente, pais;
        double latitud, longitud;
        String hora;
        String fecha;

        nombreBuque = teclado.nextLine();
        duenoBuque = teclado.nextLine();
        tipoBuque = teclado.nextLine();
        materialCasco = teclado.nextLine();
        codigoBuque = teclado.nextDouble();
        tonelajeBuque = teclado.nextDouble();
        nombrePuerto = teclado.nextLine();
        descripcionPuerto = teclado.nextLine();
        nombreMar = teclado.nextLine();
        profundidadMar = teclado.nextDouble();
        continente = teclado.nextLine();
        pais = teclado.nextLine();
        latitud = teclado.nextDouble();
        longitud = teclado.nextDouble();
        hora = teclado.nextLine();
        fecha = teclado.nextLine();
    }

    private String nombreBuque;

    public String getNombreBuque() {
        return nombreBuque;
    }

    public void setNombreBuque(String nombreBuque) {
        this.nombreBuque = nombreBuque;

    }

    private double tonelajeBuque;

    public double getTonelajeBuque() {
        return tonelajeBuque;
    }

    public void setTonelajeBuque(double tonelajeBuque) {
        this.tonelajeBuque = tonelajeBuque;
    }

}
