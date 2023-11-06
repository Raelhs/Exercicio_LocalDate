package executa;

import entidade.Pessoa;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {


        LocalDate data1 = LocalDate.of(2003, 2, 28);
        LocalDate data2 = LocalDate.of(2002, 12, 16);
        Pessoa pessoa1 = new Pessoa("Emanuel", data1);
        Pessoa pessoa2 = new Pessoa("Rael", data2);

        System.out.println(Pessoa.listaPessoas.toString());
        Pessoa maisVelho = Pessoa.listaPessoas.get(0);
        Pessoa maisNovo = Pessoa.listaPessoas.get(0);
        for (Pessoa pessoa : Pessoa.listaPessoas) {
            if (pessoa.getDataDeNascimento().isBefore(data1)) {
                maisVelho = pessoa;
            }
            if (pessoa.getDataDeNascimento().isAfter(data1)) {
                maisNovo = pessoa;
            }
        }

        System.out.println("\nO mais Velho: " + maisVelho.toString());
        System.out.println("\nO mais Novo: " + maisNovo.toString());


    }

}
