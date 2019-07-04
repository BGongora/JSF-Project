/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Me
 */
@Named(value = "miCalculadora")
@SessionScoped
public class MiCalculadora implements Serializable{

    /**
     * Creates a new instance of MiCalculadora
     */
    private double numero1;
    private double numero2;
    private double numero3;
    private double resultado;
    private List<Double> resultados;
    
    public MiCalculadora() {
        resultados = new ArrayList<>();
    }

    public List<Double> getResultados() {
        return resultados;
    }

    public void setResultados(List<Double> resultados) {
        this.resultados = resultados;
    }
    
    

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero3() {
        return numero3;
    }

    public void setNumero3(double numero3) {
        this.numero3 = numero3;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public String sumar(){
        resultado = numero1 + numero2;
        resultados.add(resultado);
        return "";
    }
    
    public String restar(){
        resultado = numero1 - numero2;
        resultados.add(resultado);
        return "";
    }
    
    public String multiplicar(){
        resultado =  numero1 * numero2;
        resultados.add(resultado);
        return "";
    }
    
    public String dividir(){
        resultado = numero1 / numero2;
        resultados.add(resultado);
        return "";
    }
    
    public String limpiar(){
        resultados.clear();
        return "";
    }
    
    public void eliminarPares(){
        resultados.removeIf(new Predicate<Double>(){
            @Override
            public boolean test(Double t){
                return t.intValue() %2 == 0;
            }
        });
    }
    
    public void eliminaImpares(){
        resultados.removeIf(new Predicate<Double>(){
            @Override
            public boolean test(Double t){
                return t.intValue() %2 == 1;
            }
        });
    }
    
}
