package br.com.cotiinformatica.api_usuarios;

import br.com.cotiinformatica.application.dtos.CriarContaDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ApiUsuariosApplicationTests {

	@Autowired
	private MockMvc mock;

	@Autowired
	private ObjectMapper objectMapper;

	@Test
	public void atualizarDadosTest() throws Exception {
		fail("Não implementado.");
	}

	@Test
	public void autenticarTest() throws Exception {
		fail("Não implementado.");
	}

	@Test
	public void criarContaTest() throws Exception {

		CriarContaDTO dto = new CriarContaDTO();
		Faker faker = new Faker();

		dto.setNome(faker.name().fullName());
		dto.setEmail(faker.internet().emailAddress());
		dto.setSenha("@Teste1234");

		mock.perform(
				post("/api/usuarios/criar-conta")
					.contentType("application/json")
					.content(objectMapper.writeValueAsString(dto))
				).andExpect(status().isCreated());
	}

	@Test
	public void recuperarSenhaTest() throws Exception {
		fail("Não implementado.");
	}

}
