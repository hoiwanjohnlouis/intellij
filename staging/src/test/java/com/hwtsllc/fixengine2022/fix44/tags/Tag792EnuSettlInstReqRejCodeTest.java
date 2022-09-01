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

import com.hwtsllc.fixengine2022.fix44.enums.Enum792SettlInstReqRejCode;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag792EnuSettlInstReqRejCodeTest {
    Tag792EnuSettlInstReqRejCode tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum792SettlInstReqRejCode oneEnum : Enum792SettlInstReqRejCode.values()) {
            tagData = new Tag792EnuSettlInstReqRejCode(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum792SettlInstReqRejCode oneEnum : Enum792SettlInstReqRejCode.values()) {
            tagData = new Tag792EnuSettlInstReqRejCode(oneEnum);
            assertEquals( "FIX792_ENU_SETTL_INST_REQ_REJ_CODE", tagData.toFIXLabelString());
            assertEquals( "792", tagData.toEnumIDString());
            assertEquals( "SETTL_INST_REQ_REJ_CODE", tagData.toEnumNameString());
            assertEquals( "SettlInstReqRejCode", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum792SettlInstReqRejCode oneEnum : Enum792SettlInstReqRejCode.values()) {
            tagData = new Tag792EnuSettlInstReqRejCode(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  792
         *  SettlInstReqRejCode
         *  int
         *  <p>    0 - Unable to process request
         *  <p>    1 - Unknown account
         *  <p>    2 - No matching settlement instructions found
         */
        tagData = new Tag792EnuSettlInstReqRejCode( Enum792SettlInstReqRejCode.UNABLE_TO_PROCESS_REQUEST );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag792EnuSettlInstReqRejCode( Enum792SettlInstReqRejCode.UNKNOWN_ACCOUNT );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag792EnuSettlInstReqRejCode( Enum792SettlInstReqRejCode.NO_MATCHING_INSTRUCTIONS );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    99 - Other
         *  <p>    or any value conforming to the data type Reserved100Plus
         */
        tagData = new Tag792EnuSettlInstReqRejCode( Enum792SettlInstReqRejCode.OTHER );
        assertEquals( "99", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum792SettlInstReqRejCode oneEnum : Enum792SettlInstReqRejCode.values()) {
            tagData = new Tag792EnuSettlInstReqRejCode(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum792SettlInstReqRejCode oneEnum : Enum792SettlInstReqRejCode.values()) {
            tagData = new Tag792EnuSettlInstReqRejCode(oneEnum);
            assertEquals( "Tag792EnuSettlInstReqRejCode\n" +
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