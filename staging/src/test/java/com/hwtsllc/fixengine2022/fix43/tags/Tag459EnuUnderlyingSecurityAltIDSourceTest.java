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
import com.hwtsllc.fixengine2022.datatypes.MyEnumSecurityIDSource;
import com.hwtsllc.fixengine2022.fix27.tags.Tag22EnuSecurityIDSource;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag459EnuUnderlyingSecurityAltIDSourceTest {
    Tag459EnuUnderlyingSecurityAltIDSource tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (MyEnumSecurityIDSource oneEnum : MyEnumSecurityIDSource.values()) {
            tagData = new Tag459EnuUnderlyingSecurityAltIDSource(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (MyEnumSecurityIDSource oneEnum : MyEnumSecurityIDSource.values()) {
            tagData = new Tag459EnuUnderlyingSecurityAltIDSource(oneEnum);
            assertEquals( "FIX459_ENU_UNDERLYING_SECURITY_ALT_ID_SOURCE", tagData.toEnumLabelString());
            assertEquals( "459", tagData.toEnumIDString());
            assertEquals( "UNDERLYING_SECURITY_ALT_ID_SOURCE", tagData.toEnumNameString());
            assertEquals( "UnderlyingSecurityAltIDSource", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (MyEnumSecurityIDSource oneEnum : MyEnumSecurityIDSource.values()) {
            tagData = new Tag459EnuUnderlyingSecurityAltIDSource(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  459
         *  (same as 22, 305, 456, 459, 603, 606, 761, 1096, 1105)
         *  <p>    1 - CUSIP
         *  <p>    2 - SEDOL
         *  <p>    3 - QUIK
         *  <p>    4 - ISIN number
         *  <p>    5 - RIC code
         */
        tagData = new Tag459EnuUnderlyingSecurityAltIDSource(MyEnumSecurityIDSource.CUSIP);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag459EnuUnderlyingSecurityAltIDSource(MyEnumSecurityIDSource.SEDOL);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag459EnuUnderlyingSecurityAltIDSource(MyEnumSecurityIDSource.QUIK);
        assertEquals( "3", tagData.toString());
        assertNotEquals( FIX27.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag459EnuUnderlyingSecurityAltIDSource(MyEnumSecurityIDSource.ISIN);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag459EnuUnderlyingSecurityAltIDSource(MyEnumSecurityIDSource.RIC);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    6 - ISO Currency Code
         *  <p>    7 - ISO Country Code
         *  <p>    8 - Exchange Symbol
         *  <p>    9 - Consolidated Tape Association (CTA) Symbol
         *              (SIAC CTS/CQS line format)
         */
        tagData = new Tag459EnuUnderlyingSecurityAltIDSource(MyEnumSecurityIDSource.ISO_CURRENCY_CODE);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag459EnuUnderlyingSecurityAltIDSource(MyEnumSecurityIDSource.ISO_COUNTRY_CODE);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag459EnuUnderlyingSecurityAltIDSource(MyEnumSecurityIDSource.EXCHANGE_SYMBOL);
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag459EnuUnderlyingSecurityAltIDSource(MyEnumSecurityIDSource.CTA);
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    A - Bloomberg Symbol
         *  <p>    B - Wertpapier
         *  <p>    C - Dutch
         *  <p>    D - Valoren
         *  <p>    E - Sicovam
         */
        tagData = new Tag459EnuUnderlyingSecurityAltIDSource(MyEnumSecurityIDSource.BLOOMBERG);
        assertEquals( "A", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag459EnuUnderlyingSecurityAltIDSource(MyEnumSecurityIDSource.WERTPAPIER);
        assertEquals( "B", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag459EnuUnderlyingSecurityAltIDSource(MyEnumSecurityIDSource.DUTCH);
        assertEquals( "C", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag459EnuUnderlyingSecurityAltIDSource(MyEnumSecurityIDSource.VALOREN);
        assertEquals( "D", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag459EnuUnderlyingSecurityAltIDSource(MyEnumSecurityIDSource.SICOVAM);
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
        tagData = new Tag459EnuUnderlyingSecurityAltIDSource(MyEnumSecurityIDSource.BELGIAN);
        assertEquals( "F", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag459EnuUnderlyingSecurityAltIDSource(MyEnumSecurityIDSource.COMMON);
        assertEquals( "G", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag459EnuUnderlyingSecurityAltIDSource(MyEnumSecurityIDSource.CLEARING_HOUSE_OR_ORGANIZATION);
        assertEquals( "H", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag459EnuUnderlyingSecurityAltIDSource(MyEnumSecurityIDSource.ISDA_PRODUCT_SPECIFICATION);
        assertEquals( "I", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag459EnuUnderlyingSecurityAltIDSource(MyEnumSecurityIDSource.OPTION_PRICE_REPORTING_AUTHORITY);
        assertEquals( "J", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    K - ISDA/FpML Product URL (URL in SecurityID)
         *  <p>    L - Letter of Credit
         */
        tagData = new Tag459EnuUnderlyingSecurityAltIDSource(MyEnumSecurityIDSource.ISDA_PRODUCT_URL);
        assertEquals( "K", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag459EnuUnderlyingSecurityAltIDSource(MyEnumSecurityIDSource.LETTER_OF_CREDIT);
        assertEquals( "L", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (MyEnumSecurityIDSource oneEnum : MyEnumSecurityIDSource.values()) {
            tagData = new Tag459EnuUnderlyingSecurityAltIDSource(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (MyEnumSecurityIDSource oneEnum : MyEnumSecurityIDSource.values()) {
            tagData = new Tag459EnuUnderlyingSecurityAltIDSource(oneEnum);
            assertEquals( "Tag459EnuUnderlyingSecurityAltIDSource\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
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