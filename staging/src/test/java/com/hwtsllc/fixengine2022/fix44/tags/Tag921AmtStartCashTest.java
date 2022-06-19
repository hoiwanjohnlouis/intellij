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
import com.hwtsllc.fixengine2022.datatypes.MyAmtType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  921
 *  StartCash
 *  Amt
 *  <p></p>
 *  Starting dirty cash consideration of a financing deal,
 *  i.e. paid to the seller on the Start Date.
 */
class Tag921AmtStartCashTest {
    @Test
    void FIX0921Test() {
        FIX44 fixData = FIX44.FIX921_AMT_START_CASH;
        assertEquals( "921", fixData.toFIXIDString());
        assertEquals( "START_CASH", fixData.toFIXNameString());
        assertEquals( "StartCash", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0921Test() {
        Tag921AmtStartCash tagData;
        double oneElement;

        oneElement = Tag921AmtStartCash.TESTA_AMT_START_CASH;
        tagData = new Tag921AmtStartCash( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "921", tagData.toFIXIDString());
        assertEquals( "START_CASH", tagData.toFIXNameString());
        assertEquals( "StartCash", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag921AmtStartCash.TESTB_AMT_START_CASH;
        tagData = new Tag921AmtStartCash( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag921AmtStartCash tagData;
        double oneElement;

        oneElement = Tag921AmtStartCash.TESTA_AMT_START_CASH;
        tagData = new Tag921AmtStartCash( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag921AmtStartCash.TESTB_AMT_START_CASH;
        tagData = new Tag921AmtStartCash( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag921AmtStartCash tagData;
        double oneElement;

        oneElement = Tag921AmtStartCash.TESTB_AMT_START_CASH;
        tagData = new Tag921AmtStartCash( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag921AmtStartCash tagData;
        double oneElement;

        oneElement = Tag921AmtStartCash.TESTB_AMT_START_CASH;
        tagData = new Tag921AmtStartCash( new MyAmtType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag921AmtStartCash tagData;
        double oneElement;

        oneElement = Tag921AmtStartCash.TESTB_AMT_START_CASH;
        tagData = new Tag921AmtStartCash( new MyAmtType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag921AmtStartCash tagData;
        double oneElement;

        oneElement = Tag921AmtStartCash.TESTA_AMT_START_CASH;
        tagData = new Tag921AmtStartCash( new MyAmtType( oneElement ) );
        assertEquals( "Tag921AmtStartCash\n" +
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