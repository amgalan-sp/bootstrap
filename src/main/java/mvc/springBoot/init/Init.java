package mvc.springBoot.init;

import mvc.springBoot.entity.Role;
import mvc.springBoot.entity.User;
import mvc.springBoot.service.RoleService;
import mvc.springBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Component
public class Init {
    @Autowired
    private UserService userService;
    private RoleService roleService;

    public Init(RoleService roleService) {
        this.roleService = roleService;
    }

    @PostConstruct
    private void postConstruct() {
        Role adminRole = new Role((long)1,  "ROLE_ADMIN");
        Role userRole = new Role((long)2,  "ROLE_USER");
        roleService.saveRole(adminRole);
        roleService.saveRole(userRole);
        User adminUser = new User(1,"Иван", "Иванов", 30, "admin", "admin");
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRoles(adminRoles);
        userService.saveUser(adminUser);
    }
}
