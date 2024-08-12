package br.com.alura.codechella;

import br.com.alura.codechella.domain.entities.usuario.Usuario;
import br.com.alura.codechella.infra.gateways.RepositorioDeUsuarioEmArquivo;

import java.time.LocalDate;

public class UtilizaUsuarioComArquivos {
    public static void main(String[] args) {
        RepositorioDeUsuarioEmArquivo repositorio = new RepositorioDeUsuarioEmArquivo();

        repositorio.cadastrarUsuario(new Usuario(
                "456.789.888-88",
                "João",
                LocalDate.parse("1990-12-12"),
                "joao@email.com")
        );

        repositorio.cadastrarUsuario(new Usuario(
                "456.789.888-89",
                "Maria",
                LocalDate.parse("1990-12-12"),
                "maria@email.com")
        );

        repositorio.cadastrarUsuario(new Usuario(
                "456.789.888-91",
                "Josefa",
                LocalDate.parse("1990-12-12"),
                "josefa@email.com")
        );

        repositorio.cadastrarUsuario(new Usuario(
                "456.789.888-90",
                "Cassandra",
                LocalDate.parse("1990-12-12"),
                "cassandra@email.com")
        );

//        System.out.println(repositorio.listarTodos());
        repositorio.gravaEmArquivo("usuarios.txt");

    }
}
