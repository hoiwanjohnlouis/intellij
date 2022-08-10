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
    Tag1015EnuAsOfIndicator tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum1015AsOfIndicator oneEnum : Enum1015AsOfIndicator.values()) {
            tagData = new Tag1015EnuAsOfIndicator(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum1015AsOfIndicator oneEnum : Enum1015AsOfIndicator.values()) {
            tagData = new Tag1015EnuAsOfIndicator(oneEnum);
            assertEquals( "FIX1015_ENU_AS_OF_INDICATOR", tagData.toEnumLabelString());
            assertEquals( "1015", tagData.toEnumIDString());
            assertEquals( "AS_OF_INDICATOR", tagData.toEnumNameString());
            assertEquals( "AsOfIndicator", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  <p>    0 - false - trade is not an AsOf trade
         *  <p>    1 - true - trade is an AsOf  trade
         */
        tagData = new Tag1015EnuAsOfIndicator( Enum1015AsOfIndicator.FALSE );
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1015EnuAsOfIndicator( Enum1015AsOfIndicator.TRUE );
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        // loop around the ENUM and process
        for ( Enum1015AsOfIndicator oneEnum : Enum1015AsOfIndicator.values()) {
            tagData = new Tag1015EnuAsOfIndicator(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum1015AsOfIndicator oneEnum : Enum1015AsOfIndicator.values()) {
            tagData = new Tag1015EnuAsOfIndicator(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( Enum1015AsOfIndicator oneEnum : Enum1015AsOfIndicator.values()) {
            tagData = new Tag1015EnuAsOfIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum1015AsOfIndicator oneEnum : Enum1015AsOfIndicator.values()) {
            tagData = new Tag1015EnuAsOfIndicator(oneEnum);
            assertEquals( "Tag1015EnuAsOfIndicator\n" +
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