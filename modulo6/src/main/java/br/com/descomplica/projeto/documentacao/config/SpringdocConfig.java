package br.com.descomplica.projeto.documentacao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SpringdocConfig {
	@Bean
	public OpenAPI springShopOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("API de Gerenciamento de Produtos e Pedidos")
						.description("API desenvolvida para gerenciar informações de produtos e pedidos, utilizando Springdoc para documentação.")
						.version("2.0.0")
						.license(new License().name("Licença Personalizada").url("http://meu-site-exemplo.com/licenca")))
				.externalDocs(new ExternalDocumentation()
						.description("Repositório no GitHub com o código da aplicação")
						.url("https://github.com/SeuUsuario/api-gerenciamento-produtos"));
	}
}
