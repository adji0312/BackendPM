package project.ProjectManagement.controller.listfiltermanagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.ProjectManagement.model.listfiltermanagement.ApplicationType;
import project.ProjectManagement.service.listfiltermanagement.ApplicationTypeService;

import java.util.List;

@RestController
@RequestMapping("/appType")
public class AppTypeController {

    private final ApplicationTypeService applicationTypeService;

    public AppTypeController(ApplicationTypeService applicationTypeService) {
        this.applicationTypeService = applicationTypeService;
    }

    @GetMapping("/all")
    public List<ApplicationType> applicationTypeList(){
        return applicationTypeService.getAllAppType();
    }
}
