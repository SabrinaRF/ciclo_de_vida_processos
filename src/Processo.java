package src;

import src.enumeration.Estado;

import java.util.Random;

public class Processo {
    private String pid;
    private Estado estado;
    private static final Random random = new Random();

    public Processo() {
        this.pid = gerarPidAleatorio();
        this.estado = Estado.NOVO;
    }

    private String gerarPidAleatorio() {
        return String.valueOf(1000 + random.nextInt(9000));
    }

    public String getPid() {
        return pid;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void mostrar() {
        System.out.println("PID: " + pid + ", src.enumeration.Estado.java: " + estado);
    }
}
