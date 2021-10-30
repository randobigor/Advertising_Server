//package com.randob.advertising_server.service;
//
//import com.randob.advertising_server.model.Advert;
//import com.randob.advertising_server.model.Picture;
//import com.randob.advertising_server.reposiroy.AdvertRepository;
//import com.randob.advertising_server.reposiroy.PictureRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//@Service
//public class AdvertService {
//  private final AdvertRepository advertRepository;
//  private final PictureRepository pictureRepository;
//
//  @Autowired
//  public AdvertService(AdvertRepository advertRepository, PictureRepository pictureRepository) {
//    this.advertRepository = advertRepository;
//    this.pictureRepository = pictureRepository;
//  }
//
//  public Advert save(Advert advert) {
//    if(advert.getPictures() != null) {
//      for (Picture picture : advert.getPictures()) {
//        pictureRepository.save(picture);
//      }
//    }
//
//    return advertRepository.save(advert);
//  }
//}
