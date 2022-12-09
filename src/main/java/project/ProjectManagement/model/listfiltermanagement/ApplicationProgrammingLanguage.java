package project.ProjectManagement.model.listfiltermanagement;

import javax.persistence.*;

@Entity
@Table(name = "app_prog_lang")
public class ApplicationProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    private String app_prog_lang_name;

    public ApplicationProgrammingLanguage(Long id, String app_prog_lang_name) {
        this.id = id;
        this.app_prog_lang_name = app_prog_lang_name;
    }

    public ApplicationProgrammingLanguage() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApp_prog_lang_name() {
        return app_prog_lang_name;
    }

    public void setApp_prog_lang_name(String app_prog_lang_name) {
        this.app_prog_lang_name = app_prog_lang_name;
    }
}
