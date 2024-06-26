package com.spring.calculator.service;

import com.spring.calculator.model.Number;
import com.spring.calculator.repositories.NumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NumberServiceImpl implements NumberService{
    @Autowired
    private NumberRepository numberRepository;
    @Override
    public List<Number> getAll() {
        return numberRepository.findAll();
    }
    @Override
    public void save(Number number) {
        numberRepository.save(number);
    }

    @Override
    public Number getById(int id) {
        return numberRepository.findById(id);
    }

    @Override
    public void update(Number number) {
        numberRepository.save(number);
    }

    @Override
    public void delete(int id) {
        numberRepository.deleteById(id);
    }
}
