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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.FIX43;
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
 *  <p>
 *  Identifies class or source of the SecurityID (48) value.  Required if SecurityID is specified.
 *  <p>
 *  100+ are reserved for private security identifications
 *  <p></p>
 *  305
 *  UnderlyingSecurityIDSource
 *  String
 *  <p>
 *  Underlying security’s SecurityIDSource.
 *  <p>
 *  Valid values:   See SecurityIDSource (22) field
 *  <p></p>
 *  456
 *  SecurityAltIDSource
 *  String
 *  <p>
 *  Identifies class or source of the SecurityAltID (455) value.  Required if SecurityAltID is specified.
 *  <p>
 *  Valid values:   Same valid values as the SecurityIDSource (22) field
 *  <p></p>
 *  459
 *  UnderlyingSecurityAltIDSource
 *  String
 *  <p>
 *  Identifies class or source of the UnderlyingSecurityAltID (458) value.  Required if UnderlyingSecurityAltID is specified.
 *  <p>
 *  Valid values:   Same valid values as the SecurityIDSource (22) field
 *  <p></p>
 *  603
 *  LegSecurityIDSource
 *  String
 *  <p>
 *  Multileg instrument's individual  security’s SecurityIDSource.
 *  <p>
 *  Valid values:   See SecurityIDSource (22) field for description
 *  <p></p>
 *  606
 *  LegSecurityAltIDSource
 *  String
 *  <p>
 *  Multileg instrument's individual  security’s SecurityAltIDSource.
 *  <p>
 *  Valid values:   See SecurityAltIDSource (456) field for description
 *  <p></p>
 *  761
 *  BenchmarkSecurityIDSource
 *  String
 *  <p>
 *  Identifies class or source of the BenchmarkSecurityID (699) value.
 *  <p>
 *  Required if BenchmarkSecurityID is specified.
 *  <p>
 *  Same values as the SecurityIDSource (22) field
 *  <p></p>
 *  1096
 *  PegSecurityIDSource
 *  String
 *  <p>
 *  Defines the identity of the security off whose prices the order will peg.
 *  <p>
 *  Valid values:   See SecurityIDSource (22) field for description
 *  <p></p>
 *  1105
 *  TriggerSecurityIDSource
 *  String
 *  <p>
 *  Defines the identity of the security whose prices will be tracked by the trigger logic.
 *  <p>
 *  Valid values:   See SecurityIDSource (22) field for description
 *  <p></p>
 *  Valid values:
 *  <p>    1 - CUSIP
 *  <p>    2 - SEDOL
 *  <p>    3 - QUIK
 *  <p>    4 - ISIN number
 *  <p>    5 - RIC code
 *  <p></p>
 *  <p>    6 - ISO Currency Code
 *  <p>    7 - ISO Country Code
 *  <p>    8 - Exchange Symbol
 *  <p>    9 - Consolidated Tape Association (CTA) Symbol
 *              (SIAC CTS/CQS line format)
 *  <p></p>
 *  <p>    A - Bloomberg Symbol
 *  <p>    B - Wertpapier
 *  <p>    C - Dutch
 *  <p>    D - Valoren
 *  <p>    E - Sicovam
 *  <p></p>
 *  <p>    F - Belgian
 *  <p>    G - "Common" (Clearstream and Euroclear)
 *  <p>    H - Clearing House / Clearing Organization
 *  <p>    I - ISDA/FpML Product Specification
 *              (XML in EncodedSecurityDesc)
 *  <p>    J - Option Price Reporting Authority
 *  <p></p>
 *  <p>    K - ISDA/FpML Product URL (URL in SecurityID)
 *  <p>    L - Letter of Credit
 */
class Tag606EnuLegSecurityAltIDSourceTest {
    @Test
    void FIX0606Test() {
        FIX43 fixData = FIX43.FIX606_ENU_LEG_SECURITY_ALT_ID_SOURCE;
        assertEquals( "606", fixData.getID());
        assertEquals( "LEG_SECURITY_ALT_ID_SOURCE", fixData.getName());
        assertEquals( "LegSecurityAltIdSource", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0606Test() {
        Tag606EnuLegSecurityAltIDSource tagData;

        /**
         * 1-9 Security ID Source
         */
        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.CUSIP);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.SEDOL);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.QUIK);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.ISIN);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.RIC);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.ISO_CURRENCY_CODE);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.ISO_COUNTRY_CODE);
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.EXCHANGE_SYMBOL);
        assertEquals( "8", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.CTA);
        assertEquals( "9", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * A-L Security ID Source
         */
        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.BLOOMBERG);
        assertEquals( "A", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.WERTPAPIER);
        assertEquals( "B", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.DUTCH);
        assertEquals( "C", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.VALOREN);
        assertEquals( "D", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.SICOVAM);
        assertEquals( "E", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.BELGIAN);
        assertEquals( "F", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.COMMON);
        assertEquals( "G", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.CLEARING_HOUSE_OR_ORGANIZATION);
        assertEquals( "H", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.ISDA_PRODUCT_SPECIFICATION);
        assertEquals( "I", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.OPTION_PRICE_REPORTING_AUTHORITY);
        assertEquals( "J", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.ISDA_PRODUCT_URL);
        assertEquals( "K", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.LETTER_OF_CREDIT);
        assertEquals( "L", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}