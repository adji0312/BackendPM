package project.ProjectManagement.model.TableManagement;

import javax.persistence.*;

@Entity
@Table(name = "app_database")
public class ApplicationDatabase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    private String app_database_name;

    public ApplicationDatabase(Long id, String app_database_name) {
        this.id = id;
        this.app_database_name = app_database_name;
    }

    public ApplicationDatabase() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApp_database_name() {
        return app_database_name;
    }

    public void setApp_database_name(String app_database_name) {
        this.app_database_name = app_database_name;
    }
}
