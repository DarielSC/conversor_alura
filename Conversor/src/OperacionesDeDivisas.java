
public class OperacionesDeDivisas {
    
    private double Valor, resultado;
    private int divisa, divisafinal;

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public int getDivisa() {
        return divisa;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        this.Valor = valor;
    }

    public void setDivisa(int divisa) {
        this.divisa = divisa;
    }

    public int getDivisafinal() {
        return divisafinal;
    }

    public void setDivisafinal(int divisafinal) {
        this.divisafinal = divisafinal;
    }

    public OperacionesDeDivisas(){
 
    }
    
    public double convertir(){
            if (divisa == divisafinal) {
            resultado = Valor;
            } else if (divisa >= 0 && divisa < FACTORES_CONVERSION.length &&
                   divisafinal >= 0 && divisafinal < FACTORES_CONVERSION.length) {
            double factorConversion = FACTORES_CONVERSION[divisa][divisafinal];
            resultado = Valor * factorConversion;
            } else {
            System.out.println("Conversión no soportada: " + divisa + " a " + divisafinal);
            resultado = 0.0;
                 }
         return resultado;
        }
    private static final double[][] FACTORES_CONVERSION = {
        //  peso   dolar  euro   libras  yen    won sulcoleano
        { 1.000, 0.060, 0.053, 0.046, 8.29, 75.52 }, // peso
        { 16.75, 1.000, 0.89, 0.77, 138.87, 1,264.95 }, // dolar
        { 18.81, 1.12, 1.000, 0.86, 155.89, 1,420.74 }, // euro
        { 21.84, 1.30, 1.16, 1.000, 180.98, 1,649.31  }, // libras
        { 0.12, 0.0072, 0.0064, 0.0055, 1.000, 9.11 }, // yen
        { 0.013, 0.00079, 0.00070, 0.0000061, 0.11, 1.000 } // wonsulcoleano   
        // Agregar más conversiones si es necesario
    };
    
    
    
    
    
}
