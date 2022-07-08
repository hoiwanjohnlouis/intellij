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
 *  53
 *  Quantity
 *  Qty
 *  <p></p>
 *  Overall/total quantity (e.g. number of shares)
 *  <p></p>
 *  (Prior to FIX 4.2 this field was of type int)
 */
class Tag53QtyQuantityTest {
    @Test
    void PrintFIXTagTest() {
        Tag53QtyQuantity tagData;
        int oneElement;

        oneElement = Tag53QtyQuantity.TESTA_QTY_QUANTITY;
        tagData = new Tag53QtyQuantity(new MyQtyType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag53QtyQuantity.TESTB_QTY_QUANTITY;
        tagData = new Tag53QtyQuantity(new MyQtyType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag53QtyQuantity tagData;
        int oneElement;

        oneElement = Tag53QtyQuantity.TESTA_QTY_QUANTITY;
        tagData = new Tag53QtyQuantity(new MyQtyType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag53QtyQuantity.TESTB_QTY_QUANTITY;
        tagData = new Tag53QtyQuantity(new MyQtyType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag53QtyQuantity tagData ) {
        assertEquals( "FIX53_QTY_QUANTITY", tagData.toEnumLabelString());
        assertEquals( "QUANTITY", tagData.toEnumNameString());
        assertEquals( "53", tagData.toEnumIDString());
        assertEquals( "Quantity (formerly Shares)", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag53QtyQuantity tagData;
        int oneElement;

        oneElement = Tag53QtyQuantity.TESTA_QTY_QUANTITY;
        tagData = new Tag53QtyQuantity(new MyQtyType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag53QtyQuantity.TESTB_QTY_QUANTITY;
        tagData = new Tag53QtyQuantity(new MyQtyType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = 400;
        tagData = new Tag53QtyQuantity(new MyQtyType( oneElement ) );
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag53QtyQuantity tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_QTY_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag53QtyQuantity tagData;
        int oneElement;

        oneElement = Tag53QtyQuantity.TESTA_QTY_QUANTITY;
        tagData = new Tag53QtyQuantity(new MyQtyType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag53QtyQuantity.TESTB_QTY_QUANTITY;
        tagData = new Tag53QtyQuantity(new MyQtyType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag53QtyQuantity tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag53QtyQuantity tagData;
        int oneElement;

        oneElement = Tag53QtyQuantity.TESTA_QTY_QUANTITY;
        tagData = new Tag53QtyQuantity(new MyQtyType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag53QtyQuantity.TESTB_QTY_QUANTITY;
        tagData = new Tag53QtyQuantity(new MyQtyType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag53QtyQuantity tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag53QtyQuantity tagData;
        int oneElement;

        oneElement = Tag53QtyQuantity.TESTA_QTY_QUANTITY;
        tagData = new Tag53QtyQuantity(new MyQtyType( oneElement ));
        verifyVerboseString( tagData, oneElement );

        oneElement = Tag53QtyQuantity.TESTB_QTY_QUANTITY;
        tagData = new Tag53QtyQuantity(new MyQtyType( oneElement ));
        verifyVerboseString( tagData, oneElement );
    }

    private void verifyVerboseString( final Tag53QtyQuantity tagData, final int oneElement ) {
        assertEquals( "Tag53QtyQuantity\n" +
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