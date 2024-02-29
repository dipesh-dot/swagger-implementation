package com.swaggerimplementationproject.entiry;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_tb")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_tb_seq_gen")
   @SequenceGenerator(name = "user_tb_seq_gen",sequenceName ="user_tb_seq",allocationSize = 1)
    private Long id ;
    private String name;
    private String password;
    private int age;
    private String address;
}
