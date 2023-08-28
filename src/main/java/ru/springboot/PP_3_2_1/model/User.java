package ru.springboot.PP_3_2_1.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "Name should not be empty.") // https://www.baeldung.com/java-validation
    @NotBlank
    // может применяться только к текстовым значениям и проверяет, что свойство не является нулевым или пробелом.
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters.")
    @Column(name = "name")
    private String name;
    @NotEmpty(message = "Surname should not be empty.")
    @Column(name = "surname")
    private String surname;
    @NotEmpty(message = "Email should not be empty.")
    @Email(message = "Email should be valid.")
    @Column(name = "email")
    private String email;

    public User() {

    }

    public User(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = (long) id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
