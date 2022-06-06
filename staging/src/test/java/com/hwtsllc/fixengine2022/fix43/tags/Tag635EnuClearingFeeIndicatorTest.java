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
import com.hwtsllc.fixengine2022.fix43.enums.Enum635ClearingFeeIndicator;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  635
 *  ClearingFeeIndicator
 *  String
 *  <p></p>
 *  Indicates type of fee being assessed of the customer
 *  for trade executions at an exchange.
 *  <p></p>
 *  Applicable for futures markets only at this time.
 *  <p></p>
 *  (Values source CBOT, CME, NYBOT, and NYMEX):
 *  Valid values:
 *  <p>    1 - 1st year delegate trading for own account
 *  <p>    2 - 2nd year delegate trading for own account
 *  <p>    3 - 3rd year delegate trading for own account
 *  <p>    4 - 4th year delegate trading for own account
 *  <p>    5 - 5th year delegate trading for own account
 *  <p></p>
 *  <p>    9 - 6th year delegate trading for own account
 *  <p>    B - CBOE Member
 *  <p>    C - Non-member and Customer
 *  <p>    E - Equity Member and Clearing Member
 *  <p>    F - Full and Associate Member trading for own account and as floor brokers
 *  <p></p>
 *  <p>    H - 106.H and 106.J firms
 *  <p>    I - GIM, IDEM and COM Membership Interest Holders
 *  <p>    L - Lessee 106.F Employees
 *  <p>    M - All other ownership types
 */
class Tag635EnuClearingFeeIndicatorTest {
    @Test
    void FIX0635Test() {
        FIX43 fixData = FIX43.FIX635_ENU_CLEARING_FEE_INDICATOR;
        assertEquals( "635", fixData.toFIXIDString());
        assertEquals( "CLEARING_FEE_INDICATOR", fixData.toFIXNameString());
        assertEquals( "ClearingFeeIndicator", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0635Test() {
        Tag635EnuClearingFeeIndicator tagData;

        /*
         *  1-5, 9, B, C, E, F, H, I, L, M, types
         */

        /*
         *  1-5, types
         */
        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.FIRST_YEAR_DELEGATE );
        assertEquals( Enum635ClearingFeeIndicator.FIRST_YEAR_DELEGATE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.SECOND_YEAR_DELEGATE );
        assertEquals( Enum635ClearingFeeIndicator.SECOND_YEAR_DELEGATE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.THIRD_YEAR_DELEGATE );
        assertEquals( Enum635ClearingFeeIndicator.THIRD_YEAR_DELEGATE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.FOURTH_YEAR_DELEGATE );
        assertEquals( Enum635ClearingFeeIndicator.FOURTH_YEAR_DELEGATE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.FIFTH_YEAR_DELEGATE );
        assertEquals( Enum635ClearingFeeIndicator.FIFTH_YEAR_DELEGATE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  9 type
         */
        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.SIXTH_YEAR_DELEGATE );
        assertEquals( Enum635ClearingFeeIndicator.SIXTH_YEAR_DELEGATE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  B-C, types
         */
        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.CBOE_MEMBER );
        assertEquals( Enum635ClearingFeeIndicator.CBOE_MEMBER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.NON_MEMBER_AND_CUSTOMER );
        assertEquals( Enum635ClearingFeeIndicator.NON_MEMBER_AND_CUSTOMER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  E-F, types
         */
        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.EQUITY_AND_CLEARING_MEMBER );
        assertEquals( Enum635ClearingFeeIndicator.EQUITY_AND_CLEARING_MEMBER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.FULL_AND_ASSOCIATE_AS_FLOOR );
        assertEquals( Enum635ClearingFeeIndicator.FULL_AND_ASSOCIATE_AS_FLOOR.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  H-I types
         */
        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.H_AND_J_FIRMS );
        assertEquals( Enum635ClearingFeeIndicator.H_AND_J_FIRMS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.GIM_IDEM_AND_COM );
        assertEquals( Enum635ClearingFeeIndicator.GIM_IDEM_AND_COM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  L-M, types
         */
        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.F_EMPLOYEES );
        assertEquals( Enum635ClearingFeeIndicator.F_EMPLOYEES.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag635EnuClearingFeeIndicator( Enum635ClearingFeeIndicator.ALL_OTHER );
        assertEquals( Enum635ClearingFeeIndicator.ALL_OTHER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag635EnuClearingFeeIndicator tagData;

        // loop around the ENUM and process
        for ( Enum635ClearingFeeIndicator oneEnum : Enum635ClearingFeeIndicator.values()) {
            tagData = new Tag635EnuClearingFeeIndicator(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag635EnuClearingFeeIndicator tagData;

        // loop around the ENUM and process
        for (Enum635ClearingFeeIndicator oneEnum : Enum635ClearingFeeIndicator.values()) {
            tagData = new Tag635EnuClearingFeeIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag635EnuClearingFeeIndicator tagData;

        // loop around the ENUM and process
        for (Enum635ClearingFeeIndicator oneEnum : Enum635ClearingFeeIndicator.values()) {
            tagData = new Tag635EnuClearingFeeIndicator(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag635EnuClearingFeeIndicator tagData;

        // loop around the ENUM and process
        for (Enum635ClearingFeeIndicator oneEnum : Enum635ClearingFeeIndicator.values()) {
            tagData = new Tag635EnuClearingFeeIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag635EnuClearingFeeIndicator tagData;

        // loop around the ENUM and process
        for (Enum635ClearingFeeIndicator oneEnum : Enum635ClearingFeeIndicator.values()) {
            tagData = new Tag635EnuClearingFeeIndicator(oneEnum);
            assertEquals( "Tag635EnuClearingFeeIndicator\n" +
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