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
import com.hwtsllc.fixengine2022.fix44.enums.Enum728PosReqResult;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  728
 *  PosReqResult
 *  int
 *  <p></p>
 *  Result of Request for Position
 *  <p></p>
 *  4000+ Reserved and available for bi-laterally agreed upon user-defined values
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Valid request
 *  <p>    1 - Invalid or unsupported request
 *  <p>    2 - No positions found that match criteria
 *  <p>    3 - Not authorized to request positions
 *  <p>    4 - Request for position not supported
 *  <p></p>
 *  <p>    99 - Other (use Text (58) in conjunction with this code for an explanation)
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Tag728EnuPosReqResultTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX728_ENU_POS_REQ_RESULT;
        assertEquals( "728", fixData.toFIXIDString());
        assertEquals( "POS_REQ_RESULT", fixData.toFIXNameString());
        assertEquals( "PosReqResult", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0728Test() {
        Tag728EnuPosReqResult tagData;
        Enum728PosReqResult oneElement;

        oneElement = Enum728PosReqResult.VALID_REQUEST;
        tagData = new Tag728EnuPosReqResult( oneElement );
        assertEquals( "0", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "728", tagData.toFIXIDString());
        assertEquals( "POS_REQ_RESULT", tagData.toFIXNameString());
        assertEquals( "PosReqResult", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        tagData = new Tag728EnuPosReqResult(Enum728PosReqResult.UNSUPPORTED_REQUEST);
        assertEquals( "1", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag728EnuPosReqResult(Enum728PosReqResult.NO_POSITIONS_FOUND);
        assertEquals( "2", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag728EnuPosReqResult(Enum728PosReqResult.NOT_AUTHORIZED);
        assertEquals( "3", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag728EnuPosReqResult(Enum728PosReqResult.REQUEST_NOT_SUPPORTED);
        assertEquals( "4", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag728EnuPosReqResult(Enum728PosReqResult.OTHER);
        assertEquals( "99", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag728EnuPosReqResult tagData;

        // loop around the ENUM and process
        for ( Enum728PosReqResult oneEnum : Enum728PosReqResult.values()) {
            tagData = new Tag728EnuPosReqResult(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag728EnuPosReqResult tagData;

        // loop around the ENUM and process
        for (Enum728PosReqResult oneEnum : Enum728PosReqResult.values()) {
            tagData = new Tag728EnuPosReqResult(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag728EnuPosReqResult tagData;

        // loop around the ENUM and process
        for (Enum728PosReqResult oneEnum : Enum728PosReqResult.values()) {
            tagData = new Tag728EnuPosReqResult(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag728EnuPosReqResult tagData;

        // loop around the ENUM and process
        for (Enum728PosReqResult oneEnum : Enum728PosReqResult.values()) {
            tagData = new Tag728EnuPosReqResult(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag728EnuPosReqResult tagData;

        // loop around the ENUM and process
        for (Enum728PosReqResult oneEnum : Enum728PosReqResult.values()) {
            tagData = new Tag728EnuPosReqResult(oneEnum);
            assertEquals( "Tag728EnuPosReqResult\n" +
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