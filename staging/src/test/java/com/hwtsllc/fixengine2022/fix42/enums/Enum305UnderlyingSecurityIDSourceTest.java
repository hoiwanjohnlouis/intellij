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

package com.hwtsllc.fixengine2022.fix42.enums;

import org.junit.jupiter.api.*;

class Enum305UnderlyingSecurityIDSourceTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @BeforeAll
    static void beforeAll() {
    }

    @AfterAll
    static void afterAll() {
    }

    @Test
    void Enum0305Test() {
        Enum305UnderlyingSecurityIDSource enumType;

        /*
         * 1-9 msg types
         */
        enumType = Enum305UnderlyingSecurityIDSource.CUSIP;
        enumType = Enum305UnderlyingSecurityIDSource.SEDOL;
        enumType = Enum305UnderlyingSecurityIDSource.QUIK;
        enumType = Enum305UnderlyingSecurityIDSource.ISIN;
        enumType = Enum305UnderlyingSecurityIDSource.RIC;
        enumType = Enum305UnderlyingSecurityIDSource.ISO_CURRENCY_CODE;
        enumType = Enum305UnderlyingSecurityIDSource.ISO_COUNTRY_CODE;
        enumType = Enum305UnderlyingSecurityIDSource.EXCHANGE_SYMBOL;
        enumType = Enum305UnderlyingSecurityIDSource.CTA;
        enumType = Enum305UnderlyingSecurityIDSource.CUSIP;

        /*
         * A-L msg types
         */
        enumType = Enum305UnderlyingSecurityIDSource.BLOOMBERG;
        enumType = Enum305UnderlyingSecurityIDSource.WERTPAPIER;
        enumType = Enum305UnderlyingSecurityIDSource.DUTCH;
        enumType = Enum305UnderlyingSecurityIDSource.VALOREN;
        enumType = Enum305UnderlyingSecurityIDSource.SICOVAM;
        enumType = Enum305UnderlyingSecurityIDSource.BELGIAN;
        enumType = Enum305UnderlyingSecurityIDSource.COMMON;
        enumType = Enum305UnderlyingSecurityIDSource.CLEARING_HOUSE_OR_ORGANIZATION;
        enumType = Enum305UnderlyingSecurityIDSource.ISDA_PRODUCT_SPECIFICATION;
        enumType = Enum305UnderlyingSecurityIDSource.OPTION_PRICE_REPORTING_AUTHORITY;
        enumType = Enum305UnderlyingSecurityIDSource.ISDA_PRODUCT_URL;
        enumType = Enum305UnderlyingSecurityIDSource.LETTER_OF_CREDIT;
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}