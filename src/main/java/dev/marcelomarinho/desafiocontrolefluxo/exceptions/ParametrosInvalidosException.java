package dev.marcelomarinho.desafiocontrolefluxo.exceptions;

public class ParametrosInvalidosException extends RuntimeException {

    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}
