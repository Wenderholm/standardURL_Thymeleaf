package com.example.adresythymeleaf;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class PictureRepository {
    private final Map<String, Picture> pictures = new HashMap<>();

    PictureRepository(){
        Picture dogPicture = new Picture("dog", "Pies w okularach", "dog.jpg");
        Picture catPicture = new Picture("cat", "Kot na zdjeciu", "cat.jpg");
        Picture mousePicture = new Picture("mouse", "Mysz na obrazku", "mouse.jpg");
        pictures.put(dogPicture.getId(), dogPicture);
        pictures.put(catPicture.getId(), catPicture);
        pictures.put(mousePicture.getId(), mousePicture);
    }

    Picture findById(String id){
        return pictures.get(id);
    }

    Collection<Picture> findAll(){
        return pictures.values();
    }

}
