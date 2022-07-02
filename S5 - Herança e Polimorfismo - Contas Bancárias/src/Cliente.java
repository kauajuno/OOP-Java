public class Cliente{
    private String nome;
    private String telefone;

    Cliente(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}
