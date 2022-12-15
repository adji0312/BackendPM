package project.ProjectManagement.service.TableManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.ProjectManagement.exception.TableManagement.ServerException;
import project.ProjectManagement.model.TableManagement.Server;
import project.ProjectManagement.repo.listfiltermanagement.ServerRepo;

import java.util.List;

@Service
@Transactional
public class ServerService {

    private final ServerRepo serverRepo;

    @Autowired
    public ServerService(ServerRepo serverRepo) {
        this.serverRepo = serverRepo;
    }
    public List<Server> getAllServer(){
        return serverRepo.findAll();
    }

    public Server addServer(Server server){
        return serverRepo.save(server);
    }

    public Server getServerById(Long id) throws ServerException {
        return serverRepo.findServerById(id).orElseThrow(() -> new ServerException("Server Not Found"));
    }
}
