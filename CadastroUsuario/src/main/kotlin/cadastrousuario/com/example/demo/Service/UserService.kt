package cadastrousuario.com.example.demo.Service

import cadastrousuario.com.example.demo.DTO.UserDTO
import cadastrousuario.com.example.demo.Entity.Users
import cadastrousuario.com.example.demo.Repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {

    fun saveUser(userDTO: UserDTO): Users {
        if (userRepository.findByEmail(userDTO.email).isPresent) {
            throw IllegalArgumentException("Email already exists")
        }
        val user = Users(
            name = userDTO.name,
            email = userDTO.email,
            password = userDTO.password
        )
        return userRepository.save(user)
    }
}