package com.juani.exercises.service;

import com.juani.exercises.model.Item;
import com.juani.exercises.repository.ItemRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ShoppingCartServiceTest {

    @Mock
    private ItemRepository repository;

    @InjectMocks
    private ShoppingCartService service;

    public ShoppingCartServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllItems() {
        List<Item> mockItems = new ArrayList<>();
        mockItems.add(new Item());
        when(repository.findAll()).thenReturn(mockItems);

        List<Item> items = service.getAllItems();
        assertEquals(1, items.size());
    }

    @Test
    public void testGetItemById() {
        Item item = new Item();
        when(repository.findById(1L)).thenReturn(Optional.of(item));

        Optional<Item> foundItem = service.getItemById(1L);
        assertTrue(foundItem.isPresent());
    }

    @Test
    public void testAddItem() {
        Item item = new Item();
        when(repository.save(item)).thenReturn(item);

        Item savedItem = service.addItem(item);
        assertNotNull(savedItem);
    }

    @Test
    public void testUpdateItem() {
        Item existingItem = new Item();
        existingItem.setName("Old Name");
        when(repository.findById(1L)).thenReturn(Optional.of(existingItem));

        Item updatedDetails = new Item();
        updatedDetails.setName("New Name");

        when(repository.save(existingItem)).thenReturn(existingItem);

        Item updatedItem = service.updateItem(1L, updatedDetails);
        assertEquals("New Name", updatedItem.getName());
    }

    @Test
    public void testDeleteItem() {
        doNothing().when(repository).deleteById(1L);

        service.deleteItem(1L);

        verify(repository, times(1)).deleteById(1L);
    }
}
