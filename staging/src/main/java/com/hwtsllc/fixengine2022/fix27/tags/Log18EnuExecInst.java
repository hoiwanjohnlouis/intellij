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
import com.hwtsllc.fixengine2022.fix27.enums.Enum18ExecInst;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  18
 *  ExecInst
 *  MultipleCharValue
 *  Instructions for order handling on exchange trading floor.
 *
 *  If more than one instruction is applicable to an order,
 *  this field can contain multiple instructions separated by space.
 *
 *  *** SOME VALUES HAVE BEEN REPLACED ***
 *  *** See Replaced Features and Supported Approach ***
 *
 *  (see Volume : "Glossary" for value definitions)
 *
 *  Valid values:
 *      0 - Stay on offer side
 *      1 - Not held
 *      2 - Work
 *      3 - Go along
 *      4 - Over the day
 *
 *      5 - Held
 *      6 - Participant don't initiate
 *      7 - Strict scale
 *      8 - Try to scale
 *      9 - Stay on bid side
 *
 *      A - No cross (cross is forbidden)
 *      B - OK to cross
 *      C - Call first
 *      D - Percent of volume
 *          (indicates that the sender does not want to be all of
 *           the volume on the floor vs. a specific percentage)
 *      E - Do not increase - DNI
 *
 *      F - Do not reduce - DNR
 *      G - All or none - AON
 *      H - Reinstate on system failue (mutually exclusive with Q)
 *      I - Institutions only
 *      J - Reinstate on Trading Halt (mutually exclusive with K)
 *
 *      K - Cancel on Trading Halt (mutually exclusive with J)
 *      L - Last peg (last sale)
 *      M - Mid-price peg (midprice of inside quote)
 *      N - Non-negotiable
 *      O - Opening peg
 *
 *      P - Market peg
 *      Q - Cancel on system failure (mutually exclusive with H)
 *      R - Primary peg (primary market - buy at bid/sell at offer)
 *      S - Suspend
 *      T - Fixed Peg to Local best bid or offer at time of order
 *
 *      U - Customer Display Instruction (Rule 11Ac1-1/4)
 *      V - Netting (for Forex)
 *      W - Peg to VWAP
 *      X - Trade Along
 *      Y - Try To Stop
 *
 *      Z - Cancel if not best
 *
 *      a - Trailing Stop Peg
 *      b - Strict Limit (No price improvement)
 *      c - Ignore Price Validity Checks
 *      d - Peg to Limit Price
 *      e - Work to Target Strategy
 *
 *      f - Intermarket Sweep
 *      g - External Routing Allowed
 *      h - External Routing Not Allowed
 *      i - Imbalance Only
 *      j - Single execution requested for block trade
 *
 *      k - Best Execution
 */
public class Log18EnuExecInst extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final Enum18ExecInst dataValue;

    public final static Enum18ExecInst TESTA_ENU_EXEC_INST = Enum18ExecInst.STAY_ON_OFFER_SIDE; // fake data
    public final static Enum18ExecInst TESTB_ENU_EXEC_INST = Enum18ExecInst.STAY_ON_BID_SIDE;

    public Log18EnuExecInst(Enum18ExecInst dataValue) {
        setFixType(FIX27.FIX18_ENU_EXEC_INST);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
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
     * standard wrapper to format a simple string describing the data
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
        Log18EnuExecInst tagData;

        tagData = new Log18EnuExecInst(TESTA_ENU_EXEC_INST);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Log18EnuExecInst(TESTB_ENU_EXEC_INST);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
