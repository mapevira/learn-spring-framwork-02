package com.in28minutes.learnspringframework.examples.c1;

import org.springframework.stereotype.Repository;

/**
 * MySQL Data Service implementation class.
 *
 * @author Architecture - raulp
 * @since jdk 1.17
 * @version 4 May 2023 - 16:14:09
 */
@Repository
public class MySqlDataService implements DataService {

    @Override
    public int[] retrieveData() {
        return new int[] { 1, 2, 3, 4, 5 };
    }

}
