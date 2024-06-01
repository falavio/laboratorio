package cadastrousuario.com.example.demo.Repository

import cadastrousuario.com.example.demo.Entity.Users
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface UserRepository : JpaRepository<Users, Long> {
    fun findByEmail(email: String): Optional<Users>
}