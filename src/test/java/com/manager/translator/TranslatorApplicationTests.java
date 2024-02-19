package com.manager.translator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


// Note:
// @ExtendWith annotation tell JUnit 5 to enable Spring support.
// As of Spring Boot 2.1, we no longer need to load the SpringExtension because
// it's included as a meta annotation in the Spring Boot test annotations like @DataJpaTest, @WebMvcTest, and @SpringBootTest.
@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class TranslatorApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getAllPublicTranslation() throws Exception {
        mockMvc.perform(get("/translations"))
                .andExpect(status().isOk());
    }
}


