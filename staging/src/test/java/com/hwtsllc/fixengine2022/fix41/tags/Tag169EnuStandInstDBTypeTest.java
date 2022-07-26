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

import com.hwtsllc.fixengine2022.fix41.enums.Enum169StandInstDbType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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
            assertEquals( "FIX169_ENU_STAND_INST_DB_TYPE", tagData.toEnumLabelString());
            assertEquals( "169", tagData.toEnumIDString());
            assertEquals( "STAND_INST_DB_TYPE", tagData.toEnumNameString());
            assertEquals( "StandInstDbType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        tagData = new Tag169EnuStandInstDBType(Enum169StandInstDbType.OTHER);
        assertEquals( Enum169StandInstDbType.OTHER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag169EnuStandInstDBType(Enum169StandInstDbType.DTC_SID);
        assertEquals( Enum169StandInstDbType.DTC_SID.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag169EnuStandInstDBType(Enum169StandInstDbType.THOMPSON_ALERT);
        assertEquals( Enum169StandInstDbType.THOMPSON_ALERT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag169EnuStandInstDBType(Enum169StandInstDbType.GLOBAL_CUSTODIAN);
        assertEquals( Enum169StandInstDbType.GLOBAL_CUSTODIAN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag169EnuStandInstDBType(Enum169StandInstDbType.ACCOUNT_NET);
        assertEquals( Enum169StandInstDbType.ACCOUNT_NET.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for (Enum169StandInstDbType oneEnum : Enum169StandInstDbType.values()) {
            tagData = new Tag169EnuStandInstDBType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum169StandInstDbType oneEnum : Enum169StandInstDbType.values()) {
            tagData = new Tag169EnuStandInstDBType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
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