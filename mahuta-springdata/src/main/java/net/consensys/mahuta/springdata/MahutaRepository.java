package net.consensys.mahuta.springdata;

import java.io.Serializable;
import java.util.Map;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * MahutaRepository represents the union of a PagingAndSortingRepository and a MahutaCustomRepository
 *
 * @param <E>  Entity type
 * @param <ID> Entity ID type
 * @author Gregoire Jeanmart <gregoire.jeanmart@consensys.net>
 */
public interface MahutaRepository<E, I extends Serializable> extends PagingAndSortingRepository<E, I>, MahutaCustomRepository<E> {


    /**
     * Save a document with external indexes
     *
     * @param entity Entity to save
     * @return Entity saved
     */
    <S extends E> S save(S entity, Map<String, Object> externalIndexFields);
}

