package project.ProjectManagement.controller.TableManagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.ProjectManagement.model.TableManagement.Server;
import project.ProjectManagement.service.TableManagement.ServerService;

import java.util.List;

@RestController
@RequestMapping("/server")
public class ServerController {

    private final ServerService service;

    public ServerController(ServerService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<Server> serverList(){
        return service.getAllServer();
    }
}
