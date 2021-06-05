package app.repository;

import app.domain.RadioBroadcast;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RadioBroadcastRepository extends JpaRepository<RadioBroadcast, Long> {

    Optional<RadioBroadcast> findByNameRadio(String nameRadio);
}
