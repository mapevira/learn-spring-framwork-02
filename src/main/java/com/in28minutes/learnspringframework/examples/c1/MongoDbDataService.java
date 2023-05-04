package com.in28minutes.learnspringframework.examples.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * The Mongo DB Data Service implementation class.
 *
 * @author Architecture - raulp
 * @since jdk 1.17
 * @version 4 May 2023 - 16:13:00
 */
@Repository
@Primary
public class MongoDbDataService implements DataService {

    @Override
    public int[] retrieveData() {
        return new int[] { 11, 22, 33, 44, 55 };
    }

}
