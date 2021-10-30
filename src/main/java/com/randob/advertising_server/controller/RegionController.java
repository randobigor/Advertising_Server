package com.randob.advertising_server.controller;

import com.randob.advertising_server.model.Region;
import com.randob.advertising_server.reposiroy.RegionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author randobigor
 **/

@RestController
@RequestMapping("/regions")
public class RegionController {
  private final RegionRepository regionRepository;

  public RegionController(RegionRepository regionRepository) {
    this.regionRepository = regionRepository;
  }

  @GetMapping
  public List<Region> getAllRegions() {
    return regionRepository.findAll();
  }
}
