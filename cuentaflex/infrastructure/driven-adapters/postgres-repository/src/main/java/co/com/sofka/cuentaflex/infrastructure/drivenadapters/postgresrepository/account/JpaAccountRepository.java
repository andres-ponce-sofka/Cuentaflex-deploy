package co.com.sofka.cuentaflex.infrastructure.drivenadapters.postgresrepository.account;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface JpaAccountRepository extends JpaRepository<JpaAccountEntity, Integer> {
    Optional<JpaAccountEntity> findByIdAndCustomer_Id(int accountId, int customerId);
    Optional<JpaAccountEntity> findByNumber(int number);
    List<JpaAccountEntity> findByCustomer_Id(int customerId);
}
