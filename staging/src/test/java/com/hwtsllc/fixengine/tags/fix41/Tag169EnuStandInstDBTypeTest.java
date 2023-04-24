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

package com.hwtsllc.fixengine.tags.fix41;

import com.hwtsllc.fixengine.enums.fix41.Enum169StandInstDbType;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  169
 *  StandInstDbType
 *  int
 *  <p></p>
 *  Identifies the Standing Instruction database used
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Other
 *  <p>    1 - DTC SID
 *  <p>    2 - Thomson ALERT
 *  <p>    3 - A Global Custodian (StandInstDBName (70) must be provided)
 *  <p>    4 - AccountNet
 */
class Tag169EnuStandInstDBTypeTest {
    Tag169EnuStandInstDBType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum169StandInstDbType oneEnum : Enum169StandInstDbType.values()) {
            tagData = new Tag169EnuStandInstDBType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum169StandInstDbType oneEnum : Enum169StandInstDbType.values()) {
            tagData = new Tag169EnuStandInstDBType(oneEnum);
            assertEquals( "FIX169_ENU_STAND_INST_DB_TYPE", tagData.toFIXLabelString());
            assertEquals( "169", tagData.toFIXIDString());
            assertEquals( "STAND_INST_DB_TYPE", tagData.toFIXNameString());
            assertEquals( "StandInstDbType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum169StandInstDbType oneEnum : Enum169StandInstDbType.values()) {
            tagData = new Tag169EnuStandInstDBType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  169
         *  StandInstDbType
         *  int
         *  <p>    0 - Other
         *  <p>    1 - DTC SID
         *  <p>    2 - Thomson ALERT
         *  <p>    3 - A Global Custodian (StandInstDBName (70) must be provided)
         *  <p>    4 - AccountNet
         */
        tagData = new Tag169EnuStandInstDBType(Enum169StandInstDbType.OTHER);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag169EnuStandInstDBType(Enum169StandInstDbType.DTC_SID);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag169EnuStandInstDBType(Enum169StandInstDbType.THOMPSON_ALERT);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag169EnuStandInstDBType(Enum169StandInstDbType.GLOBAL_CUSTODIAN);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag169EnuStandInstDBType(Enum169StandInstDbType.ACCOUNT_NET);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum169StandInstDbType oneEnum : Enum169StandInstDbType.values()) {
            tagData = new Tag169EnuStandInstDBType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum169StandInstDbType oneEnum : Enum169StandInstDbType.values()) {
            tagData = new Tag169EnuStandInstDBType(oneEnum);
            assertEquals( "Tag169EnuStandInstDBType\n" +
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