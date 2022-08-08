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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.fix44.enums.Enum694QuoteRespType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  694
 *  QuoteRespType
 *  int
 *  <p></p>
 *  Identifies the type of Quote Response.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Hit/Lift
 *  <p>    2 - Counter
 *  <p>    3 - Expired
 *  <p>    4 - Cover
 *  <p>    5 - Done Away
 *  <p></p>
 *  <p>    6 - Pass
 */
class Tag694EnuQuoteRespTypeTest {
    Tag694EnuQuoteRespType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum694QuoteRespType oneEnum : Enum694QuoteRespType.values()) {
            tagData = new Tag694EnuQuoteRespType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum694QuoteRespType oneEnum : Enum694QuoteRespType.values()) {
            tagData = new Tag694EnuQuoteRespType(oneEnum);
            assertEquals( "FIX694_ENU_QUOTE_RESP_TYPE", tagData.toEnumLabelString());
            assertEquals( "694", tagData.toEnumIDString());
            assertEquals( "QUOTE_RESP_TYPE", tagData.toEnumNameString());
            assertEquals( "QuoteRespType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  <p>    1 - Hit/Lift
         *  <p>    2 - Counter
         *  <p>    3 - Expired
         *  <p>    4 - Cover
         *  <p>    5 - Done Away
         */
        tagData = new Tag694EnuQuoteRespType( Enum694QuoteRespType.HIT_OR_LIFT );
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag694EnuQuoteRespType(Enum694QuoteRespType.COUNTER);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag694EnuQuoteRespType(Enum694QuoteRespType.EXPIRED);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag694EnuQuoteRespType(Enum694QuoteRespType.COVER);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag694EnuQuoteRespType(Enum694QuoteRespType.DONE_AWAY);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    6 - Pass
         */
        tagData = new Tag694EnuQuoteRespType(Enum694QuoteRespType.PASS);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( Enum694QuoteRespType oneEnum : Enum694QuoteRespType.values()) {
            tagData = new Tag694EnuQuoteRespType(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum694QuoteRespType oneEnum : Enum694QuoteRespType.values()) {
            tagData = new Tag694EnuQuoteRespType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( Enum694QuoteRespType oneEnum : Enum694QuoteRespType.values()) {
            tagData = new Tag694EnuQuoteRespType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum694QuoteRespType oneEnum : Enum694QuoteRespType.values()) {
            tagData = new Tag694EnuQuoteRespType(oneEnum);
            assertEquals( "Tag694EnuQuoteRespType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}