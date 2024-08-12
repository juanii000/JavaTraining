package com.juani.exercises.controller;

import com.juani.exercises.model.Item;
import com.juani.exercises.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/cart")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartService service;

    @PostMapping("/items")
    public ResponseEntity<Item> addItem(@RequestBody Item cartItem) {
        Item createdItem = service.addItem(cartItem);
        return ResponseEntity.ok(createdItem);
    }

    @GetMapping("/items/{id}")
    public ResponseEntity<Item> getItem(@PathVariable String id) {
        Optional<Item> cartItem = service.getItem(id);
        return cartItem.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/items")
    public ResponseEntity<Iterable<Item>> getAllItems() {
        Iterable<Item> allItems = service.getAllItems();
        return ResponseEntity.ok(allItems);
    }

    @PutMapping("/items/{id}")
    public ResponseEntity<Item> updateItem(@PathVariable String id, @RequestBody Item cartItem) {
        cartItem.setId(id);
        Item updatedItem = service.updateItem(cartItem);
        return ResponseEntity.ok(updatedItem);
    }

    @DeleteMapping("/items/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable String id) {
        service.deleteCartItem(id);
        return ResponseEntity.noContent().build();
    }
}
