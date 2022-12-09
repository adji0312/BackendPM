package project.ProjectManagement.repo.listfiltermanagement;

import org.springframework.data.jpa.repository.JpaRepository;
import project.ProjectManagement.model.listfiltermanagement.ApplicationOperatingSystem;

import java.util.Optional;

public interface ApplicationOperatingSystemRepo extends JpaRepository<ApplicationOperatingSystem, Long> {
    Optional<ApplicationOperatingSystem> findApplicationOperatingSystemById(Long id);
}
