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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.fix27.enums.Enum22SecurityIDSource;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag22EnuSecurityIDSourceTest {
    @Test
    void FIX0022Test() {
        FIX27 fixData = FIX27.FIX22_ENU_SECURITY_ID_SOURCE;
        assertEquals( "SECURITY_ID_SOURCE", fixData.getName());
        assertEquals( "22", fixData.getID());
        assertEquals( "SecurityIDSource", fixData.getDescription());
        assertNotEquals( FIX27.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( FIX27.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX27.JUNK_ID, fixData.getID());
        assertNotEquals( FIX27.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  22 (same as 22, 305, 456, 459, 603, 606, 761, 1096, 1105)
     *  Identifies class or source of the SecurityID (48) value.
     *  Required if SecurityID is specified.
     *  100+ are reserved for private security identifications
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
    void Tag0022Test() {
        Tag22EnuSecurityIDSource tagData;

        /**
         * 1-9 Securiy ID Source
         */
        tagData = new Tag22EnuSecurityIDSource(Enum22SecurityIDSource.CUSIP);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag22EnuSecurityIDSource(Enum22SecurityIDSource.SEDOL);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag22EnuSecurityIDSource(Enum22SecurityIDSource.QUIK);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag22EnuSecurityIDSource(Enum22SecurityIDSource.ISIN);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag22EnuSecurityIDSource(Enum22SecurityIDSource.RIC);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag22EnuSecurityIDSource(Enum22SecurityIDSource.ISO_CURRENCY_CODE);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag22EnuSecurityIDSource(Enum22SecurityIDSource.ISO_COUNTRY_CODE);
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag22EnuSecurityIDSource(Enum22SecurityIDSource.EXCHANGE_SYMBOL);
        assertEquals( "8", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag22EnuSecurityIDSource(Enum22SecurityIDSource.CTA);
        assertEquals( "9", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * A-L Securiy ID Source
         */
        tagData = new Tag22EnuSecurityIDSource(Enum22SecurityIDSource.BLOOMBERG);
        assertEquals( "A", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag22EnuSecurityIDSource(Enum22SecurityIDSource.WERTPAPIER);
        assertEquals( "B", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag22EnuSecurityIDSource(Enum22SecurityIDSource.DUTCH);
        assertEquals( "C", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag22EnuSecurityIDSource(Enum22SecurityIDSource.VALOREN);
        assertEquals( "D", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag22EnuSecurityIDSource(Enum22SecurityIDSource.SICOVAM);
        assertEquals( "E", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag22EnuSecurityIDSource(Enum22SecurityIDSource.BELGIAN);
        assertEquals( "F", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag22EnuSecurityIDSource(Enum22SecurityIDSource.COMMON);
        assertEquals( "G", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag22EnuSecurityIDSource(Enum22SecurityIDSource.CLEARING_HOUSE_OR_ORGANIZATION);
        assertEquals( "H", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag22EnuSecurityIDSource(Enum22SecurityIDSource.ISDA_PRODUCT_SPECIFICATION);
        assertEquals( "I", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag22EnuSecurityIDSource(Enum22SecurityIDSource.OPTION_PRICE_REPORTING_AUTHORITY);
        assertEquals( "J", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag22EnuSecurityIDSource(Enum22SecurityIDSource.ISDA_PRODUCT_URL);
        assertEquals( "K", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag22EnuSecurityIDSource(Enum22SecurityIDSource.LETTER_OF_CREDIT);
        assertEquals( "L", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}