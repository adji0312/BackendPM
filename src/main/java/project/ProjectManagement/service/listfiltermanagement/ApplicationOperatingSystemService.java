package project.ProjectManagement.service.listfiltermanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.ProjectManagement.exception.listfiltermanagement.ApplicationOperatingSystemException;
import project.ProjectManagement.model.listfiltermanagement.ApplicationOperatingSystem;
import project.ProjectManagement.repo.listfiltermanagement.ApplicationOperatingSystemRepo;

import java.util.List;

@Service
@Transactional
public class ApplicationOperatingSystemService {

    private final ApplicationOperatingSystemRepo applicationOperatingSystemRepo;

    @Autowired
    public ApplicationOperatingSystemService(ApplicationOperatingSystemRepo applicationOperatingSystemRepo) {
        this.applicationOperatingSystemRepo = applicationOperatingSystemRepo;
    }

    public List<ApplicationOperatingSystem> getAllAppOprSys(){
        return applicationOperatingSystemRepo.findAll();
    }

    public ApplicationOperatingSystem addAppOprSys(ApplicationOperatingSystem applicationOperatingSystem){
        return applicationOperatingSystemRepo.save(applicationOperatingSystem);
    }

    public ApplicationOperatingSystem getAppOprSysById(Long id) throws ApplicationOperatingSystemException{
        return applicationOperatingSystemRepo.findApplicationOperatingSystemById(id).orElseThrow(() -> new ApplicationOperatingSystemException("App Opr Sys Not Found"));
    }
}
