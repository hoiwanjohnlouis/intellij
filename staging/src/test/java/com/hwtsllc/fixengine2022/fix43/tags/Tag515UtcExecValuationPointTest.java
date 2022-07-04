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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.MyUTCTimestampType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  515
 *  ExecValuationPoint
 *  UTCTimestamp
 *  <p>
 *  For CIV - a date and time stamp to indicate the fund valuation point with respect to which a order was priced by the fund manager.
 */
class Tag515UtcExecValuationPointTest {
    @Test
    void FIX0515Test() {
        FIX43 fixData = FIX43.FIX515_UTC_EXEC_VALUATION_POINT;
        assertEquals( "515", fixData.toEnumIDString());
        assertEquals( "EXEC_VALUATION_POINT", fixData.toEnumNameString());
        assertEquals( "ExecValuationPoint", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0515Test() {
        Tag515UtcExecValuationPoint tagData;
        String oneElement;

        oneElement = Tag515UtcExecValuationPoint.TESTA_UTC_EXEC_VALUATION_POINT;
        tagData = new Tag515UtcExecValuationPoint( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag515UtcExecValuationPoint.TESTB_UTC_EXEC_VALUATION_POINT;
        tagData = new Tag515UtcExecValuationPoint( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag515UtcExecValuationPoint tagData;
        String oneElement;

        oneElement = Tag515UtcExecValuationPoint.TESTA_UTC_EXEC_VALUATION_POINT;
        tagData = new Tag515UtcExecValuationPoint( new MyUTCTimestampType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag515UtcExecValuationPoint.TESTB_UTC_EXEC_VALUATION_POINT;
        tagData = new Tag515UtcExecValuationPoint( new MyUTCTimestampType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag515UtcExecValuationPoint tagData;
        String oneElement;

        oneElement = Tag515UtcExecValuationPoint.TESTB_UTC_EXEC_VALUATION_POINT;
        tagData = new Tag515UtcExecValuationPoint( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag515UtcExecValuationPoint tagData;
        String oneElement;

        oneElement = Tag515UtcExecValuationPoint.TESTB_UTC_EXEC_VALUATION_POINT;
        tagData = new Tag515UtcExecValuationPoint( new MyUTCTimestampType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag515UtcExecValuationPoint tagData;
        String oneElement;

        oneElement = Tag515UtcExecValuationPoint.TESTB_UTC_EXEC_VALUATION_POINT;
        tagData = new Tag515UtcExecValuationPoint( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag515UtcExecValuationPoint tagData;
        String oneElement;

        oneElement = Tag515UtcExecValuationPoint.TESTA_UTC_EXEC_VALUATION_POINT;
        tagData = new Tag515UtcExecValuationPoint( new MyUTCTimestampType( oneElement ) );
        assertEquals( "Tag515UtcExecValuationPoint\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toVerboseString() );
    }
}