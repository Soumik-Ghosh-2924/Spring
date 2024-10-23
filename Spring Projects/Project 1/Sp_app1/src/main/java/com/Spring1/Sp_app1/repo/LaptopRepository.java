package com.Spring1.Sp_app1.repo;

import com.Spring1.Sp_app1.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository
{
    public void save(Laptop lap)
    {
        System.out.println("Saved the laptop Data.");
    }
}
