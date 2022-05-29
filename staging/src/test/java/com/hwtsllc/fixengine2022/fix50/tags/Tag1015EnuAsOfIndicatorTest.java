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
import com.hwtsllc.fixengine2022.fix50.enums.Enum1015AsOfIndicator;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1015
 *  AsOfIndicator
 *  char
 *  <p>
 *  Used to indicate that a floor-trade was originally submitted 'as of'
 *  a specific trade date which is earlier than its clearing date.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - false - trade is not an AsOf trade
 *  <p>    1 - true - trade is an AsOf  trade
 */
class Tag1015EnuAsOfIndicatorTest {
    @Test
    void FIX1015Test() {
        FIX50 fixData = FIX50.FIX1015_ENU_AS_OF_INDICATOR;
        assertEquals( "1015", fixData.toFIXIDString());
        assertEquals( "AS_OF_INDICATOR", fixData.toFIXNameString());
        assertEquals( "AsOfIndicator", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1015Test() {
        Tag1015EnuAsOfIndicator tagData;

        tagData = new Tag1015EnuAsOfIndicator( Enum1015AsOfIndicator.FALSE );
        assertEquals( Enum1015AsOfIndicator.FALSE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1015EnuAsOfIndicator( Enum1015AsOfIndicator.TRUE );
        assertEquals( Enum1015AsOfIndicator.TRUE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1015EnuAsOfIndicator tagData;

        // loop around the ENUM and process
        for ( Enum1015AsOfIndicator oneEnum : Enum1015AsOfIndicator.values()) {
            tagData = new Tag1015EnuAsOfIndicator(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag1015EnuAsOfIndicator tagData;

        // loop around the ENUM and process
        for (Enum1015AsOfIndicator oneEnum : Enum1015AsOfIndicator.values()) {
            tagData = new Tag1015EnuAsOfIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1015EnuAsOfIndicator tagData;

        // loop around the ENUM and process
        for (Enum1015AsOfIndicator oneEnum : Enum1015AsOfIndicator.values()) {
            tagData = new Tag1015EnuAsOfIndicator(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag1015EnuAsOfIndicator tagData;

        // loop around the ENUM and process
        for (Enum1015AsOfIndicator oneEnum : Enum1015AsOfIndicator.values()) {
            tagData = new Tag1015EnuAsOfIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1015EnuAsOfIndicator tagData;

        // loop around the ENUM and process
        for (Enum1015AsOfIndicator oneEnum : Enum1015AsOfIndicator.values()) {
            tagData = new Tag1015EnuAsOfIndicator(oneEnum);
            assertEquals( "Tag1015EnuAsOfIndicator\n" +
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