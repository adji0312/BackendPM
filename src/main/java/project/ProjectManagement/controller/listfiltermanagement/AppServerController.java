package project.ProjectManagement.controller.listfiltermanagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.ProjectManagement.model.listfiltermanagement.ApplicationServer;
import project.ProjectManagement.service.listfiltermanagement.ApplicationServerService;

import java.util.List;

@RestController
@RequestMapping("/appServer")
public class AppServerController {

    private final ApplicationServerService applicationServerService;

    public AppServerController(ApplicationServerService applicationServerService) {
        this.applicationServerService = applicationServerService;
    }

    @GetMapping("/all")
    public List<ApplicationServer> applicationServerList(){
        return applicationServerService.getAllAppServer();
    }
}
