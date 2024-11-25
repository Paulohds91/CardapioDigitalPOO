package com.example.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
}
