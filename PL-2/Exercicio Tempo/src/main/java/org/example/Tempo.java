package org.example;

/**
 * Representa uma instância de Tempo.
 * @author Francisco Osório
 */
public class Tempo {
    /**
     * Hora de um Tempo.
     */
    private int hora;
    /**
     * Minutos de um Tempo.
     */
    private int minutos;
    /**
     * Segundos de um Tempo.
     */
    private int segundos;
    /**
     * Hora de um Tempo por omissão.
     */
    private static final int HORA_POR_OMISSAO = 0;
    /**
     * Minutos de um Tempo por omissão.
     */
    private static final int MINUTOS_POR_OMISSAO = 0;
    /**
     * Segundos de um Tempo por omissão.
     */
    private static final int SEGUNDOS_POR_OMISSAOO = 0;
    /**
     * Segundos máximos.
     */
    private static final int SEGUNDOS_MAX = 60;
    /**
     * Minutos máximos.
     */
    private static final int MINUTOS_MAX = 60;
    /**
     * Horas máximas.
     */
    private static final int HORAS_MAX = 24;


    /**
     * Constrói uma instância de Tempo por omissão da hora, minutos e segundos.
     */
    public Tempo(){
        this.hora = HORA_POR_OMISSAO;
        this.minutos = MINUTOS_POR_OMISSAO;
        this.segundos = SEGUNDOS_POR_OMISSAOO;
    }

    /**
     * Constrói uma instância de Tempo recebendo a hora, minutos e segundos.
     * Para além disso existe verificação se os parâmetros são validos para o contexto.
     * @param hora hora relativa ao Tempo
     * @param minutos minutos relativos ao Tempo
     * @param segundos segundos relativos ao Tempo
     */
    public Tempo(int hora, int minutos, int segundos) {
        if (hora >=HORA_POR_OMISSAO && hora < HORA_POR_OMISSAO && minutos >= MINUTOS_POR_OMISSAO && minutos <MINUTOS_MAX && segundos >= SEGUNDOS_POR_OMISSAOO && segundos <SEGUNDOS_MAX){
            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;
        }else{
            System.out.println("O tempo que definiu é inválido!");
            System.exit(0);
        }
    }

    /**
     * Acerta a hora do Tempo, em conformidade com os limites das horas, minutos, segundos.
     */
    public void acertarHora() {
        if (this.segundos >= SEGUNDOS_MAX) {
            this.segundos = 0;
            this.minutos++;
        }
        if (this.minutos >= MINUTOS_MAX) {
            this.minutos = 0;
            hora++;
        }
        if (hora >= HORAS_MAX) {
            this.hora = 0;
            this.segundos++;
        }
    }
    
    /**
     * Devolve o Tempo no formato normal hh:mm:ss
     * @return Tempo
     */
    public String getEstadoTempoTotal(){
        return String.format("%d:%d:%d", hora,minutos,segundos);
    }

    /**
     * Devolve o Tempo no formato hh:mm:ss AM OU PM
     * @return Tempo
     */
    public String getEstadoTempo(){
        if (this.hora > 12)
            return String.format("%d:%d:%d PM",hora - 12, minutos,segundos);
        return String.format("%d:%d:%d AM",hora,minutos,segundos);
    }

    /**
     * Devolve a hora do Tempo.
     * @return hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * Modifica a hora do Tempo.
     * @param hora hora do Tempo
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    /**
     * Devolve os minutos do Tempo.
     * @return minutos
     */
    public int getMinutos() {
        return minutos;
    }

    /**
     * Modifica os minutos do Tempo.
     * @param minutos minutos do Tempo
     */
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    /**
     * Devolve os Segundos do Tempo.
     * @return segundos
     */
    public int getSegundos() {
        return segundos;
    }

    /**
     * Modifica os segundos do Tempo
     * @param segundos segundos do Tempo
     */
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    /**
     * Acrescenta 1 segundo ao Tempo.
     * Para além disso é chamado o método acertarHora, caso os segundos, os minutos ou as horas passem do seu limite.
     */
    public void acrescentarSegundo(){
        this.segundos += 1;
        acertarHora();
    }

    /**
     * Verifica se um Tempo 1 é maior que outro Tempo, recebendo o Tempo para comparar como parâmetro.
     * @param tempoComparacao Tempo utilizado para comparar
     * @return Tempo1 > Tempo Comparação
     */
    public boolean verifyMaiorTempo(Tempo tempoComparacao){
        if (this.hora > tempoComparacao.hora)
            return true;
        if (this.hora == tempoComparacao.hora && this.minutos > tempoComparacao.minutos)
            return true;
        if (this.hora == tempoComparacao.hora && this.minutos == tempoComparacao.minutos && this.segundos > tempoComparacao.segundos)
            return true;
        return false;
    }

    /**
     * Verifica se um Tempo 1 é maior que outro Tempo, recebendo como parâmetros as horas, os minutos e segundos.
     * @param horas Horas do Tempo Comparação
     * @param minutos Minutos do Tempo Comparação
     * @param segundos Segundos do Tempo Comparação
     * @return Tempo1 > Tempo Comparação
     */
    public boolean verifyMaiorTempo(int horas, int minutos, int segundos){
        if (this.hora > horas)
            return true;
        if (this.hora == horas && this.minutos > minutos)
            return true;
        if (this.hora == horas&& this.minutos == minutos && this.segundos > segundos)
            return true;
        return false;
    }

    /**
     * Devolve o Tempo em segundos.
     * @return Tempo em segundos
     */
    public int converterTempoSegundos(){
        return ((hora*3600) + (minutos * 60) + segundos);
    }

    /**
     * Devolve a diferença (valor absoluto) entre dois Tempos em segundos, recebendo ambos os Tempos por parâmetros.
     * @param tempo1 Tempo 1
     * @param tempo2 Tempo 2
     * @return a diferença em segundos de ambos os Tempos
     */
    public static int diferencaTempoSegundos(Tempo tempo1, Tempo tempo2){
        return Math.abs(tempo1.converterTempoSegundos() - tempo2.converterTempoSegundos());
    }

    /**
     * Devolve a diferença (valor absoluto) entre dois Tempos no formato hh:mm:ss, recebendo ambos os Tempos por parâmetros
     * @param tempo1
     * @param tempo2
     * @return a diferença no formato hh:mm:ss de ambos os Tempos
     */
    public static String diferencaTempoString (Tempo tempo1, Tempo tempo2){
        return String.format("%d:%d:%d",Math.abs(tempo1.hora - tempo2.hora),Math.abs(tempo1.minutos - tempo2.minutos),Math.abs(tempo1.segundos - tempo2.segundos));
    }
}
