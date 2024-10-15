package pl.ptemich.templates_demo.model.jupiter;

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
public class Task extends AbstractEntity {

    private String name;

    @ManyToOne
    private Process process;

    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL)
    private List<DocumentLinking> linkings = new ArrayList<>();

}
