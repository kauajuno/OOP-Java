public class Filme extends Item{
    String diretor;

    Filme(String titulo, String diretor){
        this.titulo = titulo;
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "diretor='" + diretor + '\'' +
                "} " + super.toString();
    }
}
