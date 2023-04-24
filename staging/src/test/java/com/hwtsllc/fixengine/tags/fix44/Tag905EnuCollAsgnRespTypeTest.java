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

import com.hwtsllc.fixengine.enums.fix44.Enum905CollAsgnRespType;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag905EnuCollAsgnRespTypeTest {
    Tag905EnuCollAsgnRespType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum905CollAsgnRespType oneEnum : Enum905CollAsgnRespType.values()) {
            tagData = new Tag905EnuCollAsgnRespType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum905CollAsgnRespType oneEnum : Enum905CollAsgnRespType.values()) {
            tagData = new Tag905EnuCollAsgnRespType(oneEnum);
            assertEquals( "FIX905_ENU_COLL_ASGN_RESP_TYPE", tagData.toFIXLabelString());
            assertEquals( "905", tagData.toFIXIDString());
            assertEquals( "COLL_ASGN_RESP_TYPE", tagData.toFIXNameString());
            assertEquals( "CollAsgnRespType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum905CollAsgnRespType oneEnum : Enum905CollAsgnRespType.values()) {
            tagData = new Tag905EnuCollAsgnRespType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  905
         *  CollAsgnRespType
         *  int
         *  <p>    0 - Received
         *  <p>    1 - Accepted
         *  <p>    2 - Declined
         *  <p>    3 - Rejected
         */
        tagData = new Tag905EnuCollAsgnRespType( Enum905CollAsgnRespType.RECEIVED );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag905EnuCollAsgnRespType( Enum905CollAsgnRespType.ACCEPTED );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag905EnuCollAsgnRespType( Enum905CollAsgnRespType.DECLINED );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag905EnuCollAsgnRespType( Enum905CollAsgnRespType.REJECTED );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum905CollAsgnRespType oneEnum : Enum905CollAsgnRespType.values()) {
            tagData = new Tag905EnuCollAsgnRespType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum905CollAsgnRespType oneEnum : Enum905CollAsgnRespType.values()) {
            tagData = new Tag905EnuCollAsgnRespType(oneEnum);
            assertEquals( "Tag905EnuCollAsgnRespType\n" +
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