package com.randob.advertising_server.reposiroy;

import com.randob.advertising_server.model.Picture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PictureRepository extends JpaRepository<Picture, Long> {
}
