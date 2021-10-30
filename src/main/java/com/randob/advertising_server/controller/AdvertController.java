package com.randob.advertising_server.controller;

import com.randob.advertising_server.model.Advert;
import com.randob.advertising_server.model.AllTimeReport;
import com.randob.advertising_server.model.Picture;
import com.randob.advertising_server.reposiroy.AdvertRepository;
import com.randob.advertising_server.reposiroy.AllTimeReportRepository;
import com.randob.advertising_server.reposiroy.PictureRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class AdvertController {
  private final AdvertRepository advertRepository;
  private final PictureRepository pictureRepository;
  private final AllTimeReportRepository dailyRepository;

  public AdvertController(AdvertRepository advertRepository, PictureRepository pictureRepository, AllTimeReportRepository dailyRepository) {
    this.advertRepository = advertRepository;
    this.pictureRepository = pictureRepository;
    this.dailyRepository = dailyRepository;
  }

  @GetMapping
  public List<Advert> getAllAdverts() {
    return advertRepository.findAll();
  }

  @GetMapping("/ac/{id}")
  public List<Advert> getAdvertsByCategoryId(@PathVariable Long id) {
    return advertRepository.findByCategoryId(id);
  }

  @GetMapping("/{id}")
  public Advert getAdvertById(@PathVariable("id") Long id) {
    return advertRepository.findById(id).get();
  }

  @PostMapping
  public Advert submitAdvert(@RequestBody Advert advert) {
    //All this logic will be in service
    List<Picture> pictures = advert.getPictures();
    if (pictures != null) {
      for(Picture picture : pictures) {
        pictureRepository.save(picture);
      }
    }
    return advertRepository.save(advert);
  }

  @GetMapping("test")
  public List<AllTimeReport> getDailyReport() {
    return dailyRepository.findAll();
  }
}
