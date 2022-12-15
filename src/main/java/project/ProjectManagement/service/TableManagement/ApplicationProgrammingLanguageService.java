package project.ProjectManagement.service.TableManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.ProjectManagement.exception.TableManagement.ApplicationProgrammingLanguageException;
import project.ProjectManagement.model.TableManagement.ApplicationProgrammingLanguage;
import project.ProjectManagement.repo.listfiltermanagement.ApplicationProgrammingLanguageRepo;

import java.util.List;

@Service
@Transactional
public class ApplicationProgrammingLanguageService {

    private final ApplicationProgrammingLanguageRepo applicationProgrammingLanguageRepo;

    @Autowired
    public ApplicationProgrammingLanguageService(ApplicationProgrammingLanguageRepo applicationProgrammingLanguageRepo) {
        this.applicationProgrammingLanguageRepo = applicationProgrammingLanguageRepo;
    }


    public List<ApplicationProgrammingLanguage> getAllAppProgLang(){
        return applicationProgrammingLanguageRepo.findAll();
    }

    public ApplicationProgrammingLanguage addAppProgLang(ApplicationProgrammingLanguage applicationProgrammingLanguage){
        return applicationProgrammingLanguageRepo.save(applicationProgrammingLanguage);
    }

    public ApplicationProgrammingLanguage getAppProgLangById(Long id) throws ApplicationProgrammingLanguageException {
        return applicationProgrammingLanguageRepo.findApplicationProgrammingLanguageById(id).orElseThrow(() -> new ApplicationProgrammingLanguageException("App Prog Lang Not Found"));
    }
}
