package org.example;

import java.util.Calendar;
import java.util.Date;
import org.example.classes.Endereco;
import org.example.classes.TipoLogradouro;
import org.example.classes.TipoEndereco;
import org.example.classes.Bairro;
import org.example.classes.Cidade;
import org.example.classes.Estado;
import org.example.classes.Pais;
import org.example.classes.PessoaFisica;

public class Main {
    public static void main(String[] args) {
        // Criar um objeto PessoaFisica
        Pais brasil = new Pais("Brasil");
        Estado sp = new Estado("SP", brasil);
        Cidade saoPaulo = new Cidade("São Paulo", sp);
        Bairro centro = new Bairro("Centro", saoPaulo);

        Endereco endereco = new Endereco(
                TipoLogradouro.RUA,
                "Rua Principal",
                123,
                null,
                12345,
                TipoEndereco.RESIDENCIAL,
                centro
        );

        PessoaFisica pessoaFisica = new PessoaFisica(
                "John Doe",
                new Date(1980, Calendar.JANUARY, 1),
                "M",
                endereco
        );

        // Imprimir os detalhes do objeto PessoaFisica
        System.out.println("PessoaFisica:");
        System.out.println("Nome: " + pessoaFisica.getNome());
        System.out.println("Data de Nascimento: " + pessoaFisica.getDataNascimento());
        System.out.println("Sexo: " + pessoaFisica.getSexo());
        System.out.println("Endereço:");
        System.out.println("Tipo de Logradouro: " + pessoaFisica.getEndereco().getTipoLogradouro());
        System.out.println("Nome da Rua: " + pessoaFisica.getEndereco().getNome());
        System.out.println("Número: " + pessoaFisica.getEndereco().getNumero());
        System.out.println("Complemento: " + pessoaFisica.getEndereco().getComplemento());
        System.out.println("CEP: " + pessoaFisica.getEndereco().getCEP());
        System.out.println("Tipo de Endereço: " + pessoaFisica.getEndereco().getTipoEndereco());
        System.out.println("Bairro: " + pessoaFisica.getEndereco().getBairro().getNome());
        System.out.println("Cidade: " + pessoaFisica.getEndereco().getBairro().getCidade().getNome());
        System.out.println("Estado: " + pessoaFisica.getEndereco().getBairro().getCidade().getEstado().getSigla());
        System.out.println("País: " + pessoaFisica.getEndereco().getBairro().getCidade().getEstado().getPais().getNome());
    }
}
