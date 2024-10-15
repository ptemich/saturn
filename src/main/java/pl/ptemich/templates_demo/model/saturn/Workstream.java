package pl.ptemich.templates_demo.model.saturn;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Workstream extends AbstractEntity {

    private String name;

    @ManyToOne
    private Project project;

    @OneToMany(mappedBy = "workstream", cascade = CascadeType.ALL)
    private List<Process> processes = new ArrayList<>();

}
