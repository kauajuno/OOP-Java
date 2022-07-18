import java.util.ArrayList;

public class Cidade implements Publicavel{
    private final String codigo;
    private final String nome;
    private int habitantes = 0;
    private double area;
    private ArrayList<Cidade> fronteiras = new ArrayList<>();

    public Cidade(String codigo, String nome, double area){
        this.codigo = codigo;
        this.nome = nome;
        this.area = area;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public boolean cidadeIgual(Cidade cidade){
        return this.getNome().equals(cidade.getNome()) && this.getCodigo().equals(cidade.getCodigo());
    }

    public void addFronteira(Cidade cidade){
        int flag = 0;
        for(Cidade cid : this.fronteiras){
            if (cidade.getNome().equals(cid.getNome()) && cidade.getCodigo().equals(cid.getCodigo())) {
                System.out.println("A cidade já está inclusa!");
                flag++;
                break;
            }
        }
        if (flag == 0){
            this.fronteiras.add(cidade);
            System.out.println("Fronteira adicionada!");
            cidade.fronteiras.add(this);
        }
    }

    public boolean isLimitrofe(Cidade cidade){
        for (Cidade cid : this.fronteiras){
            if (cidade.getNome().equals(cid.getNome()) && cidade.getCodigo().equals(cid.getCodigo())) return true;
        }
        return false;
    }

    public String getClassificacao(){
        double dd = this.habitantes / this.area;
        if(dd == 0){
            return "A quantidade de habitantes não foi informada!";
        } else if(dd < 100){
            return "Povoação baixa: " + dd + " hab/km²";
        } else if(dd < 500){
            return "Povoação regular: " + dd + " hab/km²";
        }
        return "Povoação elevada: " + dd + " hab/km²";
    }

    public ArrayList<Cidade> vizinhosEmComum(Cidade cidade){
        ArrayList<Cidade> aux = new ArrayList<>();
        for(Cidade cidadethis : this.fronteiras){
            for (Cidade cidadeparametro : cidade.fronteiras){
                if (cidadethis.getNome().equals(cidadeparametro.getNome()) && cidadethis.getCodigo().equals(cidadeparametro.getCodigo())){
                    aux.add(cidadethis);
                }
            }
        }
        return aux;
    }

    public String mostraDados(){
        return "Dados da cidade " + this.getNome() + " (" + this.getCodigo() + ")" +
                "\nHabitantes: " + this.habitantes +
                "\nÁrea: " + this.area +
                "\nFronteiras: " + this.fronteiras;
    }

}
