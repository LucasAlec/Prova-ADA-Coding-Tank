import java.util.Scanner;

public class SalariosBrutoss {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        // Contruind um array de doubble
        double[] salarioB = new double[5];

        //Criando um laço para receber esses salários
        for (int i = 0; i < 5; i++) {
            System.out.print("Forneça o salário bruto recebido pelo funcionároi " + (i +1) + ": \n");
            salarioB[i] = a.nextDouble();
        }

        // resultado
        for (int i = 0; i< 5; i++){
            double salarBruto = salarioB[i];
            double iNSS = DescontoINSS.descontarINSS(salarBruto);
            double salarDeBase = salarBruto - iNSS;
            double iR = DescontoIR.descontandoIR(salarDeBase);
            double salarioLiquido = salarBruto - iNSS - iR;

            //Imprme resultados
            System.out.printf("Funcionário %d: \n", i+1);
            System.out.printf("Salário Bruto: R$ %.2f\n", salarBruto);
            System.out.printf("Pagou ao INSS: R$ %.2f\n", iNSS);
            System.out.printf("Pagou ao Imposto de Renda: R$ %.2f\n", iR);
            System.out.printf("Salário Líquido: R$ %.2f\n\n",salarioLiquido);
        }
        a.close();
    }
}
