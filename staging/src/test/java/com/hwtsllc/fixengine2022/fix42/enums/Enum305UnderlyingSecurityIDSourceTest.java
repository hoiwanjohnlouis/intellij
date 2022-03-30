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

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum305UnderlyingSecurityIDSourceTest {
    /**
     *  Information is the same for TAGS 22, 305, 456, 459,
     */
    @Test
    void Enum0305Test() {
        Enum305UnderlyingSecurityIDSource enumType;

        /*
         * 1-9
         */
        enumType = Enum305UnderlyingSecurityIDSource.CUSIP;
        assertEquals("1", enumType.getID());
        assertEquals("CUSIP", enumType.getName());
        assertEquals("1 - CUSIP - Committee on Uniform Securities Identification Procedures", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum305UnderlyingSecurityIDSource.SEDOL;
        assertEquals("2", enumType.getID());
        assertEquals("SEDOL", enumType.getName());
        assertEquals("2 - SEDOL - Stock Exchange Daily Official List", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum305UnderlyingSecurityIDSource.QUIK;
        assertEquals("3", enumType.getID());
        assertEquals("QUIK", enumType.getName());
        assertEquals("3 - QUIK", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum305UnderlyingSecurityIDSource.ISIN;
        assertEquals("4", enumType.getID());
        assertEquals("ISIN", enumType.getName());
        assertEquals("4 - ISIN - The International Securities Identification Number", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum305UnderlyingSecurityIDSource.RIC;
        assertEquals("5", enumType.getID());
        assertEquals("RIC", enumType.getName());
        assertEquals("5 - RIC - Reuters Instrument Code", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum305UnderlyingSecurityIDSource.ISO_CURRENCY_CODE;
        assertEquals("6", enumType.getID());
        assertEquals("ISO_CURRENCY_CODE", enumType.getName());
        assertEquals("6 - ISO Currency Code", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum305UnderlyingSecurityIDSource.ISO_COUNTRY_CODE;
        assertEquals("7", enumType.getID());
        assertEquals("ISO_COUNTRY_CODE", enumType.getName());
        assertEquals("7 - ISO Country Code", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum305UnderlyingSecurityIDSource.EXCHANGE_SYMBOL;
        assertEquals("8", enumType.getID());
        assertEquals("EXCHANGE_SYMBOL", enumType.getName());
        assertEquals("8 - Exchange Symbol", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum305UnderlyingSecurityIDSource.CTA;
        assertEquals("9", enumType.getID());
        assertEquals("CTA", enumType.getName());
        assertEquals("9 - Consolidated Tape Association (CTA) Symbol (SIAC CTS/CQS line format)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        /*
         * A-L
         */
        enumType = Enum305UnderlyingSecurityIDSource.BLOOMBERG;
        assertEquals("A", enumType.getID());
        assertEquals("BLOOMBERG", enumType.getName());
        assertEquals("A - Bloomberg Symbol", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum305UnderlyingSecurityIDSource.WERTPAPIER;
        assertEquals("B", enumType.getID());
        assertEquals("WERTPAPIER", enumType.getName());
        assertEquals("B - Wertpapier", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum305UnderlyingSecurityIDSource.DUTCH;
        assertEquals("C", enumType.getID());
        assertEquals("DUTCH", enumType.getName());
        assertEquals("C - Dutch", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum305UnderlyingSecurityIDSource.VALOREN;
        assertEquals("D", enumType.getID());
        assertEquals("VALOREN", enumType.getName());
        assertEquals("D - Valoren", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum305UnderlyingSecurityIDSource.SICOVAM;
        assertEquals("E", enumType.getID());
        assertEquals("SICOVAM", enumType.getName());
        assertEquals("E - Sicovam", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum305UnderlyingSecurityIDSource.BELGIAN;
        assertEquals("F", enumType.getID());
        assertEquals("BELGIAN", enumType.getName());
        assertEquals("F - Belgian", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum305UnderlyingSecurityIDSource.COMMON;
        assertEquals("G", enumType.getID());
        assertEquals("COMMON", enumType.getName());
        assertEquals("G - Common (Clearstream and Euroclear)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum305UnderlyingSecurityIDSource.CLEARING_HOUSE_OR_ORGANIZATION;
        assertEquals("H", enumType.getID());
        assertEquals("CLEARING_HOUSE_OR_ORGANIZATION", enumType.getName());
        assertEquals("H - Clearing House or Clearing Organization", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum305UnderlyingSecurityIDSource.ISDA_PRODUCT_SPECIFICATION;
        assertEquals("I", enumType.getID());
        assertEquals("ISDA_PRODUCT_SPECIFICATION", enumType.getName());
        assertEquals("I - ISDA/FpML Product Specification (XML in EncodedSecurityDesc)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum305UnderlyingSecurityIDSource.OPTION_PRICE_REPORTING_AUTHORITY;
        assertEquals("J", enumType.getID());
        assertEquals("OPTION_PRICE_REPORTING_AUTHORITY", enumType.getName());
        assertEquals("J - Option Price Reporting Authority", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum305UnderlyingSecurityIDSource.ISDA_PRODUCT_URL;
        assertEquals("K", enumType.getID());
        assertEquals("ISDA_PRODUCT_URL", enumType.getName());
        assertEquals("K - ISDA/FpML Product URL (URL in SecurityID)", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum305UnderlyingSecurityIDSource.LETTER_OF_CREDIT;
        assertEquals("L", enumType.getID());
        assertEquals("LETTER_OF_CREDIT", enumType.getName());
        assertEquals("L - Letter of Credit", enumType.getDescription());
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}