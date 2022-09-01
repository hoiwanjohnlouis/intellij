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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.fix43.enums.Enum560SecurityRequestResult;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag560EnuSecurityRequestResultTest {
    Tag560EnuSecurityRequestResult tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum560SecurityRequestResult oneEnum : Enum560SecurityRequestResult.values()) {
            tagData = new Tag560EnuSecurityRequestResult(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum560SecurityRequestResult oneEnum : Enum560SecurityRequestResult.values()) {
            tagData = new Tag560EnuSecurityRequestResult(oneEnum);
            assertEquals( "FIX560_ENU_SECURITY_REQUEST_RESULT", tagData.toFIXLabelString());
            assertEquals( "560", tagData.toFIXIDString());
            assertEquals( "SECURITY_REQUEST_RESULT", tagData.toEnumNameString());
            assertEquals( "SecurityRequestResult", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum560SecurityRequestResult oneEnum : Enum560SecurityRequestResult.values()) {
            tagData = new Tag560EnuSecurityRequestResult(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  560
         *  SecurityRequestResult
         *  int
         *  <p>    0 - Valid request
         *  <p>    1 - Invalid or unsupported request
         *  <p>    2 - No instruments found that match selection criteria
         *  <p>    3 - Not authorized to retrieve instrument data
         *  <p>    4 - Instrument data temporarily unavailable
         */
        tagData = new Tag560EnuSecurityRequestResult( Enum560SecurityRequestResult.VALID_REQUEST );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag560EnuSecurityRequestResult( Enum560SecurityRequestResult.UNSUPPORTED_REQUEST );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag560EnuSecurityRequestResult( Enum560SecurityRequestResult.NO_INSTRUMENTS_FOUND );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag560EnuSecurityRequestResult( Enum560SecurityRequestResult.NOT_AUTHORIZED );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag560EnuSecurityRequestResult( Enum560SecurityRequestResult.INSTRUMENT_DATA_UNAVAILABLE );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    5 - Request for instrument data not supported
         */
        tagData = new Tag560EnuSecurityRequestResult( Enum560SecurityRequestResult.REQUEST_NOT_SUPPORTED );
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum560SecurityRequestResult oneEnum : Enum560SecurityRequestResult.values()) {
            tagData = new Tag560EnuSecurityRequestResult(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum560SecurityRequestResult oneEnum : Enum560SecurityRequestResult.values()) {
            tagData = new Tag560EnuSecurityRequestResult(oneEnum);
            assertEquals( "Tag560EnuSecurityRequestResult\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
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