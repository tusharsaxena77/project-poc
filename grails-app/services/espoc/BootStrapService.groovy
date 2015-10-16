package espoc

import com.espoc.entity.User
import com.espoc.repositories.UserRepository
import grails.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired

@Transactional
class BootStrapService {

    @Autowired
    UserRepository userRepository

    def bootstrapEssentialData() {
        User user = new User(emailId: 'tushar.saxena@example.com', firstName: 'Tushar', id: UUID.randomUUID())
        userRepository.save(user)
    }
}
