public enum OperadorEnum {
    SOMAR(" + ") {
        @Override
        public double executarOperacao(double x, double y) {
            return x + y;
            
        }
    },
    SUBTRAIR(" - ") {
        @Override
        public double executarOperacao(double x, double y) {
            return x - y;
        }
    },
    MULTIPLICAR(" * ") {
        @Override
        public double executarOperacao(double x, double y) {
            return x * y;
        }
    },
    DIVIDIR(" / ") {
        @Override
        public double executarOperacao(double x, double y) {
            return x / y;
        }
    };

    private final String operacao;

    OperadorEnum(String sinal) {
        this.operacao = sinal;
    }

    public String toString() {
        return operacao;
    }

    public abstract double executarOperacao(double x, double y);
}
