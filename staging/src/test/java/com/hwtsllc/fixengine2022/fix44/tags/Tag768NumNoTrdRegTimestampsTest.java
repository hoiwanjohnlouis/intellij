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
import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  768
 *  NoTrdRegTimestamps
 *  NumInGroup
 *  <p></p>
 *  Number of TrdRegTimestamp (769) entries
 */
class Tag768NumNoTrdRegTimestampsTest {
    @Test
    void FIX0768Test() {
        FIX44 fixData = FIX44.FIX768_NUM_NO_TRD_REG_TIMESTAMPS;
        assertEquals( "768", fixData.toFIXIDString());
        assertEquals( "NO_TRD_REG_TIMESTAMPS", fixData.toFIXNameString());
        assertEquals( "NoTrdRegTimestamps", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0768Test() {
        Tag768NumNoTrdRegTimestamps tagData;
        int oneElement;

        oneElement = Tag768NumNoTrdRegTimestamps.TESTA_NUM_NO_TRD_REG_TIMESTAMPS;
        tagData = new Tag768NumNoTrdRegTimestamps( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "768", tagData.toFIXIDString());
        assertEquals( "NO_TRD_REG_TIMESTAMPS", tagData.toFIXNameString());
        assertEquals( "NoTrdRegTimestamps", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag768NumNoTrdRegTimestamps.TESTB_NUM_NO_TRD_REG_TIMESTAMPS;
        tagData = new Tag768NumNoTrdRegTimestamps( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag768NumNoTrdRegTimestamps tagData;
        int oneElement;

        oneElement = Tag768NumNoTrdRegTimestamps.TESTA_NUM_NO_TRD_REG_TIMESTAMPS;
        tagData = new Tag768NumNoTrdRegTimestamps( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag768NumNoTrdRegTimestamps.TESTB_NUM_NO_TRD_REG_TIMESTAMPS;
        tagData = new Tag768NumNoTrdRegTimestamps( new MyNumInGroupType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag768NumNoTrdRegTimestamps tagData;
        int oneElement;

        oneElement = Tag768NumNoTrdRegTimestamps.TESTB_NUM_NO_TRD_REG_TIMESTAMPS;
        tagData = new Tag768NumNoTrdRegTimestamps( new MyNumInGroupType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag768NumNoTrdRegTimestamps tagData;
        int oneElement;

        oneElement = Tag768NumNoTrdRegTimestamps.TESTB_NUM_NO_TRD_REG_TIMESTAMPS;
        tagData = new Tag768NumNoTrdRegTimestamps( new MyNumInGroupType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag768NumNoTrdRegTimestamps tagData;
        int oneElement;

        oneElement = Tag768NumNoTrdRegTimestamps.TESTB_NUM_NO_TRD_REG_TIMESTAMPS;
        tagData = new Tag768NumNoTrdRegTimestamps( new MyNumInGroupType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag768NumNoTrdRegTimestamps tagData;
        int oneElement;

        oneElement = Tag768NumNoTrdRegTimestamps.TESTA_NUM_NO_TRD_REG_TIMESTAMPS;
        tagData = new Tag768NumNoTrdRegTimestamps( new MyNumInGroupType( oneElement ) );
        assertEquals( "Tag768NumNoTrdRegTimestamps\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}