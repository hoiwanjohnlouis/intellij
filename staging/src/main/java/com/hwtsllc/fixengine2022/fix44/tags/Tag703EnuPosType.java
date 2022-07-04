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
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.fix44.enums.Enum703PosType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
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
public class Tag703EnuPosType extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum703PosType dataValue;

    public final static Enum703PosType TESTA_ENU_POS_TYPE
            = Enum703PosType.ALLOCATION_TRADE_QTY;
    public final static Enum703PosType TESTB_ENU_POS_TYPE
            = Enum703PosType.ELECTRONIC_TRADE_QTY;

    public Tag703EnuPosType(Enum703PosType dataValue) {
        setFixType(FIX44.FIX703_ENU_POS_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.toEnumIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
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
        return this.dataValue.toEnumIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toEnumNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toEnumDescriptionString();
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
        Tag703EnuPosType tagData;

        tagData = new Tag703EnuPosType(TESTA_ENU_POS_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag703EnuPosType(TESTB_ENU_POS_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum703PosType oneEnum : Enum703PosType.values()) {
            System.out.println( new Tag703EnuPosType(oneEnum).toVerboseString() );
        }
    }
}
