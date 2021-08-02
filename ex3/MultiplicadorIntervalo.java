import java.util.Scanner; 

public class MultiplicadorIntervalo
{
    public MultiplicadorIntervalo()
    {
        this.init();
    }

    public void init()
    {
        int multiplicando = this.getParametrosInteiros("Multiplicando:");
        int intervaloInicial = this.getParametrosInteiros("Inicio do intervalo:");
        int intervaloFinal = this.getParametrosInteiros("Fim do intervalo:");
        
        calcularValores(multiplicando, intervaloInicial, intervaloFinal);
    }
    
    private void calcularValores(int multiplicador, int intervaloInicial, int intervaloFinal)
    {
         for(int i = intervaloInicial; i <= intervaloFinal; ++i){
            int resultadoCalculuo = multiplicarValores(multiplicador, i);
            String resultado = multiplicador + " x " + i + " = " + resultadoCalculuo;
            System.out.println(resultado);
        
        }
    }
    
    private int multiplicarValores(int valorA, int valorB)
    {
        return valorA*valorB;   
    }
    
    public int getParametrosInteiros(String parametro)
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.print(parametro);
        int iterator = scan.nextInt();
        scan.close();
        return iterator;
    }    
}
