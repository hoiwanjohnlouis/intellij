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
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  422
 *  TotNoStrikes
 *  int
 *  <p>
 *  Total number of strike price entries across all messages.
 *  <p>
 *  Should be the sum of all NoStrikes (428) in each message that has
 *  repeating strike price entries related to the same ListID (66).
 *  <p></p>
 *  Used to support fragmentation.
 */
class Tag422IntTotNoStrikesTest {
    @Test
    void FIX0422Test() {
        FIX42 fixData = FIX42.FIX422_INT_TOT_NO_STRIKES;
        assertEquals( "422", fixData.toFIXIDString());
        assertEquals( "TOT_NO_STRIKES", fixData.toFIXNameString());
        assertEquals( "TotNoStrikes", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0422Test() {
        Tag422IntTotNoStrikes tagData;
        int oneElement;

        oneElement = Tag422IntTotNoStrikes.TESTA_INT_TOT_NO_STRIKES;
        tagData = new Tag422IntTotNoStrikes( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag422IntTotNoStrikes.TESTB_INT_TOT_NO_STRIKES;
        tagData = new Tag422IntTotNoStrikes( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag422IntTotNoStrikes tagData;
        int oneElement;

        oneElement = Tag422IntTotNoStrikes.TESTA_INT_TOT_NO_STRIKES;
        tagData = new Tag422IntTotNoStrikes( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag422IntTotNoStrikes.TESTB_INT_TOT_NO_STRIKES;
        tagData = new Tag422IntTotNoStrikes( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag422IntTotNoStrikes tagData;
        int oneElement;

        oneElement = Tag422IntTotNoStrikes.TESTB_INT_TOT_NO_STRIKES;
        tagData = new Tag422IntTotNoStrikes( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag422IntTotNoStrikes tagData;
        int oneElement;

        oneElement = Tag422IntTotNoStrikes.TESTB_INT_TOT_NO_STRIKES;
        tagData = new Tag422IntTotNoStrikes( new MyIntType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag422IntTotNoStrikes tagData;
        int oneElement;

        oneElement = Tag422IntTotNoStrikes.TESTB_INT_TOT_NO_STRIKES;
        tagData = new Tag422IntTotNoStrikes( new MyIntType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag422IntTotNoStrikes tagData;
        int oneElement;

        oneElement = Tag422IntTotNoStrikes.TESTA_INT_TOT_NO_STRIKES;
        tagData = new Tag422IntTotNoStrikes( new MyIntType( oneElement ) );
        assertEquals( "Tag422IntTotNoStrikes\n" +
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