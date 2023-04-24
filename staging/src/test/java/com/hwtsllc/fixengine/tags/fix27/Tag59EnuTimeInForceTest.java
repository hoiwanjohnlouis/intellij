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

package com.hwtsllc.fixengine.tags.fix27;

import com.hwtsllc.fixengine.enums.fix27.Enum59TimeInForce;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag59EnuTimeInForceTest {
    Tag59EnuTimeInForce tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum59TimeInForce oneEnum : Enum59TimeInForce.values()) {
            tagData = new Tag59EnuTimeInForce(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum59TimeInForce oneEnum : Enum59TimeInForce.values()) {
            tagData = new Tag59EnuTimeInForce(oneEnum);
            assertEquals( "FIX59_ENU_TIME_IN_FORCE", tagData.toFIXLabelString());
            assertEquals( "TIME_IN_FORCE", tagData.toFIXNameString());
            assertEquals( "59", tagData.toFIXIDString());
            assertEquals( "TimeInForce", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum59TimeInForce oneEnum : Enum59TimeInForce.values()) {
            tagData = new Tag59EnuTimeInForce(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  59
         *  <p>    0 - Day (or session)
         *  <p>    1 - Good Till Cancel (GTC)
         *  <p>    2 - At the Opening (OPG)
         *  <p>    3 - Immediate Or Cancel (IOC)
         *  <p>    4 - Fill Or Kill (FOK)
         */
        tagData = new Tag59EnuTimeInForce(Enum59TimeInForce.DAY);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag59EnuTimeInForce(Enum59TimeInForce.GOOD_TILL_CANCEL);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag59EnuTimeInForce(Enum59TimeInForce.AT_THE_OPENING);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag59EnuTimeInForce(Enum59TimeInForce.IMMEDIATE_OR_CANCEL);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag59EnuTimeInForce(Enum59TimeInForce.FILL_OR_KILL);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    5 - Good Till Crossing (GTX)
         *  <p>    6 - Good Till Date (GTD)
         *  <p>    7 - At the Close
         */
        tagData = new Tag59EnuTimeInForce(Enum59TimeInForce.GOOD_TILL_CROSSING);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag59EnuTimeInForce(Enum59TimeInForce.GOOD_TILL_DATE);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag59EnuTimeInForce(Enum59TimeInForce.AT_THE_CLOSE);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum59TimeInForce oneEnum : Enum59TimeInForce.values()) {
            tagData = new Tag59EnuTimeInForce(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum59TimeInForce oneEnum : Enum59TimeInForce.values()) {
            tagData = new Tag59EnuTimeInForce(oneEnum);
            assertEquals( "Tag59EnuTimeInForce\n" +
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