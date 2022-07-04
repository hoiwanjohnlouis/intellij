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
 *  395
 *  NumTickets
 *  int
 *  <p>
 *  Total number of tickets.
 */
class Tag395IntNumTicketsTest {
    @Test
    void FIX0395Test() {
        FIX42 fixData = FIX42.FIX395_INT_NUM_TICKETS;
        assertEquals( "395", fixData.toEnumIDString());
        assertEquals( "NUM_TICKETS", fixData.toEnumNameString());
        assertEquals( "NumTickets", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0395Test() {
        Tag395IntNumTickets tagData;
        int oneElement;

        oneElement = Tag395IntNumTickets.TESTA_INT_NUM_TICKETS;
        tagData = new Tag395IntNumTickets( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag395IntNumTickets.TESTB_INT_NUM_TICKETS;
        tagData = new Tag395IntNumTickets( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag395IntNumTickets tagData;
        int oneElement;

        oneElement = Tag395IntNumTickets.TESTA_INT_NUM_TICKETS;
        tagData = new Tag395IntNumTickets( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag395IntNumTickets.TESTB_INT_NUM_TICKETS;
        tagData = new Tag395IntNumTickets( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag395IntNumTickets tagData;
        int oneElement;

        oneElement = Tag395IntNumTickets.TESTB_INT_NUM_TICKETS;
        tagData = new Tag395IntNumTickets( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag395IntNumTickets tagData;
        int oneElement;

        oneElement = Tag395IntNumTickets.TESTB_INT_NUM_TICKETS;
        tagData = new Tag395IntNumTickets( new MyIntType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag395IntNumTickets tagData;
        int oneElement;

        oneElement = Tag395IntNumTickets.TESTB_INT_NUM_TICKETS;
        tagData = new Tag395IntNumTickets( new MyIntType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag395IntNumTickets tagData;
        int oneElement;

        oneElement = Tag395IntNumTickets.TESTA_INT_NUM_TICKETS;
        tagData = new Tag395IntNumTickets( new MyIntType( oneElement ) );
        assertEquals( "Tag395IntNumTickets\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}