package project.ProjectManagement.model.TableManagement;

import javax.persistence.*;

@Entity
@Table(name = "app_op_system")
public class ApplicationOperatingSystem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    private String app_op_system_name;

    public ApplicationOperatingSystem(Long id, String app_op_system_name) {
        this.id = id;
        this.app_op_system_name = app_op_system_name;
    }

    public ApplicationOperatingSystem() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApp_op_system_name() {
        return app_op_system_name;
    }

    public void setApp_op_system_name(String app_op_system_name) {
        this.app_op_system_name = app_op_system_name;
    }
}
