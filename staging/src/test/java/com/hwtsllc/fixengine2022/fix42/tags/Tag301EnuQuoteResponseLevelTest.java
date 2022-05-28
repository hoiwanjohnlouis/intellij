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
import com.hwtsllc.fixengine2022.fix42.enums.Enum301QuoteResponseLevel;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  301
 *  QuoteResponseLevel
 *  int
 *  <p>
 *  Level of Response requested from receiver of quote messages.
 *  <p></p>
 *  Valid values:
 *  <p>    0-2 msg types
 *  <p>    "0 - No Acknowledgement (default)"
 *  <p>    "1 - Acknowledge only negative or erroneous quotes"
 *  <p>    "2 - Acknowledge each quote messages"
 */
class Tag301EnuQuoteResponseLevelTest {
    @Test
    void FIX0301Test() {
        FIX42 fixData = FIX42.FIX301_ENU_QUOTE_RESPONSE_LEVEL;
        assertEquals( "301", fixData.toFIXIDString());
        assertEquals( "QUOTE_RESPONSE_LEVEL", fixData.toFIXNameString());
        assertEquals( "QuoteResponseLevel", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0301Test() {
        Tag301EnuQuoteResponseLevel tagData;

        /*
         * 0-2 msg types
         */
        tagData = new Tag301EnuQuoteResponseLevel(Enum301QuoteResponseLevel.NO_ACKNOWLEDGEMENT);
        assertEquals( Enum301QuoteResponseLevel.NO_ACKNOWLEDGEMENT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag301EnuQuoteResponseLevel(Enum301QuoteResponseLevel.ACKNOWLEDGE_NEGATIVE_OR_ERRORS);
        assertEquals( Enum301QuoteResponseLevel.ACKNOWLEDGE_NEGATIVE_OR_ERRORS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag301EnuQuoteResponseLevel(Enum301QuoteResponseLevel.ACKNOWLEDGE_EACH_QUOTE);
        assertEquals( Enum301QuoteResponseLevel.ACKNOWLEDGE_EACH_QUOTE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag301EnuQuoteResponseLevel tagData;

        // loop around the ENUM and process
        for (Enum301QuoteResponseLevel oneEnum : Enum301QuoteResponseLevel.values()) {
            tagData = new Tag301EnuQuoteResponseLevel(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag301EnuQuoteResponseLevel tagData;

        // loop around the ENUM and process
        for (Enum301QuoteResponseLevel oneEnum : Enum301QuoteResponseLevel.values()) {
            tagData = new Tag301EnuQuoteResponseLevel(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag301EnuQuoteResponseLevel tagData;

        // loop around the ENUM and process
        for (Enum301QuoteResponseLevel oneEnum : Enum301QuoteResponseLevel.values()) {
            tagData = new Tag301EnuQuoteResponseLevel(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag301EnuQuoteResponseLevel tagData;

        // loop around the ENUM and process
        for (Enum301QuoteResponseLevel oneEnum : Enum301QuoteResponseLevel.values()) {
            tagData = new Tag301EnuQuoteResponseLevel(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag301EnuQuoteResponseLevel tagData;

        // loop around the ENUM and process
        for (Enum301QuoteResponseLevel oneEnum : Enum301QuoteResponseLevel.values()) {
            tagData = new Tag301EnuQuoteResponseLevel(oneEnum);
            assertEquals( "Tag301EnuQuoteResponseLevel\n" +
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