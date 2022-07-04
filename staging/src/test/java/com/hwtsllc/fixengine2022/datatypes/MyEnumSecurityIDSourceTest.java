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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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
class MyEnumSecurityIDSourceTest {
    @Test
    void Enum0022Test() {
        MyEnumSecurityIDSource enumType;

        /*
         *  * 1-9
         */
        enumType = MyEnumSecurityIDSource.CUSIP;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("CUSIP", enumType.toEnumNameString());
        assertEquals("1 - CUSIP - Committee on Uniform Securities Identification Procedures", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityIDSource.SEDOL;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("SEDOL", enumType.toEnumNameString());
        assertEquals("2 - SEDOL - Stock Exchange Daily Official List", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityIDSource.QUIK;
        assertEquals("3", enumType.toEnumIDString());
        assertEquals("QUIK", enumType.toEnumNameString());
        assertEquals("3 - QUIK", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityIDSource.ISIN;
        assertEquals("4", enumType.toEnumIDString());
        assertEquals("ISIN", enumType.toEnumNameString());
        assertEquals("4 - ISIN - The International Securities Identification Number", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityIDSource.RIC;
        assertEquals("5", enumType.toEnumIDString());
        assertEquals("RIC", enumType.toEnumNameString());
        assertEquals("5 - RIC - Reuters Instrument Code", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumSecurityIDSource.ISO_CURRENCY_CODE;
        assertEquals("6", enumType.toEnumIDString());
        assertEquals("ISO_CURRENCY_CODE", enumType.toEnumNameString());
        assertEquals("6 - ISO Currency Code", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityIDSource.ISO_COUNTRY_CODE;
        assertEquals("7", enumType.toEnumIDString());
        assertEquals("ISO_COUNTRY_CODE", enumType.toEnumNameString());
        assertEquals("7 - ISO Country Code", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityIDSource.EXCHANGE_SYMBOL;
        assertEquals("8", enumType.toEnumIDString());
        assertEquals("EXCHANGE_SYMBOL", enumType.toEnumNameString());
        assertEquals("8 - Exchange Symbol", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityIDSource.CTA;
        assertEquals("9", enumType.toEnumIDString());
        assertEquals("CTA", enumType.toEnumNameString());
        assertEquals("9 - Consolidated Tape Association (CTA) Symbol (SIAC CTS/CQS line format)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         * A-L
         */
        enumType = MyEnumSecurityIDSource.BLOOMBERG;
        assertEquals("A", enumType.toEnumIDString());
        assertEquals("BLOOMBERG", enumType.toEnumNameString());
        assertEquals("A - Bloomberg Symbol", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityIDSource.WERTPAPIER;
        assertEquals("B", enumType.toEnumIDString());
        assertEquals("WERTPAPIER", enumType.toEnumNameString());
        assertEquals("B - Wertpapier", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityIDSource.DUTCH;
        assertEquals("C", enumType.toEnumIDString());
        assertEquals("DUTCH", enumType.toEnumNameString());
        assertEquals("C - Dutch", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityIDSource.VALOREN;
        assertEquals("D", enumType.toEnumIDString());
        assertEquals("VALOREN", enumType.toEnumNameString());
        assertEquals("D - Valoren", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityIDSource.SICOVAM;
        assertEquals("E", enumType.toEnumIDString());
        assertEquals("SICOVAM", enumType.toEnumNameString());
        assertEquals("E - Sicovam", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumSecurityIDSource.BELGIAN;
        assertEquals("F", enumType.toEnumIDString());
        assertEquals("BELGIAN", enumType.toEnumNameString());
        assertEquals("F - Belgian", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityIDSource.COMMON;
        assertEquals("G", enumType.toEnumIDString());
        assertEquals("COMMON", enumType.toEnumNameString());
        assertEquals("G - Common (Clearstream and Euroclear)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityIDSource.CLEARING_HOUSE_OR_ORGANIZATION;
        assertEquals("H", enumType.toEnumIDString());
        assertEquals("CLEARING_HOUSE_OR_ORGANIZATION", enumType.toEnumNameString());
        assertEquals("H - Clearing House or Clearing Organization", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityIDSource.ISDA_PRODUCT_SPECIFICATION;
        assertEquals("I", enumType.toEnumIDString());
        assertEquals("ISDA_PRODUCT_SPECIFICATION", enumType.toEnumNameString());
        assertEquals("I - ISDA/FpML Product Specification (XML in EncodedSecurityDesc)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityIDSource.OPTION_PRICE_REPORTING_AUTHORITY;
        assertEquals("J", enumType.toEnumIDString());
        assertEquals("OPTION_PRICE_REPORTING_AUTHORITY", enumType.toEnumNameString());
        assertEquals("J - Option Price Reporting Authority", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = MyEnumSecurityIDSource.ISDA_PRODUCT_URL;
        assertEquals("K", enumType.toEnumIDString());
        assertEquals("ISDA_PRODUCT_URL", enumType.toEnumNameString());
        assertEquals("K - ISDA/FpML Product URL (URL in SecurityID)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = MyEnumSecurityIDSource.LETTER_OF_CREDIT;
        assertEquals("L", enumType.toEnumIDString());
        assertEquals("LETTER_OF_CREDIT", enumType.toEnumNameString());
        assertEquals("L - Letter of Credit", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}