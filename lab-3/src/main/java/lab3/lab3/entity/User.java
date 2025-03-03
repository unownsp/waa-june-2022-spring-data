package lab3.lab3.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    //@JsonManagedReference
    @OneToMany
    @JoinColumn
    private List<Review> reviews;

    @OneToOne
    private Address address;

}
