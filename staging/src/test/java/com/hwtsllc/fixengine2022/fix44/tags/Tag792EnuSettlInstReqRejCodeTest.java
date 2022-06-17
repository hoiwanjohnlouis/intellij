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
import com.hwtsllc.fixengine2022.fix44.enums.Enum792SettlInstReqRejCode;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  792
 *  SettlInstReqRejCode
 *  int
 *  <p></p>
 *  Identifies reason for rejection (of a settlement instruction request message).
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Unable to process request
 *  <p>    1 - Unknown account
 *  <p>    2 - No matching settlement instructions found
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Tag792EnuSettlInstReqRejCodeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX792_ENU_SETTL_INST_REQ_REJ_CODE;
        assertEquals( "792", fixData.toFIXIDString());
        assertEquals( "SETTL_INST_REQ_REJ_CODE", fixData.toFIXNameString());
        assertEquals( "SettlInstReqRejCode", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0792Test() {
        Tag792EnuSettlInstReqRejCode tagData;
        Enum792SettlInstReqRejCode oneElement;

        oneElement = Enum792SettlInstReqRejCode.UNABLE_TO_PROCESS_REQUEST;
        tagData = new Tag792EnuSettlInstReqRejCode( oneElement );
        assertEquals( oneElement.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "792", tagData.toFIXIDString());
        assertEquals( "SETTL_INST_REQ_REJ_CODE", tagData.toFIXNameString());
        assertEquals( "SettlInstReqRejCode", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        tagData = new Tag792EnuSettlInstReqRejCode( Enum792SettlInstReqRejCode.UNKNOWN_ACCOUNT );
        assertEquals( Enum792SettlInstReqRejCode.UNKNOWN_ACCOUNT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag792EnuSettlInstReqRejCode( Enum792SettlInstReqRejCode.NO_MATCHING_INSTRUCTIONS );
        assertEquals( Enum792SettlInstReqRejCode.NO_MATCHING_INSTRUCTIONS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag792EnuSettlInstReqRejCode( Enum792SettlInstReqRejCode.OTHER );
        assertEquals( Enum792SettlInstReqRejCode.OTHER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag792EnuSettlInstReqRejCode tagData;

        // loop around the ENUM and process
        for ( Enum792SettlInstReqRejCode oneEnum : Enum792SettlInstReqRejCode.values()) {
            tagData = new Tag792EnuSettlInstReqRejCode(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag792EnuSettlInstReqRejCode tagData;

        // loop around the ENUM and process
        for (Enum792SettlInstReqRejCode oneEnum : Enum792SettlInstReqRejCode.values()) {
            tagData = new Tag792EnuSettlInstReqRejCode(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag792EnuSettlInstReqRejCode tagData;

        // loop around the ENUM and process
        for (Enum792SettlInstReqRejCode oneEnum : Enum792SettlInstReqRejCode.values()) {
            tagData = new Tag792EnuSettlInstReqRejCode(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag792EnuSettlInstReqRejCode tagData;

        // loop around the ENUM and process
        for (Enum792SettlInstReqRejCode oneEnum : Enum792SettlInstReqRejCode.values()) {
            tagData = new Tag792EnuSettlInstReqRejCode(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag792EnuSettlInstReqRejCode tagData;

        // loop around the ENUM and process
        for (Enum792SettlInstReqRejCode oneEnum : Enum792SettlInstReqRejCode.values()) {
            tagData = new Tag792EnuSettlInstReqRejCode(oneEnum);
            assertEquals( "Tag792EnuSettlInstReqRejCode\n" +
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