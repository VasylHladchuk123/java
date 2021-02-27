package vasia.cardetailsshop.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@Entity
public class Supplier {
    @Id
    private String id;
    private String businessName;
    private String director;
    private String address;
    private String number;
    private String whatProductSupply;
    private String businessBill;
    private String description;
    private Date startedWorkTogether;
    @OneToMany(mappedBy = "supplier")
    private Set<Product> products;
}
