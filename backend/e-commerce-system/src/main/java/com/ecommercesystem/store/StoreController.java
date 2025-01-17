package com.ecommercesystem.store;

import com.ecommercesystem.product.entity.books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin()
@RequestMapping("ecommerce")
public class StoreController {
    @Autowired
    private StoreService storeService;
    @PostMapping(path = "/store")
    public List<books> GetAllBooks (@RequestParam String category){
        return storeService.GetBooks(category);
    }
    @PostMapping(path = "/search")
    @ResponseBody
    public List<books> GetSearchedBooks (@RequestParam String keyword){
        System.out.println(keyword);
        return storeService.GetSerchBooks(keyword);
    }

}
