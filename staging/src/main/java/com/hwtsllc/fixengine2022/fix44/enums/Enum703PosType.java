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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  703
 *  PosType
 *  String
 *  <p></p>
 *  Used to identify the type of quantity that is being returned.
 *  <p></p>
 *  Valid values:
 *  <p>    ALC - Allocation Trade Qty
 *  <p>    AS - Option Assignment
 *  <p>    ASF - As-of Trade Qty
 *  <p>    DLV - Delivery Qty
 *  <p>    ETR - Electronic Trade Qty
 *  <p></p>
 *  <p>    EX - Option Exercise Qty
 *  <p>    FIN - End-of-Day Qty
 *  <p>    IAS - Intra-spread Qty
 *  <p>    IES - Inter-spread Qty
 *  <p>    PA - Adjustment Qty
 *  <p></p>
 *  <p>    PIT - Pit Trade Qty
 *  <p>    SOD - Start-of-Day Qty
 *  <p>    SPL - Integral Split
 *  <p>    TA - Transaction from Assignment
 *  <p>    TOT - Total Transaction Qty
 *  <p></p>
 *  <p>    TQ - Transaction Quantity
 *  <p>    TRF - Transfer Trade Qty
 *  <p>    TX - Transaction from Exercise
 *  <p>    XM - Cross Margin Qty
 *  <p>    RCV - Receive Quantity
 *  <p></p>
 *  <p>    CAA - Corporate Action Adjustment
 *  <p>    DN - Delivery Notice Qty
 *  <p>    EP - Exchange for Physical Qty
 */
public enum Enum703PosType implements LogFIXString, LogVerboseString {
    ALLOCATION_TRADE_QTY( "ALC", "ALLOCATION_TRADE_QTY", "ALC - Allocation Trade Qty" ),
    OPTION_ASSIGNMENT( "AS", "OPTION_ASSIGNMENT", "AS - Option Assignment" ),
    AS_OF_TRADE_QTY( "ASF", "AS_OF_TRADE_QTY", "ASF - As-of Trade Qty" ),
    DELIVERY_QTY( "DLV", "DELIVERY_QTY", "DLV - Delivery Qty" ),
    ELECTRONIC_TRADE_QTY( "ETR", "ELECTRONIC_TRADE_QTY", "ETR - Electronic Trade Qty" ),

    OPTION_EXERCISE_QTY( "EX", "OPTION_EXERCISE_QTY", "EX - Option Exercise Qty" ),
    END_OF_DAY_QTY( "FIN", "END_OF_DAY_QTY", "FIN - End-of-Day Qty" ),
    INTRA_SPREAD_QTY( "IAS", "INTRA_SPREAD_QTY", "IAS - Intra-spread Qty" ),
    INTER_SPREAD_QTY( "IES", "INTER_SPREAD_QTY", "IES - Inter-spread Qty" ),
    ADJUSTMENT_QTY( "PA", "ADJUSTMENT_QTY", "PA - Adjustment Qty" ),

    PIT_TRADE_QTY( "PIT", "PIT_TRADE_QTY", "PIT - Pit Trade Qty" ),
    START_OF_DAY_QTY( "SOD", "START_OF_DAY_QTY", "SOD - Start-of-Day Qty" ),
    INTEGRAL_SPLIT( "SPL", "INTEGRAL_SPLIT", "SPL - Integral Split" ),
    TRANSACTION_FROM_ASSIGNMENT( "TA", "TRANSACTION_FROM_ASSIGNMENT", "TA - Transaction from Assignment" ),
    TOTAL_TRANSACTION_QTY( "TOT", "TOTAL_TRANSACTION_QTY", "TOT - Total Transaction Qty" ),

    TRANSACTION_QUANTITY( "TQ", "TRANSACTION_QUANTITY", "TQ - Transaction Quantity" ),
    TRANSFER_TRADE_QTY( "TRF", "TRANSFER_TRADE_QTY", "TRF - Transfer Trade Qty" ),
    TRANSACTION_FROM_EXERCISE( "TX", "TRANSACTION_FROM_EXERCISE", "TX - Transaction from Exercise" ),
    CROSS_MARGIN_QTY( "XM", "CROSS_MARGIN_QTY", "XM - Cross Margin Qty" ),
    RECEIVE_QUANTITY( "RCV", "RECEIVE_QUANTITY", "RCV - Receive Quantity" ),

    CORPORATE_ACTION_ADJUSTMENT( "CAA", "CORPORATE_ACTION_ADJUSTMENT", "CAA - Corporate Action Adjustment" ),
    DELIVERY_NOTICE_QTY( "DN", "DELIVERY_NOTICE_QTY", "DN - Delivery Notice Qty" ),
    EXCHANGE_FOR_PHYSICAL_QTY( "EP", "EXCHANGE_FOR_PHYSICAL_QTY", "EP - Exchange for Physical Qty" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum703PosType(final String id, final String name, final String description) {
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
    public String toFIXIDString() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String toFIXNameString() {
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
                .concat( toFIXIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat( toFIXNameString())
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
        for (Enum703PosType oneEnum : Enum703PosType.values()) {
            System.out.println(oneEnum);
            System.out.println(oneEnum.toVerboseString());
        }
    }
}
