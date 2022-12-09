package project.ProjectManagement.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.ProjectManagement.model.Application;
import project.ProjectManagement.service.ApplicationService;

import java.util.List;

@RestController
@RequestMapping("/application")
public class ApplicationController {

    private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("/all")
    public List<Application> applicationList(){
        return applicationService.getAllApplication();
    }

    @PostMapping("/add")
    public ResponseEntity<Application> createApplication(@RequestBody Application application){
        Application newApp = applicationService.addApplication(application);
        return new ResponseEntity<>(newApp, HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Application> getApplicationById(@PathVariable("id") Long id){
        Application application = applicationService.getApplicationById(id);
        return new ResponseEntity<>(application, HttpStatus.OK);
    }
}
