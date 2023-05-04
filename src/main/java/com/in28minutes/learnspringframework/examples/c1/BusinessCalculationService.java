package com.in28minutes.learnspringframework.examples.c1;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * The Business Calculation Service.
 *
 * @author Architecture - raulp
 * @since jdk 1.17
 * @version 4 May 2023 - 16:17:05
 */
@Data
@Service
@AllArgsConstructor
public class BusinessCalculationService {

    /** The dataService repository.*/
    DataService dataService;

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }

}
