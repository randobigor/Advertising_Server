package com.randob.advertising_server.reposiroy;

import com.randob.advertising_server.model.Advert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdvertRepository extends JpaRepository<Advert, Long> {
  List<Advert> findByCategoryId(Long category_id);
}
