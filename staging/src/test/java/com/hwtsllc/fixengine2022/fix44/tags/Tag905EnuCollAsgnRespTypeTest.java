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
import com.hwtsllc.fixengine2022.fix44.enums.Enum905CollAsgnRespType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  905
 *  CollAsgnRespType
 *  int
 *  <p></p>
 *  Collateral Assignment Response Type
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Received
 *  <p>    1 - Accepted
 *  <p>    2 - Declined
 *  <p>    3 - Rejected
 */
class Tag905EnuCollAsgnRespTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX905_ENU_COLL_ASGN_RESP_TYPE;
        assertEquals( "905", fixData.toFIXIDString());
        assertEquals( "COLL_ASGN_RESP_TYPE", fixData.toFIXNameString());
        assertEquals( "CollAsgnRespType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0905Test() {
        Tag905EnuCollAsgnRespType tagData;
        Enum905CollAsgnRespType oneElement;

        oneElement = Enum905CollAsgnRespType.RECEIVED;
        tagData = new Tag905EnuCollAsgnRespType( oneElement );
        assertEquals( oneElement.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "905", tagData.toFIXIDString());
        assertEquals( "COLL_ASGN_RESP_TYPE", tagData.toFIXNameString());
        assertEquals( "CollAsgnRespType", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        tagData = new Tag905EnuCollAsgnRespType( Enum905CollAsgnRespType.ACCEPTED );
        assertEquals( Enum905CollAsgnRespType.ACCEPTED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag905EnuCollAsgnRespType( Enum905CollAsgnRespType.DECLINED );
        assertEquals( Enum905CollAsgnRespType.DECLINED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag905EnuCollAsgnRespType( Enum905CollAsgnRespType.REJECTED );
        assertEquals( Enum905CollAsgnRespType.REJECTED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag905EnuCollAsgnRespType tagData;

        // loop around the ENUM and process
        for ( Enum905CollAsgnRespType oneEnum : Enum905CollAsgnRespType.values()) {
            tagData = new Tag905EnuCollAsgnRespType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag905EnuCollAsgnRespType tagData;

        // loop around the ENUM and process
        for (Enum905CollAsgnRespType oneEnum : Enum905CollAsgnRespType.values()) {
            tagData = new Tag905EnuCollAsgnRespType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag905EnuCollAsgnRespType tagData;

        // loop around the ENUM and process
        for (Enum905CollAsgnRespType oneEnum : Enum905CollAsgnRespType.values()) {
            tagData = new Tag905EnuCollAsgnRespType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag905EnuCollAsgnRespType tagData;

        // loop around the ENUM and process
        for (Enum905CollAsgnRespType oneEnum : Enum905CollAsgnRespType.values()) {
            tagData = new Tag905EnuCollAsgnRespType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag905EnuCollAsgnRespType tagData;

        // loop around the ENUM and process
        for (Enum905CollAsgnRespType oneEnum : Enum905CollAsgnRespType.values()) {
            tagData = new Tag905EnuCollAsgnRespType(oneEnum);
            assertEquals( "Tag905EnuCollAsgnRespType\n" +
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