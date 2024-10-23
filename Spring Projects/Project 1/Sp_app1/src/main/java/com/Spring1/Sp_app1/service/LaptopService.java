package com.Spring1.Sp_app1.service;

import com.Spring1.Sp_app1.repo.LaptopRepository;
import com.Spring1.Sp_app1.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService
{
    @Autowired
    private LaptopRepository repo;
    public void addLaptop(Laptop lap)
    {
        System.out.println("Laptop Added.");

        repo.save(lap);
    }

    public boolean goodforProg(Laptop lap)
    {
        return true;
    }
}
