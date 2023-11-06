package entidade;

import java.security.PublicKey;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nomePessoa;
    private LocalDate dataDeNascimento;
    public static List<Pessoa> listaPessoas = new ArrayList<>();

    public Pessoa(String nomePessoa, LocalDate dataDeNascimento) {
        setNomePessoa(nomePessoa);
        setDataDeNascimento(dataDeNascimento);
        listaPessoas.add(this);
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        if (nomePessoa == null || nomePessoa.isEmpty() || nomePessoa.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }

        this.nomePessoa = nomePessoa;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        if (dataDeNascimento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Data Inválida");
        }
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "\nNome: " + nomePessoa +
                "\nDataDeNascimento: " + dataDeNascimento +
                "\nDia da semana: " + dataDeNascimento.getDayOfWeek() +
                "\nEstação do Ano: " + dataDeNascimento.getEra() +
                "\nAno bissexto: " + dataDeNascimento.isLeapYear();
    }
}
