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

package com.hwtsllc.fixengine2022.fix27.enums;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Enum22SecurityIDSourceTest {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

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
    void Enum0022Test() {
        Enum22SecurityIDSource enumType;

        /*
         * 1-9
         */
        enumType = Enum22SecurityIDSource.CUSIP;
        assertEquals("1", enumType.getAction());
        assertEquals("CUSIP", enumType.getName());
        assertEquals("1 - CUSIP - Committee on Uniform Securities Identification Procedures", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum22SecurityIDSource.SEDOL;
        assertEquals("2", enumType.getAction());
        assertEquals("SEDOL", enumType.getName());
        assertEquals("2 - SEDOL - Stock Exchange Daily Official List", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum22SecurityIDSource.QUIK;
        assertEquals("3", enumType.getAction());
        assertEquals("QUIK", enumType.getName());
        assertEquals("3 - QUIK", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum22SecurityIDSource.ISIN;
        assertEquals("4", enumType.getAction());
        assertEquals("ISIN", enumType.getName());
        assertEquals("4 - ISIN - The International Securities Identification Number", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum22SecurityIDSource.RIC;
        assertEquals("5", enumType.getAction());
        assertEquals("RIC", enumType.getName());
        assertEquals("5 - RIC - Reuters Instrument Code", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum22SecurityIDSource.ISO_CURRENCY_CODE;
        assertEquals("6", enumType.getAction());
        assertEquals("ISO_CURRENCY_CODE", enumType.getName());
        assertEquals("6 - ISO Currency Code", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum22SecurityIDSource.ISO_COUNTRY_CODE;
        assertEquals("7", enumType.getAction());
        assertEquals("ISO_COUNTRY_CODE", enumType.getName());
        assertEquals("7 - ISO Country Code", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum22SecurityIDSource.EXCHANGE_SYMBOL;
        assertEquals("8", enumType.getAction());
        assertEquals("EXCHANGE_SYMBOL", enumType.getName());
        assertEquals("8 - Exchange Symbol", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum22SecurityIDSource.CTA;
        assertEquals("9", enumType.getAction());
        assertEquals("CTA", enumType.getName());
        assertEquals("9 - Consolidated Tape Association (CTA) Symbol (SIAC CTS/CQS line format)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        /*
         * A-L
         */
        enumType = Enum22SecurityIDSource.BLOOMBERG;
        assertEquals("A", enumType.getAction());
        assertEquals("BLOOMBERG", enumType.getName());
        assertEquals("A - Bloomberg Symbol", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum22SecurityIDSource.WERTPAPIER;
        assertEquals("B", enumType.getAction());
        assertEquals("WERTPAPIER", enumType.getName());
        assertEquals("B - Wertpapier", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum22SecurityIDSource.DUTCH;
        assertEquals("C", enumType.getAction());
        assertEquals("DUTCH", enumType.getName());
        assertEquals("C - Dutch", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum22SecurityIDSource.VALOREN;
        assertEquals("D", enumType.getAction());
        assertEquals("VALOREN", enumType.getName());
        assertEquals("D - Valoren", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum22SecurityIDSource.SICOVAM;
        assertEquals("E", enumType.getAction());
        assertEquals("SICOVAM", enumType.getName());
        assertEquals("E - Sicovam", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum22SecurityIDSource.BELGIAN;
        assertEquals("F", enumType.getAction());
        assertEquals("BELGIAN", enumType.getName());
        assertEquals("F - Belgian", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum22SecurityIDSource.COMMON;
        assertEquals("G", enumType.getAction());
        assertEquals("COMMON", enumType.getName());
        assertEquals("G - Common (Clearstream and Euroclear)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum22SecurityIDSource.CLEARING_HOUSE_OR_ORGANIZATION;
        assertEquals("H", enumType.getAction());
        assertEquals("CLEARING_HOUSE_OR_ORGANIZATION", enumType.getName());
        assertEquals("H - Clearing House or Clearing Organization", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum22SecurityIDSource.ISDA_PRODUCT_SPECIFICATION;
        assertEquals("I", enumType.getAction());
        assertEquals("ISDA_PRODUCT_SPECIFICATION", enumType.getName());
        assertEquals("I - ISDA/FpML Product Specification (XML in EncodedSecurityDesc)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum22SecurityIDSource.OPTION_PRICE_REPORTING_AUTHORITY;
        assertEquals("J", enumType.getAction());
        assertEquals("OPTION_PRICE_REPORTING_AUTHORITY", enumType.getName());
        assertEquals("J - Option Price Reporting Authority", enumType.getDescription());
        assertNotEquals("11", enumType.getAction());

        enumType = Enum22SecurityIDSource.ISDA_PRODUCT_URL;
        assertEquals("K", enumType.getAction());
        assertEquals("ISDA_PRODUCT_URL", enumType.getName());
        assertEquals("K - ISDA/FpML Product URL (URL in SecurityID)", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());

        enumType = Enum22SecurityIDSource.LETTER_OF_CREDIT;
        assertEquals("L", enumType.getAction());
        assertEquals("LETTER_OF_CREDIT", enumType.getName());
        assertEquals("L - Letter of Credit", enumType.getDescription());
        assertNotEquals("junkAction", enumType.getAction());
        assertNotEquals("junkName", enumType.getName());
        assertNotEquals("junkDescription", enumType.getDescription());
    }
}