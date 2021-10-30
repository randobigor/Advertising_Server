package com.randob.advertising_server.controller;

import com.randob.advertising_server.model.Category;
import com.randob.advertising_server.reposiroy.CategoryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("c")
public class CategoryController {
  private final CategoryRepository categoryRepository;

  public CategoryController(CategoryRepository categoryRepository) {
    this.categoryRepository = categoryRepository;
  }

  @GetMapping
  public List<Category> getAllCategories() {
    return categoryRepository.findAll();
  }

  @GetMapping("/{id}")
  public Category getCategoryById(@PathVariable("id") Long id) {
    return categoryRepository.findById(id).get();
  }

  @PostMapping
  public Category submitCategory(@RequestBody Category category) {
    return categoryRepository.save(category);
  }


}
