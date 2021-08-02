public class CalculadoraImposto
{
    Double valor;
    
    public CalculadoraImposto(Double valor)
    {
        this.valor = valor;
    }
    
    public void main()
    {
        IPI ipi = new IPI();
        ICMS icms = new ICMS();
        COFINS cofins = new COFINS();
        
        double valor = this.valor;
        double custoIPI = this.calculaImposto(ipi);
        double custoICMS = this.calculaImposto(icms);
        double custoCOFINS = this.calculaImposto(cofins);
        
        double impostoIPI = (custoIPI != valor)? custoIPI - valor : valor; 
        double impostoICMS = (custoICMS != valor)? custoICMS - valor : valor;
        double impostoCOFINS = (custoCOFINS  != valor) ? custoCOFINS  - valor : 0;
	double totalImposto = impostoIPI + impostoICMS + impostoCOFINS;
        double totalPagar = valor + totalImposto;
        
        System.out.println("IPI: " + impostoIPI);
        System.out.println("ICMS: " + impostoICMS);  
        System.out.println("COFINS: " + impostoCOFINS);  
        System.out.println("Total imposto: " + totalImposto);
        System.out.println("Total a pagar: " + totalPagar);        
    }
    
    public double calculaImposto(Imposto imposto)
    {
        return imposto.calculaImposto(this.valor);   
    }
}
