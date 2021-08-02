
public class COFINS implements Imposto
{
    final double imposto = 1.04;
    
    public double calculaImposto(double valor)
    {
        return valor * this.getImposto(valor);
    }
    
    public double getImposto(double valor)
    {
        if(valor > (double) 13000) return this.imposto;
        return 1.0; // sem imposto
    }
}
