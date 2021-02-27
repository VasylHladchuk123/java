package vasia.cardetailsshop.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Data
@Entity
public class Product {
    @Id
    private Long id;
    private String name;
    private String description;
    private Integer countOfAvailability;
    private BigDecimal price;
    @OneToMany(mappedBy = "product")
    private Set<Order> orders;
    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;
}