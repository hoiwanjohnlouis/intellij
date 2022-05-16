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

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine2022.fix27.enums.Enum47Rule80A;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  47
 *  Rule80A(No Longer Used)
 *  char
 *  Deprecated in FIX.4.3
 *  Note that the name of this field is changing to 'OrderCapacity' as Rule80A is a
 *  very US market-specific term. Other world markets need to convey similar information,
 *  however, often a subset of the US values.
 *
 *      See the 'Rule80A (aka OrderCapacity) Usage by Market' appendix
 *      for market-specific usage of this field.
 *
 *  Valid values:
 *      A - Agency single order
 *      B - Short exempt transaction (refer to A type)
 *      C - Program order, non-index arb, for Member firm/org
 *      D - Program order, index arb, for Member firm/org
 *      E - Short Exempt Transaction for Principal
 *          (was incorrectly identified in the FIX spec as "Registered Equity Market Maker trades")
 *
 *      F - Short exempt transaction (refer to W type)
 *      H - Short exempt transaction (refer to I type)
 *      I - Individual Investor, single order
 *      J - Program Order, index arb, for individual customer
 *      K - Program Order, non-index arb, for individual customer
 *
 *      L - Short exempt transaction for member competing market-maker affliated with the firm clearing the trade
 *          (refer to P and O types)
 *      M - Program Order, index arb, for other member
 *      N - Program Order, non-index arb, for other member
 *      O - Proprietary transactions for competing market-maker that is affiliated with the clearing member
 *          (was incorrectly identified in the FIX spec as "Competing dealer trades")
 *      P - Principal
 *
 *      R - Transactions for the account of a non-member compting market-maker
 *          (was incorrectly identified in the FIX spec as "Competing dealer trades")
 *      S - Specialist trades
 *      T - Transactions for the account of an unaffiliated member's competing market-maker
 *          (was incorrectly identified in the FIX spec as "Competing dealer trades")
 *      U - Program Order, index arb, for other agency
 *      W - All other orders as agent for other member
 *
 *      X - Short exempt transaction for member competing market-maker not affiliated with the firm clearing the trade
 *      (refer to W and T types)
 *      Y - Program Order, non-index arb, for other agency
 *      Z - Short exempt transaction for non-member competing market-maker (refer to A and R types)
 */
// @Deprecated
public class Tag47EnuRule80A extends FIX27Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum47Rule80A dataValue;

    public final static Enum47Rule80A TESTA_ENU_RULE_80_A
            = Enum47Rule80A.AGENCY_SINGLE_ORDER;
    public final static Enum47Rule80A TESTB_ENU_RULE_80_A
            = Enum47Rule80A.PRINCIPAL;

    public Tag47EnuRule80A(Enum47Rule80A dataValue) {
        setFixType(FIX27.FIX47_ENU_RULE_80_A);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toFIXDescriptionString();
    }
    /**
     * standard wrapper to return a string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        dumpDataValues(new Tag47EnuRule80A(TESTA_ENU_RULE_80_A));
        dumpDataValues(new Tag47EnuRule80A(TESTB_ENU_RULE_80_A));

        // loop around the ENUM and display
        for (Enum47Rule80A oneEnum : Enum47Rule80A.values()) {
            dumpDataValues(new Tag47EnuRule80A(oneEnum));
        }
    }
    static void dumpDataValues(Tag47EnuRule80A tagData) {
        System.out.println("-------------------- Start Enum --------------------");
        System.out.println("VerboseString:" + tagData.toVerboseString());
        System.out.println("Accessing FIXTag Directly:");
        System.out.println("TagDataString:" + tagData);
        System.out.println("EnumNameString:" + tagData.toEnumNameString());
        System.out.println("FIXIDString:" + tagData.toFIXIDString());
        System.out.println("FIXNameString:" + tagData.toFIXNameString());
        System.out.println("FIXDescriptionString:" + tagData.toFIXDescriptionString());
        System.out.println("DataIDString:" + tagData.toDataIDString());
        System.out.println("DataNameString:" + tagData.toDataNameString());
        System.out.println("DataDescriptionString:" + tagData.toDataDescriptionString());
        System.out.println("ValuePairString:" + tagData.toValuePairString());
        System.out.println("-------------------- End Enum --------------------");
    }
}
