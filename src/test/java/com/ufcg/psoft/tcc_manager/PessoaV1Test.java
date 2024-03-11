package com.ufcg.psoft.tcc_manager;

import org.apache.coyote.http11.upgrade.UpgradeServletOutputStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@DisplayName("Classe de Teste de Pessoa")
public class PessoaV1Test {
    MockMvc driver;

    @Test
    public void testePessoa() {
        //CustomErrorType excecao;
        //String resultado = driver.perform();
    }

    //@Nested // Diversas classes dentro de uma classe de Teste

}
