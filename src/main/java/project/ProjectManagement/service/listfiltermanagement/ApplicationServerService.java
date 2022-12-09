package project.ProjectManagement.service.listfiltermanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.ProjectManagement.exception.listfiltermanagement.ApplicationServerException;
import project.ProjectManagement.model.listfiltermanagement.ApplicationServer;
import project.ProjectManagement.repo.listfiltermanagement.ApplicationServerRepo;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class ApplicationServerService {

    private final ApplicationServerRepo applicationServerRepo;

    @Autowired
    public ApplicationServerService(ApplicationServerRepo applicationServerRepo) {
        this.applicationServerRepo = applicationServerRepo;
    }

    public List<ApplicationServer> getAllAppServer(){
        return applicationServerRepo.findAll();
    }

    public ApplicationServer addAppServer(ApplicationServer applicationServer){
        return applicationServerRepo.save(applicationServer);
    }

    public ApplicationServer getAppServerById(Long id) throws ApplicationServerException {
        return applicationServerRepo.findApplicationServerById(id).orElseThrow(() -> new ApplicationServerException("App Server Not Found"));
    }
}
