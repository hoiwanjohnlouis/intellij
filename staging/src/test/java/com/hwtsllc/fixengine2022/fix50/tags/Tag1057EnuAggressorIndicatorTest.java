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
import com.hwtsllc.fixengine2022.fix50.enums.Enum1057AggressorIndicator;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1057
 *  AggressorIndicator
 *  Boolean
 *  <p>
 *  Used to identify whether the order initiator is an aggressor or not in the trade.
 *  <p></p>
 *  Valid values:
 *  <p>  AGGRESSOR( "Y", "AGGRESSOR", "Y - Order initiator is aggressor" ),
 *  <p>  PASSIVE( "N", "PASSIVE", "N - Order initiator is passive" ),
 */
class Tag1057EnuAggressorIndicatorTest {
    @Test
    void FIX1057Test() {
        FIX50 fixData = FIX50.FIX1057_ENU_AGGRESSOR_INDICATOR;
        assertEquals( "1057", fixData.toFIXIDString());
        assertEquals( "AGGRESSOR_INDICATOR", fixData.toFIXNameString());
        assertEquals( "AggressorIndicator", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1057Test() {
        Tag1057EnuAggressorIndicator tagData;

        tagData = new Tag1057EnuAggressorIndicator( Enum1057AggressorIndicator.AGGRESSOR );
        assertEquals( Enum1057AggressorIndicator.AGGRESSOR.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1057EnuAggressorIndicator( Enum1057AggressorIndicator.PASSIVE );
        assertEquals( Enum1057AggressorIndicator.PASSIVE.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1057EnuAggressorIndicator tagData;

        // loop around the ENUM and process
        for ( Enum1057AggressorIndicator oneEnum : Enum1057AggressorIndicator.values()) {
            tagData = new Tag1057EnuAggressorIndicator(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag1057EnuAggressorIndicator tagData;

        // loop around the ENUM and process
        for (Enum1057AggressorIndicator oneEnum : Enum1057AggressorIndicator.values()) {
            tagData = new Tag1057EnuAggressorIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1057EnuAggressorIndicator tagData;

        // loop around the ENUM and process
        for (Enum1057AggressorIndicator oneEnum : Enum1057AggressorIndicator.values()) {
            tagData = new Tag1057EnuAggressorIndicator(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag1057EnuAggressorIndicator tagData;

        // loop around the ENUM and process
        for (Enum1057AggressorIndicator oneEnum : Enum1057AggressorIndicator.values()) {
            tagData = new Tag1057EnuAggressorIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1057EnuAggressorIndicator tagData;

        // loop around the ENUM and process
        for (Enum1057AggressorIndicator oneEnum : Enum1057AggressorIndicator.values()) {
            tagData = new Tag1057EnuAggressorIndicator(oneEnum);
            assertEquals( "Tag1057EnuAggressorIndicator\n" +
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