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

package com.hwtsllc.fix.tags.fix43;

import com.hwtsllc.fix.datatypes.FIX27;
import com.hwtsllc.fix.datatypes.MyEnumSecurityIDSource;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag606EnuLegSecurityAltIDSourceTest {
    Tag606EnuLegSecurityAltIDSource tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (MyEnumSecurityIDSource oneEnum : MyEnumSecurityIDSource.values()) {
            tagData = new Tag606EnuLegSecurityAltIDSource(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (MyEnumSecurityIDSource oneEnum : MyEnumSecurityIDSource.values()) {
            tagData = new Tag606EnuLegSecurityAltIDSource(oneEnum);
            assertEquals( "FIX606_ENU_LEG_SECURITY_ALT_ID_SOURCE", tagData.toFIXLabelString());
            assertEquals( "606", tagData.toFIXIDString());
            assertEquals( "LEG_SECURITY_ALT_ID_SOURCE", tagData.toFIXNameString());
            assertEquals( "LegSecurityAltIDSource", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (MyEnumSecurityIDSource oneEnum : MyEnumSecurityIDSource.values()) {
            tagData = new Tag606EnuLegSecurityAltIDSource(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  606
         *  (same as 22, 305, 456, 459, 603, 606, 761, 1096, 1105)
         *  <p>    1 - CUSIP
         *  <p>    2 - SEDOL
         *  <p>    3 - QUIK
         *  <p>    4 - ISIN number
         *  <p>    5 - RIC code
         */
        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.CUSIP);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.SEDOL);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.QUIK);
        assertEquals( "3", tagData.toString());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.ISIN);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.RIC);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    6 - ISO Currency Code
         *  <p>    7 - ISO Country Code
         *  <p>    8 - Exchange Symbol
         *  <p>    9 - Consolidated Tape Association (CTA) Symbol
         *              (SIAC CTS/CQS line format)
         */
        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.ISO_CURRENCY_CODE);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.ISO_COUNTRY_CODE);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.EXCHANGE_SYMBOL);
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.CTA);
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    A - Bloomberg Symbol
         *  <p>    B - Wertpapier
         *  <p>    C - Dutch
         *  <p>    D - Valoren
         *  <p>    E - Sicovam
         */
        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.BLOOMBERG);
        assertEquals( "A", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.WERTPAPIER);
        assertEquals( "B", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.DUTCH);
        assertEquals( "C", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.VALOREN);
        assertEquals( "D", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.SICOVAM);
        assertEquals( "E", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    F - Belgian
         *  <p>    G - "Common" (Clearstream and Euroclear)
         *  <p>    H - Clearing House / Clearing Organization
         *  <p>    I - ISDA/FpML Product Specification
         *              (XML in EncodedSecurityDesc)
         *  <p>    J - Option Price Reporting Authority
         */
        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.BELGIAN);
        assertEquals( "F", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.COMMON);
        assertEquals( "G", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.CLEARING_HOUSE_OR_ORGANIZATION);
        assertEquals( "H", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.ISDA_PRODUCT_SPECIFICATION);
        assertEquals( "I", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.OPTION_PRICE_REPORTING_AUTHORITY);
        assertEquals( "J", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    K - ISDA/FpML Product URL (URL in SecurityID)
         *  <p>    L - Letter of Credit
         */
        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.ISDA_PRODUCT_URL);
        assertEquals( "K", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag606EnuLegSecurityAltIDSource(MyEnumSecurityIDSource.LETTER_OF_CREDIT);
        assertEquals( "L", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (MyEnumSecurityIDSource oneEnum : MyEnumSecurityIDSource.values()) {
            tagData = new Tag606EnuLegSecurityAltIDSource(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (MyEnumSecurityIDSource oneEnum : MyEnumSecurityIDSource.values()) {
            tagData = new Tag606EnuLegSecurityAltIDSource(oneEnum);
            assertEquals( "Tag606EnuLegSecurityAltIDSource\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}