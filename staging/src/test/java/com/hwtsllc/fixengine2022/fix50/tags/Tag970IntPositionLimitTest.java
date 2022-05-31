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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  970
 *  PositionLimit
 *  int
 *  <p>
 *  Position Limit for a given exchange-traded product.
 */
class Tag970IntPositionLimitTest {
    @Test
    void FIX0970Test() {
        FIX50 fixData = FIX50.FIX970_INT_POSITION_LIMIT;
        assertEquals( "970", fixData.toFIXIDString());
        assertEquals( "POSITION_LIMIT", fixData.toFIXNameString());
        assertEquals( "PositionLimit", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0970Test() {
        Tag970IntPositionLimit tagData;
        int oneElement;

        oneElement = Tag970IntPositionLimit.TESTA_INT_POSITION_LIMIT;
        tagData = new Tag970IntPositionLimit( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag970IntPositionLimit.TESTB_INT_POSITION_LIMIT;
        tagData = new Tag970IntPositionLimit( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag970IntPositionLimit tagData;
        int oneElement;

        oneElement = Tag970IntPositionLimit.TESTA_INT_POSITION_LIMIT;
        tagData = new Tag970IntPositionLimit( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag970IntPositionLimit.TESTB_INT_POSITION_LIMIT;
        tagData = new Tag970IntPositionLimit( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag970IntPositionLimit tagData;
        int oneElement;

        oneElement = Tag970IntPositionLimit.TESTB_INT_POSITION_LIMIT;
        tagData = new Tag970IntPositionLimit( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag970IntPositionLimit tagData;
        int oneElement;

        oneElement = Tag970IntPositionLimit.TESTB_INT_POSITION_LIMIT;
        tagData = new Tag970IntPositionLimit( new MyIntType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag970IntPositionLimit tagData;
        int oneElement;

        oneElement = Tag970IntPositionLimit.TESTB_INT_POSITION_LIMIT;
        tagData = new Tag970IntPositionLimit( new MyIntType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag970IntPositionLimit tagData;
        int oneElement;

        oneElement = Tag970IntPositionLimit.TESTA_INT_POSITION_LIMIT;
        tagData = new Tag970IntPositionLimit( new MyIntType( oneElement ) );
        assertEquals( "Tag970IntPositionLimit\n" +
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