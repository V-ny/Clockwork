package clockwork;

public class tempo {
    private int hora;
    private int minuto;
    private int segundo;
    
 

    public tempo(int hora) {
        this.hora = hora;
    }

    public tempo(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public tempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public int getHora(){
        return hora;
    }
    public void setHora(int hora){
        this.hora = hora;
    }
    public int getMinuto(){
        return minuto;
    }
    public void setminuto(int minuto){
        this.minuto = minuto;
    }
    public int getSegundo(){
        return segundo;
    }
    public void setSegundo(int segundo){
        this.segundo = segundo;
    }
    
    @Override
    public String toString() {
        return String.format("Horario: %d:%d:%d",hora,minuto,segundo);
    }
    
    
}
