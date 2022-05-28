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
import com.hwtsllc.fixengine2022.fix42.enums.Enum334Adjustment;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  334
 *  Enu
 *  Adjustment
 *  int
 *  <p>
 *  Identifies the type of adjustment.
 *  <p></p>
 *  Valid values:
 *  <p>    1-3 msg types
 *  <p>    CANCEL( "1", "CANCEL", "1 - Cancel" ),
 *  <p>    ERROR( "2", "ERROR", "2 - Error" ),
 *  <p>    CORRECTION( "3", "CORRECTION", "3 - Correction" ),
 */
class Tag334EnuAdjustmentTest {
    @Test
    void FIX0334Test() {
        FIX42 fixData = FIX42.FIX334_ENU_ADJUSTMENT;
        assertEquals( "334", fixData.toFIXIDString());
        assertEquals( "ADJUSTMENT", fixData.toFIXNameString());
        assertEquals( "Adjustment", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0334Test() {
        Tag334EnuAdjustment tagData;

        /*
         * 1-3 msg types
         */
        tagData = new Tag334EnuAdjustment(Enum334Adjustment.CANCEL);
        assertEquals( Enum334Adjustment.CANCEL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag334EnuAdjustment(Enum334Adjustment.ERROR);
        assertEquals( Enum334Adjustment.ERROR.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag334EnuAdjustment(Enum334Adjustment.CORRECTION);
        assertEquals( Enum334Adjustment.CORRECTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag334EnuAdjustment tagData;

        // loop around the ENUM and process
        for (Enum334Adjustment oneEnum : Enum334Adjustment.values()) {
            tagData = new Tag334EnuAdjustment(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag334EnuAdjustment tagData;

        // loop around the ENUM and process
        for (Enum334Adjustment oneEnum : Enum334Adjustment.values()) {
            tagData = new Tag334EnuAdjustment(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag334EnuAdjustment tagData;

        // loop around the ENUM and process
        for (Enum334Adjustment oneEnum : Enum334Adjustment.values()) {
            tagData = new Tag334EnuAdjustment(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag334EnuAdjustment tagData;

        // loop around the ENUM and process
        for (Enum334Adjustment oneEnum : Enum334Adjustment.values()) {
            tagData = new Tag334EnuAdjustment(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag334EnuAdjustment tagData;

        // loop around the ENUM and process
        for (Enum334Adjustment oneEnum : Enum334Adjustment.values()) {
            tagData = new Tag334EnuAdjustment(oneEnum);
            assertEquals( "Tag334EnuAdjustment\n" +
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