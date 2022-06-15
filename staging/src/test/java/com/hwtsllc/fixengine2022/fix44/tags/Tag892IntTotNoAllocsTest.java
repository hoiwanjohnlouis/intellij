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
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  892
 *  TotNoAllocs
 *  int
 *  <p></p>
 *  Total number of NoAlloc entries across all messages.
 *  <p></p>
 *  Should be the sum of all NoAllocs in each message that has
 *  repeating NoAlloc entries related to the same AllocID or AllocReportID.
 *  <p></p>
 *  Used to support fragmentation.
 */
class Tag892IntTotNoAllocsTest {
    @Test
    void FIX0892Test() {
        FIX44 fixData = FIX44.FIX892_INT_TOT_NO_ALLOCS;
        assertEquals( "892", fixData.toFIXIDString());
        assertEquals( "TOT_NO_ALLOCS", fixData.toFIXNameString());
        assertEquals( "TotNoAllocs", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0892Test() {
        Tag892IntTotNoAllocs tagData;
        int oneElement;

        oneElement = Tag892IntTotNoAllocs.TESTA_INT_TOT_NO_ALLOCS;
        tagData = new Tag892IntTotNoAllocs( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag892IntTotNoAllocs.TESTB_INT_TOT_NO_ALLOCS;
        tagData = new Tag892IntTotNoAllocs( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag892IntTotNoAllocs tagData;
        int oneElement;

        oneElement = Tag892IntTotNoAllocs.TESTA_INT_TOT_NO_ALLOCS;
        tagData = new Tag892IntTotNoAllocs( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag892IntTotNoAllocs.TESTB_INT_TOT_NO_ALLOCS;
        tagData = new Tag892IntTotNoAllocs( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag892IntTotNoAllocs tagData;
        int oneElement;

        oneElement = Tag892IntTotNoAllocs.TESTB_INT_TOT_NO_ALLOCS;
        tagData = new Tag892IntTotNoAllocs( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag892IntTotNoAllocs tagData;
        int oneElement;

        oneElement = Tag892IntTotNoAllocs.TESTB_INT_TOT_NO_ALLOCS;
        tagData = new Tag892IntTotNoAllocs( new MyIntType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag892IntTotNoAllocs tagData;
        int oneElement;

        oneElement = Tag892IntTotNoAllocs.TESTB_INT_TOT_NO_ALLOCS;
        tagData = new Tag892IntTotNoAllocs( new MyIntType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag892IntTotNoAllocs tagData;
        int oneElement;

        oneElement = Tag892IntTotNoAllocs.TESTA_INT_TOT_NO_ALLOCS;
        tagData = new Tag892IntTotNoAllocs( new MyIntType( oneElement ) );
        assertEquals( "Tag892IntTotNoAllocs\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}