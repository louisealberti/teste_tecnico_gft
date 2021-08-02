
public class IPI implements Imposto
{
    final double impostoAte5PorCento = 1.05;
    final double imposto11PorCento = 1.11;
    
    public double calculaImposto(double valor)
    {
        return valor * this.getImposto(valor);
    }
    
    public double getImposto(double valor)
    {
        if(valor < (double) 25000) return this.impostoAte5PorCento;
        return this.imposto11PorCento;
    }
}
