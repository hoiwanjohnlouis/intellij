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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.fix42.enums.Enum434CxlRejResponseTo;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  434
 *  CxlRejResponseTo
 *  char
 *  <p>
 *  Identifies the type of request that a Cancel Reject is in response to.
 *  <p></p>
 *  Valid values:
 *  <p>    1-2 msg types
 *  <p>    1 - Order cancel request
 *  <p>    2 - Order cancel/replace request
 */
class Tag434EnuCxlRejResponseToTest {
    @Test
    void FIX0434Test() {
        FIX42 fixData = FIX42.FIX434_ENU_CXL_REJ_RESPONSE_TO;
        assertEquals( "434", fixData.toFIXIDString());
        assertEquals( "CXL_REJ_RESPONSE_TO", fixData.toFIXNameString());
        assertEquals( "CxlRejResponseTo", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0434Test() {
        Tag434EnuCxlRejResponseTo tagData;

        /*
         * 1-2 msg types
         */
        tagData = new Tag434EnuCxlRejResponseTo(Enum434CxlRejResponseTo.ORDER_CANCEL_REQUEST);
        assertEquals( Enum434CxlRejResponseTo.ORDER_CANCEL_REQUEST.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag434EnuCxlRejResponseTo(Enum434CxlRejResponseTo.ORDER_MODIFICATION_REQUEST);
        assertEquals( Enum434CxlRejResponseTo.ORDER_MODIFICATION_REQUEST.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag434EnuCxlRejResponseTo tagData;

        // loop around the ENUM and process
        for (Enum434CxlRejResponseTo oneEnum : Enum434CxlRejResponseTo.values()) {
            tagData = new Tag434EnuCxlRejResponseTo(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag434EnuCxlRejResponseTo tagData;

        // loop around the ENUM and process
        for (Enum434CxlRejResponseTo oneEnum : Enum434CxlRejResponseTo.values()) {
            tagData = new Tag434EnuCxlRejResponseTo(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag434EnuCxlRejResponseTo tagData;

        // loop around the ENUM and process
        for (Enum434CxlRejResponseTo oneEnum : Enum434CxlRejResponseTo.values()) {
            tagData = new Tag434EnuCxlRejResponseTo(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag434EnuCxlRejResponseTo tagData;

        // loop around the ENUM and process
        for (Enum434CxlRejResponseTo oneEnum : Enum434CxlRejResponseTo.values()) {
            tagData = new Tag434EnuCxlRejResponseTo(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag434EnuCxlRejResponseTo tagData;

        // loop around the ENUM and process
        for (Enum434CxlRejResponseTo oneEnum : Enum434CxlRejResponseTo.values()) {
            tagData = new Tag434EnuCxlRejResponseTo(oneEnum);
            assertEquals( "Tag434EnuCxlRejResponseTo\n" +
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