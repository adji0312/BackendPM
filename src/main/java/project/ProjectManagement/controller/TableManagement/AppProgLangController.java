package project.ProjectManagement.controller.TableManagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.ProjectManagement.model.TableManagement.ApplicationProgrammingLanguage;
import project.ProjectManagement.service.TableManagement.ApplicationProgrammingLanguageService;

import java.util.List;

@RestController
@RequestMapping("/appProgLang")
public class AppProgLangController {

    private final ApplicationProgrammingLanguageService applicationProgrammingLanguageService;

    public AppProgLangController(ApplicationProgrammingLanguageService applicationProgrammingLanguageService) {
        this.applicationProgrammingLanguageService = applicationProgrammingLanguageService;
    }

    @GetMapping("/all")
    public List<ApplicationProgrammingLanguage> applicationProgrammingLanguageList(){
        return applicationProgrammingLanguageService.getAllAppProgLang();
    }
}
