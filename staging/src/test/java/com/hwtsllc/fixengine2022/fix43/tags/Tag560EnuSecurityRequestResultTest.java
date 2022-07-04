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

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.fix43.enums.Enum560SecurityRequestResult;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  560
 *  SecurityRequestResult
 *  int
 *  <p></p>
 *  The results returned to a Security Request message
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Valid request
 *  <p>    1 - Invalid or unsupported request
 *  <p>    2 - No instruments found that match selection criteria
 *  <p>    3 - Not authorized to retrieve instrument data
 *  <p>    4 - Instrument data temporarily unavailable
 *  <p>    5 - Request for instrument data not supported
 */
class Tag560EnuSecurityRequestResultTest {
    @Test
    void FIX0560Test() {
        FIX43 fixData = FIX43.FIX560_ENU_SECURITY_REQUEST_RESULT;
        assertEquals( "560", fixData.toEnumIDString());
        assertEquals( "SECURITY_REQUEST_RESULT", fixData.toEnumNameString());
        assertEquals( "SecurityRequestResult", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0560Test() {
        Tag560EnuSecurityRequestResult tagData;

        /*
         *  0-5 types
         */
        tagData = new Tag560EnuSecurityRequestResult( Enum560SecurityRequestResult.VALID_REQUEST );
        assertEquals( Enum560SecurityRequestResult.VALID_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag560EnuSecurityRequestResult( Enum560SecurityRequestResult.UNSUPPORTED_REQUEST );
        assertEquals( Enum560SecurityRequestResult.UNSUPPORTED_REQUEST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag560EnuSecurityRequestResult( Enum560SecurityRequestResult.NO_INSTRUMENTS_FOUND );
        assertEquals( Enum560SecurityRequestResult.NO_INSTRUMENTS_FOUND.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag560EnuSecurityRequestResult( Enum560SecurityRequestResult.NOT_AUTHORIZED );
        assertEquals( Enum560SecurityRequestResult.NOT_AUTHORIZED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag560EnuSecurityRequestResult( Enum560SecurityRequestResult.INSTRUMENT_DATA_UNAVAILABLE );
        assertEquals( Enum560SecurityRequestResult.INSTRUMENT_DATA_UNAVAILABLE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag560EnuSecurityRequestResult( Enum560SecurityRequestResult.REQUEST_NOT_SUPPORTED );
        assertEquals( Enum560SecurityRequestResult.REQUEST_NOT_SUPPORTED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag560EnuSecurityRequestResult tagData;

        // loop around the ENUM and process
        for ( Enum560SecurityRequestResult oneEnum : Enum560SecurityRequestResult.values()) {
            tagData = new Tag560EnuSecurityRequestResult(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag560EnuSecurityRequestResult tagData;

        // loop around the ENUM and process
        for (Enum560SecurityRequestResult oneEnum : Enum560SecurityRequestResult.values()) {
            tagData = new Tag560EnuSecurityRequestResult(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag560EnuSecurityRequestResult tagData;

        // loop around the ENUM and process
        for (Enum560SecurityRequestResult oneEnum : Enum560SecurityRequestResult.values()) {
            tagData = new Tag560EnuSecurityRequestResult(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag560EnuSecurityRequestResult tagData;

        // loop around the ENUM and process
        for (Enum560SecurityRequestResult oneEnum : Enum560SecurityRequestResult.values()) {
            tagData = new Tag560EnuSecurityRequestResult(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag560EnuSecurityRequestResult tagData;

        // loop around the ENUM and process
        for (Enum560SecurityRequestResult oneEnum : Enum560SecurityRequestResult.values()) {
            tagData = new Tag560EnuSecurityRequestResult(oneEnum);
            assertEquals( "Tag560EnuSecurityRequestResult\n" +
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