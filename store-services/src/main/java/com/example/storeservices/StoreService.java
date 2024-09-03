package com.example.storeservices;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StoreService {

    @Autowired
    private StoreRepository storeRepository;
//get all the records from the table
    public List<Store> getAllStores() {
        return storeRepository.findAll();
    }
//to get a specific record with id
    public Optional<Store> getStoreById(int id) {
        return storeRepository.findById(id);
    }
//save the record
    public Store saveStore(Store store) {
        return storeRepository.save(store);
    }
// deleting the paticular record with id
    public void deleteStore(int id) {
        storeRepository.deleteById(id);
    }
}
