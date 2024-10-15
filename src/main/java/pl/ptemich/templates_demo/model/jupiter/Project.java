package pl.ptemich.templates_demo.model.jupiter;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Project extends AbstractEntity {

    private String name;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private List<Workstream> workstreams = new ArrayList<>();

}
