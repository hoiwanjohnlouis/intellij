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

import com.hwtsllc.fixengine2022.fix44.enums.Enum871InstrAttribType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag871EnuInstrAttribTypeTest {
    Tag871EnuInstrAttribType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum871InstrAttribType oneEnum : Enum871InstrAttribType.values()) {
            tagData = new Tag871EnuInstrAttribType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum871InstrAttribType oneEnum : Enum871InstrAttribType.values()) {
            tagData = new Tag871EnuInstrAttribType(oneEnum);
            assertEquals( "FIX871_ENU_INSTR_ATTRIB_TYPE", tagData.toFIXLabelString());
            assertEquals( "871", tagData.toFIXIDString());
            assertEquals( "INSTR_ATTRIB_TYPE", tagData.toEnumNameString());
            assertEquals( "InstrAttribType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum871InstrAttribType oneEnum : Enum871InstrAttribType.values()) {
            tagData = new Tag871EnuInstrAttribType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  871
         *  InstrAttribType
         *  int
         *  <p>    1 - Flat (securities pay interest on a current basis but are traded without interest)
         *  <p>    2 - Zero coupon
         *  <p>    3 - Interest bearing (for Euro commercial paper when not issued at discount)
         *  <p>    4 - No periodic payments
         *  <p>    5 - Variable rate
         */
        tagData = new Tag871EnuInstrAttribType( Enum871InstrAttribType.FLAT );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.ZERO_COUPON);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.INTEREST_BEARING);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.NO_PERIODIC_PAYMENTS);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.VARIABLE_RATE);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    6 - Less fee for put
         *  <p>    7 - Stepped coupon
         *  <p>    8 - Coupon period (if not semi-annual). Supply redemption date in the InstrAttribValue (872) field.
         *  <p>    9 - When [and if] issued
         *  <p>    10 - Original issue discount
         */
        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.LESS_FEE_FOR_PUT);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.STEPPED_COUPON);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.COUPON_PERIOD);
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.WHEN_ISSUED);
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.ORIGINAL_ISSUE_DISCOUNT);
        assertEquals( "10", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    11 - Callable, puttable
         *  <p>    12 - Escrowed to Maturity
         *  <p>    13 - Escrowed to redemption date - callable. Supply redemption date in the InstrAttribValue (872) field
         *  <p>    14 - Pre-refunded
         *  <p>    15 - In default
         */
        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.CALLABLE_PUTTABLE);
        assertEquals( "11", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.ESCROWED_TO_MATURITY);
        assertEquals( "12", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.ESCROWED_TO_REDEMPTION_DATE);
        assertEquals( "13", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.PRE_REFUNDED);
        assertEquals( "14", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.IN_DEFAULT);
        assertEquals( "15", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    16 - Unrated
         *  <p>    17 - Taxable
         *  <p>    18 - Indexed
         *  <p>    19 - Subject To Alternative Minimum Tax
         *  <p>    20 - Original issue discount price. Supply price in the InstrAttribValue (872) field
         */
        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.UNRATED);
        assertEquals( "16", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.TAXABLE);
        assertEquals( "17", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.INDEXED);
        assertEquals( "18", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.SUBJECT_TO_AMT);
        assertEquals( "19", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.ORIGINAL_DISCOUNT_PRICE);
        assertEquals( "20", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    21 - Callable below maturity value
         *  <p>    22 - Callable without notice by mail to holder unless registered
         */
        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.CALLABLE_BELOW_MATURITY_VALUE);
        assertEquals( "21", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.CALLABLE_WITHOUT_NOTICE);
        assertEquals( "22", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    99 - Text. Supply the text of the attribute or disclaimer in the InstrAttribValue (872) field.
         *  <p>    or any value conforming to the data type Reserved100Plus
         */
        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.TEXT);
        assertEquals( "99", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum871InstrAttribType oneEnum : Enum871InstrAttribType.values()) {
            tagData = new Tag871EnuInstrAttribType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum871InstrAttribType oneEnum : Enum871InstrAttribType.values()) {
            tagData = new Tag871EnuInstrAttribType(oneEnum);
            assertEquals( "Tag871EnuInstrAttribType\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}