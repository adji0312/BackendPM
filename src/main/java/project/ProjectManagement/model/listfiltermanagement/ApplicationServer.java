package project.ProjectManagement.model.listfiltermanagement;

import javax.persistence.*;

@Entity
@Table(name = "app_server")
public class ApplicationServer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    private String app_server_name;

    public ApplicationServer(Long id, String app_server_name) {
        this.id = id;
        this.app_server_name = app_server_name;
    }

    public ApplicationServer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApp_server_name() {
        return app_server_name;
    }

    public void setApp_server_name(String app_server_name) {
        this.app_server_name = app_server_name;
    }
}
