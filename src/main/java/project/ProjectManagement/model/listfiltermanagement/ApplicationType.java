package project.ProjectManagement.model.listfiltermanagement;

import javax.persistence.*;

@Entity
@Table(name = "app_type")
public class ApplicationType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    private String app_type_name;

    public ApplicationType(Long id, String app_type_name) {
        this.id = id;
        this.app_type_name = app_type_name;
    }

    public ApplicationType() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApp_type_name() {
        return app_type_name;
    }

    public void setApp_type_name(String app_type_name) {
        this.app_type_name = app_type_name;
    }
}
