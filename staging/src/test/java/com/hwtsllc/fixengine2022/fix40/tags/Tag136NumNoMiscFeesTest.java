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
import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  136
 *  NoMiscFees
 *  NumInGroup
 *  Number of repeating groups of miscellaneous fees
 */
class Tag136NumNoMiscFeesTest {
    @Test
    void FIX0136Test() {
        FIX40 fixData = FIX40.FIX136_NUM_NO_MISC_FEES;
        assertEquals( "NO_MISC_FEES", fixData.toFIXNameString());
        assertEquals( "136", fixData.toFIXIDString());
        assertEquals( "NoMiscFees", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0136Test() {
        Tag136NumNoMiscFees tagData;

        tagData = new Tag136NumNoMiscFees(new MyNumInGroupType(3) );
        assertEquals( 3, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag136NumNoMiscFees tagData;

        tagData = new Tag136NumNoMiscFees(new MyNumInGroupType(Tag136NumNoMiscFees.TESTB_NUM_NO_MISC_FEES));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag136NumNoMiscFees tagData;

        tagData = new Tag136NumNoMiscFees(new MyNumInGroupType(Tag136NumNoMiscFees.TESTB_NUM_NO_MISC_FEES));
        assertEquals( Tag136NumNoMiscFees.TESTB_NUM_NO_MISC_FEES, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag136NumNoMiscFees tagData;

        tagData = new Tag136NumNoMiscFees(new MyNumInGroupType(Tag136NumNoMiscFees.TESTB_NUM_NO_MISC_FEES));
        assertEquals( tagData.toFIXIDString() + "=" + Tag136NumNoMiscFees.TESTB_NUM_NO_MISC_FEES,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag136NumNoMiscFees tagData;

        tagData = new Tag136NumNoMiscFees(new MyNumInGroupType(Tag136NumNoMiscFees.TESTB_NUM_NO_MISC_FEES));
        assertEquals( String.valueOf(Tag136NumNoMiscFees.TESTB_NUM_NO_MISC_FEES),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag136NumNoMiscFees tagData;

        tagData = new Tag136NumNoMiscFees(new MyNumInGroupType(Tag136NumNoMiscFees.TESTA_NUM_NO_MISC_FEES));
        assertEquals( "Tag136NumNoMiscFees\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag136NumNoMiscFees.TESTA_NUM_NO_MISC_FEES + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag136NumNoMiscFees.TESTA_NUM_NO_MISC_FEES + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}