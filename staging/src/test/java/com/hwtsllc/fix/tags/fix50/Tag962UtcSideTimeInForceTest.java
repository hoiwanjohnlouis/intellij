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

package com.hwtsllc.fix.tags.fix50;

import com.hwtsllc.fix.datatypes.MyUTCTimestampType;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  962
 *  SideTimeInForce
 *  UTCTimestamp
 *  <p>
 *  Indicates how long the order as specified in the side stays in effect.
 *  <p></p>
 *  SideTimeInForce allows a two-sided cross order to specify order behavior separately for each side.
 *  Absence of this field indicates that TimeInForce should be referenced.
 *  <p></p>
 *  SideTimeInForce will override TimeInForce if both are provided.
 */
class Tag962UtcSideTimeInForceTest {
    Tag962UtcSideTimeInForce tagData;
    String [] TestArray = {
            Tag962UtcSideTimeInForce.TESTA_UTC_SIDE_TIME_IN_FORCE,
            Tag962UtcSideTimeInForce.TESTB_UTC_SIDE_TIME_IN_FORCE
    };

    @Test
    void PrintTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag962UtcSideTimeInForce( new MyUTCTimestampType( oneElement ));
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag962UtcSideTimeInForce( new MyUTCTimestampType( oneElement ));
            assertEquals( "FIX962_UTC_SIDE_TIME_IN_FORCE", tagData.toFIXLabelString());
            assertEquals( "962", tagData.toFIXIDString());
            assertEquals( "SIDE_TIME_IN_FORCE", tagData.toFIXNameString());
            assertEquals( "SideTimeInForce", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag962UtcSideTimeInForce( new MyUTCTimestampType( oneElement ));
            assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
        }
    }
    @Test
    void TagToStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag962UtcSideTimeInForce( new MyUTCTimestampType( oneElement ));
            assertEquals( oneElement, tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag962UtcSideTimeInForce( new MyUTCTimestampType( oneElement ));
            assertEquals( "Tag962UtcSideTimeInForce\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + oneElement + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
        }
    }
}