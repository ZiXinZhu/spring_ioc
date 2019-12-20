package com.tinelion.service.imp;

import com.tinelion.service.AnnotationService;
import org.springframework.stereotype.Service;

@Service("annotationService")
public class IAnnotationService implements AnnotationService {
    public String sayAnnotation() {
        return "hello annotation !";
    }
}
