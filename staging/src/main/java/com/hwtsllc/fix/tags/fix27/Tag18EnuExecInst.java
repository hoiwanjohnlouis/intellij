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

package com.hwtsllc.fix.tags.fix27;

import com.hwtsllc.fix.datatypes.FIX27;
import com.hwtsllc.fix.datatypes.FIX27Abstract;
import com.hwtsllc.fix.enums.fix27.Enum18ExecInst;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  18
 *  ExecInst
 *  MultipleCharValue
 *  <p></p>
 *  Instructions for order handling on exchange trading floor.
 *  <p></p>
 *  If more than one instruction is applicable to an order,
 *  this field can contain multiple instructions separated by space.
 *  <p></p>
 *  *** SOME VALUES HAVE BEEN REPLACED ***
 *  *** See Replaced Features and Supported Approach ***
 *  <p></p>
 *  (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Stay on offer side
 *  <p>    1 - Not held
 *  <p>    2 - Work
 *  <p>    3 - Go along
 *  <p>    4 - Over the day
 *  <p></p>
 *  <p>    5 - Held
 *  <p>    6 - Participant don't initiate
 *  <p>    7 - Strict scale
 *  <p>    8 - Try to scale
 *  <p>    9 - Stay on bid side
 *  <p></p>
 *  <p>    A - No cross (cross is forbidden)
 *  <p>    B - OK to cross
 *  <p>    C - Call first
 *  <p>    D - Percent of volume
 *          (indicates that the sender does not want
 *          all the volume on the floor vs. a specific percentage)
 *  <p>    E - Do not increase - DNI
 *  <p></p>
 *  <p>    F - Do not reduce - DNR
 *  <p>    G - All or none - AON
 *  <p>    H - Reinstate on system failue (mutually exclusive with Q)
 *  <p>    I - Institutions only
 *  <p>    J - Reinstate on Trading Halt (mutually exclusive with K)
 *  <p></p>
 *  <p>    K - Cancel on Trading Halt (mutually exclusive with J)
 *  <p>    L - Last peg (last sale)
 *  <p>    M - Mid-price peg (midprice of inside quote)
 *  <p>    N - Non-negotiable
 *  <p>    O - Opening peg
 *  <p></p>
 *  <p>    P - Market peg
 *  <p>    Q - Cancel on system failure (mutually exclusive with H)
 *  <p>    R - Primary peg (primary market - buy at bid/sell at offer)
 *  <p>    S - Suspend
 *  <p>    T - Fixed Peg to Local best bid or offer at time of order
 *  <p></p>
 *  <p>    U - Customer Display Instruction (Rule 11Ac1-1/4)
 *  <p>    V - Netting (for Forex)
 *  <p>    W - Peg to VWAP
 *  <p>    X - Trade Along
 *  <p>    Y - Try To Stop
 *  <p></p>
 *  <p>    Z - Cancel if not best
 *  <p></p>
 *  <p>    a - Trailing Stop Peg
 *  <p>    b - Strict Limit (No price improvement)
 *  <p>    c - Ignore Price Validity Checks
 *  <p>    d - Peg to Limit Price
 *  <p>    e - Work to Target Strategy
 *  <p></p>
 *  <p>    f - Intermarket Sweep
 *  <p>    g - External Routing Allowed
 *  <p>    h - External Routing Not Allowed
 *  <p>    i - Imbalance Only
 *  <p>    j - Single execution requested for block trade
 *  <p></p>
 *  <p>    k - Best Execution
 */
public class Tag18EnuExecInst extends FIX27Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum18ExecInst dataValue;

    public final static Enum18ExecInst TESTA_ENU_EXEC_INST
            = Enum18ExecInst.STAY_ON_OFFER_SIDE;
    public final static Enum18ExecInst TESTB_ENU_EXEC_INST
            = Enum18ExecInst.STAY_ON_BID_SIDE;

    public Tag18EnuExecInst(Enum18ExecInst dataValue) {
        setFixType(FIX27.FIX18_ENU_EXEC_INST);
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
        System.out.println( new Tag18EnuExecInst(TESTA_ENU_EXEC_INST).toVerboseString() );
        System.out.println( new Tag18EnuExecInst(TESTB_ENU_EXEC_INST).toVerboseString() );

        // loop around the ENUM and display
        for (Enum18ExecInst oneEnum : Enum18ExecInst.values()) {
            System.out.println( new Tag18EnuExecInst(oneEnum).toVerboseString() );
        }
    }
}
