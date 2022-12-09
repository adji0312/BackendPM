package project.ProjectManagement.service.listfiltermanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.ProjectManagement.exception.listfiltermanagement.ApplicationTypeException;
import project.ProjectManagement.model.listfiltermanagement.ApplicationType;
import project.ProjectManagement.repo.listfiltermanagement.ApplicationTypeRepo;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class ApplicationTypeService {

    private final ApplicationTypeRepo applicationTypeRepo;

    @Autowired
    public ApplicationTypeService(ApplicationTypeRepo applicationTypeRepo) {
        this.applicationTypeRepo = applicationTypeRepo;
    }

    public List<ApplicationType> getAllAppType(){
        return applicationTypeRepo.findAll();
    }

    public ApplicationType addAppType(ApplicationType applicationType){
        return applicationTypeRepo.save(applicationType);
    }

    public ApplicationType getAppTypeById(Long id) throws ApplicationTypeException {
        return applicationTypeRepo.findApplicationTypeById(id).orElseThrow(() -> new ApplicationTypeException("App Type Not Found"));
    }
}
