
public class OperacionesDeTemperatura {
    private double Valor, resultado;
    private int t1, t2;

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public int getT1() {
        return t1;
    }

    public void setT1(int t1) {
        this.t1 = t1;
    }

    public int getT2() {
        return t2;
    }

    public void setT2(int t2) {
        this.t2 = t2;
    }
    
    public double convetirT(){
        
        if (t1 == 0 && t2 == 0)// caso inexistente
            resultado = Valor;
         
        if (t1 == 0 && t2 == 1) // de celsius a fahrenheit 
            resultado = (Valor * 1.8) + 32;
        
        if (t1 == 0 && t2 == 2) // de celsius a kelvin
            resultado = Valor + 273.15;
        
        if (t1 == 1 && t2 == 0) // de fahrenheit a celsius
            resultado = ((Valor - 32) * 0.5555555556);
        
        if (t1 == 1 && t2 == 1) // de fahrenheit a fahrenheit (caso inexistente)
            resultado = Valor;
        
        if (t1 == 1 && t2 == 2)// de fahrenheit a kelvin
            resultado = ((Valor - 32 ) * 0.5555555556) + 273.15; 
        
        if ( t1 == 2 && t2 == 0) // de kelvin a celsius
            resultado = Valor - 273.15;
            
        if (t1 == 2 && t2 == 1) // de kelvin a fahrenheit
            resultado = ((Valor - 273.15) * 1.8 ) + 32;
        
        if (t1 ==2 && t2 == 2) // kelvin a kelvin 
            resultado = Valor;
        
        return resultado;
    }
    
}
