package project.ProjectManagement.service.TableManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.ProjectManagement.model.TableManagement.Status;
import project.ProjectManagement.repo.listfiltermanagement.StatusRepo;

import java.util.List;

@Service
@Transactional
public class StatusService {

    private final StatusRepo statusRepo;

    @Autowired
    public StatusService(StatusRepo statusRepo) {
        this.statusRepo = statusRepo;
    }

    public List<Status> getAllStatus(){
        return statusRepo.findAll();
    }
}
