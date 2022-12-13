package raf.rs.domaci3.model;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class Permission {
    private int canCreateUser;
    private int canReadUser;
    private int canUpdateUser;
    private int canDeleteUser;
}
