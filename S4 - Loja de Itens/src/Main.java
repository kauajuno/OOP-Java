import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<CD> cdArrayList = new ArrayList<>();
        ArrayList<Filme> filmeArrayList = new ArrayList<>();
        ArrayList<Jogo> jogoArrayList = new ArrayList<>();

        for(int i=0;i<10;i++){
            cdArrayList.add(new CD("SKZ" + (2021 + i), "Stray Kids", 15));
            filmeArrayList.add(new Filme("Rocky "+(i + 1), "Sylvester Stallone"));
            jogoArrayList.add(new Jogo("Tekken "+i, (int) Math.pow(3, i+2), "PS"));
        }

        for (CD cd : cdArrayList) {
            System.out.println(cd);
        }

        for(Filme filme : filmeArrayList){
            System.out.println(filme);
        }

        for(Jogo jogo : jogoArrayList){
            System.out.println(jogo);
        }

        System.out.println(jogoArrayList.get(3).getPlataforma());


    }
}
