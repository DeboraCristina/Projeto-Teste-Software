package sigvs.sigvs.ti_tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class REQ01CadastrarLivro 
{
    Biblioteca biblioteca;
    @Test
    public void ct01_cadastrar_livro_com_sucesso()
    {
        // Dado q o usuário entrou com as informações do livro
        biblioteca = new Biblioteca();
        Livro livro = new Livro("engenharia", "presman");
        // qnd o user confimar a operação
        biblioteca.save(livro);

        //ent o fica disponivel para consulta
        assertEquals(1, biblioteca.size());
    }
}
