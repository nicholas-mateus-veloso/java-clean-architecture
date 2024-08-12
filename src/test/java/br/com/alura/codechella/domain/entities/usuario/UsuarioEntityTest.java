package br.com.alura.codechella.domain.entities.usuario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioEntityTest {

    @Test
    void naoDeveCadastrarUsuarioComCpfNoFormatoInvalido() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> new Usuario(
                        "123456789-99",
                        "Leandro",
                        LocalDate.parse("1990-09-09"),
                        "email@email.com"
                )
        );
    }

    @Test
    void deveCriarUsuarioUsandoFabricaDeUsuario() {
        FabricaDeUsuario fabrica = new FabricaDeUsuario();
        Usuario usuario = fabrica.comNomeCpfNascimento(
                "Emily",
                "654.123.897-88",
                LocalDate.parse("2000-10-01")
                );

        Assertions.assertEquals("Emily", usuario.getNome());

        usuario = fabrica.incluiEndereco("12345-999", 40, "apto 201");

        Assertions.assertEquals("apto 201", usuario.getEndereco().getComplemento());
    }
}
