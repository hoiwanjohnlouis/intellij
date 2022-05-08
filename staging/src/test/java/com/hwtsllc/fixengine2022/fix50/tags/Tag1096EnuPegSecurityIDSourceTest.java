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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyEnumSecurityIDSource;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  22
 *  (same as 22, 305, 456, 459, 603, 606, 761, 1096, 1105)
 *  SecurityIDSource
 *  String
 *  Identifies class or source of the SecurityID (48) value.  Required if SecurityID is specified.
 *                  100+ are reserved for private security identifications
 *  305
 *  UnderlyingSecurityIDSource
 *  String
 *  Underlying security’s SecurityIDSource.
 *                  Valid values:   See SecurityIDSource (22) field
 *  456
 *  SecurityAltIDSource
 *  String
 *  Identifies class or source of the SecurityAltID (455) value.  Required if SecurityAltID is specified.
 *                  Valid values:   Same valid values as the SecurityIDSource (22) field
 *  459
 *  UnderlyingSecurityAltIDSource
 *  String
 *  Identifies class or source of the UnderlyingSecurityAltID (458) value.  Required if UnderlyingSecurityAltID is specified.
 *                  Valid values:   Same valid values as the SecurityIDSource (22) field
 *  603
 *  LegSecurityIDSource
 *  String
 *  Multileg instrument's individual  security’s SecurityIDSource.
 *                  Valid values:   See SecurityIDSource (22) field for description
 *  606
 *  LegSecurityAltIDSource
 *  String
 *  Multileg instrument's individual  security’s SecurityAltIDSource.
 *                  Valid values:   See SecurityAltIDSource (456) field for description
 *  761
 *  BenchmarkSecurityIDSource
 *  Identifies class or source of the BenchmarkSecurityID (699) value.
 *  Required if BenchmarkSecurityID is specified.
 *              Same values as the SecurityIDSource (22) field
 *  1096
 *  PegSecurityIDSource
 *  String
 *  Defines the identity of the security off whose prices the order will peg.
 *                  Valid values:   See SecurityIDSource (22) field for description
 *  1105
 *  TriggerSecurityIDSource
 *  String
 *  Defines the identity of the security whose prices will be tracked by the trigger logic.
 *                  Valid values:   See SecurityIDSource (22) field for description
 *
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
class Tag1096EnuPegSecurityIDSourceTest {
    @Test
    void FIX1096Test() {
        FIX50 fixData = FIX50.FIX1096_ENU_PEG_SECURITY_ID_SOURCE;
        assertEquals( "1096", fixData.getID());
        assertEquals( "PEG_SECURITY_ID_SOURCE", fixData.getName());
        assertEquals( "PegSecurityIdSource", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1096Test() {
        Tag1096EnuPegSecurityIDSource tagData;

        /**
         * 1-9 Security ID Source
         */
        tagData = new Tag1096EnuPegSecurityIDSource(MyEnumSecurityIDSource.CUSIP);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1096EnuPegSecurityIDSource(MyEnumSecurityIDSource.SEDOL);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1096EnuPegSecurityIDSource(MyEnumSecurityIDSource.QUIK);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1096EnuPegSecurityIDSource(MyEnumSecurityIDSource.ISIN);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1096EnuPegSecurityIDSource(MyEnumSecurityIDSource.RIC);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag1096EnuPegSecurityIDSource(MyEnumSecurityIDSource.ISO_CURRENCY_CODE);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1096EnuPegSecurityIDSource(MyEnumSecurityIDSource.ISO_COUNTRY_CODE);
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1096EnuPegSecurityIDSource(MyEnumSecurityIDSource.EXCHANGE_SYMBOL);
        assertEquals( "8", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1096EnuPegSecurityIDSource(MyEnumSecurityIDSource.CTA);
        assertEquals( "9", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * A-L Security ID Source
         */
        tagData = new Tag1096EnuPegSecurityIDSource(MyEnumSecurityIDSource.BLOOMBERG);
        assertEquals( "A", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1096EnuPegSecurityIDSource(MyEnumSecurityIDSource.WERTPAPIER);
        assertEquals( "B", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1096EnuPegSecurityIDSource(MyEnumSecurityIDSource.DUTCH);
        assertEquals( "C", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1096EnuPegSecurityIDSource(MyEnumSecurityIDSource.VALOREN);
        assertEquals( "D", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1096EnuPegSecurityIDSource(MyEnumSecurityIDSource.SICOVAM);
        assertEquals( "E", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag1096EnuPegSecurityIDSource(MyEnumSecurityIDSource.BELGIAN);
        assertEquals( "F", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1096EnuPegSecurityIDSource(MyEnumSecurityIDSource.COMMON);
        assertEquals( "G", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1096EnuPegSecurityIDSource(MyEnumSecurityIDSource.CLEARING_HOUSE_OR_ORGANIZATION);
        assertEquals( "H", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1096EnuPegSecurityIDSource(MyEnumSecurityIDSource.ISDA_PRODUCT_SPECIFICATION);
        assertEquals( "I", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1096EnuPegSecurityIDSource(MyEnumSecurityIDSource.OPTION_PRICE_REPORTING_AUTHORITY);
        assertEquals( "J", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag1096EnuPegSecurityIDSource(MyEnumSecurityIDSource.ISDA_PRODUCT_URL);
        assertEquals( "K", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1096EnuPegSecurityIDSource(MyEnumSecurityIDSource.LETTER_OF_CREDIT);
        assertEquals( "L", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}