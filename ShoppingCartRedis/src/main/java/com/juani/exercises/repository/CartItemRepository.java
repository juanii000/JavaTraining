package com.juani.exercises.repository;

import com.juani.exercises.model.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends CrudRepository<Item, String> {
}
