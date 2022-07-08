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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.MyQtyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  84
 *  CxlQty
 *  Qty
 *  <p></p>
 *  Total quantity canceled for this order.
 *  <p></p>
 *  (Prior to FIX 4.2 this field was of type int)
 */
class Tag84QtyCxlQtyTest {
    @Test
    void PrintFIXTagTest() {
        Tag84QtyCxlQty tagData;
        int oneElement;

        oneElement = Tag84QtyCxlQty.TESTA_QTY_CXL_QTY;
        tagData = new Tag84QtyCxlQty(new MyQtyType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag84QtyCxlQty.TESTB_QTY_CXL_QTY;
        tagData = new Tag84QtyCxlQty(new MyQtyType( oneElement ));
        System.out.println( tagData.toVerboseString() );
     }

    @Test
    void FIXTest() {
        Tag84QtyCxlQty tagData;
        int oneElement;

        oneElement = Tag84QtyCxlQty.TESTA_QTY_CXL_QTY;
        tagData = new Tag84QtyCxlQty(new MyQtyType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag84QtyCxlQty.TESTB_QTY_CXL_QTY;
        tagData = new Tag84QtyCxlQty(new MyQtyType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag84QtyCxlQty tagData ) {
        assertEquals( "FIX84_QTY_CXL_QTY", tagData.toEnumLabelString());
        assertEquals( "CXL_QTY", tagData.toEnumNameString());
        assertEquals( "84", tagData.toEnumIDString());
        assertEquals( "CxlQty", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag84QtyCxlQty tagData;
        int oneElement;

        oneElement = Tag84QtyCxlQty.TESTA_QTY_CXL_QTY;
        tagData = new Tag84QtyCxlQty(new MyQtyType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag84QtyCxlQty.TESTB_QTY_CXL_QTY;
        tagData = new Tag84QtyCxlQty(new MyQtyType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = 8484;
        tagData = new Tag84QtyCxlQty(new MyQtyType( oneElement ));
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag84QtyCxlQty tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag84QtyCxlQty tagData;
        int oneElement;

        oneElement = Tag84QtyCxlQty.TESTA_QTY_CXL_QTY;
        tagData = new Tag84QtyCxlQty(new MyQtyType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag84QtyCxlQty.TESTB_QTY_CXL_QTY;
        tagData = new Tag84QtyCxlQty(new MyQtyType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag84QtyCxlQty tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag84QtyCxlQty tagData;
        int oneElement;

        oneElement = Tag84QtyCxlQty.TESTA_QTY_CXL_QTY;
        tagData = new Tag84QtyCxlQty(new MyQtyType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag84QtyCxlQty.TESTB_QTY_CXL_QTY;
        tagData = new Tag84QtyCxlQty(new MyQtyType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag84QtyCxlQty tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag84QtyCxlQty tagData;
        int oneElement;

        oneElement = Tag84QtyCxlQty.TESTA_QTY_CXL_QTY;
        tagData = new Tag84QtyCxlQty(new MyQtyType( oneElement ));
        verifyVerboseString( tagData, oneElement );

        oneElement = Tag84QtyCxlQty.TESTB_QTY_CXL_QTY;
        tagData = new Tag84QtyCxlQty(new MyQtyType( oneElement ));
        verifyVerboseString( tagData, oneElement );
    }

    private void verifyVerboseString( final Tag84QtyCxlQty tagData, final int oneElement ) {
        assertEquals( "Tag84QtyCxlQty\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}