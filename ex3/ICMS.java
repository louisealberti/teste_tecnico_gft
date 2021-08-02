
public class ICMS implements Imposto
{
    final double imposto = 1.27;
    final double totalImposto = 0;
    
    public double calculaImposto(double valor)
    {
        return valor * this.getImposto();
    }
    
    public double getImposto()
    {
        return this.imposto;
    }
}
