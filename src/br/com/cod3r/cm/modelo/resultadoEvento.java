package br.com.cod3r.cm.modelo;

public class resultadoEvento {

    private final boolean ganhou;

    public resultadoEvento(boolean ganhou) {
        this.ganhou = ganhou;
    }

    public boolean isGanhou() {
        return ganhou;
    }
}
