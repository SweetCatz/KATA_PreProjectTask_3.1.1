package web.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.Objects;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @Size(min = 2, max = 20, message = "Поле 'Имя' должно содержать от 2 до 20 символов")
    private String name;

    @Column(name = "last_name")
    @Size(min = 2, max = 20, message = "Поле 'Фамилия' должно содержать от 2 до 20 символов")
    private String lastname;

    @Column(name = "age")
    @Min(value = 0, message = "Возраст должен быть больше чем 0")
    private byte age;

    @Column(name = "email")
    @NotEmpty(message = "Поле 'EMAIL' не должно быть пустым")
    @Email(message = "Поле 'EMAIL' должно быть корректным")
    private String email;

    @Column(name = "password")
    @Size(min = 4, max = 20, message = "Поле 'PASSWORD' должно содержать от 4 до 20 символов")
    private String password;

    public User() {
    }

    public User(Long id, String name, String lastname, byte age, String email, String password) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(lastname, user.lastname) && Objects.equals(email, user.email) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastname, age, email, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}