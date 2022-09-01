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

package com.hwtsllc.fixengine2022.datatypes;

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  1031 (same as 1031, 1035,)
 *  CustOrderHandlingInst
 *  MultipleStringValue
 *  <p>
 *  Codes that apply special information that the Broker / Dealer needs to report, as specified by the customer.
 *  <p>
 *  NOTE: This field and its values have no bearing on the ExecInst and TimeInForce fields.
 *  <p>
 *  These values should not be used instead of ExecInst or TimeInForce.
 *  <p>
 *  This field and its values are intended for compliance reporting only.
 *  <p>
 *  For DeskTypeSource (1034) = 1 (NASD OATS), valid values are (as of OATS Phase 3 as provided by NASD.
 *  <p>
 *  See also http://www.nasd.com/oats/PhaseIII for a complete list.
 *  <p></p>
 *  1035
 *  DeskOrderHandlingInst
 *  MultipleStringValue
 *  <p></p>
 *  Valid values:
 *  <p>    ADD - Add On Order
 *  <p>    AON - All Or None
 *  <p>    CNH - Cash Not Held
 *  <p>    DIR - Directed Order
 *  <p>    E.W - Exchange for Physical Transaction
 *  <p></p>
 *  <p>    FOK - Fill Or Kill
 *  <p>    IO - Imbalance Only
 *  <p>    IOC - Immediate Or Cancel
 *  <p>    LOO - Limit On Open
 *  <p>    LOC - Limit On Close
 *  <p></p>
 *  <p>    MAO - Market At Open
 *  <p>    MAC - Market At Close
 *  <p>    MOO - Market On Open
 *  <p>    MOC - Market On Close
 *  <p>    MQT - Minimum Quantity
 *  <p></p>
 *  <p>    NH - Not Held
 *  <p>    OVD - Over the Day
 *  <p>    PEG - Pegged
 *  <p>    RSV - Reserve Size Order
 *  <p>    S.W - Stop Stock Transaction
 *  <p></p>
 *  <p>    SCL - Scale
 *  <p>    TMO - Time Order
 *  <p>    TS - Trailing Stop
 *  <p>    WRK - Work
 */
public enum MyEnumOrderHandlingInst implements LogFIXString, LogVerboseString {
    ADD_ON_ORDER( "ADD", "ADD_ON_ORDER", "ADD - Add On Order" ),
    ALL_OR_NONE( "AON", "ALL_OR_NONE", "AON - All Or None" ),
    CASH_NOT_HELD( "CNH", "CASH_NOT_HELD", "CNH - Cash Not Held" ),
    DIRECTED_ORDER( "DIR", "DIRECTED_ORDER", "DIR - Directed Order" ),
    EXCHANGE_FOR_PHYSICAL( "E.W", "EXCHANGE_FOR_PHYSICAL", "E.W - Exchange for Physical Transaction" ),

    FILL_OR_KILL( "FOK", "FILL_OR_KILL", "FOK - Fill Or Kill" ),
    IMBALANCE_ONLY( "IO", "IMBALANCE_ONLY", "IO - Imbalance Only" ),
    IMMEDIATE_OR_CANCEL( "IOC", "IMMEDIATE_OR_CANCEL", "IOC - Immediate Or Cancel" ),
    LIMIT_ON_OPEN( "LOO", "LIMIT_ON_OPEN", "LOO - Limit On Open" ),
    LIMIT_ON_CLOSE( "LOC", "LIMIT_ON_CLOSE", "LOC - Limit On Close" ),

    MARKET_AT_OPEN( "MAO", "MARKET_AT_OPEN", "MAO - Market At Open" ),
    MARKET_AT_CLOSE( "MAC", "MARKET_AT_CLOSE", "MAC - Market At Close" ),
    MARKET_ON_OPEN( "MOO", "MARKET_ON_OPEN", "MOO - Market On Open" ),
    MARKET_ON_CLOSE( "MOC", "MARKET_ON_CLOSE", "MOC - Market On Close" ),
    MINIMUM_QUANTITY( "MQT", "MINIMUM_QUANTITY", "MQT - Minimum Quantity" ),

    NOT_HELD( "NH", "NOT_HELD", "NH - Not Held" ),
    OVER_THE_DAY( "OVD", "OVER_THE_DAY", "OVD - Over the Day" ),
    PEGGED( "PEG", "PEGGED", "PEG - Pegged" ),
    RESERVE_SIZE_ORDER( "RSV", "RESERVE_SIZE_ORDER", "RSV - Reserve Size Order" ),
    STOP_STOCK_TRANSACTION( "S.W", "STOP_STOCK_TRANSACTION", "S.W - Stop Stock Transaction" ),

    SCALE( "SCL", "SCALE", "SCL - Scale" ),
    TIME_ORDER( "TMO", "TIME_ORDER", "TMO - Time Order" ),
    TRAILING_STOP( "TS", "TRAILING_STOP", "TS - Trailing Stop" ),
    WORK( "WRK", "WORK", "WRK - Work" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    MyEnumOrderHandlingInst(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String toFIXLabelString() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String toEnumIDString() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String toEnumNameString() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String toEnumDescriptionString() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat( toFIXLabelString())
                .concat("]")
                .concat("\n\tAction[")
                .concat( toEnumIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat( toEnumNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat( toEnumDescriptionString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return id;
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (MyEnumOrderHandlingInst oneEnum : MyEnumOrderHandlingInst.values()) {
            System.out.println(oneEnum.toVerboseString());
        }
    }
}
