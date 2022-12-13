package raf.rs.domaci3.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String email;

    private String name;
    private String surname;
    private String password;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "can_create_user", column = @Column(name = "can_create_user")),
            @AttributeOverride(name = "can_read_user", column = @Column(name = "can_read_user")),
            @AttributeOverride(name = "can_update_user", column = @Column(name = "can_update_user")),
            @AttributeOverride(name = "can_delete_user", column = @Column(name = "can_delete_user"))
    })
    private Permission permission;

    public User() {

    }

    public User(String email, String name, String surname, String password, Permission permission) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.permission = permission;
    }
}
