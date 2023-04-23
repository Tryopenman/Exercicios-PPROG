package org.example;


import pt.ipp.isep.dei.Data;
import pt.ipp.isep.dei.Tempo;

public class Empregado {
    private String primeiroNome;
    private String ultimoNome;
    private Data dataContrato;
    private Tempo horaEntrada;
    private Tempo horaSaida;

    private final int DIAS_TRABALHO = 5;

    public Empregado(String primeiroNome, String ultimoNome, Data dataContrato, Tempo horaEntrada, Tempo horaSaida) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.dataContrato = dataContrato;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public Data getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Data dataContrato) {
        this.dataContrato = dataContrato;
    }

    public Tempo getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Tempo horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Tempo getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Tempo horaSaida) {
        this.horaSaida = horaSaida;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "primeiroNome='" + primeiroNome + '\'' +
                ", ultimoNome='" + ultimoNome + '\'' +
                ", dataContrato=" + dataContrato +
                ", horaEntrada=" + horaEntrada +
                ", horaSaida=" + horaSaida +
                ", DIAS_TRABALHO=" + DIAS_TRABALHO +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Empregado empregado = (Empregado) o;

        if (!primeiroNome.equals(empregado.primeiroNome)) return false;
        if (!ultimoNome.equals(empregado.ultimoNome)) return false;
        return dataContrato.equals(empregado.dataContrato);
    }
    public int horasSemanais(){
        Tempo diferenca = horaEntrada.diferencaEmTempo(horaSaida);
        return DIAS_TRABALHO * diferenca.getHoras();
    }
    public int tempoContratado(){
        return this.dataContrato.diferenca(Data.dataAtual());
    }


}
