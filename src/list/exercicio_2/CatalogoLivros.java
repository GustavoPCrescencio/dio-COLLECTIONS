package list.exercicio_2;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livroPorTitulo = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for(Livro a : livroList) {
                if(a.getAutor().equalsIgnoreCase(autor)) {
                    livroPorTitulo.add(a);
                } 
            }
        }
        return livroPorTitulo;
    }

    public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        for(Livro a : livroList) {
            if(a.getAnoPublicacao() >= anoInicial && a.getAnoPublicacao() <= anoFinal) {
                System.out.println(a.toString());
            }
        }
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()) {
            for(Livro t : livroList) {
                livroPorTitulo = t;
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros livrosList = new CatalogoLivros();
        livrosList.adicionarLivro("O ultimo amigo", "Gustavo", 2005);
        livrosList.adicionarLivro("O amigo do meio", "Pedro", 2019);
        livrosList.adicionarLivro("O amigo do meio", "Jonas", 2019);
        livrosList.adicionarLivro("O Mato final", "Pedro", 2007);
        livrosList.adicionarLivro("O primeiro amigo", "Henrique", 2018);
        // livrosList.pesquisarPorIntervaloAnos(2004, 2020);

        System.out.println(livrosList.pesquisarPorAutor("Pedro"));
        System.out.println(livrosList.pesquisarPorTitulo("O amigo do meio"));
    }
}
