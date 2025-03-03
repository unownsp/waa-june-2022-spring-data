package lab3.lab3.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
public class Review {
    @Id
    @GeneratedValue
    private int id;
    private String comment;

    //@JsonBackReference
//    @OneToOne
//    private User user;
}
