package project.ProjectManagement.repo.listfiltermanagement;

import org.springframework.data.jpa.repository.JpaRepository;
import project.ProjectManagement.model.TableManagement.ApplicationType;

import java.util.Optional;

public interface ApplicationTypeRepo extends JpaRepository<ApplicationType, Long> {

    Optional<ApplicationType> findApplicationTypeById(Long id);
}
