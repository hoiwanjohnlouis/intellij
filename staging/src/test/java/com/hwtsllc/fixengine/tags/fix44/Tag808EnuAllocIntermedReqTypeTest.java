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

package com.hwtsllc.fixengine.tags.fix44;

import com.hwtsllc.fixengine.enums.fix44.Enum808AllocIntermedReqType;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag808EnuAllocIntermedReqTypeTest {
    Tag808EnuAllocIntermedReqType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum808AllocIntermedReqType oneEnum : Enum808AllocIntermedReqType.values()) {
            tagData = new Tag808EnuAllocIntermedReqType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum808AllocIntermedReqType oneEnum : Enum808AllocIntermedReqType.values()) {
            tagData = new Tag808EnuAllocIntermedReqType(oneEnum);
            assertEquals( "FIX808_ENU_ALLOC_INTERMED_REQ_TYPE", tagData.toFIXLabelString());
            assertEquals( "808", tagData.toFIXIDString());
            assertEquals( "ALLOC_INTERMED_REQ_TYPE", tagData.toFIXNameString());
            assertEquals( "AllocIntermedReqType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum808AllocIntermedReqType oneEnum : Enum808AllocIntermedReqType.values()) {
            tagData = new Tag808EnuAllocIntermedReqType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  808
         *  AllocIntermedReqType
         *  int
         *  <p>    1 - Pending Accept
         *  <p>    2 - Pending Release
         *  <p>    3 - Pending Reversal
         *  <p>    4 - Accept
         *  <p>    5 - Block Level Reject
         */
        tagData = new Tag808EnuAllocIntermedReqType( Enum808AllocIntermedReqType.PENDING_ACCEPT );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag808EnuAllocIntermedReqType( Enum808AllocIntermedReqType.PENDING_RELEASE );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag808EnuAllocIntermedReqType( Enum808AllocIntermedReqType.PENDING_REVERSAL );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag808EnuAllocIntermedReqType( Enum808AllocIntermedReqType.ACCEPT );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag808EnuAllocIntermedReqType( Enum808AllocIntermedReqType.BLOCK_LEVEL_REJECT );
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    6 - Account Level Reject
         */
        tagData = new Tag808EnuAllocIntermedReqType( Enum808AllocIntermedReqType.ACCOUNT_LEVEL_REJECT );
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum808AllocIntermedReqType oneEnum : Enum808AllocIntermedReqType.values()) {
            tagData = new Tag808EnuAllocIntermedReqType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum808AllocIntermedReqType oneEnum : Enum808AllocIntermedReqType.values()) {
            tagData = new Tag808EnuAllocIntermedReqType(oneEnum);
            assertEquals( "Tag808EnuAllocIntermedReqType\n" +
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