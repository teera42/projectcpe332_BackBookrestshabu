package com.mikestudio.Spring_first.Controllers;

import com.mikestudio.Spring_first.Models.Table;
import com.mikestudio.Spring_first.Services.TableService;
import jakarta.annotation.Priority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.ErrorResponseException;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TableController {

    @Autowired
    private TableService tableService;



    @GetMapping("/0/table")
    public Iterable<Table> getAllTables(){
        return  tableService.get();
    }

    @DeleteMapping("/0/table/{tableType}/{tableNumberType}")
    public void deleteTable(@PathVariable String tableType, @PathVariable Integer tableNumberType){
        tableService.deleteTable(tableType, tableNumberType);
    }
    @PostMapping("/0/table")
    public Table createTable(@RequestBody Table table){
        table.setCreatedAt(LocalDateTime.now());
        tableService.put(table);

        return table;
    }



}
