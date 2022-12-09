package project.ProjectManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import project.ProjectManagement.model.Application;

import java.util.Optional;

public interface ApplicationRepo extends JpaRepository<Application, Long> {

    Optional<Application> findApplicationsById(Long id);

    @Query(value = "SELECT u FROM Application u WHERE u.application_name =: application_name")
    Application findApplicationByApplication_name(@Param("application_name") String application_name);
}
