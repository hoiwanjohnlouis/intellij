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
import com.hwtsllc.fixengine2022.fix44.enums.Enum871InstrAttribType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  871
 *  InstrAttribType
 *  int
 *  <p></p>
 *  Code to represent the type of instrument attribute
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Flat (securities pay interest on a current basis but are traded without interest)
 *  <p>    2 - Zero coupon
 *  <p>    3 - Interest bearing (for Euro commercial paper when not issued at discount)
 *  <p>    4 - No periodic payments
 *  <p>    5 - Variable rate
 *  <p></p>
 *  <p>    6 - Less fee for put
 *  <p>    7 - Stepped coupon
 *  <p>    8 - Coupon period (if not semi-annual). Supply redemption date in the InstrAttribValue (872) field.
 *  <p>    9 - When [and if] issued
 *  <p>    10 - Original issue discount
 *  <p></p>
 *  <p>    11 - Callable, puttable
 *  <p>    12 - Escrowed to Maturity
 *  <p>    13 - Escrowed to redemption date - callable. Supply redemption date in the InstrAttribValue (872) field
 *  <p>    14 - Pre-refunded
 *  <p>    15 - In default
 *  <p></p>
 *  <p>    16 - Unrated
 *  <p>    17 - Taxable
 *  <p>    18 - Indexed
 *  <p>    19 - Subject To Alternative Minimum Tax
 *  <p>    20 - Original issue discount price. Supply price in the InstrAttribValue (872) field
 *  <p></p>
 *  <p>    21 - Callable below maturity value
 *  <p>    22 - Callable without notice by mail to holder unless registered
 *  <p></p>
 *  <p>    99 - Text. Supply the text of the attribute or disclaimer in the InstrAttribValue (872) field.
 *  <p></p>
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Tag871EnuInstrAttribTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX871_ENU_INSTR_ATTRIB_TYPE;
        assertEquals( "871", fixData.toFIXIDString());
        assertEquals( "INSTR_ATTRIB_TYPE", fixData.toFIXNameString());
        assertEquals( "InstrAttribType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0871Test() {
        Tag871EnuInstrAttribType tagData;
        Enum871InstrAttribType oneElement;

        oneElement = Enum871InstrAttribType.FLAT;
        tagData = new Tag871EnuInstrAttribType( oneElement );
        assertEquals( oneElement.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "871", tagData.toFIXIDString());
        assertEquals( "INSTR_ATTRIB_TYPE", tagData.toFIXNameString());
        assertEquals( "InstrAttribType", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.ZERO_COUPON);
        assertEquals( Enum871InstrAttribType.ZERO_COUPON.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.INTEREST_BEARING);
        assertEquals( Enum871InstrAttribType.INTEREST_BEARING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.NO_PERIODIC_PAYMENTS);
        assertEquals( Enum871InstrAttribType.NO_PERIODIC_PAYMENTS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.VARIABLE_RATE);
        assertEquals( Enum871InstrAttribType.VARIABLE_RATE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.LESS_FEE_FOR_PUT);
        assertEquals( Enum871InstrAttribType.LESS_FEE_FOR_PUT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.STEPPED_COUPON);
        assertEquals( Enum871InstrAttribType.STEPPED_COUPON.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.COUPON_PERIOD);
        assertEquals( Enum871InstrAttribType.COUPON_PERIOD.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.WHEN_ISSUED);
        assertEquals( Enum871InstrAttribType.WHEN_ISSUED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.ORIGINAL_ISSUE_DISCOUNT);
        assertEquals( Enum871InstrAttribType.ORIGINAL_ISSUE_DISCOUNT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.CALLABLE_PUTTABLE);
        assertEquals( Enum871InstrAttribType.CALLABLE_PUTTABLE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.ESCROWED_TO_MATURITY);
        assertEquals( Enum871InstrAttribType.ESCROWED_TO_MATURITY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.ESCROWED_TO_REDEMPTION_DATE);
        assertEquals( Enum871InstrAttribType.ESCROWED_TO_REDEMPTION_DATE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.PRE_REFUNDED);
        assertEquals( Enum871InstrAttribType.PRE_REFUNDED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.IN_DEFAULT);
        assertEquals( Enum871InstrAttribType.IN_DEFAULT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.UNRATED);
        assertEquals( Enum871InstrAttribType.UNRATED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.TAXABLE);
        assertEquals( Enum871InstrAttribType.TAXABLE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.INDEXED);
        assertEquals( Enum871InstrAttribType.INDEXED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.SUBJECT_TO_AMT);
        assertEquals( Enum871InstrAttribType.SUBJECT_TO_AMT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.ORIGINAL_DISCOUNT_PRICE);
        assertEquals( Enum871InstrAttribType.ORIGINAL_DISCOUNT_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.CALLABLE_BELOW_MATURITY_VALUE);
        assertEquals( Enum871InstrAttribType.CALLABLE_BELOW_MATURITY_VALUE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.CALLABLE_WITHOUT_NOTICE);
        assertEquals( Enum871InstrAttribType.CALLABLE_WITHOUT_NOTICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag871EnuInstrAttribType(Enum871InstrAttribType.TEXT);
        assertEquals( Enum871InstrAttribType.TEXT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag871EnuInstrAttribType tagData;

        // loop around the ENUM and process
        for ( Enum871InstrAttribType oneEnum : Enum871InstrAttribType.values()) {
            tagData = new Tag871EnuInstrAttribType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag871EnuInstrAttribType tagData;

        // loop around the ENUM and process
        for (Enum871InstrAttribType oneEnum : Enum871InstrAttribType.values()) {
            tagData = new Tag871EnuInstrAttribType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag871EnuInstrAttribType tagData;

        // loop around the ENUM and process
        for (Enum871InstrAttribType oneEnum : Enum871InstrAttribType.values()) {
            tagData = new Tag871EnuInstrAttribType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag871EnuInstrAttribType tagData;

        // loop around the ENUM and process
        for (Enum871InstrAttribType oneEnum : Enum871InstrAttribType.values()) {
            tagData = new Tag871EnuInstrAttribType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag871EnuInstrAttribType tagData;

        // loop around the ENUM and process
        for (Enum871InstrAttribType oneEnum : Enum871InstrAttribType.values()) {
            tagData = new Tag871EnuInstrAttribType(oneEnum);
            assertEquals( "Tag871EnuInstrAttribType\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}