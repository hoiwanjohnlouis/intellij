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
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  703
 *  PosType
 *  Used to identify the type of quantity that is being returned.
 *  Valid values:
 *      ALC - Allocation Trade Qty
 *      AS - Option Assignment
 *      ASF - As-of Trade Qty
 *      DLV - Delivery Qty
 *      ETR - Electronic Trade Qty
 *      EX - Option Exercise Qty
 *      FIN - End-of-Day Qty
 *      IAS - Intra-spread Qty
 *      IES - Inter-spread Qty
 *      PA - Adjustment Qty
 *      PIT - Pit Trade Qty
 *      SOD - Start-of-Day Qty
 *      SPL - Integral Split
 *      TA - Transaction from Assignment
 *      TOT - Total Transaction Qty
 *      TQ - Transaction Quantity
 *      TRF - Transfer Trade Qty
 *      TX - Transaction from Exercise
 *      XM - Cross Margin Qty
 *      RCV - Receive Quantity
 *      CAA - Corporate Action Adjustment
 *      DN - Delivery Notice Qty
 *      EP - Exchange for Physical Qty
 */
public class Log703EnuPosType extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final Enum703PosType dataValue;

    public final static Enum703PosType TESTA_ENU_POS_TYPE
            = Enum703PosType.ALLOCATION_TRADE_QTY;
    public final static Enum703PosType TESTB_ENU_POS_TYPE
            = Enum703PosType.ELECTRONIC_TRADE_QTY;

    public Log703EnuPosType(Enum703PosType dataValue) {
        setFixType(FIX44.FIX703_ENU_POS_TYPE);
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
        Log703EnuPosType tagData;

        tagData = new Log703EnuPosType(TESTA_ENU_POS_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Log703EnuPosType(TESTB_ENU_POS_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
