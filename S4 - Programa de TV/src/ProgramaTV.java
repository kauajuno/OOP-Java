import java.util.ArrayList;

public class ProgramaTV {

    static int codigo;

    String nome;

    ArrayList <Pessoa> artistas = new ArrayList <Pessoa>();

    Pessoa diretor;

    String categoria;

    ProgramaTV(String nome, String categoria) {

        ProgramaTV.codigo++;

        this.nome = nome;

        this.categoria = categoria;

    }

    void setDiretor(Pessoa diretor){

        this.diretor = diretor;

    }

    void setArtistas(Pessoa artista) {

        artistas.add(artista);

    }

    public String toString() {

        StringBuilder programa = new StringBuilder(codigo + "-" + nome + " (" + categoria + ")\n");

        programa.append("Diretor : ").append(diretor).append("\n");

        programa.append("Artistas : \n");

        for (Pessoa artista : artistas) {

            programa.append(artista).append("\n");

        }

        return programa.toString();

    }

}