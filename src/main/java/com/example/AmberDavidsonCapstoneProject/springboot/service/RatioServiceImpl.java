package com.example.AmberDavidsonCapstoneProject.springboot.service;

import com.example.AmberDavidsonCapstoneProject.springboot.model.Ratio;
import com.example.AmberDavidsonCapstoneProject.springboot.repository.RatioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatioServiceImpl implements RatioService {

    private RatioRepository ratioRepository;

    @Autowired
    public RatioServiceImpl(RatioRepository ratioRepository) {
        this.ratioRepository = ratioRepository;
    }

    @Override
    public List<Ratio> getAllRatios() {
        return null;
    }

    @Override
    public Ratio getRatioById(long id) {
        return ratioRepository.getOne(id);
    }
}
