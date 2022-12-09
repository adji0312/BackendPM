package project.ProjectManagement.repo.listfiltermanagement;

import org.springframework.data.jpa.repository.JpaRepository;
import project.ProjectManagement.model.listfiltermanagement.ApplicationServer;

import java.util.Optional;

public interface ApplicationServerRepo extends JpaRepository<ApplicationServer, Long> {
    Optional<ApplicationServer> findApplicationServerById(Long id);
}
