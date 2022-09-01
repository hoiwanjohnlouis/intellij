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

import com.hwtsllc.fixengine2022.fix42.enums.Enum301QuoteResponseLevel;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag301EnuQuoteResponseLevelTest {
    Tag301EnuQuoteResponseLevel tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum301QuoteResponseLevel oneEnum : Enum301QuoteResponseLevel.values()) {
            tagData = new Tag301EnuQuoteResponseLevel(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum301QuoteResponseLevel oneEnum : Enum301QuoteResponseLevel.values()) {
            tagData = new Tag301EnuQuoteResponseLevel(oneEnum);
            assertEquals( "FIX301_ENU_QUOTE_RESPONSE_LEVEL", tagData.toFIXLabelString());
            assertEquals( "301", tagData.toFIXIDString());
            assertEquals( "QUOTE_RESPONSE_LEVEL", tagData.toEnumNameString());
            assertEquals( "QuoteResponseLevel", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum301QuoteResponseLevel oneEnum : Enum301QuoteResponseLevel.values()) {
            tagData = new Tag301EnuQuoteResponseLevel(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  301
         *  QuoteResponseLevel
         *  int
         *  <p>    0-2 msg types
         *  <p>    "0 - No Acknowledgement (default)"
         *  <p>    "1 - Acknowledge only negative or erroneous quotes"
         *  <p>    "2 - Acknowledge each quote messages"
         */
        tagData = new Tag301EnuQuoteResponseLevel(Enum301QuoteResponseLevel.NO_ACKNOWLEDGEMENT);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag301EnuQuoteResponseLevel(Enum301QuoteResponseLevel.ACKNOWLEDGE_NEGATIVE_OR_ERRORS);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag301EnuQuoteResponseLevel(Enum301QuoteResponseLevel.ACKNOWLEDGE_EACH_QUOTE);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum301QuoteResponseLevel oneEnum : Enum301QuoteResponseLevel.values()) {
            tagData = new Tag301EnuQuoteResponseLevel(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum301QuoteResponseLevel oneEnum : Enum301QuoteResponseLevel.values()) {
            tagData = new Tag301EnuQuoteResponseLevel(oneEnum);
            assertEquals( "Tag301EnuQuoteResponseLevel\n" +
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