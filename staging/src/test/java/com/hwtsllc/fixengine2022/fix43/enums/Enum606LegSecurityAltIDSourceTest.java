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

package com.hwtsllc.fixengine2022.fix43.enums;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum606LegSecurityAltIDSourceTest {
    /**
     *  606 (same as 22, 305, 456, 459, 603, 606, 761, 1096, 1105)
     *  Multileg instrument's individual  security’s SecurityAltIDSource.
     *  See SecurityAltIDSource (456) field for description.
     *              Same values as the SecurityIDSource (22) field
     *  Valid values:
     *      1 - CUSIP
     *      2 - SEDOL
     *      3 - QUIK
     *      4 - ISIN number
     *      5 - RIC code
     *      6 - ISO Currency Code
     *      7 - ISO Country Code
     *      8 - Exchange Symbol
     *      9 - Consolidated Tape Association (CTA) Symbol
     *              (SIAC CTS/CQS line format)
     *      A - Bloomberg Symbol
     *      B - Wertpapier
     *      C - Dutch
     *      D - Valoren
     *      E - Sicovam
     *      F - Belgian
     *      G - "Common" (Clearstream and Euroclear)
     *      H - Clearing House / Clearing Organization
     *      I - ISDA/FpML Product Specification
     *              (XML in EncodedSecurityDesc)
     *      J - Option Price Reporting Authority
     *      K - ISDA/FpML Product URL (URL in SecurityID)
     *      L - Letter of Credit
     */
    @Test
    void Enum0606Test() {
        Enum606LegSecurityAltIDSource enumType;

        /*
         * 1-9
         */
        enumType = Enum606LegSecurityAltIDSource.CUSIP;
        assertEquals("1", enumType.getID());
        assertEquals("CUSIP", enumType.getName());
        assertEquals("1 - CUSIP - Committee on Uniform Securities Identification Procedures", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum606LegSecurityAltIDSource.SEDOL;
        assertEquals("2", enumType.getID());
        assertEquals("SEDOL", enumType.getName());
        assertEquals("2 - SEDOL - Stock Exchange Daily Official List", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum606LegSecurityAltIDSource.QUIK;
        assertEquals("3", enumType.getID());
        assertEquals("QUIK", enumType.getName());
        assertEquals("3 - QUIK", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum606LegSecurityAltIDSource.ISIN;
        assertEquals("4", enumType.getID());
        assertEquals("ISIN", enumType.getName());
        assertEquals("4 - ISIN - The International Securities Identification Number", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum606LegSecurityAltIDSource.RIC;
        assertEquals("5", enumType.getID());
        assertEquals("RIC", enumType.getName());
        assertEquals("5 - RIC - Reuters Instrument Code", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum606LegSecurityAltIDSource.ISO_CURRENCY_CODE;
        assertEquals("6", enumType.getID());
        assertEquals("ISO_CURRENCY_CODE", enumType.getName());
        assertEquals("6 - ISO Currency Code", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum606LegSecurityAltIDSource.ISO_COUNTRY_CODE;
        assertEquals("7", enumType.getID());
        assertEquals("ISO_COUNTRY_CODE", enumType.getName());
        assertEquals("7 - ISO Country Code", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum606LegSecurityAltIDSource.EXCHANGE_SYMBOL;
        assertEquals("8", enumType.getID());
        assertEquals("EXCHANGE_SYMBOL", enumType.getName());
        assertEquals("8 - Exchange Symbol", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum606LegSecurityAltIDSource.CTA;
        assertEquals("9", enumType.getID());
        assertEquals("CTA", enumType.getName());
        assertEquals("9 - Consolidated Tape Association (CTA) Symbol (SIAC CTS/CQS line format)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());


        /*
         * A-L
         */
        enumType = Enum606LegSecurityAltIDSource.BLOOMBERG;
        assertEquals("A", enumType.getID());
        assertEquals("BLOOMBERG", enumType.getName());
        assertEquals("A - Bloomberg Symbol", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum606LegSecurityAltIDSource.WERTPAPIER;
        assertEquals("B", enumType.getID());
        assertEquals("WERTPAPIER", enumType.getName());
        assertEquals("B - Wertpapier", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum606LegSecurityAltIDSource.DUTCH;
        assertEquals("C", enumType.getID());
        assertEquals("DUTCH", enumType.getName());
        assertEquals("C - Dutch", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum606LegSecurityAltIDSource.VALOREN;
        assertEquals("D", enumType.getID());
        assertEquals("VALOREN", enumType.getName());
        assertEquals("D - Valoren", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum606LegSecurityAltIDSource.SICOVAM;
        assertEquals("E", enumType.getID());
        assertEquals("SICOVAM", enumType.getName());
        assertEquals("E - Sicovam", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum606LegSecurityAltIDSource.BELGIAN;
        assertEquals("F", enumType.getID());
        assertEquals("BELGIAN", enumType.getName());
        assertEquals("F - Belgian", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum606LegSecurityAltIDSource.COMMON;
        assertEquals("G", enumType.getID());
        assertEquals("COMMON", enumType.getName());
        assertEquals("G - Common (Clearstream and Euroclear)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum606LegSecurityAltIDSource.CLEARING_HOUSE_OR_ORGANIZATION;
        assertEquals("H", enumType.getID());
        assertEquals("CLEARING_HOUSE_OR_ORGANIZATION", enumType.getName());
        assertEquals("H - Clearing House or Clearing Organization", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum606LegSecurityAltIDSource.ISDA_PRODUCT_SPECIFICATION;
        assertEquals("I", enumType.getID());
        assertEquals("ISDA_PRODUCT_SPECIFICATION", enumType.getName());
        assertEquals("I - ISDA/FpML Product Specification (XML in EncodedSecurityDesc)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum606LegSecurityAltIDSource.OPTION_PRICE_REPORTING_AUTHORITY;
        assertEquals("J", enumType.getID());
        assertEquals("OPTION_PRICE_REPORTING_AUTHORITY", enumType.getName());
        assertEquals("J - Option Price Reporting Authority", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum606LegSecurityAltIDSource.ISDA_PRODUCT_URL;
        assertEquals("K", enumType.getID());
        assertEquals("ISDA_PRODUCT_URL", enumType.getName());
        assertEquals("K - ISDA/FpML Product URL (URL in SecurityID)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum606LegSecurityAltIDSource.LETTER_OF_CREDIT;
        assertEquals("L", enumType.getID());
        assertEquals("LETTER_OF_CREDIT", enumType.getName());
        assertEquals("L - Letter of Credit", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());
    }
}