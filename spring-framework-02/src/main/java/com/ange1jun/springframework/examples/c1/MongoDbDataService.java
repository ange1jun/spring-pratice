package com.ange1jun.springframework.examples.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Primary
//@Component
public class MongoDbDataService implements DataService {

    @Override
    public int[] retrieveData() {
        return new int[] { 11, 22, 33, 44, 55 };
    }
}
