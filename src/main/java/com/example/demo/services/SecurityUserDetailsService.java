package com.example.demo.services;

import com.example.demo.repositories.IUsuarioRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class SecurityUserDetailsService implements UserDetailsService {

    private final IUsuarioRepository userRepository;

    public SecurityUserDetailsService(IUsuarioRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        var optUser = userRepository.findByUsername(username);
        if (optUser.isPresent()) {
            Collection<? extends GrantedAuthority> authorities = optUser.get().getAuthorities()
                    .stream()
                    .map(role -> new SimpleGrantedAuthority("ROLE_".concat(role.getName().toString())))
                    .collect(Collectors.toSet());

            return new User(optUser.get().getUsername(),
                    optUser.get().getPassword(),
                    true,
                    true,
                    true,
                    true,
                    authorities);

        }
        throw new UsernameNotFoundException("Usuario no Encontrado" + username);
    }


}
