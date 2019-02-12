//package styudy.spring.youngvly.secure.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import javax.persistence.Entity;
//import java.util.List;
//
//@Entity
//@Getter
//public class User implements UserDetails {
//    private String id;
//    private String password;
//    private boolean isEnable;
//    private List<GrantedAuthority> authorities;
//
//    public User(String id, String password, boolean isEnable, List<GrantedAuthority> authentications) {
//        this.id = id;
//        this.password = password;
//        this.isEnable = isEnable;
//        this.authorities = authentications;
//    }
//
//    @Override
//    public List<GrantedAuthority> getAuthorities() {
//        return authorities;
//    }
//
//    @Override
//    public String getUsername() {
//        return null;
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return false;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return false;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return false;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return false;
//    }
//}
