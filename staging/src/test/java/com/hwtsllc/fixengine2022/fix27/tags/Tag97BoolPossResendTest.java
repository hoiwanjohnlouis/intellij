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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.fix27.enums.Enum97PossResend;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  97
 *  PossResend
 *  Boolean
 *  <p>
 *  Indicates that message may contain information that has been sent under another sequence number.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Original Transmission
 *  <p>    Y - Possible Resend
 */
class Tag97BoolPossResendTest {
    @Test
    void FIX0097Test() {
        FIX27 fixData = FIX27.FIX97_BOOL_POSS_RESEND;
        assertEquals( "POSS_RESEND", fixData.toFIXNameString());
        assertEquals( "97", fixData.toFIXIDString());
        assertEquals( "PossResend", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void PrintFIXTagTest() {
        Tag97BoolPossResend tagData;

        // loop around the ENUM and process
        for (Enum97PossResend oneEnum : Enum97PossResend.values()) {
            tagData = new Tag97BoolPossResend(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag97BoolPossResend tagData;

        // loop around the ENUM and process
        for (Enum97PossResend oneEnum : Enum97PossResend.values()) {
            tagData = new Tag97BoolPossResend(oneEnum);
            assertEquals( oneEnum.toFIXIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag97BoolPossResend tagData;

        // loop around the ENUM and process
        for (Enum97PossResend oneEnum : Enum97PossResend.values()) {
            tagData = new Tag97BoolPossResend(oneEnum);
            assertEquals( "97=" + oneEnum.toFIXIDString(), tagData.toValuePairString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag97BoolPossResend tagData;

        // loop around the ENUM and process
        for (Enum97PossResend oneEnum : Enum97PossResend.values()) {
            tagData = new Tag97BoolPossResend(oneEnum);
            assertEquals( "Tag97BoolPossResend\n" +
                            "\tEnumName[FIX97_BOOL_POSS_RESEND]\n" +
                            "\tFIXID[97]\n" +
                            "\tFIXName[POSS_RESEND]\n" +
                            "\tFIXDescription[PossResend]\n" +
                            "\tDataValue[" + oneEnum.toFIXIDString() + "]\n" +
                            "\tValuePair[97=" + oneEnum.toFIXIDString() + "]\n" +
                            "\tDataID[" + oneEnum.toFIXIDString() + "]\n" +
                            "\tDataName[" + oneEnum.toFIXNameString() + "]\n" +
                            "\tDataDescription[" + oneEnum.toFIXDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag97BoolPossResend tagData;

        // loop around the ENUM and process
        for (Enum97PossResend oneEnum : Enum97PossResend.values()) {
            tagData = new Tag97BoolPossResend(oneEnum);
            assertEquals( oneEnum.toFIXIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
}