package project.ProjectManagement.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.ProjectManagement.model.ProjectPIC;
import project.ProjectManagement.model.User;
import project.ProjectManagement.service.ProjectPICService;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/pic")
public class ProjectPICController {

    private final ProjectPICService projectPICService;

    public ProjectPICController(ProjectPICService projectPICService) {
        this.projectPICService = projectPICService;
    }

    @PostMapping("/addPICDev/{project_code}/{user_id}")
    public ResponseEntity<ProjectPIC> addPICDev(@PathVariable("project_code") String project_code, @PathVariable("user_id") String user_id){
        ProjectPIC newPICDev = projectPICService.addPICDev(project_code, user_id);
        if(newPICDev == null){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(newPICDev,HttpStatus.CREATED);
    }

    @PostMapping("/addPICPM/{project_code}/{user_id}")
    public ResponseEntity<ProjectPIC> addPICPM(@PathVariable("project_code") String project_code, @PathVariable("user_id") String user_id){
        ProjectPIC newPICPM = projectPICService.addPICPM(project_code, user_id);
        if(newPICPM == null){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(newPICPM,HttpStatus.CREATED);
    }

    @GetMapping("/getPICPM/{project_code}")
    public ResponseEntity<ProjectPIC> getProjectPICPM(@PathVariable("project_code") String project_code){
        ProjectPIC findPICPM = projectPICService.getProjectPICPM(project_code);
        return new ResponseEntity<>(findPICPM, HttpStatus.OK);
    }

    @GetMapping("/get/{project_code}/{user_id}")
    public ResponseEntity<ProjectPIC> getProjectPIC(@PathVariable("project_code") String project_code, @PathVariable("user_id") String user_id){
        ProjectPIC findProjectPIC = projectPICService.getProjectPIC(project_code, user_id);
        return new ResponseEntity<>(findProjectPIC, HttpStatus.OK);
    }

    @GetMapping("/getPICDev/{project_code}")
    public List<ProjectPIC> getProjectPICDev(@PathVariable("project_code") String project_code){
        return projectPICService.getProjectPICDev(project_code);
    }

    @DeleteMapping("/delete/{project_code}/{user_id}")
    public ResponseEntity<ProjectPIC> deleteProjectPIC(@PathVariable("project_code") String project_code, @PathVariable("user_id") String user_id){
        projectPICService.deletePIC(project_code, user_id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
