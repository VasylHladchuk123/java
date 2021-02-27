package vasia.cardetailsshop.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Data
@Entity
public class Client {
    @Id
    private String id;
    private String name;
    private String surname;
    private String number;
    private String email;
    private String description;
    @OneToMany(mappedBy = "client")
    private Set<Order> orders;
}
