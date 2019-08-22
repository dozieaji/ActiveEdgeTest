package com.exercise.CrudeOperationApplication.dao;

import org.springframework.data.repository.CrudRepository;

import com.exercise.crudProject.model.Stock;

public interface StockDao extends CrudRepository<Stock, Integer> {

}
