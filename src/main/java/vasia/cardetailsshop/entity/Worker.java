package vasia.cardetailsshop.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Worker {
    @Id
    private String id;
    private String name;
    private String surname;
    private String patronic;
    private String number;
    private Date birthday;
    private Date startedWork;
    private String job;
}
