//Gabriella

package projetofinal;

public class Candidato {
    
    private int numero;
    private String nome;
    private String partido;
    private String vice;
    private int votos;

    public Candidato() {
    }

    public Candidato(int numero, String nome, String partido, String vice) {
        this.numero = numero;
        this.nome = nome;
        this.partido = partido;
        this.vice = vice;
        this.votos = 0;
    }
    
    public Candidato(String nome){
        this.nome = nome;
        this.votos = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getVice() {
        return vice;
    }

    public void setVice(String vice) {
        this.vice = vice;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos() {
        this.votos += 1;
    }
    
    public void resetVotos(){
        this.votos = 0;
    }
    
    
    
    
    
}
