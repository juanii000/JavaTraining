package com.juani.exercises.service;

import com.juani.exercises.model.Item;
import com.juani.exercises.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShoppingCartService {

    @Autowired
    private CartItemRepository repository;

    public Item addItem(Item cartItem) {
        return repository.save(cartItem);
    }

    public Optional<Item> getItem(String id) {
        return repository.findById(id);
    }

    public Iterable<Item> getAllItems() {
        return repository.findAll();
    }

    public Item updateItem(Item cartItem) {
        return repository.save(cartItem);
    }

    public void deleteCartItem(String id) {
        repository.deleteById(id);
    }
}
