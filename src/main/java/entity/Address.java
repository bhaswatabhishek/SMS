package entity;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Address {

    private  Integer addressId;
    private  String contry;
    private String state;
    private String city;

    @Enumerated
    private  Addersstype addersses;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Employee employee;




}
