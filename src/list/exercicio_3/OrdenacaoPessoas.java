package list.exercicio_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    List<Pessoa> listaPessoas;

    public OrdenacaoPessoas() {
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorIdade); // comparable
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura()); // comparator
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas pessoas = new OrdenacaoPessoas();
        pessoas.adicionarPessoa("Gustavo", 21, 1.76);
        pessoas.adicionarPessoa("Alexandre", 24, 1.80);
        pessoas.adicionarPessoa("Bruna", 22, 1.56);

        System.out.println(pessoas.ordenarPorIdade());
        System.out.println(pessoas.ordenarPorAltura());
    }
}
