package com.codegym.bms.repository;

import java.util.List;

public interface Repository<T> {
    void create(T model);

    List<T> findAll();

    T findById(Long id);

    void remove(Long id);
}
