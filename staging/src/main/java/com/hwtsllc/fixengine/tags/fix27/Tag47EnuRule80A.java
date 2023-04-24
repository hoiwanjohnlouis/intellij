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

package com.hwtsllc.fixengine.tags.fix27;

import com.hwtsllc.fixengine.datatypes.FIX27;
import com.hwtsllc.fixengine.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine.enums.fix27.Enum47Rule80A;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  47
 *  Rule80A(No Longer Used)
 *  char
 *  <p></p>
 *  Deprecated in FIX.4.3
 *  <p></p>
 *  Note that the name of this field is changing to 'OrderCapacity' as Rule80A is a
 *  very US market-specific term. Other world markets need to convey similar information,
 *  however, often a subset of the US values.
 *  <p></p>
 *      See the 'Rule80A (aka OrderCapacity) Usage by Market' appendix
 *      for market-specific usage of this field.
 *  <p></p>
 *  Valid values:
 *  <p>    A - Agency single order
 *  <p>    B - Short exempt transaction (refer to A type)
 *  <p>    C - Program order, non-index arb, for Member firm/org
 *  <p>    D - Program order, index arb, for Member firm/org
 *  <p>    E - Short Exempt Transaction for Principal
 *          (was incorrectly identified in the FIX spec as "Registered Equity Market Maker trades")
 *  <p></p>
 *  <p>    F - Short exempt transaction (refer to W type)
 *  <p>    H - Short exempt transaction (refer to I type)
 *  <p>    I - Individual Investor, single order
 *  <p>    J - Program Order, index arb, for individual customer
 *  <p>    K - Program Order, non-index arb, for individual customer
 *  <p></p>
 *  <p>    L - Short exempt transaction for member competing market-maker affiliated with the firm clearing the trade
 *          (refer to P and O types)
 *  <p>    M - Program Order, index arb, for other member
 *  <p>    N - Program Order, non-index arb, for other member
 *  <p>    O - Proprietary transactions for competing market-maker that is affiliated with the clearing member
 *          (was incorrectly identified in the FIX spec as "Competing dealer trades")
 *  <p>    P - Principal
 *  <p></p>
 *  <p>    R - Transactions for the account of a non-member competing market-maker
 *          (was incorrectly identified in the FIX spec as "Competing dealer trades")
 *  <p>    S - Specialist trades
 *  <p>    T - Transactions for the account of an unaffiliated member's competing market-maker
 *          (was incorrectly identified in the FIX spec as "Competing dealer trades")
 *  <p>    U - Program Order, index arb, for other agency
 *  <p>    W - All other orders as agent for other member
 *  <p></p>
 *  <p>    X - Short exempt transaction for member competing market-maker not affiliated with the firm clearing the trade
 *      (refer to W and T types)
 *  <p>    Y - Program Order, non-index arb, for other agency
 *  <p>    Z - Short exempt transaction for non-member competing market-maker (refer to A and R types)
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

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                .concat("\n\tDataID[")
                .concat(toDataIDString())
                .concat("]")
                .concat("\n\tDataName[")
                .concat(toDataNameString())
                .concat("]")
                .concat("\n\tDataDescription[")
                .concat(toDataDescriptionString())
                .concat("]")
                ;
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return dataValue.toFIXDescriptionString();
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        System.out.println( new Tag47EnuRule80A(TESTA_ENU_RULE_80_A).toVerboseString() );
        System.out.println( new Tag47EnuRule80A(TESTB_ENU_RULE_80_A).toVerboseString() );

        // loop around the ENUM and display
        for (Enum47Rule80A oneEnum : Enum47Rule80A.values()) {
            System.out.println( new Tag47EnuRule80A(oneEnum).toVerboseString() );
        }
    }
}
