public class Pessoas {
    private String nome;
    private int votos;

 
    public Pessoas() {
        this.votos = 0;  
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    
    public void votar() {
        this.votos++; 
    }
    
    public int getVotos() {
        return votos;
    }
}
