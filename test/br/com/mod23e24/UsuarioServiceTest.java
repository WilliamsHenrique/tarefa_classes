package br.com.mod23e24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioServiceTest {

    @Test
    public void testBuscarUsuarioPorId() {
        UsuarioService usuarioService = new UsuarioService();
        Usuario usuario = new Usuario(1, "Alice");
        usuarioService.adicionarUsuario(usuario);

        Usuario usuarioRecuperado = usuarioService.buscarUsuarioPorId(1);

        assertEquals(usuario, usuarioRecuperado);
    }

    @Test
    public void testExcluirUsuario() {
        UsuarioService usuarioService = new UsuarioService();
        Usuario usuario = new Usuario(1, "Bob");
        usuarioService.adicionarUsuario(usuario);

        usuarioService.excluirUsuario(1);

        Assertions.assertNull(usuarioService.buscarUsuarioPorId(1));
    }

    @Test
    public void testAtualizarUsuario() {
        UsuarioService usuarioService = new UsuarioService();
        Usuario usuario = new Usuario(1, "Charlie");
        usuarioService.adicionarUsuario(usuario);

        usuario.setNome("Charlie Updated");
        usuarioService.atualizarUsuario(usuario);

    }
}
