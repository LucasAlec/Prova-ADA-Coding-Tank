public class DescontoINSS {
    public static double descontarINSS(double salarBruto){

        if (salarBruto <= 1212.00) {
            return salarBruto * (7.5/100);

        } else if (salarBruto <=2427.35){
            return  salarBruto * (9.0/100);

        } else if (salarBruto <= 3641.03){
            return salarBruto * (12.0/100);

        }else {
            return salarBruto * (14.0/100);

        }
    }
}
