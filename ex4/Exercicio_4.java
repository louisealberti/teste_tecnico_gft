import java.util.*;



public class Exercicio_4 {
    public static void main(String[] args){

      Scanner myObj = new Scanner (System.in);
      int multiplicando, inicioIntervalo, finalIntervalo;

      multiplicando = myObj.nextInt();
      if (multiplicando > 1000)
      {
        System.out.println("Erro! Multiplicando maior que 1000");
        System.exit(0);
      }

      inicioIntervalo = myObj.nextInt();
      finalIntervalo = myObj.nextInt();

      boolean inicioPositivo = (inicioIntervalo >= 0);
      boolean finalPositivo = (finalIntervalo >= 0);
      boolean inicioMaior = (inicioIntervalo > 1000);
      boolean finalMaior = (finalIntervalo > 1000);
      boolean diferenca = ((finalIntervalo-inicioIntervalo)>0 && (finalIntervalo-inicioIntervalo)<=10);

      System.out.println("Multiplicando:"+multiplicando);
      System.out.println("Inicio do intervalo:"+inicioIntervalo);
      System.out.println("Fim do intervalo:"+finalIntervalo);

      if (inicioPositivo == finalPositivo)
      {
        if (!inicioMaior == !finalMaior)
        {
          if (diferenca)
          {
            for (int i=inicioIntervalo; i<=finalIntervalo; i++)
            {
              int resultado = multiplicando * i;
              System.out.println(multiplicando + " x " + i + " = " + resultado);
            }
          }
            else
            {
              System.out.println("Inicio do intervalo nao pode ser maior que o final, ou a diferença ser maior que 10");
              System.exit(0);
            }
        }
        else
        {
          System.out.println("Intervalos não admitem valores maiores que 1000");
          System.exit(0);
        }


      }
      else
      {
        System.out.println("Intervalos não podem ser negativos");
        System.exit(0);
      }




  }
}
