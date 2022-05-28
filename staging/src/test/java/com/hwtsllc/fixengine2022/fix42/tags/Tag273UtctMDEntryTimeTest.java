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
import com.hwtsllc.fixengine2022.datatypes.MyUTCTimeType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  273
 *  MDEntryTime
 *  UTCTimeOnly
 *  <p>
 *  Time of Market Data Entry.
 */
class Tag273UtctMDEntryTimeTest {
    @Test
    void FIX0273Test() {
        FIX42 fixData = FIX42.FIX273_UTCT_MD_ENTRY_TIME;
        assertEquals( "273", fixData.toFIXIDString());
        assertEquals( "MD_ENTRY_TIME", fixData.toFIXNameString());
        assertEquals( "MDEntryTime", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0273Test() {
        Tag273UtctMDEntryTime tagData;
        String oneElement;

        oneElement = Tag273UtctMDEntryTime.TESTA_UTCT_MD_ENTRY_TIME;
        tagData = new Tag273UtctMDEntryTime(new MyUTCTimeType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_UTCT_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag273UtctMDEntryTime.TESTB_UTCT_MD_ENTRY_TIME;
        tagData = new Tag273UtctMDEntryTime(new MyUTCTimeType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_UTCT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag273UtctMDEntryTime tagData;
        String oneElement;

        oneElement = Tag273UtctMDEntryTime.TESTA_UTCT_MD_ENTRY_TIME;
        tagData = new Tag273UtctMDEntryTime(new MyUTCTimeType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag273UtctMDEntryTime.TESTB_UTCT_MD_ENTRY_TIME;
        tagData = new Tag273UtctMDEntryTime(new MyUTCTimeType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag273UtctMDEntryTime tagData;
        String oneElement;

        oneElement = Tag273UtctMDEntryTime.TESTB_UTCT_MD_ENTRY_TIME;
        tagData = new Tag273UtctMDEntryTime(new MyUTCTimeType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_UTCT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag273UtctMDEntryTime tagData;
        String oneElement;

        oneElement = Tag273UtctMDEntryTime.TESTB_UTCT_MD_ENTRY_TIME;
        tagData = new Tag273UtctMDEntryTime(new MyUTCTimeType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_UTCT_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag273UtctMDEntryTime tagData;
        String oneElement;

        oneElement = Tag273UtctMDEntryTime.TESTB_UTCT_MD_ENTRY_TIME;
        tagData = new Tag273UtctMDEntryTime(new MyUTCTimeType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_UTCT_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag273UtctMDEntryTime tagData;
        String oneElement;

        oneElement = Tag273UtctMDEntryTime.TESTA_UTCT_MD_ENTRY_TIME;
        tagData = new Tag273UtctMDEntryTime(new MyUTCTimeType( oneElement ) );
        assertEquals( "Tag273UtctMDEntryTime\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_UTCT_DATA_VALUE, tagData.toVerboseString() );
    }
}