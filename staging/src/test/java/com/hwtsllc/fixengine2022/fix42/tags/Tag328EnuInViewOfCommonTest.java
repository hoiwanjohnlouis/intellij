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
import com.hwtsllc.fixengine2022.fix42.enums.Enum328InViewOfCommon;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  328
 *  InViewOfCommon
 *  Boolean
 *  <p>
 *  Indicates whether or not the halt was due to Common Stock trading being halted.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Halt was not related to a halt of the common stock
 *  <p>    Y - Half was due to common stock being halted
 */
class Tag328EnuInViewOfCommonTest {
    @Test
    void FIX0328Test() {
        FIX42 fixData = FIX42.FIX328_ENU_IN_VIEW_OF_COMMON;
        assertEquals( "328", fixData.toFIXIDString());
        assertEquals( "IN_VIEW_OF_COMMON", fixData.toFIXNameString());
        assertEquals( "InViewOfCommon", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0328Test() {
        Tag328EnuInViewOfCommon tagData;

        tagData = new Tag328EnuInViewOfCommon(Enum328InViewOfCommon.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag328EnuInViewOfCommon(Enum328InViewOfCommon.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag328EnuInViewOfCommon tagData;

        // loop around the ENUM and process
        for (Enum328InViewOfCommon oneEnum : Enum328InViewOfCommon.values()) {
            tagData = new Tag328EnuInViewOfCommon(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag328EnuInViewOfCommon tagData;

        // loop around the ENUM and process
        for (Enum328InViewOfCommon oneEnum : Enum328InViewOfCommon.values()) {
            tagData = new Tag328EnuInViewOfCommon(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag328EnuInViewOfCommon tagData;

        // loop around the ENUM and process
        for (Enum328InViewOfCommon oneEnum : Enum328InViewOfCommon.values()) {
            tagData = new Tag328EnuInViewOfCommon(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag328EnuInViewOfCommon tagData;

        // loop around the ENUM and process
        for (Enum328InViewOfCommon oneEnum : Enum328InViewOfCommon.values()) {
            tagData = new Tag328EnuInViewOfCommon(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag328EnuInViewOfCommon tagData;

        // loop around the ENUM and process
        for (Enum328InViewOfCommon oneEnum : Enum328InViewOfCommon.values()) {
            tagData = new Tag328EnuInViewOfCommon(oneEnum);
            assertEquals( "Tag328EnuInViewOfCommon\n" +
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