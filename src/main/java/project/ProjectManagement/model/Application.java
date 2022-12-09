package project.ProjectManagement.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "applications")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    @Column(length = 35, unique = true)
    private String application_name;

    @Column(length = 100)
    private String application_short_dsc;

    @Column(length = 20)
    private String application_device;

    @Column(length = 35)
    private String application_type;

    @Column(length = 50)
    private String application_programming_language;

    @Column(length = 35)
    private String application_database;

    @Column(length = 35)
    private String application_server;

    @Column(length = 50)
    private String application_operating_system;

    @Column(length = 10)
    private String server;

//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name = "")
//    private ListFilter listFilter;

    public Application(Long id, String application_name, String application_short_dsc, String application_device, String application_type, String application_programming_language, String application_database, String application_server, String application_operating_system, String server) {
        this.id = id;
        this.application_name = application_name;
        this.application_short_dsc = application_short_dsc;
        this.application_device = application_device;
        this.application_type = application_type;
        this.application_programming_language = application_programming_language;
        this.application_database = application_database;
        this.application_server = application_server;
        this.application_operating_system = application_operating_system;
        this.server = server;
    }

    public Application() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApplication_name() {
        return application_name;
    }

    public void setApplication_name(String application_name) {
        this.application_name = application_name;
    }

    public String getApplication_short_dsc() {
        return application_short_dsc;
    }

    public void setApplication_short_dsc(String application_short_dsc) {
        this.application_short_dsc = application_short_dsc;
    }

    public String getApplication_device() {
        return application_device;
    }

    public void setApplication_device(String application_device) {
        this.application_device = application_device;
    }

    public String getApplication_type() {
        return application_type;
    }

    public void setApplication_type(String application_type) {
        this.application_type = application_type;
    }

    public String getApplication_programming_language() {
        return application_programming_language;
    }

    public void setApplication_programming_language(String application_programming_language) {
        this.application_programming_language = application_programming_language;
    }

    public String getApplication_database() {
        return application_database;
    }

    public void setApplication_database(String application_database) {
        this.application_database = application_database;
    }

    public String getApplication_server() {
        return application_server;
    }

    public void setApplication_server(String application_server) {
        this.application_server = application_server;
    }

    public String getApplication_operating_system() {
        return application_operating_system;
    }

    public void setApplication_operating_system(String application_operating_system) {
        this.application_operating_system = application_operating_system;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }
}
