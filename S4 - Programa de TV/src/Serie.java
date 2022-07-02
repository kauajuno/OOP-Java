public class Serie extends ProgramaTV{

    private int temporadas;
    private int episodios;

    Serie(String nome, String categoria) {
        super(nome, categoria);
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }

    public int getTemporadas(){
        return temporadas;
    }

    public String toString(){
        return "Nome: "+this.nome+
                "\nCategoria: "+this.categoria+
                "\nTemporadas: "+this.temporadas+
                "\nEpisódios: "+this.episodios;
    }
}
