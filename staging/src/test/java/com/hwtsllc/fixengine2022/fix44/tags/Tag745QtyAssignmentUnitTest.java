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
import com.hwtsllc.fixengine2022.datatypes.MyQtyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  745
 *  AssignmentUnit
 *  Qty
 *  <p></p>
 *  Quantity Increment used in performing assignment.
 */
class Tag745QtyAssignmentUnitTest {
    @Test
    void FIX0745Test() {
        FIX44 fixData = FIX44.FIX745_QTY_ASSIGNMENT_UNIT;
        assertEquals( "745", fixData.toEnumIDString());
        assertEquals( "ASSIGNMENT_UNIT", fixData.toEnumNameString());
        assertEquals( "AssignmentUnit", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0745Test() {
        Tag745QtyAssignmentUnit tagData;
        int oneElement;

        oneElement = Tag745QtyAssignmentUnit.TESTA_QTY_ASSIGNMENT_UNIT;
        tagData = new Tag745QtyAssignmentUnit( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
        assertEquals( "745", tagData.toEnumIDString());
        assertEquals( "ASSIGNMENT_UNIT", tagData.toEnumNameString());
        assertEquals( "AssignmentUnit", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag745QtyAssignmentUnit.TESTB_QTY_ASSIGNMENT_UNIT;
        tagData = new Tag745QtyAssignmentUnit( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag745QtyAssignmentUnit tagData;
        int oneElement;

        oneElement = Tag745QtyAssignmentUnit.TESTA_QTY_ASSIGNMENT_UNIT;
        tagData = new Tag745QtyAssignmentUnit( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag745QtyAssignmentUnit.TESTB_QTY_ASSIGNMENT_UNIT;
        tagData = new Tag745QtyAssignmentUnit( new MyQtyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag745QtyAssignmentUnit tagData;
        int oneElement;

        oneElement = Tag745QtyAssignmentUnit.TESTB_QTY_ASSIGNMENT_UNIT;
        tagData = new Tag745QtyAssignmentUnit( new MyQtyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag745QtyAssignmentUnit tagData;
        int oneElement;

        oneElement = Tag745QtyAssignmentUnit.TESTB_QTY_ASSIGNMENT_UNIT;
        tagData = new Tag745QtyAssignmentUnit( new MyQtyType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag745QtyAssignmentUnit tagData;
        int oneElement;

        oneElement = Tag745QtyAssignmentUnit.TESTB_QTY_ASSIGNMENT_UNIT;
        tagData = new Tag745QtyAssignmentUnit( new MyQtyType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag745QtyAssignmentUnit tagData;
        int oneElement;

        oneElement = Tag745QtyAssignmentUnit.TESTA_QTY_ASSIGNMENT_UNIT;
        tagData = new Tag745QtyAssignmentUnit( new MyQtyType( oneElement ) );
        assertEquals( "Tag745QtyAssignmentUnit\n" +
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