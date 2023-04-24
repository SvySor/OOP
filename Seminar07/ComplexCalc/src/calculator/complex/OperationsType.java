package calculator.complex;

public enum OperationsType {
    SUM("+"), SUB("-"), MUL("*"), DIV("/"), EQ("=");
    private String sign;

    OperationsType(String sign) {
        this.sign = sign;
    }

    public static OperationsType getOperation(String arg) {
        for (OperationsType op: OperationsType.values()
             ) {
            if (op.sign.equals(arg)){
                return op;
            }
        }
        throw new IllegalArgumentException("Некорректный символ операции");
    }
}
