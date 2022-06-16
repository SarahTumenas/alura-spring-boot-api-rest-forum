package br.com.alura.forum.repository;

import br.com.alura.forum.modelo.Curso;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@ActiveProfiles("test")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)  //pra configurar banco, sem ser o de memória para testes
public class CursoRepositoryTest {

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void deveCarregarUmCursoAoBuscarPeloNome() {
         String nomeCurso = "HTML 5";

         Curso html5 = new Curso();
            html5.setNome(nomeCurso);
            html5.setCategoria("Programação");
            entityManager.persist(html5);

        Curso curso = cursoRepository.findByNome(nomeCurso);
        Assert.assertNotNull(curso);
        Assert.assertEquals(nomeCurso, curso.getNome());

    }

    @Test
    public void naoDeveCarregarUmCursoAoBuscarPeloNomeQueNaoEstejaCadastrado() {
        String nomeCurso = "JPA";
        Curso curso = cursoRepository.findByNome(nomeCurso);
        Assert.assertNull(curso);

    }
}
