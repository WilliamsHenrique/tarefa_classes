package br.com.wsilva;

import br.com.mod22.Streams;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class PrimeiroTeste {

    private Streams streams;

    @Before
    public void setUp() {
        streams = new Streams();
    }

    @Test
    public void testSomenteMulheres() {
        List<String[]> pessoas = List.of(new String[]{"Maria", "F"}, new String[]{"João", "M"}, new String[]{"Ana", "F"});

        List<String[]> mulheres = streams.somenteMulheres(pessoas);

        assertEquals(2, mulheres.size());
        assertEquals("Maria", mulheres.get(0)[0]);
        assertEquals("Ana", mulheres.get(1)[0]);
    }

    @Test
    public void testLerDados() {
        String input = "Maria,F,João,M,Ana,F";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        List<String[]> pessoas = streams.lerDados();

        assertEquals(3, pessoas.size());
        assertEquals("Maria", pessoas.get(0)[0]);
        assertEquals("F", pessoas.get(0)[1]);
        assertEquals("João", pessoas.get(1)[0]);
        assertEquals("M", pessoas.get(1)[1]);
        assertEquals("Ana", pessoas.get(2)[0]);
        assertEquals("F", pessoas.get(2)[1]);

        System.setIn(System.in);
    }
}