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
import com.hwtsllc.fixengine2022.datatypes.MyUTCTimestampType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  962
 *  SideTimeInForce
 *  UTCTimestamp
 *  <p>
 *  Indicates how long the order as specified in the side stays in effect.
 *  <p>
 *  SideTimeInForce allows a two-sided cross order to specify order behavior separately for each side.
 *  Absence of this field indicates that TimeInForce should be referenced.
 *  <p>
 *  SideTimeInForce will override TimeInForce if both are provided.
 */
class Tag962UtcSideTimeInForceTest {
    @Test
    void FIX0962Test() {
        FIX50 fixData = FIX50.FIX962_UTC_SIDE_TIME_IN_FORCE;
        assertEquals( "962", fixData.toEnumIDString());
        assertEquals( "SIDE_TIME_IN_FORCE", fixData.toEnumNameString());
        assertEquals( "SideTimeInForce", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0962Test() {
        Tag962UtcSideTimeInForce tagData;
        String oneElement;

        oneElement = Tag962UtcSideTimeInForce.TESTA_UTC_SIDE_TIME_IN_FORCE;
        tagData = new Tag962UtcSideTimeInForce( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag962UtcSideTimeInForce.TESTB_UTC_SIDE_TIME_IN_FORCE;
        tagData = new Tag962UtcSideTimeInForce( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag962UtcSideTimeInForce tagData;
        String oneElement;

        oneElement = Tag962UtcSideTimeInForce.TESTA_UTC_SIDE_TIME_IN_FORCE;
        tagData = new Tag962UtcSideTimeInForce( new MyUTCTimestampType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag962UtcSideTimeInForce.TESTB_UTC_SIDE_TIME_IN_FORCE;
        tagData = new Tag962UtcSideTimeInForce( new MyUTCTimestampType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag962UtcSideTimeInForce tagData;
        String oneElement;

        oneElement = Tag962UtcSideTimeInForce.TESTB_UTC_SIDE_TIME_IN_FORCE;
        tagData = new Tag962UtcSideTimeInForce( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag962UtcSideTimeInForce tagData;
        String oneElement;

        oneElement = Tag962UtcSideTimeInForce.TESTB_UTC_SIDE_TIME_IN_FORCE;
        tagData = new Tag962UtcSideTimeInForce( new MyUTCTimestampType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag962UtcSideTimeInForce tagData;
        String oneElement;

        oneElement = Tag962UtcSideTimeInForce.TESTB_UTC_SIDE_TIME_IN_FORCE;
        tagData = new Tag962UtcSideTimeInForce( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag962UtcSideTimeInForce tagData;
        String oneElement;

        oneElement = Tag962UtcSideTimeInForce.TESTA_UTC_SIDE_TIME_IN_FORCE;
        tagData = new Tag962UtcSideTimeInForce( new MyUTCTimestampType( oneElement ) );
        assertEquals( "Tag962UtcSideTimeInForce\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toVerboseString() );
    }
}