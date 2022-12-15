package project.ProjectManagement.repo.listfiltermanagement;

import org.springframework.data.jpa.repository.JpaRepository;
import project.ProjectManagement.model.TableManagement.ApplicationDatabase;

import java.util.Optional;

public interface ApplicationDatabaseRepo extends JpaRepository<ApplicationDatabase, Long> {
    Optional<ApplicationDatabase> findApplicationDatabaseById(Long id);
}
