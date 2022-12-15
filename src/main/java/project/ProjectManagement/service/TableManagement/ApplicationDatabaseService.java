package project.ProjectManagement.service.TableManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.ProjectManagement.exception.TableManagement.ApplicationDatabaseException;
import project.ProjectManagement.model.TableManagement.ApplicationDatabase;
import project.ProjectManagement.repo.listfiltermanagement.ApplicationDatabaseRepo;

import java.util.List;

@Service
@Transactional
public class ApplicationDatabaseService {

    private final ApplicationDatabaseRepo applicationDatabaseRepo;

    @Autowired
    public ApplicationDatabaseService(ApplicationDatabaseRepo applicationDatabaseRepo) {
        this.applicationDatabaseRepo = applicationDatabaseRepo;
    }

    public List<ApplicationDatabase> getAllApplicationDatabase(){
        return applicationDatabaseRepo.findAll();
    }

    public ApplicationDatabase addApplicationDatabase(ApplicationDatabase applicationDatabase){
        return applicationDatabaseRepo.save(applicationDatabase);
    }

    public ApplicationDatabase getApplicationDatabaseById(Long id) throws ApplicationDatabaseException{
        return applicationDatabaseRepo.findApplicationDatabaseById(id).orElseThrow(() -> new ApplicationDatabaseException("App Database Not Found"));
    }
}
