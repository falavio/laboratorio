package cadastrousuario.com.example.demo.Controller

import cadastrousuario.com.example.demo.DTO.UserDTO
import cadastrousuario.com.example.demo.Entity.Users
import cadastrousuario.com.example.demo.Service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {

    @PostMapping
    fun createUser(@RequestBody userDTO: UserDTO): ResponseEntity<Users> {
        val user = userService.saveUser(userDTO)
        return ResponseEntity.ok(user)
    }
}