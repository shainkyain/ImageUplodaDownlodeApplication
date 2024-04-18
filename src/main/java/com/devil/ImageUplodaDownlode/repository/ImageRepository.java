package com.devil.ImageUplodaDownlode.repository;

import com.devil.ImageUplodaDownlode.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long > {
}
