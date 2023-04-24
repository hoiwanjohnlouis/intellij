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

package com.hwtsllc.fixengine.tags.fix50.tags;

import com.hwtsllc.fixengine.tags.fix50.enums.Enum1008SideTrdSubTyp;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag1008EnuSideTrdSubTypTest {
    Tag1008EnuSideTrdSubTyp tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum1008SideTrdSubTyp oneEnum : Enum1008SideTrdSubTyp.values()) {
            tagData = new Tag1008EnuSideTrdSubTyp(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum1008SideTrdSubTyp oneEnum : Enum1008SideTrdSubTyp.values()) {
            tagData = new Tag1008EnuSideTrdSubTyp(oneEnum);
            assertEquals( "FIX1008_ENU_SIDE_TRD_SUB_TYP", tagData.toFIXLabelString());
            assertEquals( "1008", tagData.toFIXIDString());
            assertEquals( "SIDE_TRD_SUB_TYP", tagData.toFIXNameString());
            assertEquals( "SideTrdSubTyp", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum1008SideTrdSubTyp oneEnum : Enum1008SideTrdSubTyp.values()) {
            tagData = new Tag1008EnuSideTrdSubTyp(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  1008
         *  SideTrdSubTyp
         *  int
         *  <p>    0 - CMTA
         *  <p>    1 - Internal Transfer
         *  <p>    2 - External Transfer
         *  <p>    3 - Reject for Submitting Trade
         *  <p>    4 - Advisory for Contra Side
         */
        tagData = new Tag1008EnuSideTrdSubTyp( Enum1008SideTrdSubTyp.CMTA );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1008EnuSideTrdSubTyp( Enum1008SideTrdSubTyp.INTERNAL_TRANSFER );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1008EnuSideTrdSubTyp( Enum1008SideTrdSubTyp.EXTERNAL_TRANSFER );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1008EnuSideTrdSubTyp( Enum1008SideTrdSubTyp.REJECT_SUBMISSION );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1008EnuSideTrdSubTyp( Enum1008SideTrdSubTyp.ADVISORY_FOR_CONTRA );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    5 - Offset due to an allocation
         *  <p>    6 - Onset due to an allocation
         *  <p>    7 - Differential Spread
         *  <p>    8 - Implied Spread leg executed against an outright
         *  <p>    9 - Transaction from Exercise
         */
        tagData = new Tag1008EnuSideTrdSubTyp( Enum1008SideTrdSubTyp.OFFSET_DUE_TO_ALLOCATION );
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1008EnuSideTrdSubTyp( Enum1008SideTrdSubTyp.ONSET_DUE_TO_ALLOCATION );
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1008EnuSideTrdSubTyp( Enum1008SideTrdSubTyp.DIFFERENTIAL_SPREAD );
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1008EnuSideTrdSubTyp( Enum1008SideTrdSubTyp.IMPLIED_SPREAD_LEG );
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1008EnuSideTrdSubTyp( Enum1008SideTrdSubTyp.TRANSACTION_FROM_EXERCISE );
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    10 - Transaction from Assignment
         */
        tagData = new Tag1008EnuSideTrdSubTyp( Enum1008SideTrdSubTyp.TRANSACTION_FROM_ASSIGNMENT );
        assertEquals( "10", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum1008SideTrdSubTyp oneEnum : Enum1008SideTrdSubTyp.values()) {
            tagData = new Tag1008EnuSideTrdSubTyp(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum1008SideTrdSubTyp oneEnum : Enum1008SideTrdSubTyp.values()) {
            tagData = new Tag1008EnuSideTrdSubTyp(oneEnum);
            assertEquals( "Tag1008EnuSideTrdSubTyp\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
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