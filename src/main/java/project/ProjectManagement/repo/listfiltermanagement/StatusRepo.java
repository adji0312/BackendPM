package project.ProjectManagement.repo.listfiltermanagement;

import org.springframework.data.jpa.repository.JpaRepository;
import project.ProjectManagement.model.TableManagement.Status;

public interface StatusRepo extends JpaRepository<Status, Long> {

}
