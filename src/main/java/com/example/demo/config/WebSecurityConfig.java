package com.example.demo.config;


import com.example.demo.services.SecurityUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.web.util.matcher.AntPathRequestMatcher.antMatcher;

@Configuration
public class WebSecurityConfig {

    // Autorizar por Rol
    @Autowired
    SecurityUserDetailsService userDetailsService;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((authorizeHttpRequests) ->
                        authorizeHttpRequests
                                .requestMatchers(antMatcher(HttpMethod.GET, "/index")).permitAll()
                                .requestMatchers(antMatcher(HttpMethod.GET, "/login")).permitAll()
                                .requestMatchers(antMatcher(HttpMethod.GET, "/logout")).permitAll()
                                .requestMatchers(antMatcher(HttpMethod.POST, "/capacitacionBody")).permitAll()
                                .requestMatchers(antMatcher(HttpMethod.POST, "/formularioRegistro")).hasRole("ADMINISTRATIVO")
                                .requestMatchers(antMatcher(HttpMethod.POST, "/editarUsuario")).hasRole("ADMINISTRATIVO")
                                .requestMatchers(antMatcher(HttpMethod.POST, "/formularioPago")).hasRole("ADMINISTRATIVO")
                                .requestMatchers(antMatcher(HttpMethod.GET, "/crearCapacitacion")).hasRole("CLIENTE")
                                .requestMatchers(antMatcher(HttpMethod.GET, "/listaCapacitacion")).hasRole("CLIENTE")
                                .requestMatchers(antMatcher(HttpMethod.GET, "/listaVisita")).hasRole("PROFESIONAL")
                                .requestMatchers(antMatcher(HttpMethod.GET, "/formularioVisita")).hasRole("PROFESIONAL")
                                .requestMatchers(antMatcher(HttpMethod.GET, "/listaPagos")).hasRole("ADMINISTRATIVO")
                                .requestMatchers(antMatcher(HttpMethod.GET, "/contacto")).hasRole("CLIENTE")
                                .requestMatchers(antMatcher(HttpMethod.GET, "/crearUsuario")).hasRole("ADMINISTRATIVO")
                                .requestMatchers(antMatcher(HttpMethod.GET, "/listaUsuarios")).hasRole("ADMINISTRATIVO")
                                .anyRequest().permitAll()
                )
                .csrf(AbstractHttpConfigurer::disable)
                .formLogin((form) -> form
                        .loginPage("/login")
                        .permitAll()
                )
                .logout(logout ->
                        logout
                                .permitAll()
                                .logoutUrl("/logout")
                                .logoutSuccessUrl("/login")
                )
                .httpBasic(Customizer.withDefaults());
        return http.build();
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    @Bean
    SecurityFilterChain authenticationManager(HttpSecurity http, PasswordEncoder passwordEncoder) throws Exception {
        http
                .getSharedObject(AuthenticationManagerBuilder.class)
                .userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder);
        return http.build();
    }


}