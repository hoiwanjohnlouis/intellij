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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX40;
import com.hwtsllc.fixengine2022.fix40.enums.Enum114LocateReqd;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  114
 *  LocateReqd
 *  Boolean
 *  <p>
 *  Indicates whether the broker is to locate the stock in conjunction with a short sell order.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Indicates the broker is not required to locate
 *  <p>    Y - Indicates the broker is responsible for locating the stock
 */
class Tag114EnuLocateReqdTest {
    @Test
    void FIX0114Test() {
        FIX40 fixData = FIX40.FIX114_ENU_LOCATE_REQD;
        assertEquals( "LOCATE_REQD", fixData.toEnumNameString());
        assertEquals( "114", fixData.toEnumIDString());
        assertEquals( "LocateReqd", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0114Test() {
        Tag114EnuLocateReqd tagData;

        tagData = new Tag114EnuLocateReqd(Enum114LocateReqd.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag114EnuLocateReqd(Enum114LocateReqd.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag114EnuLocateReqd tagData;

        // loop around the ENUM and process
        for (Enum114LocateReqd oneEnum : Enum114LocateReqd.values()) {
            tagData = new Tag114EnuLocateReqd(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag114EnuLocateReqd tagData;

        // loop around the ENUM and process
        for (Enum114LocateReqd oneEnum : Enum114LocateReqd.values()) {
            tagData = new Tag114EnuLocateReqd(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag114EnuLocateReqd tagData;

        // loop around the ENUM and process
        for (Enum114LocateReqd oneEnum : Enum114LocateReqd.values()) {
            tagData = new Tag114EnuLocateReqd(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag114EnuLocateReqd tagData;

        // loop around the ENUM and process
        for (Enum114LocateReqd oneEnum : Enum114LocateReqd.values()) {
            tagData = new Tag114EnuLocateReqd(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag114EnuLocateReqd tagData;

        // loop around the ENUM and process
        for (Enum114LocateReqd oneEnum : Enum114LocateReqd.values()) {
            tagData = new Tag114EnuLocateReqd(oneEnum);
            assertEquals( "Tag114EnuLocateReqd\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}