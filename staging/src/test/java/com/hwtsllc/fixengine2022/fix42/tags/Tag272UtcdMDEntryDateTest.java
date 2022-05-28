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
import com.hwtsllc.fixengine2022.datatypes.MyUTCDateType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  272
 *  MDEntryDate
 *  UTCDateOnly
 *  <p>
 *  Date of Market Data Entry.
 *  <p>
 *  (prior to FIX 4.4 field was of type UTCDate)
 */
class Tag272UtcdMDEntryDateTest {
    @Test
    void FIX0272Test() {
        FIX42 fixData = FIX42.FIX272_UTCD_MD_ENTRY_DATE;
        assertEquals( "272", fixData.toFIXIDString());
        assertEquals( "MD_ENTRY_DATE", fixData.toFIXNameString());
        assertEquals( "MDEntryDate", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0272Test() {
        Tag272UtcdMDEntryDate tagData;
        String oneElement;

        oneElement = Tag272UtcdMDEntryDate.TESTA_UTCD_MD_ENTRY_DATE;
        tagData = new Tag272UtcdMDEntryDate( new MyUTCDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_UTCD_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag272UtcdMDEntryDate.TESTB_UTCD_MD_ENTRY_DATE;
        tagData = new Tag272UtcdMDEntryDate( new MyUTCDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_UTCD_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag272UtcdMDEntryDate tagData;
        String oneElement;

        oneElement = Tag272UtcdMDEntryDate.TESTA_UTCD_MD_ENTRY_DATE;
        tagData = new Tag272UtcdMDEntryDate( new MyUTCDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag272UtcdMDEntryDate.TESTB_UTCD_MD_ENTRY_DATE;
        tagData = new Tag272UtcdMDEntryDate( new MyUTCDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag272UtcdMDEntryDate tagData;
        String oneElement;

        oneElement = Tag272UtcdMDEntryDate.TESTB_UTCD_MD_ENTRY_DATE;
        tagData = new Tag272UtcdMDEntryDate( new MyUTCDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_UTCD_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag272UtcdMDEntryDate tagData;
        String oneElement;

        oneElement = Tag272UtcdMDEntryDate.TESTB_UTCD_MD_ENTRY_DATE;
        tagData = new Tag272UtcdMDEntryDate( new MyUTCDateType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_UTCD_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag272UtcdMDEntryDate tagData;
        String oneElement;

        oneElement = Tag272UtcdMDEntryDate.TESTB_UTCD_MD_ENTRY_DATE;
        tagData = new Tag272UtcdMDEntryDate( new MyUTCDateType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_UTCD_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag272UtcdMDEntryDate tagData;
        String oneElement;

        oneElement = Tag272UtcdMDEntryDate.TESTA_UTCD_MD_ENTRY_DATE;
        tagData = new Tag272UtcdMDEntryDate( new MyUTCDateType( oneElement ) );
        assertEquals( "Tag272UtcdMDEntryDate\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_UTCD_DATA_VALUE, tagData.toVerboseString() );
    }
}