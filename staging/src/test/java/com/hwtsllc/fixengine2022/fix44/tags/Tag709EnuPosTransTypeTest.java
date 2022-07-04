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

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.fix44.enums.Enum709PosTransType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  709
 *  PosTransType
 *  int
 *  <p></p>
 *  Identifies the type of position transaction
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Exercise
 *  <p>    2 - Do Not Exercise
 *  <p>    3 - Position Adjustment
 *  <p>    4 - Position Change Submission or Margin Disposition
 *  <p>    5 - Pledge
 *  <p></p>
 *  <p>    6 - Large Trader Submission
 */
class Tag709EnuPosTransTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX709_ENU_POS_TRANS_TYPE;
        assertEquals( "709", fixData.toEnumIDString());
        assertEquals( "POS_TRANS_TYPE", fixData.toEnumNameString());
        assertEquals( "PosTransType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0709Test() {
        Tag709EnuPosTransType tagData;
        Enum709PosTransType oneElement;

        oneElement = Enum709PosTransType.EXERCISE;
        tagData = new Tag709EnuPosTransType( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "709", tagData.toEnumIDString());
        assertEquals( "POS_TRANS_TYPE", tagData.toEnumNameString());
        assertEquals( "PosTransType", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag709EnuPosTransType(Enum709PosTransType.DO_NOT_EXERCISE);
        assertEquals( Enum709PosTransType.DO_NOT_EXERCISE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag709EnuPosTransType(Enum709PosTransType.POSITION_ADJUSTMENT);
        assertEquals( Enum709PosTransType.POSITION_ADJUSTMENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag709EnuPosTransType(Enum709PosTransType.MARGIN_DISPOSITION);
        assertEquals( Enum709PosTransType.MARGIN_DISPOSITION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag709EnuPosTransType(Enum709PosTransType.PLEDGE);
        assertEquals( Enum709PosTransType.PLEDGE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag709EnuPosTransType(Enum709PosTransType.LARGE_TRADER_SUBMISSION);
        assertEquals( Enum709PosTransType.LARGE_TRADER_SUBMISSION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag709EnuPosTransType tagData;

        // loop around the ENUM and process
        for ( Enum709PosTransType oneEnum : Enum709PosTransType.values()) {
            tagData = new Tag709EnuPosTransType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag709EnuPosTransType tagData;

        // loop around the ENUM and process
        for (Enum709PosTransType oneEnum : Enum709PosTransType.values()) {
            tagData = new Tag709EnuPosTransType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag709EnuPosTransType tagData;

        // loop around the ENUM and process
        for (Enum709PosTransType oneEnum : Enum709PosTransType.values()) {
            tagData = new Tag709EnuPosTransType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag709EnuPosTransType tagData;

        // loop around the ENUM and process
        for (Enum709PosTransType oneEnum : Enum709PosTransType.values()) {
            tagData = new Tag709EnuPosTransType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag709EnuPosTransType tagData;

        // loop around the ENUM and process
        for (Enum709PosTransType oneEnum : Enum709PosTransType.values()) {
            tagData = new Tag709EnuPosTransType(oneEnum);
            assertEquals( "Tag709EnuPosTransType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}