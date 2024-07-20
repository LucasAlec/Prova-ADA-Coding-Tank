public class DescontoIR {
    public static double descontandoIR(double salarDeBase) {
        return (salarDeBase <= 1903.98) ? 0.0 :
                (salarDeBase <= 2826.65) ? (salarDeBase - 1903.98) * 0.075 :
                (salarDeBase <= 3751.05) ? (2826.65 - 1903.98) * 0.075 + (salarDeBase - 2826.65) * 0.15 :
                                (salarDeBase <= 4664.68) ? (2826.65 - 1903.98) * 0.075 + (3751.05 - 2826.65) * 0.15 + (salarDeBase - 3751.05) * 0.225 :
                                        (2826.65 - 1903.98) * 0.075 + (3751.05 - 2826.65) * 0.15 + (4664.68 - 3751.05) * 0.225 + (salarDeBase - 4664.68) * 0.275;
    }
}
