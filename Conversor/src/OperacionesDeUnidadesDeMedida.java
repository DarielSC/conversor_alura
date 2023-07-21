
public class OperacionesDeUnidadesDeMedida {
    private double Valor, resultado;
    private int medida1, medida2;

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

    public int getMedida1() {
        return medida1;
    }

    public void setMedida1(int medida1) {
        this.medida1 = medida1;
    }

    public int getMedida2() {
        return medida2;
    }

    public void setMedida2(int medida2) {
        this.medida2 = medida2;
    }
    
    public double convertirU (){

    double[] factoresDeConversion = { 1, 1000, 100000, 1000000 };
    

    if (medida1 >= 0 && medida1 < factoresDeConversion.length && medida2 >= 0 && medida2 < factoresDeConversion.length) {
        
        resultado = Valor * factoresDeConversion[medida2] / factoresDeConversion[medida1];
        
        } else {
            // Manejar índices de unidades inválidos
            resultado = -1; // o cualquier valor de error apropiado
            }

    return resultado;
    
    }
            
                
}
    
    
    

