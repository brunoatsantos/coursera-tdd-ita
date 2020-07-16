import org.junit.Test;

import static org.junit.Assert.*;

public class TestePilha {

    @Test
    public void pilhaVazia() {
        Pilha pilha = new Pilha();
        assertTrue(pilha.estaVazia());
        assertEquals(0, pilha.tamanho());
    }

    @Test
    public void empilhaUmElemento() {
        Pilha pilha = new Pilha();
        pilha.empilha("primeiro");
        assertFalse(pilha.estaVazia());
        assertEquals(1, pilha.tamanho());
        assertEquals("primeiro", pilha.topo());
    }
}
