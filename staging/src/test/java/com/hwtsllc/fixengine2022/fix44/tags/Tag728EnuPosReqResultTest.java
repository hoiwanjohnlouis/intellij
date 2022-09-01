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

import com.hwtsllc.fixengine2022.fix44.enums.Enum728PosReqResult;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag728EnuPosReqResultTest {
    Tag728EnuPosReqResult tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum728PosReqResult oneEnum : Enum728PosReqResult.values()) {
            tagData = new Tag728EnuPosReqResult(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum728PosReqResult oneEnum : Enum728PosReqResult.values()) {
            tagData = new Tag728EnuPosReqResult(oneEnum);
            assertEquals( "FIX728_ENU_POS_REQ_RESULT", tagData.toFIXLabelString());
            assertEquals( "728", tagData.toEnumIDString());
            assertEquals( "POS_REQ_RESULT", tagData.toEnumNameString());
            assertEquals( "PosReqResult", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum728PosReqResult oneEnum : Enum728PosReqResult.values()) {
            tagData = new Tag728EnuPosReqResult(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  728
         *  PosReqResult
         *  int
         *  <p>    0 - Valid request
         *  <p>    1 - Invalid or unsupported request
         *  <p>    2 - No positions found that match criteria
         *  <p>    3 - Not authorized to request positions
         *  <p>    4 - Request for position not supported
         */
        tagData = new Tag728EnuPosReqResult( Enum728PosReqResult.VALID_REQUEST );
        assertEquals( "0", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag728EnuPosReqResult(Enum728PosReqResult.UNSUPPORTED_REQUEST);
        assertEquals( "1", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag728EnuPosReqResult(Enum728PosReqResult.NO_POSITIONS_FOUND);
        assertEquals( "2", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag728EnuPosReqResult(Enum728PosReqResult.NOT_AUTHORIZED);
        assertEquals( "3", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag728EnuPosReqResult(Enum728PosReqResult.REQUEST_NOT_SUPPORTED);
        assertEquals( "4", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    99 - Other (use Text (58) in conjunction with this code for an explanation)
         *  <p>    or any value conforming to the data type Reserved100Plus
         */
        tagData = new Tag728EnuPosReqResult(Enum728PosReqResult.OTHER);
        assertEquals( "99", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum728PosReqResult oneEnum : Enum728PosReqResult.values()) {
            tagData = new Tag728EnuPosReqResult(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum728PosReqResult oneEnum : Enum728PosReqResult.values()) {
            tagData = new Tag728EnuPosReqResult(oneEnum);
            assertEquals( "Tag728EnuPosReqResult\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
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