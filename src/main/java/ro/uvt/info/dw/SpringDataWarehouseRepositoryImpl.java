package ro.uvt.info.dw;

import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.*;

@RequiredArgsConstructor
public class SpringDataWarehouseRepositoryImpl<E, K> implements WarehouseRepository<E, K> {
    private final CrudRepository<E, K> springDataRepository;
    @Override
    public E save(E entity) {
        return springDataRepository.save(entity);
    }
    @Override
    public void delete(E entity) {
        // TODO
    }
    @Override
    public void deleteAll(K partitionKey) {
        // TODO
    }
    @Override
    public E findLatest(K partitionKey) {
        // TODO
        return null;
    }
    @Override
    public Iterable<E> findAll(K partitionKey) {
        // TODO
        return null;
    } }