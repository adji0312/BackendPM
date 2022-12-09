package project.ProjectManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.ProjectManagement.exception.ApplicationException;
import project.ProjectManagement.model.Application;
import project.ProjectManagement.repo.ApplicationRepo;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ApplicationService {

    private final ApplicationRepo applicationRepo;

    @Autowired
    public ApplicationService(ApplicationRepo applicationRepo) {
        this.applicationRepo = applicationRepo;
    }

    public List<Application> getAllApplication(){
        return applicationRepo.findAll();
    }

    public Application addApplication(Application application){
        return applicationRepo.save(application);
    }

    public Application getApplicationById(Long id) throws ApplicationException{
        return applicationRepo.findApplicationsById(id).orElseThrow(() -> new ApplicationException("Application Not Found"));
    }

//    public Application addApplication(Application application){
//
//    }
}
