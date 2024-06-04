package pposonggil.usedStuff.repository.member;

import org.springframework.data.jpa.repository.JpaRepository;
import pposonggil.usedStuff.domain.RefreshToken;

import java.util.Optional;


public interface TokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findById(Long Id);
}