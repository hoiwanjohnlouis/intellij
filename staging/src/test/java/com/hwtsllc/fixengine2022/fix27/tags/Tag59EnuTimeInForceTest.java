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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.fix27.enums.Enum59TimeInForce;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  59
 *  TimeInForce
 *  char
 *  <p></p>
 *  Specifies how long the order remains in effect.
 *  <p></p>
 *  Absence of this field is interpreted as DAY.
 *  <p></p>
 *  NOTE not applicable to CIV Orders.
 *  <p>
 *  (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Day (or session)
 *  <p>    1 - Good Till Cancel (GTC)
 *  <p>    2 - At the Opening (OPG)
 *  <p>    3 - Immediate Or Cancel (IOC)
 *  <p>    4 - Fill Or Kill (FOK)
 *  <p></p>
 *  <p>    5 - Good Till Crossing (GTX)
 *  <p>    6 - Good Till Date (GTD)
 *  <p>    7 - At the Close
 */
class Tag59EnuTimeInForceTest {
    @Test
    void PrintFIXTagTest() {
        Tag59EnuTimeInForce tagData;

        // loop around the ENUM and process
        for (Enum59TimeInForce oneEnum : Enum59TimeInForce.values()) {
            tagData = new Tag59EnuTimeInForce(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void Tag0059Test() {
        Tag59EnuTimeInForce tagData;

        /*
         * 0-7 TimeInForce types
         */
        tagData = new Tag59EnuTimeInForce(Enum59TimeInForce.DAY);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag59EnuTimeInForce(Enum59TimeInForce.GOOD_TILL_CANCEL);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag59EnuTimeInForce(Enum59TimeInForce.AT_THE_OPENING);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag59EnuTimeInForce(Enum59TimeInForce.IMMEDIATE_OR_CANCEL);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag59EnuTimeInForce(Enum59TimeInForce.FILL_OR_KILL);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag59EnuTimeInForce(Enum59TimeInForce.GOOD_TILL_CROSSING);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag59EnuTimeInForce(Enum59TimeInForce.GOOD_TILL_DATE);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag59EnuTimeInForce(Enum59TimeInForce.AT_THE_CLOSE);
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void FIXTest() {
        Tag59EnuTimeInForce tagData;

        // loop around the ENUM and process
        for (Enum59TimeInForce oneEnum : Enum59TimeInForce.values()) {
            tagData = new Tag59EnuTimeInForce(oneEnum);
            assertEquals( "FIX59_ENU_TIME_IN_FORCE", tagData.toEnumLabelString());
            assertEquals( "TIME_IN_FORCE", tagData.toEnumNameString());
            assertEquals( "59", tagData.toEnumIDString());
            assertEquals( "TimeInForce", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag59EnuTimeInForce tagData;

        // loop around the ENUM and process
        for (Enum59TimeInForce oneEnum : Enum59TimeInForce.values()) {
            tagData = new Tag59EnuTimeInForce(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag59EnuTimeInForce tagData;

        // loop around the ENUM and process
        for (Enum59TimeInForce oneEnum : Enum59TimeInForce.values()) {
            tagData = new Tag59EnuTimeInForce(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag59EnuTimeInForce tagData;

        // loop around the ENUM and process
        for (Enum59TimeInForce oneEnum : Enum59TimeInForce.values()) {
            tagData = new Tag59EnuTimeInForce(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag59EnuTimeInForce tagData;

        // loop around the ENUM and process
        for (Enum59TimeInForce oneEnum : Enum59TimeInForce.values()) {
            tagData = new Tag59EnuTimeInForce(oneEnum);
            assertEquals( "Tag59EnuTimeInForce\n" +
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