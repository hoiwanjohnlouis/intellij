/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hwtsllc.fixengine2022.datatypes;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 *
 * PriceType is a wrapper class for the Price field
 * Initially it will be a double, later on it may become BigDecimal.
 */
public class PriceType {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private double price;

    public PriceType(final double price) {
        this.price = price;
    }

    public double getPriceValue() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getPriceValue());
        return sb.toString();
    }
    /**
     *
     * @param args Not used.
     */
    public static void main(String[] args) {
        PriceType priceType = new PriceType(123.45d);
        System.out.println(priceType);
    }
}
