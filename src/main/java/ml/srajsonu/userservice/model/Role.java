package ml.srajsonu.userservice.model;

import javax.persistence.*;
import java.security.Permissions;
import java.util.List;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name = "role-permission",
            joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "permission_id", referencedColumnName = "id")
    )
    private List<Permission> permissions;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "roles")
    private  List<User> users;
}
