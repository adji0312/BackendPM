package project.ProjectManagement.controller.listfiltermanagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.ProjectManagement.model.listfiltermanagement.ApplicationDatabase;
import project.ProjectManagement.service.listfiltermanagement.ApplicationDatabaseService;

import java.util.List;

@RestController
@RequestMapping("/appDatabase")
public class AppDatabaseController {

    private final ApplicationDatabaseService applicationDatabaseService;

    public AppDatabaseController(ApplicationDatabaseService applicationDatabaseService) {
        this.applicationDatabaseService = applicationDatabaseService;
    }

    @GetMapping("/all")
    public List<ApplicationDatabase> getAppDatabaseList(){
        return applicationDatabaseService.getAllApplicationDatabase();
    }
}
