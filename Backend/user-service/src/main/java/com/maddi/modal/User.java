package com.maddi.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {


@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private  Long id;

    private  String fullname;

    @NotBlank (message="username is manatory")
    private  String username;

    @NotBlank(message="Email is manatory")
    @Email(message = "email should be vallid")
    private  String email;

    private  String phone;

    @NotBlank (message="role is manatory")
    private  String role;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private  LocalDateTime updatedAt;

    @NotBlank(message="password is manatory")
    private  String pass;



}
