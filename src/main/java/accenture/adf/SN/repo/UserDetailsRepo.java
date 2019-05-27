package accenture.adf.SN.repo;

import accenture.adf.SN.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
