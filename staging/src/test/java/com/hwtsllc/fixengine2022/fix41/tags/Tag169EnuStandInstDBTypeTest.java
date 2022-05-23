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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.fix41.enums.Enum169StandInstDbType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  169
 *  StandInstDbType
 *  int
 *  <p>
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
    @Test
    void FIX0169Test() {
        FIX41 fixData = FIX41.FIX169_ENU_STAND_INST_DB_TYPE;
        assertEquals( "169", fixData.toFIXIDString());
        assertEquals( "STAND_INST_DB_TYPE", fixData.toFIXNameString());
        assertEquals( "StandInstDbType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0169Test() {
        Tag169EnuStandInstDBType tagData;

        tagData = new Tag169EnuStandInstDBType(Enum169StandInstDbType.OTHER);
        assertEquals( Enum169StandInstDbType.OTHER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag169EnuStandInstDBType(Enum169StandInstDbType.DTC_SID);
        assertEquals( Enum169StandInstDbType.DTC_SID.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag169EnuStandInstDBType(Enum169StandInstDbType.THOMPSON_ALERT);
        assertEquals( Enum169StandInstDbType.THOMPSON_ALERT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag169EnuStandInstDBType(Enum169StandInstDbType.GLOBAL_CUSTODIAN);
        assertEquals( Enum169StandInstDbType.GLOBAL_CUSTODIAN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag169EnuStandInstDBType(Enum169StandInstDbType.ACCOUNT_NET);
        assertEquals( Enum169StandInstDbType.ACCOUNT_NET.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag169EnuStandInstDBType tagData;

        // loop around the ENUM and process
        for (Enum169StandInstDbType oneEnum : Enum169StandInstDbType.values()) {
            tagData = new Tag169EnuStandInstDBType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag169EnuStandInstDBType tagData;

        // loop around the ENUM and process
        for (Enum169StandInstDbType oneEnum : Enum169StandInstDbType.values()) {
            tagData = new Tag169EnuStandInstDBType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag169EnuStandInstDBType tagData;

        // loop around the ENUM and process
        for (Enum169StandInstDbType oneEnum : Enum169StandInstDbType.values()) {
            tagData = new Tag169EnuStandInstDBType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag169EnuStandInstDBType tagData;

        // loop around the ENUM and process
        for (Enum169StandInstDbType oneEnum : Enum169StandInstDbType.values()) {
            tagData = new Tag169EnuStandInstDBType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag169EnuStandInstDBType tagData;

        // loop around the ENUM and process
        for (Enum169StandInstDbType oneEnum : Enum169StandInstDbType.values()) {
            tagData = new Tag169EnuStandInstDBType(oneEnum);
            assertEquals( "Tag169EnuStandInstDBType\n" +
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