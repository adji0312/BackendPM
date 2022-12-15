package project.ProjectManagement.repo.listfiltermanagement;

import org.springframework.data.jpa.repository.JpaRepository;
import project.ProjectManagement.model.TableManagement.Server;

import java.util.Optional;

public interface ServerRepo extends JpaRepository<Server, Long> {

    Optional<Server> findServerById(Long id);
}
