package Enum;

public enum TipoTransacao {
    SAIDA('s'),
    ENTRADA('e'),
    CANCELAMENTO('c');

    private final char valor;

    TipoTransacao(char valor) {
        this.valor = valor;
    }

    public char getValor() {
        return valor;
    }
}
