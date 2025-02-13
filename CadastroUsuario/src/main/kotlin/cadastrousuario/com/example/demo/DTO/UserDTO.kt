package cadastrousuario.com.example.demo.DTO

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank


data class UserDTO(
    @field:NotBlank
    val name: String,

    @field:Email @field:NotBlank
    val email: String,

    @field:NotBlank
    val password: String
)