package io.github.brfernandes.apiacesso.adapter.repositories;

import io.github.brfernandes.apiacesso.adapter.entities.PersonEntity;
import io.github.brfernandes.apiacesso.adapter.entities.ResidentEntity;
import io.github.brfernandes.apiacesso.core.domain.Person;
import io.github.brfernandes.apiacesso.core.domain.Resident;
import org.hibernate.StaleObjectStateException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class ResidentRepositoryAdapterTest {

    @Mock
    private ResidentRepository residentRepository;
    @Mock
    private PersonRepositoryAdapter personRepositoryAdapter;
    @Mock
    private ModelMapper modelMapper;

    @InjectMocks
    ResidentRepositoryAdapter repositoryAdapter;

    private Resident resident;
    private ResidentEntity residentEntity;

    @BeforeEach
    void setUp() {
        resident = new Resident(1L, "12345678900", "Endereco 1", "123456789", new Person());
        residentEntity = new ResidentEntity(1L, "12345678900", "Endereco 1", "123456789", new PersonEntity());
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void createResident() {
        when(modelMapper.map(resident, ResidentEntity.class)).thenReturn(residentEntity);
        when(residentRepository.save(residentEntity)).thenReturn(residentEntity);
        when(modelMapper.map(residentEntity, Resident.class)).thenReturn(resident);

        Resident result = repositoryAdapter.createResident(resident);

        assertNotNull(result);
        assertEquals(resident.getCpf(), result.getCpf());

        verify(modelMapper).map(resident, ResidentEntity.class);
        verify(residentRepository).save(residentEntity);
        verify(modelMapper).map(residentEntity, Resident.class);
    }

    @Test
    void createResident_staleObjectStateException() {
        // Configurar o comportamento do ModelMapper
        when(modelMapper.map(resident, ResidentEntity.class)).thenReturn(residentEntity);

        // Fazer o mock do método save para lançar StaleObjectStateException
        //when(residentRepository.save(residentEntity)).thenThrow(new StaleObjectStateException("ResidentEntity", new ResidentEntity()));

        // Verificar se a exceção é lançada
        assertThrows(StaleObjectStateException.class, () -> {
            repositoryAdapter.createResident(resident);
        });

        // Verificar interações com mocks
        verify(modelMapper).map(resident, ResidentEntity.class);
        verify(residentRepository).save(residentEntity);
    }
}