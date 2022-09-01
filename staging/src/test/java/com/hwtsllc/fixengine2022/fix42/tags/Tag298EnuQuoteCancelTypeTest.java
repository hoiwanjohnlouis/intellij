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

import com.hwtsllc.fixengine2022.fix42.enums.Enum298QuoteCancelType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag298EnuQuoteCancelTypeTest {
    Tag298EnuQuoteCancelType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum298QuoteCancelType oneEnum : Enum298QuoteCancelType.values()) {
            tagData = new Tag298EnuQuoteCancelType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum298QuoteCancelType oneEnum : Enum298QuoteCancelType.values()) {
            tagData = new Tag298EnuQuoteCancelType(oneEnum);
            assertEquals( "FIX298_ENU_QUOTE_CANCEL_TYPE", tagData.toFIXLabelString());
            assertEquals( "298", tagData.toFIXIDString());
            assertEquals( "QUOTE_CANCEL_TYPE", tagData.toEnumNameString());
            assertEquals( "QuoteCancelType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum298QuoteCancelType oneEnum : Enum298QuoteCancelType.values()) {
            tagData = new Tag298EnuQuoteCancelType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  298
         *  QuoteCancelType
         *  int
         *  <p>    1-5 msg types
         *  <p>    "1 - Cancel for Symbol(s)"
         *  <p>    "2 - Cancel for Security Type(s)"
         *  <p>    "3 - Cancel for Underlying Symbol"
         *  <p>    "4 - Cancel All Quotes"
         *  <p>    "5 - Cancel quote specified in QuoteID"
         */
        tagData = new Tag298EnuQuoteCancelType(Enum298QuoteCancelType.CANCEL_FOR_SYMBOL);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag298EnuQuoteCancelType(Enum298QuoteCancelType.CANCEL_FOR_SECURITY_TYPE);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag298EnuQuoteCancelType(Enum298QuoteCancelType.CANCEL_FOR_UNDERLYING_SYMBOL);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag298EnuQuoteCancelType(Enum298QuoteCancelType.CANCEL_ALL_QUOTES);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag298EnuQuoteCancelType(Enum298QuoteCancelType.CANCEL_QUOTEID_QUOTE);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum298QuoteCancelType oneEnum : Enum298QuoteCancelType.values()) {
            tagData = new Tag298EnuQuoteCancelType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum298QuoteCancelType oneEnum : Enum298QuoteCancelType.values()) {
            tagData = new Tag298EnuQuoteCancelType(oneEnum);
            assertEquals( "Tag298EnuQuoteCancelType\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
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