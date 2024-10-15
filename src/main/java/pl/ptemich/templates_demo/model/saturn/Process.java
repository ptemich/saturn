package pl.ptemich.templates_demo.model.saturn;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Process extends AbstractEntity {

    private String name;

    @ManyToOne
    private Workstream workstream;

    @OneToMany(mappedBy = "process", cascade = CascadeType.ALL)
    private List<Task> tasks = new ArrayList<>();

}
