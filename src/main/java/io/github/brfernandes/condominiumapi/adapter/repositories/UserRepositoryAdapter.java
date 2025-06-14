package io.github.brfernandes.condominiumapi.adapter.repositories;

import io.github.brfernandes.condominiumapi.adapter.entities.UserEntity;
import io.github.brfernandes.condominiumapi.core.domain.User;
import io.github.brfernandes.condominiumapi.core.ports.UserRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserRepositoryAdapter implements UserRepositoryPort {

    private final UserRepository userRepository;
    private final PersonRepositoryAdapter personRepository;
    private final ModelMapper modelMapper;

    @Override
    public User create(User user) {
        UserEntity userEntity = modelMapper.map(user, UserEntity.class);
        userEntity.setPersonEntity(personRepository.createPerson(user.getPerson()));
        UserEntity newUser = userRepository.save(userEntity);
        return modelMapper.map(newUser, User.class);
    }

    @Override
    public User obtainByEmail(String email) {
        UserEntity userByEmail = userRepository.findByEmail(email);
        if (userByEmail == null) {
            return null;
        }
        
        return modelMapper.map(userByEmail, User.class);
    }
}
