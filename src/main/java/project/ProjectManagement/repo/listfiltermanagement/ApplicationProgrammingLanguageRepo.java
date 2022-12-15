package project.ProjectManagement.repo.listfiltermanagement;

import org.springframework.data.jpa.repository.JpaRepository;
import project.ProjectManagement.model.TableManagement.ApplicationProgrammingLanguage;

import java.util.Optional;

public interface ApplicationProgrammingLanguageRepo extends JpaRepository<ApplicationProgrammingLanguage, Long> {

    Optional<ApplicationProgrammingLanguage> findApplicationProgrammingLanguageById(Long id);
}
