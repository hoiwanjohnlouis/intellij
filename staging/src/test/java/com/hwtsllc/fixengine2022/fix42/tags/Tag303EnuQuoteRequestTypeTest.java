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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.fix42.enums.Enum303QuoteRequestType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  303
 *  QuoteRequestType
 *  int
 *  <p>
 *  Indicates the type of Quote Request being generated
 *  <p></p>
 *  Valid values:
 *  <p>    1-2 msg types
 *  <p>    "1 - Manual"
 *  <p>    "2 - Automatic"
 */
class Tag303EnuQuoteRequestTypeTest {
    @Test
    void FIX0303Test() {
        FIX42 fixData = FIX42.FIX303_ENU_QUOTE_REQUEST_TYPE;
        assertEquals( "303", fixData.toFIXIDString());
        assertEquals( "QUOTE_REQUEST_TYPE", fixData.toFIXNameString());
        assertEquals( "QuoteRequestType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0303Test() {
        Tag303EnuQuoteRequestType tagData;

        /*
         * 1-2 msg types
         */
        tagData = new Tag303EnuQuoteRequestType(Enum303QuoteRequestType.MANUAL);
        assertEquals( Enum303QuoteRequestType.MANUAL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag303EnuQuoteRequestType(Enum303QuoteRequestType.AUTOMATIC);
        assertEquals( Enum303QuoteRequestType.AUTOMATIC.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag303EnuQuoteRequestType tagData;

        // loop around the ENUM and process
        for (Enum303QuoteRequestType oneEnum : Enum303QuoteRequestType.values()) {
            tagData = new Tag303EnuQuoteRequestType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag303EnuQuoteRequestType tagData;

        // loop around the ENUM and process
        for (Enum303QuoteRequestType oneEnum : Enum303QuoteRequestType.values()) {
            tagData = new Tag303EnuQuoteRequestType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag303EnuQuoteRequestType tagData;

        // loop around the ENUM and process
        for (Enum303QuoteRequestType oneEnum : Enum303QuoteRequestType.values()) {
            tagData = new Tag303EnuQuoteRequestType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag303EnuQuoteRequestType tagData;

        // loop around the ENUM and process
        for (Enum303QuoteRequestType oneEnum : Enum303QuoteRequestType.values()) {
            tagData = new Tag303EnuQuoteRequestType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag303EnuQuoteRequestType tagData;

        // loop around the ENUM and process
        for (Enum303QuoteRequestType oneEnum : Enum303QuoteRequestType.values()) {
            tagData = new Tag303EnuQuoteRequestType(oneEnum);
            assertEquals( "Tag303EnuQuoteRequestType\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}