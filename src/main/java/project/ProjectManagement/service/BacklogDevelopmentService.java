package project.ProjectManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.ProjectManagement.exception.BacklogDevelopmentException;
import project.ProjectManagement.exception.ProjectNotFoundException;
import project.ProjectManagement.model.BacklogDevelopment;
import project.ProjectManagement.model.Project;
import project.ProjectManagement.repo.BacklogDevelopmentRepo;
import project.ProjectManagement.repo.ProjectRepo;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class BacklogDevelopmentService {

    private final BacklogDevelopmentRepo backlogDevelopmentRepo;
    private final ProjectRepo projectRepo;

    @Autowired
    public BacklogDevelopmentService(BacklogDevelopmentRepo backlogDevelopmentRepo, ProjectRepo projectRepo) {
        this.backlogDevelopmentRepo = backlogDevelopmentRepo;
        this.projectRepo = projectRepo;
    }

    public List<BacklogDevelopment> getAllBacklogDevelopment(){
        return backlogDevelopmentRepo.findAll();
    }

    public List<BacklogDevelopment> getBacklogDevelopmentByStatus(String status){
        return backlogDevelopmentRepo.getBacklogDevelopmentByStatus(status);
    }

    public BacklogDevelopment getBacklogDevelopment(String backlog_code) throws BacklogDevelopmentException{
        BacklogDevelopment backlogDev = backlogDevelopmentRepo.findByBacklog_code(backlog_code).orElseThrow(() -> new BacklogDevelopmentException("Backlog Development Not Found"));
        return backlogDev;
    }

    public BacklogDevelopment updateBacklogDevelopment(Long id, BacklogDevelopment backlogDev) throws BacklogDevelopmentException, ProjectNotFoundException {
        BacklogDevelopment updatedBacklogDev = backlogDevelopmentRepo.findBacklogDevelopmentById(id).orElseThrow(() -> new BacklogDevelopmentException("Backlog Development Not Found"));

        updatedBacklogDev.setBacklog_status(backlogDev.getBacklog_status());
        updatedBacklogDev.setBacklog_start(backlogDev.getBacklog_start());
        updatedBacklogDev.setBacklog_end(backlogDev.getBacklog_end());
        updatedBacklogDev.setPic_PM(backlogDev.getPic_PM());
        updatedBacklogDev.setModify_date(new Date());

        Project updatedProject = projectRepo.findByProject_code(updatedBacklogDev.getBacklog_code()).orElseThrow(() -> new ProjectNotFoundException("Project Not Found"));
        updatedProject.setProject_status(backlogDev.getBacklog_status());

        projectRepo.save(updatedProject);
        return backlogDevelopmentRepo.save(updatedBacklogDev);
    }

    public List<Integer> countBacklogByStatus(){
        ArrayList<Integer> countArray = new ArrayList<Integer>();

        String[] statusLabel = {"KIC", "DEV", "SIT", "READY UAT"};

        for (String stat: statusLabel) {
            countArray.add(backlogDevelopmentRepo.countBacklogDevelopmentByBacklog_status(stat));
        }

        return countArray;
    }

    public void deleteBacklogDevelopment(String backlog_code){
        backlogDevelopmentRepo.deleteBacklogDevelopmentByBacklog_code(backlog_code);
    }
}
