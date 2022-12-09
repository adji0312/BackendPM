package project.ProjectManagement.model.listfiltermanagement;

import javax.persistence.*;

@Entity
@Table(name = "server")
public class Server {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    private String server_name;

    public Server(Long id, String server_name) {
        this.id = id;
        this.server_name = server_name;
    }

    public Server() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServer_name() {
        return server_name;
    }

    public void setServer_name(String server_name) {
        this.server_name = server_name;
    }
}
