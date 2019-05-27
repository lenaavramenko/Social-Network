package accenture.adf.SN.repo;

import accenture.adf.SN.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {

}
