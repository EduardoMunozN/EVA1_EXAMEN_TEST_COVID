/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_examen_test_covid;

/**
 *
 * @author eduar
 */
public class EVA1_EXAMEN_TEST_COVID {

    public static void main(String[] args) {
        testCovid persona = new testCovid(18, 75, 1.80, false);
        persona.imprimirDatos();
        
        String riesgo = persona.calcularPersonaRiesgo();
        System.out.println("La persona es: "+riesgo);
        }    
    }
    class testCovid{
        int edad;
        double peso;
        double estatura;
        boolean enfermedadC;
        
    public testCovid(int age, double weight, double heigth, boolean disease){
        edad = age;
        peso = weight;
        estatura = heigth;
        enfermedadC = disease;
        
    } 
    public int getEdad (){
        return edad;
    }public void setEdad(int valor){
        edad = valor;
    }
    public double getPeso (){
        return peso;
    }
    public void setPeso (double valor){
        peso = valor;
    }
    public double getEstatura (){
        return estatura;
    }
    public void setEstatura (double valor){
        estatura = valor;
    }
    public boolean getEnfermedad (){
        return enfermedadC;
    }
    public void setEnfermedad(boolean valor){
        enfermedadC = valor;
    }
    
    public String calcularPersonaRiesgo(){
        double imc = calcularIMC();
        String resultado;
        if(edad > 65 && imc > 30 && enfermedadC == true){
            resultado = "PERSONA CON RIESGO";
        }else{
            resultado = "PERSONA SIN RIESGO";
        }
        return resultado;
    }
    public void imprimirDatos(){
        System.out.println("Datos Almacenados");
        System.out.println("La edad de la persona es: "+edad);
        System.out.println("El peso de la persona es: "+peso);
        System.out.println("La estatura de la persona es de: "+estatura);
    }
    private double calcularIMC() {
        return peso / (estatura * estatura);
    }
}


   
        
    


