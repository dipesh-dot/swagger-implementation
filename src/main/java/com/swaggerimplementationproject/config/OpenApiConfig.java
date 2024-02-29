package com.swaggerimplementationproject.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "User Api",
                description = "Doing the usermanagement operation ",
                termsOfService = "T&C",
                contact = @Contact(
                        name = "dipesh chaudhary",
                        email = "dipeshc045@gmail.com"
                ),

                license = @License(
                        name = "123456789"
                ),
                version = "v1"


        ),
        servers = {
                @Server(
                        description = "dev",
                        url = "http://localhost:8081"
                )
        }

)
public class OpenApiConfig {


}
