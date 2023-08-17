public class AppCalculadoraEnum {
    public static void main(String[] args) throws Exception {
        double a = 3;
        double b = 2;
        double res;

        System.out.println();
        // executando as quatro operaçoes contidas no enum:
        for (OperadorEnum op : OperadorEnum.values()) {
            res = op.executarOperacao(a, b);
            System.out.println(a + op.toString() + b + " = " + res);
        }
        System.out.println();

        // executando apenas uma operação contida no enum:
        OperadorEnum op = OperadorEnum.MULTIPLICAR;
        res = op.executarOperacao(a, b);
        System.out.println(a + op.toString() + b + " = " + res);
        
        System.out.println();
    }
}
