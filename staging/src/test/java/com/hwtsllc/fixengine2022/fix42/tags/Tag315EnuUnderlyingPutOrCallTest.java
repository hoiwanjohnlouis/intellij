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
import com.hwtsllc.fixengine2022.datatypes.MyEnumPutOrCall;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  201 (same as 201, 315)
 *  PutOrCall
 *  int
 *  <p>
 *  Deprecated in FIX.4.2 Indicates whether an Option is for a put or call
 *  <p></p>
 *  315
 *  UnderlyingPutOrCall
 *  int
 *  <p>
 *  Deprecated in FIX.4.2 Underlying security's PutOrCall. See PutOrCall field for description
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Put
 *  <p>    1 - Call
 */
// @Deprecated
class Tag315EnuUnderlyingPutOrCallTest {
    @Test
    void FIX0315Test() {
        FIX42 fixData = FIX42.FIX315_ENU_UNDERLYING_PUT_OR_CALL;
        assertEquals( "315", fixData.toFIXIDString());
        assertEquals( "UNDERLYING_PUT_OR_CALL", fixData.toFIXNameString());
        assertEquals( "UnderlyingPutOrCall (replaced)", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }

    @Test
    void Tag0315Test() {
        Tag315EnuUnderlyingPutOrCall tagData;

        tagData = new Tag315EnuUnderlyingPutOrCall(MyEnumPutOrCall.CALL);
        assertEquals( MyEnumPutOrCall.CALL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag315EnuUnderlyingPutOrCall(MyEnumPutOrCall.PUT);
        assertEquals( MyEnumPutOrCall.PUT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag315EnuUnderlyingPutOrCall tagData;

        // loop around the ENUM and process
        for (MyEnumPutOrCall oneEnum : MyEnumPutOrCall.values()) {
            tagData = new Tag315EnuUnderlyingPutOrCall(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag315EnuUnderlyingPutOrCall tagData;

        // loop around the ENUM and process
        for (MyEnumPutOrCall oneEnum : MyEnumPutOrCall.values()) {
            tagData = new Tag315EnuUnderlyingPutOrCall(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag315EnuUnderlyingPutOrCall tagData;

        // loop around the ENUM and process
        for (MyEnumPutOrCall oneEnum : MyEnumPutOrCall.values()) {
            tagData = new Tag315EnuUnderlyingPutOrCall(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag315EnuUnderlyingPutOrCall tagData;

        // loop around the ENUM and process
        for (MyEnumPutOrCall oneEnum : MyEnumPutOrCall.values()) {
            tagData = new Tag315EnuUnderlyingPutOrCall(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag315EnuUnderlyingPutOrCall tagData;

        // loop around the ENUM and process
        for (MyEnumPutOrCall oneEnum : MyEnumPutOrCall.values()) {
            tagData = new Tag315EnuUnderlyingPutOrCall(oneEnum);
            assertEquals( "Tag315EnuUnderlyingPutOrCall\n" +
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