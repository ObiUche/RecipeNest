package com.recipenest.app.repository;

import com.recipenest.app.entity.Chef;
import org.springframework.data.repository.CrudRepository;

public interface ChefRepository extends CrudRepository<Chef, Long> {
}
