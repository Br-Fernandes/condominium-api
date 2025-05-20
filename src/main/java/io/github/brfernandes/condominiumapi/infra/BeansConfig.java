package io.github.brfernandes.condominiumapi.infra;

import io.github.brfernandes.condominiumapi.core.ports.*;
import io.github.brfernandes.condominiumapi.core.services.ResidentService;
import io.github.brfernandes.condominiumapi.core.services.UserService;
import io.github.brfernandes.condominiumapi.core.services.VisitorService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public UserServicePort userServiceImpl(UserRepositoryPort userRepositoryPort) {
        return new UserService(userRepositoryPort);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public ResidentServicePort residentServiceImpl(ResidentRepositoryPort residentRepositoryPort) {
        return new ResidentService(residentRepositoryPort);
    }

    @Bean
    public VisitorServicePort visitorServicePort(VisitorRepositoryPort visitorRepositoryPort) {
        return new VisitorService(visitorRepositoryPort);
    }
}
