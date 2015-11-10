package com.theironyard;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by alhanger on 11/10/15.
 */
public interface BeerRepository extends CrudRepository<Beer, Integer> {
}
