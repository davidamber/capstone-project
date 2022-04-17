package com.example.AmberDavidsonCapstoneProject.springboot.service;
import com.example.AmberDavidsonCapstoneProject.springboot.model.Ratio;

import java.util.List;

public interface RatioService {
    List <Ratio> getAllRatios();
    // void saveRatio(Ratio ratio);
    Ratio getRatioById(long id);
    // void deleteRatioById(long id);
}
