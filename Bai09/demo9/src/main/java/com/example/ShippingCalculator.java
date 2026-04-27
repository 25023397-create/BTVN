package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShippingCalculator {
    private static final Logger logger =
            LoggerFactory.getLogger(ShippingCalculator.class);

    public double calculate(double weight, String type) {

        logger.info("Start calculating shipping: weight={}, type={}", weight, type);

        if (weight <= 0) {
            logger.error("Invalid weight: {}", weight);
            throw new IllegalArgumentException("Weight must be positive");
        }

        if ("EXPRESS".equals(type)) {
            double cost = weight * 5000 + 20000;
            logger.info("Calculated EXPRESS cost: {}", cost);
            return cost;
        }

        if ("STANDARD".equals(type)) {
            double cost = weight * 3000;
            logger.info("Calculated STANDARD cost: {}", cost);
            return cost;
        }

        logger.error("Unknown shipping type: {}", type);
        throw new IllegalArgumentException("Unknown type: " + type);
    }
}
