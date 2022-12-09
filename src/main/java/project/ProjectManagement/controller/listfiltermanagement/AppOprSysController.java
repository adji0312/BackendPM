package project.ProjectManagement.controller.listfiltermanagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.ProjectManagement.model.listfiltermanagement.ApplicationOperatingSystem;
import project.ProjectManagement.service.listfiltermanagement.ApplicationOperatingSystemService;

import java.util.List;

@RestController
@RequestMapping("/appOprSys")
public class AppOprSysController {

    private final ApplicationOperatingSystemService applicationOperatingSystemService;

    public AppOprSysController(ApplicationOperatingSystemService applicationOperatingSystemService) {
        this.applicationOperatingSystemService = applicationOperatingSystemService;
    }

    @GetMapping("/all")
    public List<ApplicationOperatingSystem> applicationOperatingSystemList(){
        return applicationOperatingSystemService.getAllAppOprSys();
    }
}
