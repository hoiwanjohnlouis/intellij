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
class Enum18ExecInstTest {
    @Test
    void Enum0018Test() {
        Enum18ExecInst enumType;

        /*
         * 0-9
         */
        enumType = Enum18ExecInst.STAY_ON_OFFER_SIDE;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("STAY_ON_OFFER_SIDE", enumType.toFIXNameString());
        assertEquals("0 - Stay on offer side", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.NOT_HELD;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("NOT_HELD", enumType.toFIXNameString());
        assertEquals("1 - Not held", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.WORK;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("WORK", enumType.toFIXNameString());
        assertEquals("2 - Work", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.GO_ALONG;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("GO_ALONG", enumType.toFIXNameString());
        assertEquals("3 - Go along", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.OVER_THE_DAY;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("OVER_THE_DAY", enumType.toFIXNameString());
        assertEquals("4 - Over the day", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.HELD;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("HELD", enumType.toFIXNameString());
        assertEquals("5 - Held", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.PARTICIPANT_DONT_INITIATE;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("PARTICIPANT_DONT_INITIATE", enumType.toFIXNameString());
        assertEquals("6 - Participant don't initiate", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.STRICT_SCALE;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("STRICT_SCALE", enumType.toFIXNameString());
        assertEquals("7 - Strict scale", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.TRY_TO_SCALE;
        assertEquals("8", enumType.toFIXIDString());
        assertEquals("TRY_TO_SCALE", enumType.toFIXNameString());
        assertEquals("8 - Try to scale", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.STAY_ON_BID_SIDE;
        assertEquals("9", enumType.toFIXIDString());
        assertEquals("STAY_ON_BID_SIDE", enumType.toFIXNameString());
        assertEquals("9 - Stay on bid side", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        /*
         * A-Z
         */
        enumType = Enum18ExecInst.NO_CROSS;
        assertEquals("A", enumType.toFIXIDString());
        assertEquals("NO_CROSS", enumType.toFIXNameString());
        assertEquals("A - No cross (cross is forbidden)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.OKAY_TO_CROSS;
        assertEquals("B", enumType.toFIXIDString());
        assertEquals("OKAY_TO_CROSS", enumType.toFIXNameString());
        assertEquals("B - OK to cross", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.CALL_FIRST;
        assertEquals("C", enumType.toFIXIDString());
        assertEquals("CALL_FIRST", enumType.toFIXNameString());
        assertEquals("C - Call first", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.PERCENT_OF_VOLUME;
        assertEquals("D", enumType.toFIXIDString());
        assertEquals("PERCENT_OF_VOLUME", enumType.toFIXNameString());
        assertEquals("D - Percent of volume (indicates that the sender does not want " +
                        "to be all of the volume on the floor vs. a specific percentage)",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.DO_NOT_INCREASE;
        assertEquals("E", enumType.toFIXIDString());
        assertEquals("DO_NOT_INCREASE", enumType.toFIXNameString());
        assertEquals("E - Do not increase - DNI", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.DO_NOT_REDUCE;
        assertEquals("F", enumType.toFIXIDString());
        assertEquals("DO_NOT_REDUCE", enumType.toFIXNameString());
        assertEquals("F - Do not reduce - DNR", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.ALL_OR_NONE;
        assertEquals("G", enumType.toFIXIDString());
        assertEquals("ALL_OR_NONE", enumType.toFIXNameString());
        assertEquals("G - All or none - AON", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.REINSTATE_ON_SYSTEM_FAILURE;
        assertEquals("H", enumType.toFIXIDString());
        assertEquals("REINSTATE_ON_SYSTEM_FAILURE", enumType.toFIXNameString());
        assertEquals("H - Reinstate on system failure (mutually exclusive with Q)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.INSTITUTION_ONLY;
        assertEquals("I", enumType.toFIXIDString());
        assertEquals("INSTITUTION_ONLY", enumType.toFIXNameString());
        assertEquals("I - Institutions only", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.REINSTATE_ON_TRADING_HALTED;
        assertEquals("J", enumType.toFIXIDString());
        assertEquals("REINSTATE_ON_TRADING_HALTED", enumType.toFIXNameString());
        assertEquals("J - Reinstate on Trading Halt (mutually exclusive with K)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.CANCEL_ON_TRADING_HALTED;
        assertEquals("K", enumType.toFIXIDString());
        assertEquals("CANCEL_ON_TRADING_HALTED", enumType.toFIXNameString());
        assertEquals("K - Cancel on Trading Halt (mutually exclusive with J)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.LAST_PEG;
        assertEquals("L", enumType.toFIXIDString());
        assertEquals("LAST_PEG", enumType.toFIXNameString());
        assertEquals("L - Last peg (last sale)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.MID_PRICE_PEG;
        assertEquals("M", enumType.toFIXIDString());
        assertEquals("MID_PRICE_PEG", enumType.toFIXNameString());
        assertEquals("M - Mid-price peg (midprice of inside quote)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.NON_NEGOTIABLE;
        assertEquals("N", enumType.toFIXIDString());
        assertEquals("NON_NEGOTIABLE", enumType.toFIXNameString());
        assertEquals("N - Non-negotiable", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.OPENING_PEG;
        assertEquals("O", enumType.toFIXIDString());
        assertEquals("OPENING_PEG", enumType.toFIXNameString());
        assertEquals("O - Opening peg", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.MARKET_PEG;
        assertEquals("P", enumType.toFIXIDString());
        assertEquals("MARKET_PEG", enumType.toFIXNameString());
        assertEquals("P - Market peg", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.CANCEL_ON_SYSTEM_FAILURE;
        assertEquals("Q", enumType.toFIXIDString());
        assertEquals("CANCEL_ON_SYSTEM_FAILURE", enumType.toFIXNameString());
        assertEquals("Q - Cancel on system failure (mutually exclusive with H)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.PRIMARY_PEG;
        assertEquals("R", enumType.toFIXIDString());
        assertEquals("PRIMARY_PEG", enumType.toFIXNameString());
        assertEquals("R - Primary peg (primary market - buy at bid/sell at offer)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.SUSPENDED;
        assertEquals("S", enumType.toFIXIDString());
        assertEquals("SUSPENDED", enumType.toFIXNameString());
        assertEquals("S - Suspended", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.FIXED_PEG_TO_LOCAL_BEST;
        assertEquals("T", enumType.toFIXIDString());
        assertEquals("FIXED_PEG_TO_LOCAL_BEST", enumType.toFIXNameString());
        assertEquals("T - Fixed Peg to Local best bid or offer at time of order", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.CUSTOMER_DISPLAY_INSTRUCTION;
        assertEquals("U", enumType.toFIXIDString());
        assertEquals("CUSTOMER_DISPLAY_INSTRUCTION", enumType.toFIXNameString());
        assertEquals("U - Customer Display Instruction (Rule 11Ac1-1/4)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.NETTING;
        assertEquals("V", enumType.toFIXIDString());
        assertEquals("NETTING", enumType.toFIXNameString());
        assertEquals("V - Netting (for Forex)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.PEG_TO_VWAP;
        assertEquals("W", enumType.toFIXIDString());
        assertEquals("PEG_TO_VWAP", enumType.toFIXNameString());
        assertEquals("W - Peg to VWAP", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.TRADE_ALONG;
        assertEquals("X", enumType.toFIXIDString());
        assertEquals("TRADE_ALONG", enumType.toFIXNameString());
        assertEquals("X - Trade Along", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.TRY_TO_STOP;
        assertEquals("Y", enumType.toFIXIDString());
        assertEquals("TRY_TO_STOP", enumType.toFIXNameString());
        assertEquals("Y - Try To Stop", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.CANCEL_IF_NOT_BEST;
        assertEquals("Z", enumType.toFIXIDString());
        assertEquals("CANCEL_IF_NOT_BEST", enumType.toFIXNameString());
        assertEquals("Z - Cancel if not best", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        /*
         * a-k
         */
        enumType = Enum18ExecInst.TRAILING_STOP_PEG;
        assertEquals("a", enumType.toFIXIDString());
        assertEquals("TRAILING_STOP_PEG", enumType.toFIXNameString());
        assertEquals("a - Trailing Stop Peg", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.STRICT_LIMIT;
        assertEquals("b", enumType.toFIXIDString());
        assertEquals("STRICT_LIMIT", enumType.toFIXNameString());
        assertEquals("b - Strict Limit (No price improvement)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.IGNORE_PRICE_VALIDITY_CHECKS;
        assertEquals("c", enumType.toFIXIDString());
        assertEquals("IGNORE_PRICE_VALIDITY_CHECKS", enumType.toFIXNameString());
        assertEquals("c - Ignore Price Validity Checks", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.PEG_TO_LIMIT_PRICE;
        assertEquals("d", enumType.toFIXIDString());
        assertEquals("PEG_TO_LIMIT_PRICE", enumType.toFIXNameString());
        assertEquals("d - Peg to Limit Price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.WORK_TO_TARGET_STRATEGY;
        assertEquals("e", enumType.toFIXIDString());
        assertEquals("WORK_TO_TARGET_STRATEGY", enumType.toFIXNameString());
        assertEquals("e - Work to Target Strategy", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.INTERMARKET_SWEEP;
        assertEquals("f", enumType.toFIXIDString());
        assertEquals("INTERMARKET_SWEEP", enumType.toFIXNameString());
        assertEquals("f - Intermarket Sweep", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.EXTERNAL_ROUTING_ALLOWED;
        assertEquals("g", enumType.toFIXIDString());
        assertEquals("EXTERNAL_ROUTING_ALLOWED", enumType.toFIXNameString());
        assertEquals("g - External Routing Allowed", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.EXTERNAL_ROUTING_NOT_ALLOWED;
        assertEquals("h", enumType.toFIXIDString());
        assertEquals("EXTERNAL_ROUTING_NOT_ALLOWED", enumType.toFIXNameString());
        assertEquals("h - External Routing Not Allowed", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.IMBALANCE_ONLY;
        assertEquals("i", enumType.toFIXIDString());
        assertEquals("IMBALANCE_ONLY", enumType.toFIXNameString());
        assertEquals("i - Imbalance Only", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.SINGLE_EXECUTION_REQUESTED;
        assertEquals("j", enumType.toFIXIDString());
        assertEquals("SINGLE_EXECUTION_REQUESTED", enumType.toFIXNameString());
        assertEquals("j - Single execution requested for block trade", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum18ExecInst.BEST_EXECUTION;
        assertEquals("k", enumType.toFIXIDString());
        assertEquals("BEST_EXECUTION", enumType.toFIXNameString());
        assertEquals("k - Best Execution", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}