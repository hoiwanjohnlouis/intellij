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

package com.hwtsllc.fixengine2022.fix27.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
class Enum18ExecInstTest {
    @Test
    void Enum0018Test() {
        Enum18ExecInst enumType;

        /*
         * 0-9
         */
        enumType = Enum18ExecInst.STAY_ON_OFFER_SIDE;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("STAY_ON_OFFER_SIDE", enumType.toEnumNameString());
        assertEquals("0 - Stay on offer side", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.NOT_HELD;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("NOT_HELD", enumType.toEnumNameString());
        assertEquals("1 - Not held", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.WORK;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("WORK", enumType.toEnumNameString());
        assertEquals("2 - Work", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.GO_ALONG;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("GO_ALONG", enumType.toEnumNameString());
        assertEquals("3 - Go along", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.OVER_THE_DAY;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("OVER_THE_DAY", enumType.toEnumNameString());
        assertEquals("4 - Over the day", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.HELD;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("HELD", enumType.toEnumNameString());
        assertEquals("5 - Held", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.PARTICIPANT_DONT_INITIATE;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("PARTICIPANT_DONT_INITIATE", enumType.toEnumNameString());
        assertEquals("6 - Participant don't initiate", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.STRICT_SCALE;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("STRICT_SCALE", enumType.toEnumNameString());
        assertEquals("7 - Strict scale", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.TRY_TO_SCALE;
        assertEquals("8", enumType.toFIXIDString());
        assertEquals("TRY_TO_SCALE", enumType.toEnumNameString());
        assertEquals("8 - Try to scale", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.STAY_ON_BID_SIDE;
        assertEquals("9", enumType.toFIXIDString());
        assertEquals("STAY_ON_BID_SIDE", enumType.toEnumNameString());
        assertEquals("9 - Stay on bid side", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        /*
         * A-Z
         */
        enumType = Enum18ExecInst.NO_CROSS;
        assertEquals("A", enumType.toFIXIDString());
        assertEquals("NO_CROSS", enumType.toEnumNameString());
        assertEquals("A - No cross (cross is forbidden)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.OKAY_TO_CROSS;
        assertEquals("B", enumType.toFIXIDString());
        assertEquals("OKAY_TO_CROSS", enumType.toEnumNameString());
        assertEquals("B - OK to cross", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.CALL_FIRST;
        assertEquals("C", enumType.toFIXIDString());
        assertEquals("CALL_FIRST", enumType.toEnumNameString());
        assertEquals("C - Call first", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.PERCENT_OF_VOLUME;
        assertEquals("D", enumType.toFIXIDString());
        assertEquals("PERCENT_OF_VOLUME", enumType.toEnumNameString());
        assertEquals("D - Percent of volume (indicates that the sender does not want " +
                        "to be all of the volume on the floor vs. a specific percentage)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.DO_NOT_INCREASE;
        assertEquals("E", enumType.toFIXIDString());
        assertEquals("DO_NOT_INCREASE", enumType.toEnumNameString());
        assertEquals("E - Do not increase - DNI", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.DO_NOT_REDUCE;
        assertEquals("F", enumType.toFIXIDString());
        assertEquals("DO_NOT_REDUCE", enumType.toEnumNameString());
        assertEquals("F - Do not reduce - DNR", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.ALL_OR_NONE;
        assertEquals("G", enumType.toFIXIDString());
        assertEquals("ALL_OR_NONE", enumType.toEnumNameString());
        assertEquals("G - All or none - AON", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.REINSTATE_ON_SYSTEM_FAILURE;
        assertEquals("H", enumType.toFIXIDString());
        assertEquals("REINSTATE_ON_SYSTEM_FAILURE", enumType.toEnumNameString());
        assertEquals("H - Reinstate on system failure (mutually exclusive with Q)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.INSTITUTION_ONLY;
        assertEquals("I", enumType.toFIXIDString());
        assertEquals("INSTITUTION_ONLY", enumType.toEnumNameString());
        assertEquals("I - Institutions only", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.REINSTATE_ON_TRADING_HALTED;
        assertEquals("J", enumType.toFIXIDString());
        assertEquals("REINSTATE_ON_TRADING_HALTED", enumType.toEnumNameString());
        assertEquals("J - Reinstate on Trading Halt (mutually exclusive with K)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.CANCEL_ON_TRADING_HALTED;
        assertEquals("K", enumType.toFIXIDString());
        assertEquals("CANCEL_ON_TRADING_HALTED", enumType.toEnumNameString());
        assertEquals("K - Cancel on Trading Halt (mutually exclusive with J)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.LAST_PEG;
        assertEquals("L", enumType.toFIXIDString());
        assertEquals("LAST_PEG", enumType.toEnumNameString());
        assertEquals("L - Last peg (last sale)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.MID_PRICE_PEG;
        assertEquals("M", enumType.toFIXIDString());
        assertEquals("MID_PRICE_PEG", enumType.toEnumNameString());
        assertEquals("M - Mid-price peg (midprice of inside quote)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.NON_NEGOTIABLE;
        assertEquals("N", enumType.toFIXIDString());
        assertEquals("NON_NEGOTIABLE", enumType.toEnumNameString());
        assertEquals("N - Non-negotiable", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.OPENING_PEG;
        assertEquals("O", enumType.toFIXIDString());
        assertEquals("OPENING_PEG", enumType.toEnumNameString());
        assertEquals("O - Opening peg", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.MARKET_PEG;
        assertEquals("P", enumType.toFIXIDString());
        assertEquals("MARKET_PEG", enumType.toEnumNameString());
        assertEquals("P - Market peg", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.CANCEL_ON_SYSTEM_FAILURE;
        assertEquals("Q", enumType.toFIXIDString());
        assertEquals("CANCEL_ON_SYSTEM_FAILURE", enumType.toEnumNameString());
        assertEquals("Q - Cancel on system failure (mutually exclusive with H)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.PRIMARY_PEG;
        assertEquals("R", enumType.toFIXIDString());
        assertEquals("PRIMARY_PEG", enumType.toEnumNameString());
        assertEquals("R - Primary peg (primary market - buy at bid/sell at offer)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.SUSPENDED;
        assertEquals("S", enumType.toFIXIDString());
        assertEquals("SUSPENDED", enumType.toEnumNameString());
        assertEquals("S - Suspended", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.FIXED_PEG_TO_LOCAL_BEST;
        assertEquals("T", enumType.toFIXIDString());
        assertEquals("FIXED_PEG_TO_LOCAL_BEST", enumType.toEnumNameString());
        assertEquals("T - Fixed Peg to Local best bid or offer at time of order", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.CUSTOMER_DISPLAY_INSTRUCTION;
        assertEquals("U", enumType.toFIXIDString());
        assertEquals("CUSTOMER_DISPLAY_INSTRUCTION", enumType.toEnumNameString());
        assertEquals("U - Customer Display Instruction (Rule 11Ac1-1/4)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.NETTING;
        assertEquals("V", enumType.toFIXIDString());
        assertEquals("NETTING", enumType.toEnumNameString());
        assertEquals("V - Netting (for Forex)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.PEG_TO_VWAP;
        assertEquals("W", enumType.toFIXIDString());
        assertEquals("PEG_TO_VWAP", enumType.toEnumNameString());
        assertEquals("W - Peg to VWAP", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.TRADE_ALONG;
        assertEquals("X", enumType.toFIXIDString());
        assertEquals("TRADE_ALONG", enumType.toEnumNameString());
        assertEquals("X - Trade Along", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.TRY_TO_STOP;
        assertEquals("Y", enumType.toFIXIDString());
        assertEquals("TRY_TO_STOP", enumType.toEnumNameString());
        assertEquals("Y - Try To Stop", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.CANCEL_IF_NOT_BEST;
        assertEquals("Z", enumType.toFIXIDString());
        assertEquals("CANCEL_IF_NOT_BEST", enumType.toEnumNameString());
        assertEquals("Z - Cancel if not best", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        /*
         * a-k
         */
        enumType = Enum18ExecInst.TRAILING_STOP_PEG;
        assertEquals("a", enumType.toFIXIDString());
        assertEquals("TRAILING_STOP_PEG", enumType.toEnumNameString());
        assertEquals("a - Trailing Stop Peg", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.STRICT_LIMIT;
        assertEquals("b", enumType.toFIXIDString());
        assertEquals("STRICT_LIMIT", enumType.toEnumNameString());
        assertEquals("b - Strict Limit (No price improvement)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.IGNORE_PRICE_VALIDITY_CHECKS;
        assertEquals("c", enumType.toFIXIDString());
        assertEquals("IGNORE_PRICE_VALIDITY_CHECKS", enumType.toEnumNameString());
        assertEquals("c - Ignore Price Validity Checks", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.PEG_TO_LIMIT_PRICE;
        assertEquals("d", enumType.toFIXIDString());
        assertEquals("PEG_TO_LIMIT_PRICE", enumType.toEnumNameString());
        assertEquals("d - Peg to Limit Price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.WORK_TO_TARGET_STRATEGY;
        assertEquals("e", enumType.toFIXIDString());
        assertEquals("WORK_TO_TARGET_STRATEGY", enumType.toEnumNameString());
        assertEquals("e - Work to Target Strategy", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.INTERMARKET_SWEEP;
        assertEquals("f", enumType.toFIXIDString());
        assertEquals("INTERMARKET_SWEEP", enumType.toEnumNameString());
        assertEquals("f - Intermarket Sweep", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.EXTERNAL_ROUTING_ALLOWED;
        assertEquals("g", enumType.toFIXIDString());
        assertEquals("EXTERNAL_ROUTING_ALLOWED", enumType.toEnumNameString());
        assertEquals("g - External Routing Allowed", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.EXTERNAL_ROUTING_NOT_ALLOWED;
        assertEquals("h", enumType.toFIXIDString());
        assertEquals("EXTERNAL_ROUTING_NOT_ALLOWED", enumType.toEnumNameString());
        assertEquals("h - External Routing Not Allowed", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.IMBALANCE_ONLY;
        assertEquals("i", enumType.toFIXIDString());
        assertEquals("IMBALANCE_ONLY", enumType.toEnumNameString());
        assertEquals("i - Imbalance Only", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.SINGLE_EXECUTION_REQUESTED;
        assertEquals("j", enumType.toFIXIDString());
        assertEquals("SINGLE_EXECUTION_REQUESTED", enumType.toEnumNameString());
        assertEquals("j - Single execution requested for block trade", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum18ExecInst.BEST_EXECUTION;
        assertEquals("k", enumType.toFIXIDString());
        assertEquals("BEST_EXECUTION", enumType.toEnumNameString());
        assertEquals("k - Best Execution", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}