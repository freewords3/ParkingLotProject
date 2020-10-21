package pl.project.cars;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;
    private String mark;
    private String color;
    private String ownername;
    private String numberplate;

    protected Cars() {
    }

    protected Cars(String name, String email, String address, String ownername, String numberplate) {
        this.model = model;
        this.mark = mark;
        this.color = color;
        this.ownername = ownername;
        this.numberplate = numberplate;
    }
}
