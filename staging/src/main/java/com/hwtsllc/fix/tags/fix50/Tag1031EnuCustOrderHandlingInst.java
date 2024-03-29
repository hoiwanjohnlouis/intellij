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

package com.hwtsllc.fix.tags.fix50;

import com.hwtsllc.fix.datatypes.MyEnumOrderHandlingInst;
import com.hwtsllc.fix.datatypes.FIX50;
import com.hwtsllc.fix.datatypes.FIX50Abstract;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

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
public class Tag1031EnuCustOrderHandlingInst extends FIX50Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final MyEnumOrderHandlingInst dataValue;

    public final static MyEnumOrderHandlingInst TESTA_ENU_CUST_ORDER_HANDLING_INST
            = MyEnumOrderHandlingInst.ADD_ON_ORDER;
    public final static MyEnumOrderHandlingInst TESTB_ENU_CUST_ORDER_HANDLING_INST
            = MyEnumOrderHandlingInst.EXCHANGE_FOR_PHYSICAL;

    public Tag1031EnuCustOrderHandlingInst(MyEnumOrderHandlingInst dataValue) {
        setFixType(FIX50.FIX1031_ENU_CUST_ORDER_HANDLING_INST);
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
     * standard wrapper to return a string describing the data
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
        Tag1031EnuCustOrderHandlingInst tagData;

        tagData = new Tag1031EnuCustOrderHandlingInst(TESTA_ENU_CUST_ORDER_HANDLING_INST);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag1031EnuCustOrderHandlingInst(TESTB_ENU_CUST_ORDER_HANDLING_INST);
        System.out.println(tagData.toVerboseString());
    }
}
