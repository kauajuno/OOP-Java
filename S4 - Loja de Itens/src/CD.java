public class CD extends Item{
    String artista;
    int qtd_faixas;

    CD(String titulo, String artista, int qtd_faixas){
        this.titulo = titulo;
        this.artista = artista;
        this.qtd_faixas = qtd_faixas;
    }

    @Override
    public String toString() {
        return "CD{" +
                "artista='" + artista + '\'' +
                ", qtd_faixas=" + qtd_faixas +
                "} " + super.toString();
    }
}
